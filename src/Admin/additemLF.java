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

/**
 *
 * @author Dell
 */
public class additemLF extends javax.swing.JFrame {

   

    // PLACE IT HERE (Right at the top, before the constructor)
    public int itemId = 0; 

   
    public additemLF() {      
    // Check if the user is logged in before showing the UI
    if (Config.Session.userId == 0) {
        javax.swing.JOptionPane.showMessageDialog(null, "Login Required! Please log in to add items.");
        // Adjust the path below to match your actual Login file location
        new Main.Login().setVisible(true); 
        this.dispose();
        return; 
    }
    
    initComponents();
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        place = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        save = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Item = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Type = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        timedate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD ITEM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 13, 230, 104));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/test3.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 223, 115));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 130));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 240, 40));
        jPanel4.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 240, 40));

        place.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeActionPerformed(evt);
            }
        });
        jPanel4.add(place, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 240, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("First Name");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Last Name:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("User type:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        save.setBackground(new java.awt.Color(102, 102, 102));
        save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveMouseExited(evt);
            }
        });
        save.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SAVE ITEM");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        save.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, -1));

        jPanel4.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 240, 50));

        Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemActionPerformed(evt);
            }
        });
        jPanel4.add(Item, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 240, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Item");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Time & date");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeActionPerformed(evt);
            }
        });
        jPanel4.add(Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 240, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Place of lost/found");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        timedate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timedateActionPerformed(evt);
            }
        });
        jPanel4.add(timedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 240, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 920, 370));

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
    
    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        setColor(save);
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
        resetColor(save);
    }//GEN-LAST:event_saveMouseExited

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
                                  
                                    
                                       
    config conf = new config();
    
    // 1. SQL Query - Make sure these column names match your SQLite table exactly
    String sql = "INSERT INTO tbl_items (item_name, item_type, item_place, item_date, item_status) VALUES (?, ?, ?, ?, ?)";
    
    // 2. Execute addRecord using your actual variable names (Item, Type, place, timedate)
    conf.addRecord(sql, 
                   Item.getText(), 
                   Type.getText(), 
                   place.getText(), 
                   timedate.getText(), 
                   "Pending");
    
    // 3. Feedback to user
    javax.swing.JOptionPane.showMessageDialog(null, "Item Reported Successfully!");

    // 4. THE REDIRECT to LoserDashboard
    // If LoserDashboard is in a different package, ensure you have the import at the top
    LoserDashboard ld = new LoserDashboard();
    ld.setVisible(true);

    // 5. Close this current window
    this.dispose();


    

    }//GEN-LAST:event_saveMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
                                           
    saveMouseClicked(evt); // This tells the label to do whatever the panel does

    }//GEN-LAST:event_jLabel11MouseClicked

    private void placeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeActionPerformed

    private void TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
                                   
    Item itm = new Item();
    itm.setVisible(true);
    this.dispose(); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void timedateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timedateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timedateActionPerformed

    private void ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemActionPerformed

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
            java.util.logging.Logger.getLogger(additemLF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(additemLF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(additemLF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(additemLF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new additemLF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Item;
    public javax.swing.JTextField Type;
    public javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lastname;
    public javax.swing.JTextField place;
    private javax.swing.JPanel save;
    public javax.swing.JTextField timedate;
    // End of variables declaration//GEN-END:variables
}
