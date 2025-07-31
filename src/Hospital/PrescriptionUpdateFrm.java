/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
public class PrescriptionUpdateFrm extends javax.swing.JFrame {
    List<Hospital> hospital = new ArrayList<Hospital>();
    Hospital hos = new Hospital(0, " ", " ", " ", "");
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    static int vPcode;
    
    public PrescriptionUpdateFrm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtVSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDiagnose = new javax.swing.JTextField();
        txtMedicine = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRemark = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAdvice = new javax.swing.JTextArea();
        btnSearch = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtClose = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/photo_2024-05-22_12-22-05-removebg-preview.png"))); // NOI18N
        jLabel9.setText("jLabel9");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Search Patient ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 95, -1, -1));

        txtVSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVSearchActionPerformed(evt);
            }
        });
        getContentPane().add(txtVSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 92, 134, -1));

        jLabel3.setText("Patient Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 95, -1, -1));
        getContentPane().add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 92, 219, -1));

        jLabel4.setText("Diagnose");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 157, -1, -1));

        jLabel5.setText("Medicine");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 195, -1, -1));

        jLabel6.setText("Remark");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 242, -1, -1));

        jLabel7.setText("Advice");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 321, -1, -1));
        getContentPane().add(txtDiagnose, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 154, 227, -1));
        getContentPane().add(txtMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 192, 227, -1));

        txtRemark.setColumns(20);
        txtRemark.setRows(5);
        txtRemark.setText("\n");
        jScrollPane1.setViewportView(txtRemark);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 230, 309, 73));

        txtAdvice.setColumns(20);
        txtAdvice.setRows(5);
        jScrollPane2.setViewportView(txtAdvice);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 321, 309, 70));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 91, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UPDATE PRESCRIPTION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 900, 80));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/photo_2024-05-22_12-22-05-removebg-preview.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 270, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/Q-removebg-preview.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-280, 110, 560, -1));

        txtClose.setText("Close");
        txtClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCloseActionPerformed(evt);
            }
        });
        jPanel1.add(txtClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 120, 30));

        btnSave.setText("Save Changes");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 898, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        vPcode = Integer.parseInt(txtVSearch.getText());
         searchPatient();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        hos.setPatient_id(Integer.parseInt(txtVSearch.getText()));
        hos.setPatient_name(txtPatientName.getText());
        hos.setDiagnose(txtDiagnose.getText());
        hos.setMedicine(txtMedicine.getText());
        hos.setRemark(txtRemark.getText());
        hos.setAdvice(txtAdvice.getText());
        
        String host = "jdbc:derby://localhost:1527/Hospital";
        String userName = "hms";
        String password = "123";
        
        Connection conn = null;
        PreparedStatement ps = null;
        
         try{
            conn = DriverManager.getConnection(host, userName, password);
            
            ps = conn.prepareStatement("UPDATE hms.prescription SET patient_name = ?, diagnose= ?, medicine =? , remark = ?, advice = ?  WHERE patient_id = ?");
            
         
            ps.setString(1, hos.getPatient_name());
            ps.setString(2, hos.getDiagnose());
            ps.setString(3, hos.getMedicine());
            ps.setString(4, hos.getRemark());
            ps.setString(5, hos.getAdvice());
            ps.setInt(6,hos.getPatient_id());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Prescription updated...");
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } finally {
            closeConnectionAndStatement(conn, ps, null);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCloseActionPerformed
       setVisible(false); 
    }//GEN-LAST:event_txtCloseActionPerformed
public void searchPatient(){

       int patientKey;
      boolean ifExists = false;
      
   
     Hospital patient = new Hospital(0, " ", " ", " ", "");
     patient.setPatient_id(vPcode);
     patientKey= patient.getPatient_id();
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
               txtDiagnose.setText(patient.getDiagnose());
               txtMedicine.setText(patient.getMedicine());
               txtRemark.setText(patient.getRemark());
               txtAdvice.setText(patient.getAdvice());
                            
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
                    
            rs = st.executeQuery("SELECT patient_id, patient_name,diagnose, medicine, remark, advice  from hms.prescription" );  
             
             while(rs.next()){
                Hospital hos = new Hospital(0, " ", " ", " ", "");
                hos.setPatient_id(rs.getInt("patient_id"));
                hos.setPatient_name(rs.getString("patient_name"));
                hos.setDiagnose(rs.getString("diagnose"));
                hos.setMedicine(rs.getString("medicine"));
                hos.setRemark(rs.getString("remark"));
                hos.setAdvice(rs.getString("advice"));
                hospital.add(hos);
             }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
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
                JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    }
        if (conn != null) {
            try {
                 conn.close();
                } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
                }
        }
   }
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
            java.util.logging.Logger.getLogger(PrescriptionUpdateFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrescriptionUpdateFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrescriptionUpdateFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrescriptionUpdateFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrescriptionUpdateFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAdvice;
    private javax.swing.JButton txtClose;
    private javax.swing.JTextField txtDiagnose;
    private javax.swing.JTextField txtMedicine;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextArea txtRemark;
    private javax.swing.JTextField txtVSearch;
    // End of variables declaration//GEN-END:variables
}
