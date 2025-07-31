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

public class DoctorAddFrm extends javax.swing.JFrame {
    
    List<Hospital> Hospital = new ArrayList<Hospital>();
    Hospital doc = new Hospital(0, " ", " ");
    
    

    public DoctorAddFrm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDoctorId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDoctorName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDoctorSpec = new javax.swing.JComboBox<>();
        btnClose = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Doctor Information");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD DOCTOR INFORMATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 558, -1));

        jLabel3.setText("Doctor ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, 20));
        getContentPane().add(txtDoctorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 240, 30));

        jLabel4.setText("Doctor Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));
        getContentPane().add(txtDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 240, 30));

        jLabel5.setText("Specialization");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        txtDoctorSpec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiologist", "Dermatologist", "Neurologist", "Obstetrician", "Nephrologist", "Oncologist", "Pediatrician", "Radiologist", " " }));
        getContentPane().add(txtDoctorSpec, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 240, 30));

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/add doctor.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        doc.setDoc_id(Integer.parseInt(txtDoctorId.getText()));
        doc.setDoc_name(txtDoctorName.getText());
        String selectedValue = txtDoctorSpec.getSelectedItem().toString();
        doc.setDoc_specialization(selectedValue);
        
        String host = "jdbc:derby://localhost:1527/Hospital";
        String userName = "hms";
        String password = "123";
        
        Connection conn = null;
        PreparedStatement ps = null;
        
       try{
         conn = DriverManager.getConnection(host, userName, password);
         
         ps = conn.prepareStatement("INSERT INTO hms.doctor (doctor_id, doctor_name, doctor_specialization)" + "values (?, ?, ?)");
         
         ps.setInt(1, doc.getDoc_id());
         ps.setString(2, doc.getDoc_name());
         ps.setString(3, doc.getDoc_specialization());
         ps.executeUpdate();
         
         JOptionPane.showMessageDialog(this, "Doctor info saved...");

       } catch (SQLException e){
           JOptionPane.showMessageDialog(this, "SQL Exception Error...");
       }finally{
           closeConnectionAndStatement(conn, ps, null);
       }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
       setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtDoctorId.setText("");
        txtDoctorName.setText("");
        
        txtDoctorId.setEnabled(true);
        txtDoctorName.setEnabled(true);
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
            java.util.logging.Logger.getLogger(DoctorAddFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorAddFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorAddFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorAddFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorAddFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDoctorId;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JComboBox<String> txtDoctorSpec;
    // End of variables declaration//GEN-END:variables
}
