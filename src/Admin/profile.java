package Admin;

import java.awt.Color;
import javax.swing.JPanel;
import java.sql.ResultSet;
import Config.config;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class profile extends javax.swing.JFrame {
    private int userId; 

    // Constructor for passing specific userId (e.g., from an Admin list)
    public profile(int userId) {
        this.userId = userId;
        initComponents();
        // Use invokeLater to ensure UI is ready before loading image
        java.awt.EventQueue.invokeLater(() -> {
            displayData();
        });
    }

    // Default Constructor (Self-Profile)
    public profile() {
        initComponents();
        
        // Use the static session variable from your config
        if (config.userId == 0) { 
            javax.swing.JOptionPane.showMessageDialog(null, "Login Required!");
            new Main.Login().setVisible(true);
            this.dispose();
            return; 
        }
        
        this.userId = config.userId;
        
        // Use invokeLater to ensure UI is ready before loading image
        java.awt.EventQueue.invokeLater(() -> {
            displayData();
        });
    }

    private void displayData() {
        config conf = new config(); 
        // 1. SELECT all required columns from tbl_accounts
        String sql = "SELECT fname, lname, a_id, email, type, user_image FROM tbl_accounts WHERE a_id = " + userId;
        
        try {
            java.sql.ResultSet rs = conf.getData(sql);

            if (rs != null && rs.next()) {
                // 2. Set Text Fields for Profile Details
                Fn.setText(rs.getString("fname"));
                Ln.setText(rs.getString("lname"));
                id.setText(rs.getString("a_id"));
                Em.setText(rs.getString("email"));
                Ut.setText(rs.getString("type"));           
                fn.setText(rs.getString("fname"));
                ln.setText(rs.getString("lname"));
                
                // 3. Handle the Image
                // We use the helper method in config.java to handle the BLOB and scaling
                // This will now work because invokeLater ensured lbl_img has width/height
                conf.viewImage(sql, lbl_img);
                
                // 4. Close the result set to prevent database locks
                rs.close();
            }
        } catch (Exception e) {
            System.out.println("Profile Display Error: " + e.getMessage());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Pass = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Pw = new javax.swing.JLabel();
        lbl_img = new javax.swing.JLabel();
        Edit = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Back = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Ln = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        Utype = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Ut = new javax.swing.JLabel();
        Lname = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        Fname = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        Em = new javax.swing.JLabel();
        Fn = new javax.swing.JLabel();
        ln = new javax.swing.JLabel();
        fn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROFILE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, -30, -1, 183));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/image-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, -30, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/image left.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 240, 180));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/test1.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -10, 270, 160));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 110));

        Pass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(Pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 150, 20));

        lbl_img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lbl_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 270));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 360, 270));

        Edit.setBackground(new java.awt.Color(102, 102, 102));
        Edit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EDIT");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EditLayout = new javax.swing.GroupLayout(Edit);
        Edit.setLayout(EditLayout);
        EditLayout.setHorizontalGroup(
            EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        EditLayout.setVerticalGroup(
            EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 140, -1));

        Back.setBackground(new java.awt.Color(102, 102, 102));
        Back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BACK");

        javax.swing.GroupLayout BackLayout = new javax.swing.GroupLayout(Back);
        Back.setLayout(BackLayout);
        BackLayout.setHorizontalGroup(
            BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        BackLayout.setVerticalGroup(
            BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, 140, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ln.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel5.add(Ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 130, 20));

        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel5.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 140, 20));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 560, 10));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 560, 10));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 560, 10));

        Utype.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        Utype.setText("User type:");
        jPanel5.add(Utype, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        Email.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        Email.setText("Email:");
        jPanel5.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        Ut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel5.add(Ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 130, 20));

        Lname.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        Lname.setText("Last Name:");
        jPanel5.add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        Id.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        Id.setText("ID:");
        jPanel5.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        Fname.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        Fname.setText("First Name:");
        jPanel5.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 30));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 560, 10));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        jLabel5.setText("About");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Em.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel5.add(Em, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 140, 20));

        Fn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel5.add(Fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 150, 30));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 600, 400));

        ln.setFont(new java.awt.Font("Colonna MT", 1, 24)); // NOI18N
        jPanel4.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 200, 26));

        fn.setFont(new java.awt.Font("Colonna MT", 1, 24)); // NOI18N
        fn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel4.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 110, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1030, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
                                                                                
        String userRole = Ut.getText(); 
        
        if (userRole.equalsIgnoreCase("Admin")) {
            new adminDashboard().setVisible(true);
        } else if (userRole.equalsIgnoreCase("Student Council")) {
            new StudentCouncilDashboard().setVisible(true);
        } else {
            // This covers "User", "Student", and anything else
            new StudentDashboard().setVisible(true);
        }
        this.dispose();
    
    
    }//GEN-LAST:event_BackMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    // 1. Get the current data from your labels/textfields
    String fname = Fn.getText();
    String lname = Ln.getText();
    String email = Em.getText();
    String type = Ut.getText();

    // 2. Open EditProfile with all 6 required arguments
    // (id, fname, lname, email, type, role)
    // We pass 'type' twice to satisfy the new 6-argument constructor
    EditProfile ep = new EditProfile(Config.Session.userId, fname, lname, email, type, type);
    
    // 3. Show the new window
    ep.setVisible(true);
    
    // 4. Close the current profile screen
    this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked
    public void setColor(JPanel p){
        p.setBackground(new Color(240, 240, 240));
    }
    
    public void resetColor(JPanel p2){
        p2.setBackground(new Color(102, 102, 102));
    }
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
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Back;
    private javax.swing.JPanel Edit;
    private javax.swing.JLabel Em;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Fn;
    private javax.swing.JLabel Fname;
    private javax.swing.JLabel Id;
    private javax.swing.JLabel Ln;
    private javax.swing.JLabel Lname;
    private javax.swing.JLabel Pass;
    private javax.swing.JLabel Pw;
    private javax.swing.JLabel Ut;
    private javax.swing.JLabel Utype;
    private javax.swing.JLabel fn;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JLabel ln;
    // End of variables declaration//GEN-END:variables

}
