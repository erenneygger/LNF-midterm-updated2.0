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
public class ManageItem extends javax.swing.JFrame {

    /**
     * Creates new form ManageItem
     */
    public ManageItem() {       
        // 1. THE GATEKEEPER: Check session first
        if (Config.Session.userId == 0) {
            javax.swing.JOptionPane.showMessageDialog(null, "Login Required!");
            new Main.Login().setVisible(true);
            this.dispose();
            return; 
        }

        // 2. THE CONTENT
        initComponents();
        
        // === TABLE SELECTION & BEHAVIOR ===
        // Prevents selecting multiple rows to protect your logic
        usertable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        usertable.setRowSelectionAllowed(true);
        usertable.setColumnSelectionAllowed(false);
        
        // 3. MINIMALIST TABLE STYLING
        usertable.getTableHeader().setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));
        usertable.getTableHeader().setOpaque(false);
        usertable.getTableHeader().setBackground(new Color(102, 102, 102));
        usertable.getTableHeader().setForeground(Color.WHITE);
        usertable.setRowHeight(80); 
        usertable.setShowGrid(false);
        usertable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        
        // 4. INITIAL LOAD
        displayUser();
        
        // 5. AUTO-REFRESH
        this.addWindowFocusListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowGainedFocus(java.awt.event.WindowEvent e) {
                displayUser();
            }
        });
    }
    
    void displayUser() {
    config cn = new config();
    
    // Updated SQL to ensure the column order matches your JTable model
    String sql = "SELECT i.item_id, i.item_image, i.item_name, i.reported_by, " +
                 "i.item_time, i.item_location, i.item_type, i.item_status " +
                 "FROM tbl_items i";
    
    cn.displayData(sql, usertable);
    
    // Ensure the image renderer is applied to column index 1 (item_image)
    usertable.getColumnModel().getColumn(1).setPreferredWidth(80);
    applyImageRenderer();


}
    private void applyImageRenderer() {
    // Targets Column 1 (item_image) based on your SQL query: 
    // SELECT item_id, item_image...
    usertable.getColumnModel().getColumn(1).setCellRenderer(new javax.swing.table.DefaultTableCellRenderer() {
        @Override
        public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            javax.swing.JLabel label = new javax.swing.JLabel();
            
            // Set basic alignment
            label.setHorizontalAlignment(javax.swing.JLabel.CENTER);

            // 1. CHECK IF THE DATA IS A BYTE ARRAY (BLOB)
            if (value instanceof byte[]) {
                byte[] imgData = (byte[]) value;
                java.util.Base64.Decoder decoder = java.util.Base64.getDecoder();
                
                // Convert bytes to ImageIcon
                javax.swing.ImageIcon imageIcon = new javax.swing.ImageIcon(imgData);
                
                // Resize to fit your rowHeight (which is 80)
                java.awt.Image img = imageIcon.getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH);
                label.setIcon(new javax.swing.ImageIcon(img));
                
            } 
            // 2. FALLBACK: IF THE DATA IS STILL A FILE PATH (STRING)
            else if (value != null && !value.toString().isEmpty()) {
                config conf = new config();
                // Use your existing helper to resize the path-based image
                label.setIcon(conf.ResizeImage(value.toString(), null, label));
            }

            // 3. MAINTAIN SELECTION COLORS
            if (isSelected) {
                label.setOpaque(true);
                label.setBackground(table.getSelectionBackground());
                label.setForeground(table.getSelectionForeground());
            } else {
                label.setOpaque(false);
            }

            return label;
        }
    });
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
        jLabel3 = new javax.swing.JLabel();
        Reports = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usertable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        approve = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE ITEM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 104));

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

        jLabel6.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Users");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

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

        jLabel3.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Records");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

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

        jLabel7.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Reports");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

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
                "ID", "item", "Full Name", "Last Name", "Time & Date", "Place/Location", "User Type", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usertableMouseClicked(evt);
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

        searchField.setForeground(new java.awt.Color(153, 153, 153));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        jPanel1.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 240, 40));

        approve.setBackground(new java.awt.Color(102, 102, 102));
        approve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        approve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                approveMouseClicked(evt);
            }
        });
        approve.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Claim");
        approve.add(jLabel14);
        jLabel14.setBounds(30, 0, 110, 40);

        jPanel1.add(approve, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 120, 40));

        add.setBackground(new java.awt.Color(102, 102, 102));
        add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Add");
        add.add(jLabel15);
        jLabel15.setBounds(40, 0, 70, 40);

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 120, 40));

        update.setBackground(new java.awt.Color(102, 102, 102));
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("Update");
        update.add(jLabel16);
        jLabel16.setBounds(20, 0, 90, 40);

        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 120, 40));

        delete.setBackground(new java.awt.Color(102, 102, 102));
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        delete.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Delete");
        delete.add(jLabel17);
        jLabel17.setBounds(20, 0, 90, 40);

        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        resetColor(Reports);
    }//GEN-LAST:event_ReportsMouseExited

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
                                                                                 
    // Redirects back to the Admin Dashboard
    adminDashboard ds = new adminDashboard();
    ds.setVisible(true);
    this.dispose();
    
    

    }//GEN-LAST:event_HomeMouseClicked

    private void approveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approveMouseClicked
                                                                          
                                       
    int rowIndex = usertable.getSelectedRow();

    if (rowIndex < 0) {
        // Validation: Ensure a row is actually clicked in the table
        JOptionPane.showMessageDialog(null, "Please select an item to claim!");
    } else {
        try {
            // 1. Get the ID from the first column (Index 0)
            String id = usertable.getValueAt(rowIndex, 0).toString();
            
            // 2. Create the Claiming page instance
            Claiming clm = new Claiming();
            
            // 3. AUTO-FILL: This part only works because you set the modifier to 'public'
            clm.Pass.setText(id); 
            
            // OPTIONAL: Auto-fill today's date into the 'confpass' field
            // This saves the admin even more time!
            java.time.LocalDate today = java.time.LocalDate.now();
            clm.confpass.setText(today.toString()); 
            
            // 4. Navigation
            clm.setVisible(true);
            this.dispose(); 
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error passing data: " + e.getMessage());
        }
    }





    }//GEN-LAST:event_approveMouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
                                            
        displayUser(); // This refreshes the table with the new items list
     

    }//GEN-LAST:event_jPanel6MouseClicked

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
                                                                                                                                                                                                                   
                                            
    String find = searchField.getText();
    
    // We removed the JOIN and "date_claimed" to match your JTable columns
    String sql = "SELECT i.item_id, i.item_image, i.item_name, i.reported_by, " +
                 "i.item_time, i.item_location, i.item_type, i.item_status " + 
                 "FROM tbl_items i " +
                 "WHERE i.item_name LIKE '%" + find + "%' OR i.item_location LIKE '%" + find + "%'";
    
    config conf = new config();
    conf.displayData(sql, usertable);
    
    // This keeps the images visible even while searching
    applyImageRenderer();


    }//GEN-LAST:event_searchFieldKeyReleased

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
                                       
    additem ai = new additem();
    ai.setVisible(true);
    // Note: We don't dispose here if you want to come back to this page easily
    this.dispose(); 

    }//GEN-LAST:event_addMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
                                          
                                       
    int rowIndex = usertable.getSelectedRow();
    
    if (rowIndex < 0) {
        JOptionPane.showMessageDialog(null, "Please select an item!");
    } else {
        config conf = new config();
        try {
            java.sql.ResultSet rs = conf.getData("SELECT * FROM tbl_items WHERE item_id = '" + usertable.getValueAt(rowIndex, 0) + "'");
            
            if (rs.next()) {
                additem ai = new additem();
                ai.itemId = rs.getInt("item_id");
                ai.Item.setText(rs.getString("item_name"));
                ai.timedate.setText(rs.getString("item_time"));
                ai.place.setText(rs.getString("item_location"));
                ai.Type.setText(rs.getString("item_type"));
                ai.firstname.setText(rs.getString("reported_by"));
                
                // --- NEW CODE FOR IMAGE ---
                String imagePath = rs.getString("item_image");
                if(imagePath != null && !imagePath.isEmpty()){
                    // Assuming 'image_display' is the JLabel in your additem.java
                    ai.image_display.setIcon(conf.ResizeImage(imagePath, null, ai.image_display));
                }
                // --------------------------

                ai.image_display.setText("UPDATE"); 
                ai.setVisible(true);
                
                rs.getStatement().getConnection().close(); 
                this.dispose();
            }
        } catch (java.sql.SQLException ex) {
            System.out.println("Update Error: " + ex.getMessage());
        }
    }


    }//GEN-LAST:event_updateMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
                                          
                                    
    int rowIndex = usertable.getSelectedRow();

    if (rowIndex < 0) {
        JOptionPane.showMessageDialog(null, "Please select an item to delete!");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(null, "Confirm deletion?", "Warning", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        // Get ID before doing anything else
        int id = Integer.parseInt(usertable.getValueAt(rowIndex, 0).toString());
        
        config conf = new config();
        // This will now execute and close the connection automatically
        conf.deleteData(id, "tbl_items", "item_id");
        
        // Refresh
        displayUser();
    }
    }//GEN-LAST:event_deleteMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
                                    
    // This opens your Reports/Logs page
    // Make sure your class name is 'report' or 'Reports' (check your project tree)
    report rp = new report(); 
    rp.setVisible(true);
    this.dispose(); 
       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void usertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertableMouseClicked
                                            
    int rowIndex = usertable.getSelectedRow();
    
    if(rowIndex < 0){
        JOptionPane.showMessageDialog(null, "Please select an item!");
    } else {
        try {
            config conf = new config();
            // Retrieve all data for the selected ID
            java.sql.ResultSet rs = conf.getData("SELECT * FROM tbl_items WHERE item_id = '" 
                    + usertable.getValueAt(rowIndex, 0) + "'");
            
            if(rs.next()){
                // 1. If you have a JLabel on THIS page to show the image:
                // Assuming you have a JLabel named 'image_view'
                String path = rs.getString("item_image");
                
                // Use your config class helper to scale and set the image
                // Replace 'image_view' with your actual JLabel name
                // image_view.setIcon(conf.ResizeImage(path, null, image_view));
                
                System.out.println("Selected Item Image Path: " + path);
            }
        } catch(java.sql.SQLException ex) {
            System.out.println("Error fetching image: " + ex.getMessage());
        }
    }

    }//GEN-LAST:event_usertableMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
                                          
    // 1. Create the instance of the records page
    // Note: If your file is named 'Records.java' (capital R), use 'Records' instead.
    records rec = new records(); 
    
    // 2. Make the new window appear
    rec.setVisible(true);
    
    // 3. Close the current ManageItem window
    this.dispose();

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
                                                
    // 1. Create the instance of the users window
    users userPage = new users(); 

    // 2. Make the users window visible
    userPage.setVisible(true);

    // 3. Close the current ManageItem window to free up memory
    this.dispose(); 

    }//GEN-LAST:event_jLabel6MouseClicked
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageItem().setVisible(true);
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Reports;
    private javax.swing.JPanel Settings;
    private javax.swing.JPanel Users;
    private javax.swing.JPanel add;
    private javax.swing.JPanel approve;
    private javax.swing.JPanel delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel update;
    private javax.swing.JTable usertable;
    // End of variables declaration//GEN-END:variables
}
