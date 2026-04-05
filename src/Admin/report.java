/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Config.config;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Admin.StudentCouncilDashboard;
/**
 *
 * @author Dell
 */
public class report extends javax.swing.JFrame {

    /**
     * Creates new form users
     */
  public report() {       
    if (Config.Session.userId == 0) {
        javax.swing.JOptionPane.showMessageDialog(null, "Login Required!");
        new Main.Login().setVisible(true);
        this.dispose();
        return; 
    }

    initComponents();
    
    // INSERT IT HERE
    setColor(Reports); 
    
    displayUser(); // This loads the data immediately
    
    // This part is great for refreshing when you return to this window
    this.addWindowFocusListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowGainedFocus(java.awt.event.WindowEvent e) {
            displayUser(); 
        }
    });
}
    
void displayUser() {
    config cn = new config();
    
    // We only select the columns that exist in tbl_logs
    // Removed 'details' or any 'date_claimed' references
    String sql = "SELECT log_id, user_name, action, log_timestamp FROM tbl_logs ORDER BY log_id DESC";
    
    try {
        // 1. Get the data to check if it's empty (for debugging)
        java.sql.ResultSet rs = cn.getData(sql);
        
        if (rs != null && !rs.isBeforeFirst()) {
            System.out.println("DEBUG: tbl_logs is currently empty!");
        } else {
            System.out.println("DEBUG: Logs found, updating JTable...");
        }
        
        // 2. Load the data into your JTable
        // Note: Ensure your 'usertable' has 4 columns defined in the Design tab
        cn.displayData(sql, usertable);
        
        // Close result set if needed (optional depending on your config class)
        if (rs != null) rs.close();
        
    } catch (java.sql.SQLException e) {
        System.out.println("SQL ERROR in displayUser: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("GENERAL ERROR in displayUser: " + e.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Users = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Settings = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Reports = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usertable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        SearchText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REPORT LOGS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 13, -1, 104));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/test1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -10, 270, 160));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 110));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Users.setBackground(new java.awt.Color(102, 102, 102));
        Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UsersMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Users");

        javax.swing.GroupLayout UsersLayout = new javax.swing.GroupLayout(Users);
        Users.setLayout(UsersLayout);
        UsersLayout.setHorizontalGroup(
            UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsersLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        UsersLayout.setVerticalGroup(
            UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsersLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(Users, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 250, -1));

        Home.setBackground(new java.awt.Color(102, 102, 102));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Home");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 240, -1));

        Settings.setBackground(new java.awt.Color(102, 102, 102));
        Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SettingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SettingsMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Settings");

        javax.swing.GroupLayout SettingsLayout = new javax.swing.GroupLayout(Settings);
        Settings.setLayout(SettingsLayout);
        SettingsLayout.setHorizontalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        SettingsLayout.setVerticalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(Settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 250, -1));

        Reports.setBackground(new java.awt.Color(102, 102, 102));
        Reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReportsMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Reports");

        javax.swing.GroupLayout ReportsLayout = new javax.swing.GroupLayout(Reports);
        Reports.setLayout(ReportsLayout);
        ReportsLayout.setHorizontalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ReportsLayout.setVerticalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(Reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 250, 80));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 990, 140));

        usertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Log ID", "User", "Activity", "Date & Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(usertable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 930, 340));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Search");
        jPanel6.add(jLabel13);
        jLabel13.setBounds(30, 0, 80, 40);

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 110, 40));

        SearchText.setForeground(new java.awt.Color(153, 153, 153));
        SearchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextActionPerformed(evt);
            }
        });
        SearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTextKeyReleased(evt);
            }
        });
        jPanel1.add(SearchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 310, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void setColor(JPanel p){
        p.setBackground(new Color(240, 240, 240));
    }
    
    public void resetColor(JPanel p2){
        p2.setBackground(new Color(102, 102, 102));
    }
    
    private void UsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersMouseEntered
        setColor(Users);
    }//GEN-LAST:event_UsersMouseEntered

    private void UsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersMouseExited
        resetColor(Users);
    }//GEN-LAST:event_UsersMouseExited

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        setColor(Home);
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        resetColor(Home);
    }//GEN-LAST:event_HomeMouseExited

    
    private void SettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseEntered
        setColor(Settings);
    }//GEN-LAST:event_SettingsMouseEntered

    private void SettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseExited
        resetColor(Settings);
    }//GEN-LAST:event_SettingsMouseExited

    private void ReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsMouseEntered
        setColor(Reports);
    }//GEN-LAST:event_ReportsMouseEntered

    private void ReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsMouseExited
    // Keep it highlighted since we are on the Reports page
    setColor(Reports); 

    }//GEN-LAST:event_ReportsMouseExited

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
                                                                                                                                                            
    // 1. Get the account type from the Session
    String userType = Config.Session.type;

    // 2. Direct the user based on their role
    if (userType != null && userType.equalsIgnoreCase("Admin")) {
        // If the user is an Admin, go to the Admin Dashboard
        // (Make sure the class name 'adminDashboard' matches your file)
        adminDashboard admin = new adminDashboard();
        admin.setVisible(true);
    } else {
        // If the user is Student Council, go to the SC Dashboard
        Admin.StudentCouncilDashboard scDash = new Admin.StudentCouncilDashboard();
        scDash.setVisible(true);
    }

    // 3. Close the current Report window
    this.dispose();


    }//GEN-LAST:event_HomeMouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
                                       
    /* * This method handles the printing of the JTable.
     * It adds a professional Header and Page Number Footer.
     */
    try {
        // Define a Header (Top of the page)
        java.text.MessageFormat header = new java.text.MessageFormat("Lost and Found Item Report");
        
        // Define a Footer (Bottom of the page with page numbering)
        java.text.MessageFormat footer = new java.text.MessageFormat("Page {0,number,integer}");

        // Execute the print command with the header and footer
        // JTable.PrintMode.FIT_WIDTH ensures the 5 columns fit on one paper width
        boolean complete = usertable.print(javax.swing.JTable.PrintMode.FIT_WIDTH, header, footer);

        if (complete) {
            JOptionPane.showMessageDialog(null, "Printing Complete", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // This triggers if the user clicks "Cancel" in the print dialog
            System.out.println("Printing Cancelled");
        }
        
    } catch (java.awt.print.PrinterException e) {
        JOptionPane.showMessageDialog(null, "Printer Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + e.getMessage());
    }

    // Refresh the table data from tbl_items after the print dialog closes
    displayUser(); 

    }//GEN-LAST:event_jPanel6MouseClicked

    private void SearchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextKeyReleased
                                                                                   
                                        
    config conf = new config();
    String keyword = SearchText.getText().trim();
    
    // Match the columns exactly with displayUser()
    String sql = "SELECT log_id, user_name, action, log_timestamp "
               + "FROM tbl_logs "
               + "WHERE user_name LIKE '%" + keyword + "%' "
               + "OR action LIKE '%" + keyword + "%' "
               + "ORDER BY log_id DESC";
               
    conf.displayData(sql, usertable);


    }//GEN-LAST:event_SearchTextKeyReleased

    private void SearchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTextActionPerformed
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new report().setVisible(true);
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Reports;
    private javax.swing.JTextField SearchText;
    private javax.swing.JPanel Settings;
    private javax.swing.JPanel Users;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable usertable;
    // End of variables declaration//GEN-END:variables
}
