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
import javax.swing.table.DefaultTableModel;
public class AppointmentDeleteFrm extends javax.swing.JFrame {

    List<Hospital> hospital = new ArrayList<Hospital>();
    Hospital hos = new Hospital(0, " ", " ", " ", "");
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    static int vPcode;
    public AppointmentDeleteFrm() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtVSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAppointment = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtClose = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setForeground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DELETE APPOINTMENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));
        getContentPane().add(txtVSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 122, 264, -1));

        tblAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Doctor Name", "Specialization", "Date", "Time"
            }
        ));
        jScrollPane1.setViewportView(tblAppointment);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 615, 176));

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/photo_2024-05-22_12-18-29-removebg-preview.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/photo_2024-05-22_12-22-05-removebg-preview.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel2.setText("Search ");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtClose.setText("Close");
        txtClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(txtClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addGap(147, 147, 147))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtClose, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 750, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        vPcode = Integer.parseInt(txtVSearch.getText());
        search(vPcode);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
          String ans;
        ans = JOptionPane.showInputDialog("Are you sure to delete this record? [Y/N]?");
        if (ans.equalsIgnoreCase("Y")) {
        deleteNow(vPcode); 
        
       tblAppointment.setModel(new DefaultTableModel(null, new String[]{"Patient ID", "Patient Name", "Doctor Name", "Specialization", "Date", "Time"}));
       txtVSearch.setText("");
       btnSearch.setEnabled(true);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCloseActionPerformed
       setVisible(false);
    }//GEN-LAST:event_txtCloseActionPerformed
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
        ps = conn.prepareStatement("DELETE FROM hms.appointment WHERE patient_id=?");
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
       
      
    String sql = "SELECT * FROM hms.appointment WHERE patient_id = ?";
    
        try{
            conn = DriverManager.getConnection(host, userName, password);
            pst = conn.prepareStatement(sql);
            pst.setInt(1, vPcode);
            rs = pst.executeQuery();
            
            
            DefaultTableModel model = (DefaultTableModel) tblAppointment.getModel();
            model.setRowCount(0);
            
            boolean recordFound = false;
            while(rs.next()){
                
                recordFound = true;
                Object[] row = {
                    
                    rs.getInt("patient_id"),
                    rs.getString("patient_name"),
                    rs.getString("doctor_name"),
                    rs.getString("doctor_specialization"),
                    rs.getString("date"),
                    rs.getString("time")
                    
                };
                model.addRow(row); 
            }
            
            if(!recordFound){
                JOptionPane.showMessageDialog(this, "No appointment found");
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
            java.util.logging.Logger.getLogger(AppointmentDeleteFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentDeleteFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentDeleteFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentDeleteFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentDeleteFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAppointment;
    private javax.swing.JButton txtClose;
    private javax.swing.JTextField txtVSearch;
    // End of variables declaration//GEN-END:variables
}
