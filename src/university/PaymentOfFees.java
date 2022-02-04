
package university;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;


public class PaymentOfFees extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement com = null;
    ResultSet rst = null;
    Students ss = new Students();
        
    public PaymentOfFees() {
        initComponents();
        ss.setVisible(true);
        setIconImage(new ImageIcon(getClass().getResource("image/university-331279047401mXI3.jpg")).getImage());
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Payment of fees");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(226, 226, 13));
        jLabel2.setText("paying off :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 420, 270, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("The amount required :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 200, 290, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setText("The amount paid :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 260, 270, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setText("Remaining fees :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 320, 280, 50);

        jLabel10.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel10.setText("-----------------");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(580, 140, 220, 50);

        jLabel11.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel11.setText("-----------------");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(580, 200, 220, 50);

        jLabel12.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel12.setText("-----------------");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(580, 260, 220, 50);

        jLabel13.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel13.setText("-----------------");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(580, 320, 220, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setText("Name :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 140, 270, 50);

        jTextField1.setBackground(new java.awt.Color(240, 240, 240));
        jTextField1.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(420, 420, 180, 50);

        jTextField2.setBackground(new java.awt.Color(240, 240, 240));
        jTextField2.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(460, 50, 370, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(226, 226, 13));
        jLabel7.setText("Student ID_Number :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(110, 50, 270, 50);

        jButton1.setBackground(new java.awt.Color(226, 226, 13));
        jButton1.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jButton1.setText("Pay the fees");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(700, 420, 210, 50);

        jButton2.setBackground(new java.awt.Color(226, 226, 13));
        jButton2.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(850, 50, 110, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/rsom.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1017, 577);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1020, 609));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int pay = 0;
        try{
        pay = Integer.parseInt(jTextField1.getText());
        }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Please Enter the amount you want to pay ");
        }
        if(pay > 0){         
            try {
            con = ConnectionDataBase.connect();
            
            int paidDB = Integer.parseInt(jLabel12.getText()) + Integer.parseInt(jTextField1.getText());
            int restDB = Integer.parseInt(jLabel11.getText()) - paidDB;
            
            com =con.prepareStatement("Update Student set amountPaid = '"+paidDB+"' , restOfFees = '"+restDB+"' where id = '"+Integer.parseInt(jTextField2.getText())+"'");
            com.execute();
            
                        jLabel10.setText("-----------------");
                        jLabel11.setText("-----------------");
                        jLabel12.setText("-----------------");
                        jLabel13.setText("-----------------");
                        
                      
                        JOptionPane.showMessageDialog(null, "You just payd a value of "+Integer.parseInt(jTextField1.getText())+"\n Rest is "+restDB+"");
                        
                        
                        jTextField1.setEnabled(false);
                        jButton1.setEnabled(false);
                        
                        jTextField2.setEditable(true);
                        jTextField1.setText("Done");
                        jTextField2.setText("");
           
            
            } catch (SQLException ex) {

            }finally{
                try {
                    con.close();
                } catch (SQLException ex) {
                }
            }
     
        }else{
            JOptionPane.showMessageDialog(null, "Enter the amount you want to pay in positive value");
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
         Quick();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          Quick();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
            ss.setVisible(false);        
    }//GEN-LAST:event_formWindowClosed

  
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
            java.util.logging.Logger.getLogger(PaymentOfFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentOfFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentOfFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentOfFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentOfFees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void Quick() {
        if(jTextField2.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Please Enter Student ID_Number ", "Empty", JOptionPane.ERROR_MESSAGE);
        }else{
                try {
                    con = ConnectionDataBase.connect();
                    com = con.prepareStatement("select * from Student where id = '"+Integer.parseInt(jTextField2.getText())+"'");
                    rst = com.executeQuery();
                    
                    if(rst.next()){
                        
                        jLabel10.setText(rst.getString(2));
                        jLabel11.setText(rst.getString(6));
                        jLabel12.setText(rst.getString(7));
                        jLabel13.setText(rst.getString(8));
                        
                        jTextField1.setEnabled(true);
                        jTextField1.setText("0");
                        
                        jButton1.setEnabled(true);
                        
                        jTextField2.setEditable(false);
                               
                    }else{
                        JOptionPane.showMessageDialog(null,"Student ID_Number is Not Exist ", "Not Exist", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                }finally{
                    try {
                        con.close();
                    } catch (SQLException ex) {
                    }
                }
        }       
    }
    
}
