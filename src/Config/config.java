package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.InputStream;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import net.proteanit.sql.DbUtils;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class config {

    public static int userId; 

    /**
     * CONSTRUCTOR: Now empty to prevent "SQLITE_BUSY" errors and 
     * repeating console messages when switching frames.
     */
    public config() {
        // Keep this empty to stop the repeating messages
    }

    /**
     * initializeLogs: Run this ONLY ONCE in your Login constructor.
     * It ensures the log table exists without locking the database constantly.
     */
    public void initializeLogs() {
        try (Connection conn = connectDB();
             Statement stmt = conn.createStatement()) {
            
            String sql = "CREATE TABLE IF NOT EXISTS tbl_logs ("
                       + "log_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                       + "user_name TEXT, "
                       + "action TEXT, "
                       + "details TEXT, "
                       + "log_timestamp DATETIME DEFAULT CURRENT_TIMESTAMP)";
            
            stmt.execute(sql);
            System.out.println(">>> Log System Verified and Ready.");
            
        } catch (SQLException ex) {
            System.out.println("Initialization Error: " + ex.getMessage());
        }
    }

    // Helper Method for manual connection handling
    public Connection getConnection() {
        return connectDB();
    }

    // Establishing Connection
    public static Connection connectDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection("jdbc:sqlite:lostNfoundDB.db");
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e);
            return null;
        }
    }

    // updateData: Simple update method for direct SQL strings
    public boolean updateData(String sql) {
        try (Connection conn = connectDB();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            int rowsUpdated = pst.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException ex) {
            System.out.println("Update Error: " + ex.getMessage());
            return false;
        }
    }

    /**
     * FIXED getData: Uses CachedRowSet to copy data into memory 
     * and IMMEDIATELY close the database connection to prevent SQLITE_BUSY.
     */
    public ResultSet getData(String sql) {
        try (Connection conn = connectDB();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            
            CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.populate(rs);
            return crs; 
            
        } catch (SQLException e) {
            System.out.println("Error in getData: " + e.getMessage());
            return null;
        }
    }

    // safeGetData: Uses CachedRowSet to allow closing connection immediately with parameters
    public ResultSet safeGetData(String sql, Object... values) {
        try (Connection conn = connectDB();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            for (int i = 0; i < values.length; i++) {
                pstmt.setObject(i + 1, values[i]);
            }

            try (ResultSet rs = pstmt.executeQuery()) {
                CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
                crs.populate(rs);
                return crs; 
            }
        } catch (SQLException e) {
            System.out.println("Error in safeGetData: " + e.getMessage());
            return null;
        }
    }

    // updateRecord: Updated to handle mixed data types (including InputStream and byte[])
    public void updateRecord(String sql, Object... values) {
        try (Connection conn = connectDB(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            for (int i = 0; i < values.length; i++) {
                if (values[i] instanceof InputStream) {
                    pstmt.setBinaryStream(i + 1, (InputStream) values[i]);
                } else if (values[i] instanceof byte[]) {
                    pstmt.setBytes(i + 1, (byte[]) values[i]);
                } else {
                    pstmt.setObject(i + 1, values[i]);
                }
            }
            
            pstmt.executeUpdate();
            System.out.println("Record updated successfully!");
        } catch (SQLException e) {
            System.out.println("Error updating record: " + e.getMessage());
        }
    }

    // addRecord: Updated for inserting records with BLOB support
    public void addRecord(String sql, Object... values) {
        try (Connection conn = connectDB(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            for (int i = 0; i < values.length; i++) {
                if (values[i] instanceof InputStream) {
                    pstmt.setBinaryStream(i + 1, (InputStream) values[i]);
                } else if (values[i] instanceof byte[]) {
                    pstmt.setBytes(i + 1, (byte[]) values[i]);
                } else {
                    pstmt.setObject(i + 1, values[i]);
                }
            }
            
            pstmt.executeUpdate();
            System.out.println("Record added successfully!");
        } catch (SQLException e) {
            System.out.println("Error adding record: " + e.getMessage());
        }
    }

    // Display data in JTable
    public void displayData(String sql, javax.swing.JTable table) {
        try (Connection conn = connectDB();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            if(e.getMessage().contains("ResultSet")){
                 System.out.println("Display Error: Data Type Mismatch (Image included in Select)");
            } else {
                 System.out.println("Error displaying data: " + e.getMessage());
            }
        }
    }

    // Login Authentication Method
    public String authenticate(String sql, Object... values) {
        try (Connection conn = connectDB();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            for (int i = 0; i < values.length; i++) {
                pstmt.setObject(i + 1, values[i]);
            }
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("type");
                }
            }
        } catch (SQLException e) {
            System.out.println("Login Error: " + e.getMessage());
        }
        return null;
    }

    // Delete Method
    public void deleteData(int id, String table, String column) {
        String sql = "DELETE FROM " + table + " WHERE " + column + " = ?";
        try (Connection conn = connectDB(); 
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, id);
            int rowsDeleted = pst.executeUpdate();
            if (rowsDeleted > 0) {
                javax.swing.JOptionPane.showMessageDialog(null, "Deleted Successfully!");
            }
        } catch (SQLException ex) {
            System.out.println("Delete Error: " + ex.getMessage());
        }
    }

    /**
     * recordLog: Method to record system activities into tbl_logs
     */
    public void recordLog(String username, String action, String details) {
        String sql = "INSERT INTO tbl_logs (user_name, action, details) VALUES (?, ?, ?)";
        addRecord(sql, username, action, details);
    }

    /**
     * viewImage: Fetches image bytes from DB and fits them into a specific JLabel.
     */
    public void viewImage(String sql, JLabel label) {
        if (label == null) {
            System.out.println("Config Error: Target JLabel is null. Image cannot be displayed.");
            return;
        }

        try (Connection conn = connectDB();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            if (rs.next()) {
                byte[] imgBytes = rs.getBytes(1);
                if (imgBytes != null) {
                    ImageIcon myImage = new ImageIcon(imgBytes);
                    Image img = myImage.getImage();
                    
                    int width = (label.getWidth() > 0) ? label.getWidth() : 130;
                    int height = (label.getHeight() > 0) ? label.getHeight() : 130;

                    Image newImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                    label.setIcon(new ImageIcon(newImg));
                    label.setText(""); 
                } else {
                    label.setIcon(null);
                    label.setText("No Image");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error fetching image: " + ex.getMessage());
        }
    }
}