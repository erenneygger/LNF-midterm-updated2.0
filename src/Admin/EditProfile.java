package Admin;

import Config.config;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class EditProfile extends javax.swing.JFrame {

    public int userId;
    String imagePath = null;
    config conf = new config();

   public EditProfile(int a_id, String fname, String lname, String email, String type) {
    initComponents(); // This is the locked NetBeans method
    
    // 1. INITIALIZE THE LABEL MANUALLY HERE (Crucial to stop the NullPointerException)
    if (user_image == null) {
        user_image = new javax.swing.JLabel();
        user_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        user_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_image.setText("Profile Pic");
        // Add it to jPanel4 at the specific location
        jPanel4.add(user_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 160, 160));
    }

    this.userId = a_id;

    // Fill Text Fields
    firstname.setText(fname);
    lastname.setText(lname);
    Email.setText(email);
    Type.setText(type);

    // 2. NOW CALL VIEWIMAGE (Now that user_image is no longer null)
    conf.viewImage("SELECT user_image FROM tbl_accounts WHERE a_id = " + userId, user_image);
}
    // Helper to preview selected image
   public void previewImage(String path) {
    ImageIcon myImage = new ImageIcon(path);
    // Change jLabel2 to user_image
    Image img = myImage.getImage().getScaledInstance(user_image.getWidth(), user_image.getHeight(), Image.SCALE_SMOOTH);
    user_image.setIcon(new ImageIcon(img));
}
    // --- PASTE YOUR GENERATED initComponents() HERE ---


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Users = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Settings = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Reports = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Type = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        addU = new javax.swing.JPanel();
        browse_btn = new javax.swing.JLabel();
        addU1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDIT PROFILE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 13, -1, 104));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/test3.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 110));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 130));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
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

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Users");

        javax.swing.GroupLayout UsersLayout = new javax.swing.GroupLayout(Users);
        Users.setLayout(UsersLayout);
        UsersLayout.setHorizontalGroup(
            UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsersLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(91, 91, 91))
        );
        UsersLayout.setVerticalGroup(
            UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsersLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Home");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel3.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 240, -1));

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
            .addGroup(SettingsLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(79, 79, 79))
        );
        SettingsLayout.setVerticalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Reports");

        javax.swing.GroupLayout ReportsLayout = new javax.swing.GroupLayout(Reports);
        Reports.setLayout(ReportsLayout);
        ReportsLayout.setHorizontalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportsLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addGap(89, 89, 89))
        );
        ReportsLayout.setVerticalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportsLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel3.add(Reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 250, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 990, 160));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 240, 40));
        jPanel4.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 240, 40));
        jPanel4.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 240, 40));
        jPanel4.add(Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 240, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("First Name:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Last Name:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Email:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("User type:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        addU.setBackground(new java.awt.Color(153, 153, 153));
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
        addU.setLayout(null);

        browse_btn.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        browse_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        browse_btn.setText("UPDATE IMAGE");
        addU.add(browse_btn);
        browse_btn.setBounds(20, 0, 200, 70);

        jPanel4.add(addU, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 240, 70));

        addU1.setBackground(new java.awt.Color(153, 153, 153));
        addU1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addU1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addU1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addU1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addU1MouseExited(evt);
            }
        });
        addU1.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("UPDATE PROFILE");
        addU1.add(jLabel12);
        jLabel12.setBounds(20, 0, 200, 70);

        jPanel4.add(addU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 240, 70));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 930, 330));

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

    private void UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersMouseClicked
        Item Users = new Item();
        Users.setVisible(true);
        dispose();
    }//GEN-LAST:event_UsersMouseClicked
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

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        adminDashboard Home = new adminDashboard();
        Home.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeMouseClicked

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
        resetColor(Reports);
    }//GEN-LAST:event_ReportsMouseExited

    private void addUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUMouseClicked
                                    
                                       
    JFileChooser browseImageCan = new JFileChooser();
    FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
    browseImageCan.addChoosableFileFilter(fnef);
    
    int showOpenDialogue = browseImageCan.showOpenDialog(null);
    if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
        File selectedImageFile = browseImageCan.getSelectedFile();
        imagePath = selectedImageFile.getAbsolutePath();
        // Preview it
        previewImage(imagePath);
    }


    }//GEN-LAST:event_addUMouseClicked

    private void addUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUMouseEntered
        setColor(addU);
    }//GEN-LAST:event_addUMouseEntered

    private void addUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUMouseExited
        resetColor(addU);
    }//GEN-LAST:event_addUMouseExited

    private void addU1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addU1MouseClicked
                                   
                                    
    // 1. Validation: Ensure required fields aren't empty
    if(firstname.getText().isEmpty() || lastname.getText().isEmpty() || Email.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please fill in all text fields!");
        return;
    }

    try {
        if (imagePath != null) {
            // OPTION A: Update text AND the new image
            // We convert the file to a byte[] to avoid SQLite "Data Type Mismatch"
            File file = new File(imagePath);
            byte[] imgData = new byte[(int) file.length()];
            FileInputStream fis = new FileInputStream(file);
            fis.read(imgData);
            fis.close();

            String sql = "UPDATE tbl_accounts SET fname = ?, lname = ?, email = ?, type = ?, user_image = ? WHERE a_id = ?";
            
            // Order: fname(1), lname(2), email(3), type(4), user_image(5), a_id(6)
            conf.updateRecord(sql, 
                firstname.getText(), 
                lastname.getText(), 
                Email.getText(), 
                Type.getText(), 
                imgData, 
                userId
            );
        } else {
            // OPTION B: Update text only (keeps the old image in DB)
            String sql = "UPDATE tbl_accounts SET fname = ?, lname = ?, email = ?, type = ? WHERE a_id = ?";
            
            conf.updateRecord(sql, 
                firstname.getText(), 
                lastname.getText(), 
                Email.getText(), 
                Type.getText(), 
                userId
            );
        }

        JOptionPane.showMessageDialog(null, "Profile Updated Successfully!");
        
        // 2. Refresh and open the profile view
        // We pass the 'userId' so profile.java knows which image to load from the DB
        Admin.profile pfile = new Admin.profile(userId);
        pfile.setVisible(true);
        this.dispose();

    } catch (Exception e) {
        // This will help you see the exact error in the NetBeans output console
        e.printStackTrace(); 
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }


    }//GEN-LAST:event_addU1MouseClicked

    private void addU1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addU1MouseEntered
                                     
    setColor(addU1); // Turns light gray when you hover
                                    


    }//GEN-LAST:event_addU1MouseEntered

    private void addU1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addU1MouseExited
    resetColor(addU1); // Turns back to original color
    }//GEN-LAST:event_addU1MouseExited

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Reports;
    private javax.swing.JPanel Settings;
    private javax.swing.JTextField Type;
    private javax.swing.JPanel Users;
    private javax.swing.JPanel addU;
    private javax.swing.JPanel addU1;
    private javax.swing.JLabel browse_btn;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lastname;
    // End of variables declaration//GEN-END:variables
private javax.swing.JLabel user_image; // Add this with your other JLabels
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            // We pass dummy values (0, null, etc.) because the constructor 
            // will check the Session before it even cares about these values.
            new EditProfile(0, "", "", "", "").setVisible(true);
        }
    });
}

}
