/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

/**
 *
 * @author Admin
 */
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
import javax.swing.table.DefaultTableModel;
public class DoctorDeleteFrm extends javax.swing.JFrame {
    List<Hospital> hospital = new ArrayList<Hospital>();
    Hospital hos = new Hospital(0, " ", "");
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    static int vPcode;
    public DoctorDeleteFrm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtVSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 80, 30));

        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Doctor ID", "Name", "Specialization"
            }
        ));
        jScrollPane1.setViewportView(tblDoctor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 520, 64));

        jLabel1.setText("Search Patiend ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        txtVSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVSearchActionPerformed(evt);
            }
        });
        jPanel1.add(txtVSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 113, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 80, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/add doctor.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 560, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DELETE DOCTOR RECORD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1042, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, 0, 570, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String ans;
        ans = JOptionPane.showInputDialog("Are you sure to delete this record? [Y/N]?");
        if (ans.equalsIgnoreCase("Y")) {
        deleteNow(vPcode); 
        
       tblDoctor.setModel(new DefaultTableModel(null, new String[]{"Doctor ID", "Doctor Name", "Doctor Specialization"}));
       txtVSearch.setText("");
       btnSearch.setEnabled(true);
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        vPcode = Integer.parseInt(txtVSearch.getText());
        search(vPcode);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtVSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVSearchActionPerformed

     private void deleteNow(int docKey) {
    String host = "jdbc:derby://localhost:1527/Hospital";
    String userName = "hms";
    String password = "123";
    
    Hospital hospital = new Hospital( 0, " ", " ");
    hospital.setDoc_id(docKey);
    
    java.sql.Connection conn = null; 
    java.sql.PreparedStatement ps = null;
    try {
    conn = DriverManager.getConnection(host, userName, password);
        ps = conn.prepareStatement("DELETE FROM hms.doctor WHERE doctor_id=?");
        ps.setInt(1, hospital.getDoc_id());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Delete Successful...");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "SQL Exception Error...");
    } finally {
         closeConnectionAndStatement(conn, ps, null);
    }
    btnSearch.setEnabled(false);
   
    btnDelete.setEnabled(false);
 
}
     public void search(int searchTerm){
       String host = "jdbc:derby://localhost:1527/Hospital";
       String userName = "hms";
       String password = "123";
       
      
    String sql = "SELECT * FROM hms.doctor WHERE doctor_id = ?";
    
        try{
            conn = DriverManager.getConnection(host, userName, password);
            pst = conn.prepareStatement(sql);
            pst.setInt(1, vPcode);
            rs = pst.executeQuery();
            
            
            DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
            model.setRowCount(0);
            
            boolean recordFound = false;
            while(rs.next()){
                
                recordFound = true;
                Object[] row = {
                    
                    rs.getInt("doctor_id"),
                    rs.getString("doctor_name"),
                    rs.getString("doctor_specialization")
                    
                };
                model.addRow(row); 
            }
            
            if(!recordFound){
                JOptionPane.showMessageDialog(this, "No doctor found");
                return;
            }
        } catch(Exception e){
          JOptionPane.showMessageDialog(null,e);

        }
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
            java.util.logging.Logger.getLogger(DoctorDeleteFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorDeleteFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorDeleteFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorDeleteFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorDeleteFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTextField txtVSearch;
    // End of variables declaration//GEN-END:variables
}
