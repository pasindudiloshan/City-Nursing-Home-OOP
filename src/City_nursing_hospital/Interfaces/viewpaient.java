package City_nursing_hospital.Interfaces;

import City_nursing_hospital.services.HospitalService;
import City_nursing_hospital.services.Manager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class viewpaient extends javax.swing.JInternalFrame {

    
    public viewpaient() {
        initComponents();
        
        this.setBorder(null);
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        
        jTable1.getTableHeader().setFont(new Font("segoe UI", Font.BOLD, 10));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(225,225,255));
        jTable1.getTableHeader().setForeground(new Color(51,153,255));
        jTable1.setRowHeight(25);
        
        // Load patient data from file into the JTable
        loadPatientData();
    }

    private void loadPatientData() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    // Assuming you're loading data for a Manager
    HospitalService hospitalService = new Manager(); // or new Cashier(); based on the context
    hospitalService.loadPatientData(model);
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        editjButton2 = new javax.swing.JButton();
        deletejButton3 = new javax.swing.JButton();
        searchtextField2 = new javax.swing.JTextField();
        searchjButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jTable1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "NIC", "Number", "Date", "Category", "Specilist"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
            jTable1.getColumnModel().getColumn(0).setMinWidth(80);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(2).setMinWidth(40);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(40);
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

        searchtextField2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N

        searchjButton1.setText("Search");
        searchjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 232, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(editjButton2)
                                .addGap(33, 33, 33)
                                .addComponent(deletejButton3)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(searchtextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(searchjButton1)
                                .addGap(173, 173, 173))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchjButton1)
                    .addComponent(searchtextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editjButton2)
                    .addComponent(deletejButton3))
                .addGap(16, 16, 16))
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

    JTable table = jTable1; // Assuming jTable1 is your table
    
    // You can create either a Manager or Cashier based on your context
    HospitalService hospitalService = new Manager();  // Or use new Cashier();
    
    // Call the delete method
    hospitalService.deletePatient(table);
        
    }//GEN-LAST:event_deletejButton3ActionPerformed

    private void searchjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjButton1ActionPerformed

    String searchTerm = searchtextField2.getText().trim();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    // Create an instance of HospitalService; 
    HospitalService hospitalService = new Manager();
    // Call the filterPatient method to filter patient records based on the search term
    hospitalService.filterPatient(model, searchTerm);
    
    searchtextField2.setText("");
    }//GEN-LAST:event_searchjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletejButton3;
    private javax.swing.JButton editjButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchjButton1;
    private javax.swing.JTextField searchtextField2;
    // End of variables declaration//GEN-END:variables
}
