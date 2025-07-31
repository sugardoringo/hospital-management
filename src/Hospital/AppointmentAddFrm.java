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
public class AppointmentAddFrm extends javax.swing.JFrame {
    List<Hospital> hospital = new ArrayList<Hospital>();
    Hospital hos = new Hospital(0, " ", " ", " ", "");
    
    static int vPcode;
    public AppointmentAddFrm() {
        initComponents();
        doctorBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtVSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtPatientId = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        doctorComboBox = new javax.swing.JComboBox<>();
        timecomboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtSpec = new javax.swing.JTextField();
        btnClosee = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtAraw = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/Q-removebg-preview.png"))); // NOI18N
        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Search Patient ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));
        getContentPane().add(txtVSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 200, -1));

        jLabel2.setText("Patient ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 133, -1, -1));

        jLabel3.setText("Patient Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 175, -1, -1));

        jLabel5.setText("Doctor");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 219, -1, -1));

        jLabel6.setText("Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Time");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 347, -1, -1));

        btnAdd.setText("Add Appointment");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 409, -1, -1));
        getContentPane().add(txtPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 130, 208, -1));

        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 172, 208, -1));

        doctorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(doctorComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 216, 208, -1));

        timecomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7am", "8am", "9am", "10am", "11am", "1pm", "2pm", "3pm", "4pm", " " }));
        getContentPane().add(timecomboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 344, 208, -1));

        jLabel4.setText("Specialization");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 263, -1, -1));
        getContentPane().add(txtSpec, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 260, 208, -1));

        btnClosee.setText("Close");
        btnClosee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseeActionPerformed(evt);
            }
        });
        getContentPane().add(btnClosee, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 409, -1, -1));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        txtAraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArawActionPerformed(evt);
            }
        });
        getContentPane().add(txtAraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 208, -1));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ADD APPOINTMENT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(162, 162, 162))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(8, 8, 8))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/photo_2024-05-22_12-22-05-removebg-preview.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 220, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/Download_Close_up_Doctor_with_stethoscope_Medical_vector_for_free-removebg-preview.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 370, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 630, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doctorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorComboBoxActionPerformed
        searchDatabase((String) doctorComboBox.getSelectedItem());
        txtSpec.setEnabled(false);
    }//GEN-LAST:event_doctorComboBoxActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
          vPcode = Integer.parseInt(txtVSearch.getText());
         searchPatient();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        hos.setPatient_id(Integer.parseInt(txtPatientId.getText()));
        hos.setPatient_name(txtPatientName.getText());
        String selectedValue = doctorComboBox.getSelectedItem().toString();
        hos.setDoc_name(selectedValue);
        hos.setDoc_specialization(txtSpec.getText());
        
        hos.setDate(txtAraw.getText());
        
        String selectedItem = timecomboBox.getSelectedItem().toString();
        hos.setTime(selectedItem);
        
        
        String host = "jdbc:derby://localhost:1527/Hospital";
        String userName = "hms";
        String password = "123";
        
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = DriverManager.getConnection(host, userName, password);
            
            ps = conn.prepareStatement("INSERT INTO hms.appointment (patient_id, patient_name, doctor_name, doctor_specialization, time, date)" + "values (?, ?, ?, ?, ?, ?)");
            
            ps.setInt(1, hos.getPatient_id());
            ps.setString(2, hos.getPatient_name());
            ps.setString(3,hos.getDoc_name());
            ps.setString(4, hos.getDoc_specialization());
            ps.setString(5, hos.getTime());
            ps.setString(6, hos.getDate());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Appointment saved...");
            
        } catch (SQLException err){
            JOptionPane.showMessageDialog(this, err.getMessage());
        } finally {
            closeConnectionAndStatement(conn, ps, null);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCloseeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseeActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCloseeActionPerformed

    private void txtArawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArawActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArawActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtVSearch.setText("");
        txtPatientId.setText("");
        txtPatientName.setText("");
        
    }//GEN-LAST:event_btnClearActionPerformed
public void searchPatient(){
     txtPatientName.setEnabled(false);
     txtPatientId.setEnabled(false);
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
                       txtPatientId.setText(Integer.toString(patient.getPatient_id()));
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
       
       java.sql.Connection conn = null; // import java.sql
        java.sql.Statement st = null; // import java.sql
        ResultSet rs = null; // import java.sql
        
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
     public void doctorBox(){
        String host = "jdbc:derby://localhost:1527/Hospital";
        String userName = "hms";
        String password = "123";
        
        Connection con;
        
        
        String sql = "SELECT * FROM hms.doctor";
        
        try{
          con = DriverManager.getConnection(host, userName, password);
          PreparedStatement ps = con.prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
            while(rs.next()){
                doctorComboBox.addItem(rs.getString("doctor_name"));
            }
        } catch (SQLException err){
            JOptionPane.showMessageDialog(this, err.getMessage());
        }
  }
 private void searchDatabase(String selectedValue) {
        String host = "jdbc:derby://localhost:1527/Hospital";
       String userName = "hms";
       String password = "123";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Establish a connection to the database
            conn = DriverManager.getConnection(host, userName, password);

            // Create a SQL query to search for the selected value
            String sql = "SELECT doctor_specialization FROM hms.doctor WHERE doctor_name = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, selectedValue);

            // Execute the query
            rs = pstmt.executeQuery();

            // Process the result set
            if (rs.next()) {
                String result = rs.getString("doctor_specialization");
                txtSpec.setText(result);
            } else {
                txtSpec.setText("No result found");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            txtSpec.setText("Error occurred");
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
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
            java.util.logging.Logger.getLogger(AppointmentAddFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentAddFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentAddFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentAddFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentAddFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClosee;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> doctorComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> timecomboBox;
    private javax.swing.JTextField txtAraw;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtSpec;
    private javax.swing.JTextField txtVSearch;
    // End of variables declaration//GEN-END:variables
}
