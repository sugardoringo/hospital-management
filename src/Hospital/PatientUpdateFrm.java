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
import javax.swing.*;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Admin
 */
public class PatientUpdateFrm extends javax.swing.JFrame {
    List<Hospital> hospital = new ArrayList<Hospital>();
    Hospital hos = new Hospital(0, " ", 0, " ", " ", "");
    
    static int vPcode;
    public PatientUpdateFrm() {
        initComponents();
        
        btnSearch.setEnabled(false);
       
        
        btnSaveChanges.setEnabled(false);
       
        
        txtPatientID.setText("");
        txtPatientName.setText("");
        txtPatientAge.setText("");
        txtPatientGender.setText("");
        txtPatientAddress.setText("");
        txtPatientMobile.setText("");
        
        txtPatientID.setEnabled(false);
        txtPatientName.setEnabled(false);
        txtPatientAge.setEnabled(false);
        txtPatientGender.setEnabled(false);
        txtPatientAddress.setEnabled(false);
        txtPatientMobile.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtVSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPatientAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPatientGender = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPatientAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPatientMobile = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnSaveChanges = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UPDATE PATIENT RECORD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 80));

        jLabel2.setText("Search Patient ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        txtVSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVSearchActionPerformed(evt);
            }
        });
        jPanel1.add(txtVSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 211, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jLabel8.setText("Patient ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        txtPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 211, -1));

        jLabel3.setText("Patient Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));
        jPanel1.add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 211, -1));

        jLabel4.setText("Age");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        txtPatientAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientAgeActionPerformed(evt);
            }
        });
        jPanel1.add(txtPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 211, -1));

        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));
        jPanel1.add(txtPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 211, -1));

        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));
        jPanel1.add(txtPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 216, -1));

        jLabel7.setText("Mobiile Number");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        txtPatientMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientMobileActionPerformed(evt);
            }
        });
        jPanel1.add(txtPatientMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 216, -1));

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 70, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/Download_Doctor_with_Medical_mask_background_for_free-removebg-preview.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, -1));

        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveChanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 110, 30));

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 70, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/photo_2024-05-22_12-18-29-removebg-preview.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 240, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        vPcode = Integer.parseInt(txtVSearch.getText());
         searchPatient();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtVSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVSearchActionPerformed
        btnSearch.setEnabled(true);
    
        txtPatientID.setEnabled(false);
        txtPatientName.setEnabled(true);
        txtPatientAge.setEnabled(true);
        txtPatientGender.setEnabled(true);
        txtPatientAddress.setEnabled(true);
        txtPatientMobile.setEnabled(true);
        
        btnSaveChanges.setEnabled(true);
    }//GEN-LAST:event_txtVSearchActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        hos.setPatient_id(Integer.parseInt(txtPatientID.getText()));
        hos.setPatient_name(txtPatientName.getText());
        hos.setPatient_age(Integer.parseInt(txtPatientAge.getText()));
        hos.setPatient_gender(txtPatientGender.getText());
        hos.setPatient_address(txtPatientAddress.getText());
        hos.setPatient_mobileNumber(txtPatientMobile.getText());
        
        String host = "jdbc:derby://localhost:1527/Hospital";
        String userName = "hms";
        String password = "123";
        
        Connection conn = null;
        PreparedStatement ps = null;
        
         try{
            conn = DriverManager.getConnection(host, userName, password);
            
            ps = conn.prepareStatement("UPDATE hms.patient SET patient_name = ?, patient_age = ?, patient_gender = ?, patient_address = ?, patient_mobilenumber = ? WHERE patient_id = ?");
            
         
            ps.setString(1, hos.getPatient_name());
            ps.setInt(2,(int)hos.getPatient_age());
            ps.setString(3, hos.getPatient_gender());
            ps.setString(4, hos.getPatient_address());
            ps.setString(5, hos.getPatient_mobileNumber());
            ps.setInt(6,hos.getPatient_id());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Patient updated...");
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this, "SQL Exception Error...");
        } finally {
            closeConnectionAndStatement(conn, ps, null);
        }
         
         btnSearch.setEnabled(false);
        
         btnSaveChanges.setEnabled(false);
      
        
        txtPatientID.setText("");
        txtPatientName.setText("");
        txtPatientAge.setText("");
        txtPatientGender.setText("");
        txtPatientAddress.setText("");
        txtPatientMobile.setText("");
        
        txtPatientID.setEnabled(true);
        txtPatientName.setEnabled(false);
        txtPatientAge.setEnabled(false);
        txtPatientGender.setEnabled(false);
        txtPatientAddress.setEnabled(false);
        txtPatientMobile.setEnabled(false);
         
         txtPatientID.requestFocus();
        
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void txtPatientMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientMobileActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtVSearch.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtPatientAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientAgeActionPerformed

    private void txtPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIDActionPerformed
    public void searchPatient(){
     txtPatientName.setEnabled(false);
     txtPatientAge.setEnabled(false);
     txtPatientGender.setEnabled(false);
     txtPatientAddress.setEnabled(false);
     txtPatientMobile.setEnabled(false);
       int patientKey;
      boolean ifExists = false;
      
   
     Hospital patient = new Hospital(0, " ", 0, " ", " ", "");
     patient.setPatient_id(vPcode);
     patientKey= patient.getPatient_id();
      ifExists = testPatientId(patientKey);
     
     if (!ifExists){
         JOptionPane.showMessageDialog(null,"Patient ID not found","Search",JOptionPane.WARNING_MESSAGE);
         btnSearch.setEnabled(false);
        
     } else {
       
         btnSearch.setEnabled(false);
     }
 }
   public boolean testPatientId(int vPatId){
       List<Hospital> pat = new ArrayList<Hospital>();
       boolean found = false;
       pat = getAllPatient();
       for ( Hospital patient : pat){
           if (patient.getPatient_id() == vPatId){
               txtPatientID.setText(Integer.toString(patient.getPatient_id()));
               txtPatientName.setText(patient.getPatient_name());
               txtPatientAge.setText(Integer.toString(patient.getPatient_age()));
               txtPatientGender.setText(patient.getPatient_gender());
               txtPatientAddress.setText(patient.getPatient_address());
               txtPatientMobile.setText(patient.getPatient_mobileNumber());
               
               found = true;
               break;
           }
       }
       if(found){
           return true;
       }else {
           return false;
       }
   }
   
   public static List<Hospital> getAllPatient(){
       String host = "jdbc:derby://localhost:1527/Hospital";
       String userName = "hms";
       String password = "123";
       
       java.sql.Connection conn = null; // import java.sql
        java.sql.Statement st = null; // import java.sql
        ResultSet rs = null; // import java.sql
        
        List<Hospital> hospital = new ArrayList<Hospital>();
        
        try{
            conn = DriverManager.getConnection(host, userName, password);
            st = conn.createStatement();
                    
            rs = st.executeQuery("SELECT patient_id, patient_name, patient_age, patient_gender, patient_address, patient_mobilenumber from hms.patient");  
             
             while(rs.next()){
                Hospital hos = new Hospital(0, " ", 0, " ", " ", "");
                hos.setPatient_id(rs.getInt("patient_id"));
                hos.setPatient_name(rs.getString("patient_name"));
                hos.setPatient_age(rs.getInt("patient_age"));
                hos.setPatient_gender(rs.getString("patient_gender"));
                hos.setPatient_address(rs.getString("patient_address"));
                hos.setPatient_mobileNumber(rs.getString("patient_mobilenumber"));
                hospital.add(hos);
             }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "SQL Exception error...");
        }finally{
            closeConnectionAndStatement(conn, null, st);
        }
       return hospital; 
   }
   private static void closeConnectionAndStatement(Connection conn,PreparedStatement ps, Statement st) {
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
            java.util.logging.Logger.getLogger(PatientUpdateFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientUpdateFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientUpdateFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientUpdateFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientUpdateFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtPatientAddress;
    private javax.swing.JTextField txtPatientAge;
    private javax.swing.JTextField txtPatientGender;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPatientMobile;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtVSearch;
    // End of variables declaration//GEN-END:variables
}
