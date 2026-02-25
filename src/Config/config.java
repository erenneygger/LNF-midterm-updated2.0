package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

public class config {
    
    // Establishing Connection
    public static Connection connectDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            // Note: We remove the extra print to keep the console clean
            return DriverManager.getConnection("jdbc:sqlite:lostNfoundDB.db");
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e);
            return null;
        }
    }
    
    // SAFE GETDATA: Returns a ResultSet but ensures it's usable
    public ResultSet getData(String sql) throws SQLException {
        Connection conn = connectDB();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        return pstmt.executeQuery();
    }
    
    // Dynamic Update Method
    public void updateRecord(String sql, Object... values) {
        try (Connection conn = connectDB(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            for (int i = 0; i < values.length; i++) {
                pstmt.setObject(i + 1, values[i]);
            }
            pstmt.executeUpdate();
            System.out.println("Record updated successfully!");
        } catch (SQLException e) {
            System.out.println("Error updating record: " + e.getMessage());
        }
    }

    // Dynamic Add/Insert Method
    public void addRecord(String sql, Object... values) {
        try (Connection conn = connectDB(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            for (int i = 0; i < values.length; i++) {
                pstmt.setObject(i + 1, values[i]);
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
            System.out.println("Error displaying data: " + e.getMessage());
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

    // Delete Method (Enhanced with automatic closure)
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
            if (ex.getMessage().contains("locked")) {
                 javax.swing.JOptionPane.showMessageDialog(null, "Database is busy. Close other windows and try again.");
            }
            System.out.println("Delete Error: " + ex.getMessage());
        }
    }
}