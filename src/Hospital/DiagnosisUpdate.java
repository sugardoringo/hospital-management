/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;
import java.awt.BorderLayout;
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
public class DiagnosisUpdate extends javax.swing.JFrame {
List<Hospital> hospital = new ArrayList<Hospital>();
    Hospital hos = new Hospital(0, " ", " ", " ", "","", "");
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    static int vPcode;
    public DiagnosisUpdate() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        txtTemperature = new javax.swing.JTextField();
        txtPulse = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSymptoms = new javax.swing.JTextArea();
        txtDiagnose = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtVSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        jLabel4.setText("Blood Pressure");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 219, -1, -1));

        jLabel5.setText("Temperature");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 280, -1, -1));

        jLabel6.setText("Pulse Rate");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 343, -1, -1));

        jLabel7.setText("Symptoms");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 412, -1, -1));
        getContentPane().add(txtBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 216, 377, -1));

        txtTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperatureActionPerformed(evt);
            }
        });
        getContentPane().add(txtTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 277, 377, -1));
        getContentPane().add(txtPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 343, 377, -1));

        txtSymptoms.setColumns(20);
        txtSymptoms.setRows(5);
        jScrollPane1.setViewportView(txtSymptoms);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 403, 377, 82));

        txtDiagnose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiagnoseActionPerformed(evt);
            }
        });
        getContentPane().add(txtDiagnose, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 503, 377, -1));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UPDATE DIAGNOSIS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(37, 37, 37))
        );

        btnSave.setText("Save Changes");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel2.setText("Search Patient ID");

        jLabel3.setText("Patient Name");

        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/Download_Close_up_Doctor_with_stethoscope_Medical_vector_for_free-removebg-preview.png"))); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel8.setText("Diagnose");

        txtClose.setText("Close");
        txtClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel8)
                        .addGap(252, 252, 252))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSave)
                                .addGap(32, 32, 32)
                                .addComponent(txtClose, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(txtClose))
                        .addGap(41, 41, 41))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 880, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
      hos.setPatient_id(Integer.parseInt(txtVSearch.getText()));
      hos.setPatient_name(txtPatientName.getText());
      hos.setBloodPressure(txtBloodPressure.getText());
      hos.setTemperature(txtTemperature.getText());
      hos.setPulseRate(txtPulse.getText());
      hos.setSymptoms(txtSymptoms.getText());
      hos.setDiagnose(txtDiagnose.getText());
       
        String host = "jdbc:derby://localhost:1527/Hospital";
        String userName = "hms";
        String password = "123";
        
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            conn = DriverManager.getConnection(host, userName, password);
            
            ps = conn.prepareStatement("UPDATE hms.diagnosis SET patient_name = ?, bloodpressure = ?, temperature = ?, pulserate = ?, symptoms = ?, diagnose = ? WHERE patient_id = ?");
            
         
            ps.setString(1, hos.getPatient_name());
            ps.setString(2, hos.getBloodPressure());
            ps.setString(3, hos.getTemperature());
            ps.setString(4, hos.getPulseRate());
            ps.setString(5, hos.getSymptoms());
            ps.setString(6, hos.getDiagnose());
            ps.setInt(7, hos.getPatient_id());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Diagnosis updated...");
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } finally {
            closeConnectionAndStatement(conn, ps, null);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperatureActionPerformed

    private void txtDiagnoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiagnoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiagnoseActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       vPcode = Integer.parseInt(txtVSearch.getText());
         searchPatient();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void txtCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_txtCloseActionPerformed

    public void searchPatient(){
     int patientKey;
      boolean ifExists = false;

     Hospital patient = new Hospital(0, " ", " ", " ", "", "", "");
     patient.setPatient_id(vPcode);
     patientKey = patient.getPatient_id();
     ifExists = testPatientId(patientKey);
     
     if (!ifExists){
         JOptionPane.showMessageDialog(null,"Patient ID not found","Search",JOptionPane.WARNING_MESSAGE);
    
        
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
               txtVSearch.setText(Integer.toString(patient.getPatient_id()));
               txtPatientName.setText(patient.getPatient_name());
               txtBloodPressure.setText(patient.getBloodPressure());
               txtTemperature.setText(patient.getTemperature());
               txtPulse.setText(patient.getPulseRate());
               txtSymptoms.setText(patient.getSymptoms());
               txtDiagnose.setText(patient.getDiagnose());
                            
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
                    
            rs = st.executeQuery("SELECT patient_id, patient_name, bloodpressure, temperature, pulserate, symptoms, diagnose from hms.diagnosis" );  
             
             while(rs.next()){
                Hospital hos = new Hospital(0, " ", " ", " ", "", "", "");
                hos.setPatient_id(rs.getInt("patient_id"));
                hos.setPatient_name(rs.getString("patient_name"));
                hos.setBloodPressure(rs.getString("bloodpressure"));
                hos.setTemperature(rs.getString("temperature"));
                hos.setPulseRate(rs.getString("pulserate"));
                hos.setSymptoms(rs.getString("symptoms"));
                hos.setDiagnose(rs.getString("diagnose"));
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
            java.util.logging.Logger.getLogger(DiagnosisUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiagnosisUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiagnosisUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiagnosisUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiagnosisUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JButton txtClose;
    private javax.swing.JTextField txtDiagnose;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextArea txtSymptoms;
    private javax.swing.JTextField txtTemperature;
    private javax.swing.JTextField txtVSearch;
    // End of variables declaration//GEN-END:variables
}
