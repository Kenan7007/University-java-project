
package university;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class AddMarks extends javax.swing.JFrame {

    int ID;
    boolean TrueFalse = false;
    Connection con = null;
    PreparedStatement com = null;
    ResultSet rst = null;
    ShowForRegis ssl = new ShowForRegis();
    public AddMarks() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("image/university-331279047401mXI3.jpg")).getImage());
        
        try {
        
        ssl.setVisible(true);
        String idSt = JOptionPane.showInputDialog(null , "Enter Student ID_Number To Add Marks:");
        ID = Integer.parseInt(idSt);
        INFO();
        CoursesProf();
        ssl.setVisible(false);
        } catch (HeadlessException | NumberFormatException e) {
        }
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADD Marks");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(200, 16, 16));
        jLabel2.setText("Final Mark :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 220, 230, 50);

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 3, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(200, 16, 16));
        jLabel5.setText("Course Credit :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 140, 290, 50);

        jButton1.setFont(new java.awt.Font("Lucida Bright", 3, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(200, 16, 16));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(280, 330, 280, 51);

        jTextField1.setFont(new java.awt.Font("Lucida Bright", 3, 30)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(200, 16, 16));
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(460, 140, 120, 50);

        jTextField2.setFont(new java.awt.Font("Lucida Bright", 3, 30)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(200, 16, 16));
        jTextField2.setEnabled(false);
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
        jTextField2.setBounds(460, 220, 120, 50);

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(200, 16, 16));
        jLabel3.setText("Student Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(410, 10, 150, 30);

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(200, 16, 16));
        jLabel4.setText("--------");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(580, 10, 200, 30);

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(200, 16, 16));
        jLabel6.setText("Student ID_Number :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 10, 200, 30);

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(200, 16, 16));
        jLabel7.setText("-----");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(240, 10, 100, 30);

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(200, 16, 16));
        jComboBox1.setToolTipText("Choose the course");
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(370, 70, 320, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel8.setText("Choose The Course :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(130, 70, 220, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/wood-texture-wallpaper-HD9.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -10, 820, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(772, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
     try{
         if(TrueFalse && jComboBox1.getSelectedIndex() != -1){
            
        con = ConnectionDataBase.connect();
       
        try {
            
            com = con.prepareStatement("select mark1 , mark2 from RegisterStudentCourse where nameC = '"+jComboBox1.getSelectedItem().toString()+"' and idS = '"+ID+"'");
            rst = com.executeQuery();
            
            
            
            if(rst.next()){
                
                jTextField2.setText(rst.getString("mark1"));
                jTextField1.setText(rst.getString("mark2"));
                
                jTextField2.setEnabled(true);
                jTextField1.setEnabled(true);
            }
            
        } catch (SQLException e) {
                          System.out.println(e.getMessage());             
        }finally{
           try {
               con.close();
           } catch (SQLException ex) {
           }
        }
      }
     }catch (NullPointerException e){
     }
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Quick();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            Quick();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            Quick();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        ssl.setVisible(false);
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
            java.util.logging.Logger.getLogger(AddMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMarks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void INFO() {
        
        con = ConnectionDataBase.connect();
        try {
            
            com = con.prepareStatement("select nameS from Student where id = '"+ID+"'");
            rst = com.executeQuery();
            if(rst.next()){
              jLabel7.setText(ID+"");
              jLabel4.setText(rst.getString("nameS"));
                setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Student ID_Number Is Not Exist ","Not Exist ",2);
            }
            
        } catch (SQLException e) {
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }
        
        
    }
    
    
    private void CoursesProf() {
        con = ConnectionDataBase.connect();
        
        PreparedStatement com1 ;
        ResultSet rst1 ;
        
        try {
            String namePr = Login.userP;
            
            com = con.prepareStatement("select * from Course where nameP = '"+namePr+"'");
            rst = com.executeQuery();
            
            
            
            while(rst.next()){
                
                com1 = con.prepareStatement("select * from RegisterStudentCourse where idS = '"+ID+"' and nameC = '"+rst.getString("nameC")+"'");
                rst1 = com1.executeQuery();
                if(rst1.next()){
                jComboBox1.addItem(rst.getString("nameC"));
                TrueFalse = true;
                }
            }
            
            jComboBox1.setSelectedIndex(-1);
            
            
        } catch (SQLException e) {
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }
    }

    private void Quick() {
      try{
           int m1 = 0, m2 = 0;
       
       try{ 
        if(!jTextField1.getText().equals("")){
            m1 = Integer.parseInt(jTextField1.getText());
        }
        
         if(!jTextField2.getText().equals("")){
            m2 = Integer.parseInt(jTextField2.getText());
        }
         
         con = ConnectionDataBase.connect();
         
         try {
            
             com = con.prepareStatement("Update RegisterStudentCourse set mark1 = '"+m1+"' , mark2 = '"+m2+"' where idS = '"+ID+"' and nameC = '"+jComboBox1.getSelectedItem().toString()+"'");
             com.execute();
             
            
             JOptionPane.showMessageDialog(null, "Marks have been added for student","Done",JOptionPane.INFORMATION_MESSAGE);
        
             jTextField1.setText("");
             jTextField2.setText("");
             
             jTextField1.setEnabled(false);
             jTextField2.setEnabled(false);
             
             jComboBox1.setSelectedIndex(-1);
             
             
         } catch (HeadlessException | SQLException e) {
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
         }
       }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Please Enter an Integer Number !");
       }
       }catch(NullPointerException e){        
       }
    }
}
