/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

public class PatientAddFrm extends javax.swing.JFrame {
    
    List<Hospital> hospital = new ArrayList<Hospital>();
    Hospital hos = new Hospital(0, " ", 0, " ", " ", "");
    
    public PatientAddFrm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPatientGender = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        txtPatientId = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtPatientAge = new javax.swing.JTextField();
        txtPatientAddress = new javax.swing.JTextField();
        txtPatientMobile = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Patient Information");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD PATIENT INFORMATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, -1));

        jLabel10.setText("Patient ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, 20));

        jLabel11.setText("Name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jLabel12.setText("Age");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel13.setText("Gender");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 20));

        jLabel14.setText("Address");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel15.setText("Mobile Number");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        txtPatientGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male", "Others", " " }));
        getContentPane().add(txtPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 121, -1));

        btnSave.setBackground(new java.awt.Color(102, 102, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 180, -1));
        getContentPane().add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 180, -1));
        getContentPane().add(txtPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 180, -1));
        getContentPane().add(txtPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 180, -1));

        txtPatientMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientMobileActionPerformed(evt);
            }
        });
        getContentPane().add(txtPatientMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 180, -1));

        btnNew.setBackground(new java.awt.Color(102, 102, 255));
        btnNew.setText("New Record");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        btnClose.setBackground(new java.awt.Color(102, 102, 255));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/add patient.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientMobileActionPerformed

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       
        hos.setPatient_id(Integer.parseInt(txtPatientId.getText()));
        hos.setPatient_name(txtPatientName.getText());
        hos.setPatient_age(Integer.parseInt(txtPatientAge.getText()));
        String selectedValue = txtPatientGender.getSelectedItem().toString();
        hos.setPatient_gender(selectedValue);
        hos.setPatient_address(txtPatientAddress.getText());
        hos.setPatient_mobileNumber(txtPatientMobile.getText());
        
        String host = "jdbc:derby://localhost:1527/Hospital";
        String userName = "hms";
        String password = "123";
        
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            conn = DriverManager.getConnection(host, userName, password);
            
            ps = conn.prepareStatement("INSERT INTO hms.patient (patient_id, patient_name, patient_age, patient_gender, patient_address, patient_mobilenumber)" + "values (?, ?, ?, ?, ?, ?)");
            
            ps.setInt(1, hos.getPatient_id());
            ps.setString(2, hos.getPatient_name());
            ps.setInt(3,hos.getPatient_age());
            ps.setString(4, hos.getPatient_gender());
            ps.setString(5, hos.getPatient_address());
            ps.setString(6, hos.getPatient_mobileNumber());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Patient info saved...");
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this, "SQL Exception Error...");
        } finally {
            closeConnectionAndStatement(conn, ps, null);
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
            // TODO add your handling code here:
            setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        txtPatientId.setText("");
        txtPatientName.setText("");
        txtPatientAge.setText("");
        txtPatientAddress.setText("");
        txtPatientMobile.setText("");
        
        txtPatientId.setEnabled(true);
        txtPatientName.setEnabled(true);
        txtPatientAge.setEnabled(true);
        txtPatientAddress.setEnabled(true);
        txtPatientMobile.setEnabled(true);
    }//GEN-LAST:event_btnNewActionPerformed
    private static void closeConnectionAndStatement(Connection conn,PreparedStatement ps, Statement stmt) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "SQL Exception Error...");
                        }
                    }
        if (conn != null) {
            try {
                 conn.close();
                } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQL Exception Error...");
                }
        }
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
            java.util.logging.Logger.getLogger(PatientAddFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientAddFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientAddFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientAddFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientAddFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txtPatientAddress;
    private javax.swing.JTextField txtPatientAge;
    private javax.swing.JComboBox<String> txtPatientGender;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientMobile;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
}
