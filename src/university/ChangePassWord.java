
package university;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ChangePassWord extends javax.swing.JFrame {

    Login l = new Login();
    int ch;
    
    Connection con = null;
    PreparedStatement com = null;
    ResultSet rst = null;
    public ChangePassWord() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("image/university-331279047401mXI3.jpg")).getImage());
        
        ch = MainPage.changeS_P;
        
        jTextField1.setText(l.id);
        
        jLabel3.setVisible(false);
        jLabel6.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField4 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Password");
        setResizable(false);

        jPanel3.setLayout(null);

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(179, 179, 0));
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyReleased(evt);
            }
        });
        jPanel3.add(jPasswordField2);
        jPasswordField2.setBounds(500, 270, 380, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/confirm.jpg"))); // NOI18N
        jPanel3.add(jLabel5);
        jLabel5.setBounds(500, 220, 40, 50);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(212, 208, 208));
        jLabel1.setText("Change Password ");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(0, 0, 420, 60);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(179, 179, 0));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });
        jPanel3.add(jPasswordField1);
        jPasswordField1.setBounds(500, 160, 380, 40);

        jPasswordField4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPasswordField4.setForeground(new java.awt.Color(179, 179, 0));
        jPasswordField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField4ActionPerformed(evt);
            }
        });
        jPasswordField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField4KeyReleased(evt);
            }
        });
        jPanel3.add(jPasswordField4);
        jPasswordField4.setBounds(500, 380, 380, 40);

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 3, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(179, 179, 0));
        jLabel9.setText("Confirm Password");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(540, 350, 170, 20);

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(212, 208, 208));
        jLabel10.setText("Id");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(500, 20, 50, 40);

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 3, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(179, 179, 0));
        jLabel11.setText("New Password");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(540, 240, 170, 20);

        jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/eye_1.png"))); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox1);
        jCheckBox1.setBounds(890, 380, 40, 40);

        jCheckBox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/eye_1.png"))); // NOI18N
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox2);
        jCheckBox2.setBounds(890, 160, 40, 40);

        jCheckBox3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/eye_1.png"))); // NOI18N
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox3);
        jCheckBox3.setBounds(890, 270, 40, 40);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Identical");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(810, 320, 80, 14);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/ytyty.jpg"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(840, 430, 40, 40);

        jLabel12.setFont(new java.awt.Font("Baskerville Old Face", 3, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(179, 179, 0));
        jLabel12.setText(" Current Password");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(530, 130, 170, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/Check-RoundedBlack_musicplayer-512.png"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(500, 340, 36, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/unnamed.jpg"))); // NOI18N
        jPanel3.add(jLabel8);
        jLabel8.setBounds(500, 120, 36, 40);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 3, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(179, 179, 0));
        jButton1.setText("Apply");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(500, 490, 430, 60);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(179, 179, 0));
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1);
        jTextField1.setBounds(500, 60, 430, 40);

        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/black background 2.jpg"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 0, 1070, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1039, 628));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jPasswordField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField4ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected()){ 
            jPasswordField1.setEchoChar((char)0);  
        }else{
            jPasswordField1.setEchoChar('*');
     
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if(jCheckBox3.isSelected()){ 
            jPasswordField2.setEchoChar((char)0);  
        }else{
            jPasswordField2.setEchoChar('*');
     
        }        
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){ 
            jPasswordField4.setEchoChar((char)0);  
        }else{
            jPasswordField4.setEchoChar('*');
     
        }        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jPasswordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyPressed
       // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2KeyPressed

    private void jPasswordField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyReleased
      String OldP = String.valueOf(jPasswordField1.getPassword());
      String NewP = String.valueOf(jPasswordField2.getPassword());
      String ConP = String.valueOf(jPasswordField4.getPassword());
      
      

      if(!jPasswordField1.getText().equals("") && !jPasswordField2.getText().equals("")){
          if(OldP.equals(NewP)){
              jLabel3.setVisible(true);
              jPasswordField4.setText("");
              jPasswordField4.setRequestFocusEnabled(false);
          }else{
              jLabel3.setVisible(false);
              jPasswordField4.setRequestFocusEnabled(true);
          }
      }
      
      
          
      if(!jPasswordField4.getText().equals("") && !jPasswordField2.getText().equals("")){
          if(ConP.equals(NewP)){
              jLabel6.setVisible(true);
          }else{
              jLabel6.setVisible(false);
          }
      }
        
      
      
    }//GEN-LAST:event_jPasswordField2KeyReleased

    private void jPasswordField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField4KeyReleased
      String ConP = String.valueOf(jPasswordField4.getPassword());
      String NewP = String.valueOf(jPasswordField2.getPassword());
          
      if(!jPasswordField4.getText().equals("") && !jPasswordField2.getText().equals("")){
          if(ConP.equals(NewP)){
              jLabel6.setVisible(true);
          }else{
              jLabel6.setVisible(false);
          }
      }
          
    }//GEN-LAST:event_jPasswordField4KeyReleased

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased
      String OldP = String.valueOf(jPasswordField1.getPassword());
      String NewP = String.valueOf(jPasswordField2.getPassword());
    
      
      

      if(!jPasswordField1.getText().equals("") && !jPasswordField2.getText().equals("")){
          if(OldP.equals(NewP)){
              jLabel3.setVisible(true);
              jPasswordField4.setText("");
              jPasswordField4.setRequestFocusEnabled(false);
          }else{
              jLabel3.setVisible(false);
              jPasswordField4.setRequestFocusEnabled(true);
          }
      }       
    }//GEN-LAST:event_jPasswordField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(ch == 1){
            ChangeIt("Student");
        }else if(ch == 2){
            ChangeIt("Professor");
        }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassWord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void ChangeIt(String tableName) {

            String Err = "You forgot to enter the following data :"+"\n\n";
            if(jPasswordField1.getText().equals("")){
                Err += jLabel12.getText()+"\n";
            }
            if(jPasswordField2.getText().equals("")){
                Err += jLabel11.getText()+"\n";
            }
            if(jPasswordField4.getText().equals("")){
                Err += jLabel9.getText()+"\n";
            }
            
            if(!jPasswordField1.getText().equals("") && !jPasswordField2.getText().equals("") && !jPasswordField4.getText().equals("")){
                try {
                    con = ConnectionDataBase.connect();
                    com = con.prepareStatement("select password from "+tableName+" where id = '"+Integer.parseInt(jTextField1.getText())+"'");
                    rst = com.executeQuery();
                    rst.next();
                    if(jPasswordField1.getText().equals(rst.getString("password"))){
                        if(jPasswordField2.getText().equals(jPasswordField4.getText())){
                        com = con.prepareStatement("update "+tableName+" set password = '"+jPasswordField2.getText()+"' where id = '"+Integer.parseInt(jTextField1.getText())+"'");
                        com.execute();
                        JOptionPane.showMessageDialog(null, "The update process has been completed " ,"Password has been updated",JOptionPane.INFORMATION_MESSAGE);
                        
                        jPasswordField1.setText("");
                        jPasswordField2.setText("");
                        jPasswordField4.setText("");
                        
                        jLabel6.setVisible(false);
                        }else{
                            JOptionPane.showMessageDialog(null, "You have to confirm the new password well. ","Try Again!",JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                       JOptionPane.showMessageDialog(null," The current password is Wrong ", "Error",JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                }finally{
                    try {
                        con.close();
                    } catch (SQLException ex) {
                    }
                }
            }else{
                 JOptionPane.showMessageDialog(null,Err, "Data Lost",2);
            }
    }
}
