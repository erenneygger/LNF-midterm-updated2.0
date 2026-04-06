/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Config.config;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author Dell
 */
public class additem extends javax.swing.JFrame {

   

    // PLACE IT HERE (Right at the top, before the constructor)
    public int itemId = 0; 
    public String imagePath;
    public byte[] itemImageData;

   
    public additem() {      
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
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        image_display = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        place = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Item = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Type = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        timedate = new javax.swing.JTextField();
        BrowsePic = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        addU2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 50)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD ITEM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 340, 104));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/image-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, -30, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/image left.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 220, 180));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/test1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 270, 160));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 130));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image_display.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(image_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 200, 120));
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

        BrowsePic.setBackground(new java.awt.Color(102, 102, 102));
        BrowsePic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BrowsePic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowsePicMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BrowsePicMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BrowsePicMouseExited(evt);
            }
        });
        BrowsePic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("BROWSE");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        BrowsePic.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, -1));

        jPanel4.add(BrowsePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 240, 50));

        addU2.setBackground(new java.awt.Color(102, 102, 102));
        addU2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addU2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addU2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addU2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addU2MouseExited(evt);
            }
        });
        addU2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("SAVE ITEM");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        addU2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, -1));

        jPanel4.add(addU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 240, 50));

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
    
    private void placeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeActionPerformed

    private void TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeActionPerformed

    private void timedateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timedateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timedateActionPerformed

    private void ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void BrowsePicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowsePicMouseClicked
                                       
                                          
    JFileChooser browse = new JFileChooser();
    
    // Filter to show only images
    FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
    browse.setFileFilter(fnef);
    
    int showOpenDialogue = browse.showOpenDialog(null);

    if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
        File selectedImageFile = browse.getSelectedFile();
        imagePath = selectedImageFile.getAbsolutePath(); // String variable at the top of your class
        
        // 1. Display the image in your JLabel preview using your Config helper
        config conf = new config();
        image_display.setIcon(conf.ResizeImage(imagePath, null, image_display));
        image_display.setText(""); // Remove the "ADD" or "UPDATE" text from label
        
        // 2. Optional: Convert to byte array if your DB uses BLOB
        try {
            File image = new File(imagePath);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            itemImageData = bos.toByteArray(); 
        } catch (Exception e) {
            System.out.println("Image Error: " + e.getMessage());
        }
    }


    }//GEN-LAST:event_BrowsePicMouseClicked

    private void BrowsePicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowsePicMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BrowsePicMouseEntered

    private void BrowsePicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowsePicMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BrowsePicMouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void addU2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addU2MouseClicked
                                      
    config conf = new config();
    
    // 1. Validation: Ensure image and essential fields are present
    if (itemImageData == null) {
        JOptionPane.showMessageDialog(null, "Please select an image first!");
        return;
    }
    
    if (firstname.getText().trim().isEmpty() || Item.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in the required fields!");
        return;
    }

    // 2. Prepare Data
    String fullName = firstname.getText() + " " + (lastname.getText().isEmpty() ? "" : lastname.getText());
    String status = "Pending"; // Default status for new items

    // 3. Save Logic (Handles both INSERT and UPDATE)
    try {
        if (itemId == 0) { // If itemId is 0, we are adding a new record
            String sql = "INSERT INTO tbl_items (item_name, item_time, item_location, item_type, reported_by, item_status, item_image) "
                       + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            
            conf.addRecord(sql, Item.getText(), timedate.getText(), place.getText(), 
                           Type.getText(), fullName, status, itemImageData);
            
            JOptionPane.showMessageDialog(null, "Successfully Added!");
        } else { // If itemId is NOT 0, we are updating an existing record
            String sql = "UPDATE tbl_items SET item_name = ?, item_time = ?, item_location = ?, "
                       + "item_type = ?, reported_by = ?, item_image = ? WHERE item_id = ?";
            
            conf.updateRecord(sql, Item.getText(), timedate.getText(), place.getText(), 
                              Type.getText(), fullName, itemImageData, String.valueOf(itemId));
            
            JOptionPane.showMessageDialog(null, "Successfully Updated!");
        }

        // 4. SMART REDIRECT: Fixed logic to send Student Council to item.java
        String userRole = Config.Session.type; 

        if (userRole != null && userRole.equalsIgnoreCase("Admin")) {
            // Admin goes back to the Management Dashboard
            new Admin.ManageItem().setVisible(true);
        } else {
            // Student Council or Standard Users go back to the general Item page
            // Make sure the class name 'item' matches your file (e.g., Item or item)
            new Admin.Item().setVisible(true); 
        }

        // Close the current 'additem' window
        this.dispose();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error saving data: " + e.getMessage());
    }


    }//GEN-LAST:event_addU2MouseClicked

    private void addU2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addU2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addU2MouseEntered

    private void addU2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addU2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addU2MouseExited

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
            java.util.logging.Logger.getLogger(additem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(additem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(additem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(additem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new additem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BrowsePic;
    public javax.swing.JTextField Item;
    public javax.swing.JTextField Type;
    private javax.swing.JPanel addU2;
    public javax.swing.JTextField firstname;
    public javax.swing.JLabel image_display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lastname;
    public javax.swing.JTextField place;
    public javax.swing.JTextField timedate;
    // End of variables declaration//GEN-END:variables
}
