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
public class PrescriptionAddFrm extends javax.swing.JFrame {

    List<Hospital> diagnosis = new ArrayList<Hospital>();
    Hospital pres = new Hospital(0, "", "", "", "", "","");
    static int vPcode;
    public PrescriptionAddFrm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtDiagnose = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMedicine = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRemark = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAdvice = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtVSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtClose = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Diagnose");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 177, -1, -1));

        txtDiagnose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiagnoseActionPerformed(evt);
            }
        });
        getContentPane().add(txtDiagnose, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 174, 302, -1));

        jLabel5.setText("Medicine");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 221, -1, -1));

        txtMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicineActionPerformed(evt);
            }
        });
        getContentPane().add(txtMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 218, 302, -1));

        jLabel6.setText("Doctor Remark");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 278, -1, -1));

        txtRemark.setColumns(20);
        txtRemark.setRows(5);
        jScrollPane1.setViewportView(txtRemark);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 256, 302, 75));

        jLabel7.setText("Doctor Advice");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 369, -1, -1));

        txtAdvice.setColumns(20);
        txtAdvice.setRows(5);
        jScrollPane2.setViewportView(txtAdvice);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 349, 302, 83));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD PRESCRIPTION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 11, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/Download_Doctor_with_Medical_mask_background_for_free-removebg-preview.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 250, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 90, 30));

        jLabel2.setText("Search Patient ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        txtVSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVSearchActionPerformed(evt);
            }
        });
        jPanel1.add(txtVSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 148, 20));

        jLabel3.setText("Patient Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 209, -1));

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 70, 30));

        txtClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/Medische_en_medische_achtergrond_met_elektrocardiogram___Gratis_Vector-removebg-preview.png"))); // NOI18N
        txtClose.setText("jLabel9");
        jPanel1.add(txtClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 590, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 782, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVSearchActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void txtDiagnoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiagnoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiagnoseActionPerformed

    private void txtMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicineActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
         vPcode = Integer.parseInt(txtVSearch.getText());
         searchPatient();
         txtPatientName.setEnabled(false);
         txtVSearch.setEnabled(false);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        pres.setPatient_id(Integer.parseInt(txtVSearch.getText()));
        pres.setPatient_name(txtPatientName.getText());
        pres.setDiagnose(txtDiagnose.getText());
        pres.setMedicine(txtMedicine.getText());
        pres.setRemark(txtRemark.getText());
        pres.setAdvice(txtAdvice.getText());
        
        String host = "jdbc:derby://localhost:1527/Hospital";
        String userName = "hms";
        String password = "123";
        
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = DriverManager.getConnection(host, userName, password);
            
            ps = conn.prepareStatement("INSERT INTO hms.prescription (patient_id, patient_name, diagnose, medicine, remark, advice)" + "values (?, ?, ?, ?, ?, ?)");
            
            ps.setInt(1, pres.getPatient_id());
            ps.setString(2, pres.getPatient_name());
            ps.setString(3, pres.getDiagnose());
            ps.setString(4, pres.getMedicine());
            ps.setString(5, pres.getRemark());
            ps.setString(6, pres.getAdvice());
          
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Prescription saved...");
            
        } catch (SQLException err){
            JOptionPane.showMessageDialog(this, err.getMessage());
        } finally {
            closeConnectionAndStatement(conn, ps, null);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
public void searchPatient(){
     int patientKey;
     boolean ifExists = false;
     pres.setPatient_id(vPcode);
     patientKey= pres.getPatient_id();
      ifExists = test(patientKey);
     
     if (!ifExists){
         JOptionPane.showMessageDialog(null,"Patient ID not found","Search",JOptionPane.WARNING_MESSAGE);
     }
     
 }
    public boolean test(int vPatId){
               List<Hospital> pre = new ArrayList<Hospital>();
               boolean found = false;
               pre = getAllPatient();
               for ( Hospital patient : pre){
                   if (patient.getPatient_id() == vPatId){
                       txtVSearch.setText(Integer.toString(patient.getPatient_id()));
                       txtPatientName.setText(patient.getPatient_name());
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
       
       java.sql.Connection conn = null; 
        java.sql.Statement st = null;
        ResultSet rs = null;
        
        List<Hospital> hospital = new ArrayList<Hospital>();
        
        try{
            conn = DriverManager.getConnection(host, userName, password);
            st = conn.createStatement();
                    
            rs = st.executeQuery("SELECT patient_id, patient_name from hms.patient");  
             
             while(rs.next()){
                Hospital hos = new Hospital(0, " ", 0, " ", " ", "");
                hos.setPatient_id(rs.getInt("patient_id"));
                hos.setPatient_name(rs.getString("patient_name"));
                hospital.add(hos);
             }
        } catch (SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }finally{
            closeConnectionAndStatement(conn, null, st);
        }
       return hospital; 
   }
   private static void closeConnectionAndStatement(Connection conn,PreparedStatement ps, Statement st) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());
                        }
                    }
        if (conn != null) {
            try {
                 conn.close();
                } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
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
            java.util.logging.Logger.getLogger(PrescriptionAddFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrescriptionAddFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrescriptionAddFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrescriptionAddFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrescriptionAddFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAdvice;
    private javax.swing.JLabel txtClose;
    private javax.swing.JTextField txtDiagnose;
    private javax.swing.JTextField txtMedicine;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextArea txtRemark;
    private javax.swing.JTextField txtVSearch;
    // End of variables declaration//GEN-END:variables
}
