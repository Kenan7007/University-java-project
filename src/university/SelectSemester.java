
package university;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class SelectSemester extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement com = null;
    ResultSet rst = null;
    
    String sem;
    
    public SelectSemester() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("image/university-331279047401mXI3.jpg")).getImage());
        
        Start();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jRadioButton1.setBackground(new java.awt.Color(5, 5, 48));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("First Semester");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(40, 80, 220, 25);

        jRadioButton2.setBackground(new java.awt.Color(5, 5, 48));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Second Semester");
        jRadioButton2.setToolTipText("");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(320, 80, 220, 25);

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(6, 6, 98));
        jButton1.setText("Apply");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 140, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/semester.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 290);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(6, 6, 98));
        jLabel2.setText("Select The Semester");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 260, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(591, 312));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if(jRadioButton1.isSelected()){
        if(jRadioButton1.getText().equals(sem)){
            JOptionPane.showMessageDialog(null, "Can not edit because semester is currently in progress" , "" , 2);
        }else{
            UpdateFirst();
        }
     }else if(jRadioButton2.isSelected()){  
        if(jRadioButton2.getText().equals(sem)){
            JOptionPane.showMessageDialog(null, "Can not edit because semester is currently in progress" , "" , 2);
        }else{
            UpdateSecond();
        }
     }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SelectSemester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectSemester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectSemester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectSemester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectSemester().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables

    private void Start() {
        try {
            con = ConnectionDataBase.connect();
            com = con.prepareStatement("select * from Semester");
            rst = com.executeQuery();
            
            rst.next();
            
            if(Integer.parseInt(rst.getString(1)) == 1){
                jRadioButton1.setSelected(true);
                sem = jRadioButton1.getText();
            }else{
                sem = jRadioButton2.getText();
                jRadioButton2.setSelected(true);
            }
            
        } catch (SQLException ex) {
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }
    }

    private void UpdateFirst() {
        
        try {
            con = ConnectionDataBase.connect();
            com = con.prepareStatement("Update Semester set first = '1' , second = '0'");
            com.execute();
            JOptionPane.showMessageDialog(null, "Modified to first semester ","Done !",JOptionPane.INFORMATION_MESSAGE);
            MainPage.sem = 1; 
            dispose();
            
        } catch (SQLException ex) {
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }

    }

    private void UpdateSecond() {
        
           try {
            con = ConnectionDataBase.connect();
            com = con.prepareStatement("Update Semester set first = '0' , second = '1'");
            com.execute();
            JOptionPane.showMessageDialog(null, "Modified to second semester ","Done !",JOptionPane.INFORMATION_MESSAGE);
            MainPage.sem = 2; 
            dispose();

           } catch (SQLException ex) {
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }
    }
}
