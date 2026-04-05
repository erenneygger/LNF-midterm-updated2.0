/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import javax.swing.JOptionPane;
import Admin.ManageItem; // Only needed if ManageItem is in the Admin package
import Config.config;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class Claiming extends javax.swing.JFrame {

    /**
     * Creates new form add
     */
    public Claiming() {      
    // 1. SESSION CHECK: Check if a user is actually logged in
    if (Config.Session.userId == 0) {
        javax.swing.JOptionPane.showMessageDialog(null, "Login Required!");
        new Main.Login().setVisible(true);
        this.dispose();
        return; 
    }

    // 2. INITIALIZE UI: Only runs if the check above passes
    initComponents();
}
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
        Reports = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        confpass = new javax.swing.JTextField();
        Type = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        addU = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Email1 = new javax.swing.JTextField();
        Pass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLAIMING");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 104));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/test3.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 20, 223, 115));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 130));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Users.setBackground(new java.awt.Color(102, 102, 102));
        Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UsersMouseExited(evt);
            }
        });
        Users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Users");
        Users.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 80));

        jPanel3.add(Users, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 250, 80));

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

        jLabel5.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
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

        jPanel3.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 240, -1));

        Settings.setBackground(new java.awt.Color(0, 153, 153));
        Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SettingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SettingsMouseExited(evt);
            }
        });
        Settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(Settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 250, -1));

        Reports.setBackground(new java.awt.Color(102, 102, 102));
        Reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReportsMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
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

        jPanel3.add(Reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 250, -1));

        jLabel3.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Settings");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 250, 90));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 990, 160));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search");
        jPanel6.add(jLabel4);
        jLabel4.setBounds(20, 0, 70, 30);

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 110, 30));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 360, 30));

        jPanel12.setBackground(new java.awt.Color(102, 102, 102));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Update");
        jPanel12.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 2, 94, 28));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, 30));

        jPanel13.setBackground(new java.awt.Color(102, 102, 102));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Add");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 110, 30));

        jPanel14.setBackground(new java.awt.Color(102, 102, 102));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Delete");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 110, 30));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 240, 40));
        jPanel4.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 240, 40));
        jPanel4.add(confpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 240, 40));
        jPanel4.add(Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 240, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Date Claimed:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 130, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setText("Owner First Name:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Owner Last Name:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Owner Email:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Owner Contact No:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Item ID:");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        addU.setBackground(new java.awt.Color(102, 102, 102));
        addU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addUMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addUMouseExited(evt);
            }
        });
        addU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Claim");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        addU.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 30));

        jPanel4.add(addU, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 240, 50));
        jPanel4.add(Email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 240, 40));

        Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassActionPerformed(evt);
            }
        });
        jPanel4.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 240, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 930, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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
    
    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked

    }//GEN-LAST:event_jPanel13MouseClicked

    private void addUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUMouseEntered
        setColor(addU);
    }//GEN-LAST:event_addUMouseEntered

    private void addUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUMouseExited
        resetColor(addU);
    }//GEN-LAST:event_addUMouseExited

    private void addUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUMouseClicked
                                               
                                       
    config con = new config();

    // 1. Validation: Ensure no fields are empty
    if(firstname.getText().isEmpty() || lastname.getText().isEmpty() || confpass.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please fill in all owner details!");
        return;
    }

    // 2. SQL Queries
    // IMPORTANT: Changed 'claim_date' to 'date_claimed' to match your tbl_claims structure
    String claimSql = "INSERT INTO tbl_claims (item_id, owner_fname, owner_lname, owner_email, owner_contact, date_claimed) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";
    
    // This updates the status in your main items table
    String updateItemSql = "UPDATE tbl_items SET item_status = 'Claimed' WHERE item_id = ?";

    try {
        // A. Save the Claim Record to tbl_claims
        con.addRecord(claimSql, 
                Pass.getText(),      // Item ID
                firstname.getText(), 
                lastname.getText(), 
                Email1.getText(),    
                Type.getText(),      // Owner Contact
                confpass.getText()   // Date (from your text field)
        );

        // B. Update the Item Status in tbl_items
        // We use executeAction or updateRecord depending on your config.java setup
        con.updateRecord(updateItemSql, Pass.getText());

        // C. Success Message
        JOptionPane.showMessageDialog(null, "Transaction Successful!\nItem " + Pass.getText() + " is now Claimed.");

        // D. Redirect back to ManageItem
        new Admin.ManageItem().setVisible(true);
        this.dispose(); 

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error during transaction: " + e.getMessage());
    }

        
      // this part should be chamge on what i send above on what i really need, i need this to be a claim when i click claim the status of the item will become claim and then it will exit and return me back into the ManageItem.java 
    }//GEN-LAST:event_addUMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
                                      
        // This simply calls the function we just wrote above
        addUMouseClicked(null);
           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void ReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsMouseExited
        resetColor(Reports);
    }//GEN-LAST:event_ReportsMouseExited

    private void ReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsMouseEntered
        setColor(Reports);
    }//GEN-LAST:event_ReportsMouseEntered

    private void SettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseExited
        resetColor(Settings);
    }//GEN-LAST:event_SettingsMouseExited

    private void SettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseEntered
        setColor(Settings);
    }//GEN-LAST:event_SettingsMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        resetColor(Home);
    }//GEN-LAST:event_HomeMouseExited

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        setColor(Home);
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        adminDashboard Home = new adminDashboard();
        Home.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void UsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersMouseExited
        resetColor(Users);
    }//GEN-LAST:event_UsersMouseExited

    private void UsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersMouseEntered
        setColor(Users);
    }//GEN-LAST:event_UsersMouseEntered

    private void UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersMouseClicked
        Item Users = new Item();
        Users.setVisible(true);
        dispose();
    }//GEN-LAST:event_UsersMouseClicked

    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Claiming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Claiming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Claiming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Claiming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Claiming().setVisible(true);
            }
        });
    }
public String selectedItemID;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email1;
    private javax.swing.JPanel Home;
    public javax.swing.JTextField Pass;
    private javax.swing.JPanel Reports;
    private javax.swing.JPanel Settings;
    private javax.swing.JTextField Type;
    private javax.swing.JPanel Users;
    private javax.swing.JPanel addU;
    public javax.swing.JTextField confpass;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lastname;
    // End of variables declaration//GEN-END:variables
}
