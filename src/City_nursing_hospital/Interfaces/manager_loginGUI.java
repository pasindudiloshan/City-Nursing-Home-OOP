package City_nursing_hospital.Interfaces;

import City_nursing_hospital.Interfaces.managerGUI;
import javax.swing.JOptionPane;


public class manager_loginGUI extends javax.swing.JFrame {

   
    public manager_loginGUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        namejTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginjButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        backgroundimge = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namejTextField1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        namejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namejTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(namejTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 110, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, 30));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/City_nursing_images/management (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 110));

        loginjButton1.setBackground(new java.awt.Color(54, 70, 78));
        loginjButton1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        loginjButton1.setForeground(new java.awt.Color(255, 255, 255));
        loginjButton1.setText("Login");
        loginjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginjButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(loginjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, 30));

        jPasswordField1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 110, -1));

        backgroundimge.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        backgroundimge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/City_nursing_images/Blue and White Medical and Health Care Banner (1).jpg"))); // NOI18N
        jPanel1.add(backgroundimge, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 130));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void namejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namejTextField1ActionPerformed

    private void loginjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginjButton1ActionPerformed
        
         String username = namejTextField1.getText();
        String password = new String(jPasswordField1.getPassword());

        if ("pasindu".equals(username) && "dilo@123".equals(password)) {
            JOptionPane.showMessageDialog(null, "Welcome to the Manager Dashboard, " + username + "!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
            managerGUI mandash = new managerGUI();
            mandash.adminname.setText(namejTextField1.getText());
            mandash.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginjButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(manager_loginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manager_loginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manager_loginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manager_loginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manager_loginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundimge;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton loginjButton1;
    private javax.swing.JTextField namejTextField1;
    // End of variables declaration//GEN-END:variables
}
