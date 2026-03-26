package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.InputStream;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import net.proteanit.sql.DbUtils;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class config {

    public static int userId; 

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

    // getData: Standard retrieval (Caller must handle connection closing)
    public ResultSet getData(String sql) throws SQLException {
        Connection conn = connectDB();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        return pstmt.executeQuery();
    }

    // safeGetData: Uses CachedRowSet to allow closing connection immediately
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

    // addRecord: Updated for inserting records with BLOB support (InputStream or byte[])
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