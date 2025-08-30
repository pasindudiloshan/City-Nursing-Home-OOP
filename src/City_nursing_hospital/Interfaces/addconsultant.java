package City_nursing_hospital.Interfaces;



import City_nursing_hospital.services.HospitalService;
import City_nursing_hospital.services.Manager;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


public class addconsultant extends javax.swing.JInternalFrame {

    
    public addconsultant() {
        initComponents();
        
        this.setBorder(null);
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        
        // Set the default text in namejTextField2
        namejTextField2.setText("Dr.");
        
        loadConsultantData();
    }
    
    private void loadConsultantData() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        // Assuming you're loading data for a Manager
        Manager manager = new Manager();  // Create an instance of Manager to load consultant data
        manager.loadConsultantData(model); // Call a method in Manager to load consultants into the JTable
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        editjButton2 = new javax.swing.JButton();
        deletejButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        specialjTextField1 = new javax.swing.JTextField();
        numjTextField5 = new javax.swing.JTextField();
        emailjTextField3 = new javax.swing.JTextField();
        namejTextField2 = new javax.swing.JTextField();
        idjTextField1 = new javax.swing.JTextField();
        addjButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        depjTextField2 = new javax.swing.JTextField();
        searchjButton1 = new javax.swing.JButton();
        searchtextField2 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(710, 410));

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jTable1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "E-mail", "Number", "Specialization", "Department"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(255, 51, 51));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(40);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        editjButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/City_nursing_images/edit-text.png"))); // NOI18N
        editjButton2.setText("Edit");
        editjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editjButton2ActionPerformed(evt);
            }
        });

        deletejButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/City_nursing_images/trash.png"))); // NOI18N
        deletejButton3.setText("Delete");
        deletejButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButton3ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Add Consultant", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bookman Old Style", 1, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel2.setText("Consultant ID:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, -1, 30));

        jLabel3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel3.setText("Surename:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 88, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel4.setText("Email address:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 122, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel5.setText("Contact Number:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 153, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel7.setText("Specialization:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 189, -1, -1));

        specialjTextField1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jPanel2.add(specialjTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 186, 80, -1));

        numjTextField5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jPanel2.add(numjTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 150, 80, -1));

        emailjTextField3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jPanel2.add(emailjTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 80, -1));

        namejTextField2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jPanel2.add(namejTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 85, 80, -1));

        idjTextField1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        idjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idjTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(idjTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 60, -1));

        addjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/City_nursing_images/diskette.png"))); // NOI18N
        addjButton1.setText("Add Consultant");
        addjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(addjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 29));

        jLabel8.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel8.setText("Department:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        depjTextField2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jPanel2.add(depjTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 80, -1));

        searchjButton1.setText("Search");
        searchjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjButton1ActionPerformed(evt);
            }
        });

        searchtextField2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addComponent(searchtextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchjButton1)
                .addGap(134, 134, 134))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(310, 310, 310)
                            .addComponent(editjButton2)
                            .addGap(168, 168, 168)
                            .addComponent(deletejButton3)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchtextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchjButton1))
                .addContainerGap(326, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap(52, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(editjButton2)
                        .addComponent(deletejButton3))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void editjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editjButton2ActionPerformed
           
    }//GEN-LAST:event_editjButton2ActionPerformed

    private void deletejButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButton3ActionPerformed
 
    int selectedRow = jTable1.getSelectedRow();

    if (selectedRow >= 0) {
        String conIdToDelete = jTable1.getValueAt(selectedRow, 0).toString();

        // Get the manager instance (assuming you have a way to access it)
        Manager manager = new Manager(); // Adjust based on how you manage instances

        // Call the method in the Manager class to delete the consultant
        manager.deleteConsultant(conIdToDelete, jTable1); // Pass JTable for updating
    } else {
        JOptionPane.showMessageDialog(this, "No Consultant selected for deletion.");
    }
        
    }//GEN-LAST:event_deletejButton3ActionPerformed

    private void idjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idjTextField1ActionPerformed

    private void addjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjButton1ActionPerformed

        Manager manager = new Manager();

        String conId = idjTextField1.getText();
        String name = namejTextField2.getText();
        String email = emailjTextField3.getText();
        String contactNumber = numjTextField5.getText();
        String specialization = specialjTextField1.getText();
        String department = depjTextField2.getText();

        // Add the consultant record to the file and update the table
        manager.addConsultant(conId, name, email, contactNumber, specialization, department, jTable1);
    
    }//GEN-LAST:event_addjButton1ActionPerformed

    private void searchjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjButton1ActionPerformed

        String searchText = searchtextField2.getText();
        System.out.println("Search Text: " + searchText); // Debugging line

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        HospitalService hospitalService = new Manager();
        // Call the filterConsultant method from the hospitalService
        hospitalService.filterConsultant(searchText, model);

        searchtextField2.setText("");

    }//GEN-LAST:event_searchjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addjButton1;
    private javax.swing.JButton deletejButton3;
    private javax.swing.JTextField depjTextField2;
    private javax.swing.JButton editjButton2;
    private javax.swing.JTextField emailjTextField3;
    private javax.swing.JTextField idjTextField1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField namejTextField2;
    private javax.swing.JTextField numjTextField5;
    private javax.swing.JButton searchjButton1;
    private javax.swing.JTextField searchtextField2;
    private javax.swing.JTextField specialjTextField1;
    // End of variables declaration//GEN-END:variables
}
