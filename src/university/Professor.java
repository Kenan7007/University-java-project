
package university;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Professor extends javax.swing.JFrame {

    int choose;
    
    Connection con = null;
    PreparedStatement com = null;
    ResultSet rst = null;
    
    Professors p = new Professors();
    public Professor() {
        initComponents();
        p.setVisible(true);
        setIconImage(new ImageIcon(getClass().getResource("image/university-331279047401mXI3.jpg")).getImage());
        
        choose = MainPage.chP;
        
        if(choose == 2){
            
            this.setTitle("Update Professor");
            jLabel4.setText("Update Professor");
            jButton1.setText("UPDATE");
            jTextField2.setEnabled(false);
            jTextField3.setEnabled(false);
            jTextField4.setEnabled(false);
            jRadioButton1.setEnabled(false);
            jRadioButton2.setEnabled(false);
            jButton2.setEnabled(true);
            
        }else if(choose == 3){
            this.setTitle("Delete Professor");
            jLabel4.setText("Delete Professor");
            jButton1.setText("DELETE");
            jTextField2.setEnabled(false);
            jTextField3.setEnabled(false);
            jTextField4.setEnabled(false);
            jRadioButton1.setEnabled(false);
            jRadioButton2.setEnabled(false);
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADD Professor");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(212, 208, 208));
        jLabel4.setText("ADD Professor");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 430, 60);

        jTextField1.setBackground(new java.awt.Color(212, 208, 208));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(118, 193, 11));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(420, 90, 300, 40);

        jTextField2.setBackground(new java.awt.Color(212, 208, 208));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(118, 193, 11));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(420, 180, 380, 40);

        jTextField3.setBackground(new java.awt.Color(212, 208, 208));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(118, 193, 11));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(420, 270, 380, 40);

        jTextField4.setBackground(new java.awt.Color(212, 208, 208));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(118, 193, 11));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(420, 360, 380, 40);

        jLabel13.setFont(new java.awt.Font("Baskerville Old Face", 3, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(118, 193, 11));
        jLabel13.setText("Address");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(420, 340, 170, 20);

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 3, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(118, 193, 11));
        jLabel15.setText("Email");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(420, 250, 170, 20);

        jLabel14.setFont(new java.awt.Font("Baskerville Old Face", 3, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(118, 193, 11));
        jLabel14.setText("Professor Name");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(420, 160, 170, 20);

        jButton2.setBackground(new java.awt.Color(212, 208, 208));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(118, 193, 11));
        jButton2.setText("Get");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(730, 90, 70, 40);

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Baskerville Old Face", 3, 16)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(118, 193, 11));
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(420, 445, 150, 40);

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Baskerville Old Face", 3, 16)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(118, 193, 11));
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(640, 445, 150, 40);

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(118, 193, 11));
        jLabel10.setText("Id");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(420, 50, 50, 40);

        jButton1.setBackground(new java.awt.Color(212, 208, 208));
        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 3, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(118, 193, 11));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(840, -10, 200, 620);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/black backgroundG.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1050, 610);

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

        setSize(new java.awt.Dimension(1036, 628));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if(evt.getKeyCode() == evt.VK_ENTER && choose == 2){
             Quick();        
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Quick();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        switch (choose) {
            case 1:
            Insert();
            break;
            case 2:
            Update();
            break;
            default:
            Delete();
            break;
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
            p.setVisible(false);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Professor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    private void Insert() {
           String Err = "You forgot to enter the following data :"+"\n\n";
            
            if(jTextField1.getText().equals("")){
                Err += "ID_Number\n";
            }
            if(jTextField2.getText().equals("")){
                Err += "Professor Name\n";
            }
            if(jTextField3.getText().equals("")){
                Err += "Email\n";
            }
            if(jTextField4.getText().equals("")){
                Err += "Address\n";
            }
            
     
            if(!jRadioButton1.isSelected()&&!jRadioButton2.isSelected()){
                Err += "Gender \n";
            }
            
            String gender = jRadioButton2.getText();
            if(jRadioButton1.isSelected()){
                gender = jRadioButton1.getText();
            }
            
            
            
             if(!jTextField1.getText().equals("") &&
               !jTextField2.getText().equals("") &&
               !jTextField3.getText().equals("")&&
               !jTextField4.getText().equals("")&&
               (jRadioButton1.isSelected() || jRadioButton2.isSelected())){
                 
                                       try {
                                          int nr = Integer.parseInt(jTextField1.getText());
                                       } catch (NumberFormatException e) {
                                           JOptionPane.showMessageDialog(this, "Please Enter an Integer Number !");
                                       }
                 
             try {
                 con = ConnectionDataBase.connect();
                 com = con.prepareStatement("select * from Professor where id = '"+Integer.parseInt(jTextField1.getText())+"'");
                 rst = com.executeQuery();
                 if(!rst.next()){
                      com = con.prepareStatement("insert into Professor values('"+Integer.parseInt(jTextField1.getText())+"','123','"
                                                                                 +jTextField3.getText()+"','"
                                                                                 +jTextField4.getText()+"','"
                                                                                 +jTextField2.getText()+"','"
                                                                                 +gender+"')");

                        com.execute();
                        
                        JOptionPane.showMessageDialog(null,"The add process has been completed","Professor has been added",JOptionPane.INFORMATION_MESSAGE);
                        Clear();
                        
                 }else{
                        JOptionPane.showMessageDialog(null,"Professor ID_Number is Already Exist ", "ADD FAILED!",2);
                 }
                
                 
             } catch (SQLException ex) {
                 ex.getMessage();
                 System.out.println(ex);
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
            
            if(jTextField2.getText().equals("")){
                Err += "Professor Name\n";
            }
            if(jTextField3.getText().equals("")){
                Err += "Email\n";
            }
            if(jTextField4.getText().equals("")){
                Err += "Address\n";
            }
            
            
            if(!jRadioButton1.isSelected()&&!jRadioButton2.isSelected()){
                Err += "Gender\n";
            }
           
            
            if(!jTextField2.getText().equals("") &&
               !jTextField3.getText().equals("")&&
               !jTextField4.getText().equals("")&&
               (jRadioButton1.isSelected() || jRadioButton2.isSelected())){
                
                
                try {
                    con = ConnectionDataBase.connect();
                    com = con.prepareStatement("update Professor set nameP = '"+jTextField2.getText()+"' , Email = '"
                                                                             +jTextField3.getText()+"' ,address = '"+jTextField4.getText()+"', gender = '"+gender+"' where id = '"
                                                                             +Integer.parseInt(jTextField1.getText())+"'");
                    com.execute();
                    JOptionPane.showMessageDialog(null,"The update process has been completed","Professor has been updated",JOptionPane.INFORMATION_MESSAGE);
                    
                    Clear();
                    jTextField1.setEnabled(true);
                    jTextField2.setEnabled(false);
                    jTextField3.setEnabled(false);
                    jTextField4.setEnabled(false);
                    jRadioButton1.setEnabled(false);
                    jRadioButton2.setEnabled(false);
                    

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
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
            
            if(jTextField1.getText().equals("")){
                Err += "Professor ID_Number\n";
            }
            
            if(!jTextField1.getText().equals("")){
                
                                       try {
                                          int nr = Integer.parseInt(jTextField1.getText());
                                       } catch (NumberFormatException e) {
                                           JOptionPane.showMessageDialog(this, "Please Enter an Integer Number !");
                                       }
                                       
                try {
                    
                    con = ConnectionDataBase.connect();
                    com = con.prepareStatement("select * from Professor where id ='"+Integer.parseInt(jTextField1.getText())+"'");
                    rst = com.executeQuery();
                    
                   
                   
                   if(rst.next()){
                       String profN = rst.getString(5);
  
                       com = con.prepareStatement("select*from Course where nameP = '"+profN+"'");
                       rst = com.executeQuery();
                       
                       while(rst.next()){
                           com =con.prepareStatement("Update Course set nameP = '' where nameP = '"+profN+"'");
                           com.execute();
                       }
   
                       
                   
                   int p =  JOptionPane.showConfirmDialog(null, "Do you really want to delete "+profN+" from Database ?!", " Confirm! " , JOptionPane.YES_NO_OPTION);
                        if(p == 0){

                            com = con.prepareStatement("Delete from Professor where id ='"+Integer.parseInt(jTextField1.getText())+"'");
                            com.execute();
                            JOptionPane.showMessageDialog(null,"The Delete process has been completed","Professor has been Deleted ",JOptionPane.INFORMATION_MESSAGE);
                            jTextField1.setText("");
                        }
                        
                    }else{
                        JOptionPane.showMessageDialog(null,"Professor ID_Number is Not Exist ", "Not Exist",2); 
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
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
                
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
    }

    private void Quick() {
       if(jTextField1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "ID_Number field is empty" , "Empty",2);
            }else{
           
                                       try {
                                          int nr = Integer.parseInt(jTextField1.getText());
                                       } catch (NumberFormatException e) {
                                           JOptionPane.showMessageDialog(this, "Please Enter an Integer Number !");
                                       }
           
                try {
                    con = ConnectionDataBase.connect();
                    com = con.prepareStatement("select * from Professor where id = '"+Integer.parseInt(jTextField1.getText())+"'");
                    rst = com.executeQuery();
                    
                    if(rst.next()){
                        jTextField1.setEnabled(false);
                        
                        
                        jTextField2.setText(rst.getString(5));
                        jTextField2.setEnabled(true);
                        
                        jTextField3.setText(rst.getString(3));
                        jTextField3.setEnabled(true);
                                               
                        jTextField4.setText(rst.getString(4));
                        jTextField4.setEnabled(true);
                        
                        String gender = rst.getString(6);
                      
                            jRadioButton1.setSelected(true);
                            
                        if(gender.equals("Female")){
                            jRadioButton2.setSelected(true);
                        }
                        
                        jRadioButton1.setEnabled(true);
                        jRadioButton2.setEnabled(true);
                        
                        
                    }else{
                            JOptionPane.showMessageDialog(null,"Professor ID_Number is Not Exist ", "Not Exist",2); 
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
