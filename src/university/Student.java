
package university;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;

public class Student extends javax.swing.JFrame {

    int choose;
    
    Connection con = null;
    PreparedStatement com = null;
    ResultSet rst = null;
    
     Students ss = new Students();
       
       
    public Student() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("image/university-331279047401mXI3.jpg")).getImage());
         ss.setVisible(true);
        choose = MainPage.ch;
        
        if(choose == 2){
            
            this.setTitle("UPDATE Student");
            jButton1.setIcon(new ImageIcon("src//university//image//update3d.jpg"));
            jTextField4.setEnabled(false);
            jTextField5.setEnabled(false);
            jRadioButton1.setEnabled(false);
            jRadioButton2.setEnabled(false);
            jButton3.setEnabled(true);

        }
        if(choose == 3){
                   
            this.setTitle("DELETE Student");
            jButton1.setIcon(new ImageIcon("src//university//image//del.png"));
            jTextField4.setEnabled(false);
            jTextField5.setEnabled(false);
            jRadioButton1.setEnabled(false);
            jRadioButton2.setEnabled(false);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADD Student");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/user256.png"))); // NOI18N
        jPanel3.add(jLabel13);
        jLabel13.setBounds(300, 140, 40, 40);

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 102));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        jPanel3.add(jTextField3);
        jTextField3.setBounds(350, 50, 300, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/Adobe-Id-icon.png"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(300, 50, 36, 40);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/addF.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(320, 350, 170, 160);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("Student ID_Number");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(350, 30, 200, 19);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/thY8H62EZU.jpg"))); // NOI18N
        jPanel3.add(jLabel8);
        jLabel8.setBounds(0, 0, 270, 610);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("Student Name");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(350, 120, 110, 19);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/thY8H62EZU.jpg"))); // NOI18N
        jPanel3.add(jLabel5);
        jLabel5.setBounds(760, 0, 290, 600);

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 102));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField4);
        jTextField4.setBounds(350, 140, 370, 40);

        jTextField5.setBackground(new java.awt.Color(204, 204, 204));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 102));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField5);
        jTextField5.setBounds(350, 230, 370, 40);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/mobile.jpg"))); // NOI18N
        jPanel3.add(jLabel14);
        jLabel14.setBounds(300, 230, 36, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 153));
        jLabel15.setText("Mobile Number");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(350, 210, 110, 19);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(102, 51, 255));
        jRadioButton1.setText("Female");
        jPanel3.add(jRadioButton1);
        jRadioButton1.setBounds(600, 290, 120, 50);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(102, 51, 255));
        jRadioButton2.setText("Male");
        jPanel3.add(jRadioButton2);
        jRadioButton2.setBounds(350, 290, 120, 50);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/cancel-button-1024x768.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(560, 350, 170, 160);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 2, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 51, 255));
        jButton3.setText("Bring");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(650, 50, 70, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1047, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
            
 
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch (choose) {
            case 1:
                Insert();
                break;
            case 2:
                Update();
                break;
            case 3:
                Delete();
                break;
            default:
                break;
        }

       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      dispose();
      ss.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
          
             if(evt.getKeyCode() == evt.VK_ENTER && MainPage.ch == 2){
                Quick();
             }
        
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Quick();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    private void Insert() {

        
            String Err = "You forgot to enter the following data :"+"\n\n";
            
            if(jTextField3.getText().equals("")){
                Err += "Student ID_Number\n";
            }
            if(jTextField4.getText().equals("")){
                Err += "Student Name\n";
            }
            if(jTextField5.getText().equals("")){
                Err += "Mobile Number\n";
            }
            if(!jRadioButton1.isSelected()&&!jRadioButton2.isSelected()){
                Err += "Gender\n";
            }
            
            String gender = jRadioButton2.getText();
            if(jRadioButton1.isSelected()){
                gender = jRadioButton1.getText();
            }
            
      
     
            
            if(!jTextField3.getText().equals("") &&
               !jTextField4.getText().equals("") &&
               !jTextField5.getText().equals("")&&
               (jRadioButton1.isSelected() || jRadioButton2.isSelected())){
                                      try {
                                         int nr = Integer.parseInt(jTextField3.getText());
                                      } catch (NumberFormatException e) {
                                          JOptionPane.showMessageDialog(this, "Please Enter an Integer Number !");
                                      }
                
                try {
                    con = ConnectionDataBase.connect();
                    com = con.prepareStatement("select*from Student where id = '"+Integer.parseInt(jTextField3.getText())+"'");
                    rst = com.executeQuery();
                    
                    if(rst.next()){
                      
                        JOptionPane.showMessageDialog(null,"Student ID_Number is Already Exist ", "ADD FAILED!",2);

                    }else{
                        
                        com = con.prepareStatement("insert into Student values('"+Integer.parseInt(jTextField3.getText())+"','"
                                                                                 +jTextField4.getText()+"','123','"
                                                                                 +jTextField5.getText()+"','0','0','0','0','"+gender+"')");

                        com.execute();
                        
                        JOptionPane.showMessageDialog(null,"The add process has been completed","Student has been added",JOptionPane.INFORMATION_MESSAGE);
                        Clear();
                        
                       
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

    private void Update() {
       
            String gender = jRadioButton2.getText();
            if(jRadioButton1.isSelected()){
                gender = jRadioButton1.getText();
            }

            String Err = "You forgot to enter the following data :"+"\n\n";
            
            if(jTextField4.getText().equals("")){
                Err += "Student Name\n";
            }
            if(jTextField5.getText().equals("")){
                Err += "Mobile Number\n";
            }
            if(!jRadioButton1.isSelected()&&!jRadioButton2.isSelected()){
                Err += "Gender\n";
            }
           
      
            
            if(!jTextField4.getText().equals("") &&
               !jTextField5.getText().equals("")&&
               (jRadioButton1.isSelected() || jRadioButton2.isSelected())){
                
                try {
                    con = ConnectionDataBase.connect();
                    com = con.prepareStatement("update Student set nameS = '"+jTextField4.getText()+"' , mobile = '"
                                                                             +jTextField5.getText()+"' , gender = '"+gender+"' where id = '"
                                                                             +Integer.parseInt(jTextField3.getText())+"'");
                    com.execute();
                    JOptionPane.showMessageDialog(null,"The update process has been completed","Student has been updated",JOptionPane.INFORMATION_MESSAGE);
                    
                    Clear();
                    jTextField3.setEnabled(true);
                    jTextField4.setEnabled(false);
                    jTextField5.setEnabled(false);
                    jRadioButton1.setEnabled(false);
                    jRadioButton2.setEnabled(false);
                    

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

    private void Delete() {
      String Err = "Please enter the following data :"+"\n\n";
            
            if(jTextField3.getText().equals("")){
                Err += "Student ID_Number\n";
            }
        
            if(!jTextField3.getText().equals("")){
                                try {
                                   int nr = Integer.parseInt(jTextField3.getText());
                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(this, "Please Enter an Integer Number !");
                                }
                                
                try {
                    con = ConnectionDataBase.connect();
                    com = con.prepareStatement("select * from Student where id ='"+Integer.parseInt(jTextField3.getText())+"'");
                    rst = com.executeQuery();
                   
                   
                   if(rst.next()){
                   String studN = rst.getString(2);
                   int p =  JOptionPane.showConfirmDialog(null, "Do you really want to delete "+studN+" from Database ?!", " Confirm! " , JOptionPane.YES_NO_OPTION);
                        if(p == 0){

                            com = con.prepareStatement("delete * from Student where id ='"+Integer.parseInt(jTextField3.getText())+"'");
                            com.execute();
                            JOptionPane.showMessageDialog(null,"The Delete process has been completed","Student has been Deleted ",JOptionPane.INFORMATION_MESSAGE);
                            jTextField3.setText("");
                        }
                        
                    }else{
                        JOptionPane.showMessageDialog(null,"Student ID_Number is Not Exist ", "Not Exist",2); 
                    }
    
                    
                }catch(SQLException ex){       
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

    private void Clear() {
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
    }

    private void Quick() {
         if(jTextField3.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Student ID_Number field is empty" , "Empty",2);
            }else{
             
                           try {
                              int nr = Integer.parseInt(jTextField3.getText());
                           } catch (NumberFormatException e) {
                               JOptionPane.showMessageDialog(this, "Please Enter an Integer Number !");
                           }
                           
                           
                try {
                    con = ConnectionDataBase.connect();
                    com = con.prepareStatement("select * from Student where id = '"+Integer.parseInt(jTextField3.getText())+"'");
                    rst = com.executeQuery();
                    
                    if(rst.next()){
                        jTextField3.setEnabled(false);
                        
                        
                        jTextField4.setText(rst.getString(2));
                        jTextField4.setEnabled(true);
                        
                        jTextField5.setText(rst.getString(4));
                        jTextField5.setEnabled(true);
                        
                        String gender = rst.getString(9);
                        
                        if(gender.equals(jRadioButton1.getText())){
                            jRadioButton1.setSelected(true);
                        }else{
                            jRadioButton2.setSelected(true);
                        }
                        
                        jRadioButton1.setEnabled(true);
                        jRadioButton2.setEnabled(true);
                        
                        
                    }else{
                            JOptionPane.showMessageDialog(null,"Student ID_Number is Not Exist ", "Not Exist",2); 
                    }
                } catch (SQLException ex) {
                    
                } finally{
                    try {
                        con.close();
                    } catch (SQLException ex) {
                    }
                }
            }
    }
}
