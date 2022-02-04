
package university;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class Login extends javax.swing.JFrame {
    
    static String id;
    static String userP;
    static String userS;
    
    Connection con = null;
    PreparedStatement com = null;
    ResultSet rst = null;
    public Login() {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("image/university-331279047401mXI3.jpg")).getImage());
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/default_user.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(450, 10, 120, 160);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/user-alt-64.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 190, 40, 40);

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 102));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(360, 190, 370, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/thSDJSKGKC.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 270, 36, 40);

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 102));
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(360, 270, 370, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/thK49F7UR0.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 390, 40, 60);

        jComboBox1.setBackground(new java.awt.Color(199, 133, 221));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administration", "Professor", "Student" }));
        jComboBox1.setSelectedIndex(-1);
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
        jComboBox1.setBounds(360, 400, 170, 40);

        jCheckBox1.setForeground(new java.awt.Color(153, 0, 153));
        jCheckBox1.setText("show password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(360, 320, 120, 25);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 153));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(430, 460, 230, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/thY8H62EZU.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(760, 0, 430, 590);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Identification ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(360, 380, 110, 19);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("ID_Number");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(360, 170, 200, 19);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/thY8H62EZU.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 260, 580);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("Password ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(360, 250, 110, 19);

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/untitled.png"))); // NOI18N
        jMenuItem1.setText("login");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/th0IP15TE3.jpg"))); // NOI18N
        jMenuItem2.setText("logout");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/shapes-icon.png"))); // NOI18N
        jMenu9.setText("Style");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem13.setText("Style 1");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem13);

        jMenuItem23.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem23.setText("Style 2");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem23);

        jMenuItem24.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem24.setText("Style 3");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem24);

        jMenuItem28.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem28.setText("Style 4");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem28);

        jMenuItem29.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem29.setText("Style 5");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem29);

        jMenuItem30.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem30.setText("Style 6");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem30);

        jMenuItem31.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem31.setText("Style 7");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem31);

        jMenuItem32.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_8, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem32.setText("Style 8");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem32);

        jMenuItem33.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_9, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem33.setText("Style 9");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem33);

        jMenuItem34.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem34.setText("Style 10");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem34);

        jMenuItem35.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem35.setText("Style 11");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem35);

        jMenuItem36.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem36.setText("Style 12");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem36);

        jMenuItem37.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem37.setText("Default Style");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem37);

        jMenu2.add(jMenu9);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/Adobe-Help-Center-icon.png"))); // NOI18N
        jMenuItem4.setText("Help");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/Glossy_3d_blue_plussign.png"))); // NOI18N
        jMenuItem5.setText("About");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1036, 628));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
        if(jCheckBox1.isSelected()){ 
            jPasswordField1.setEchoChar((char)0);  
        }else{
            jPasswordField1.setEchoChar('*');
     
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new Help().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user_n = jTextField1.getText();
        String pass_w = jPasswordField1.getText();
        int Select_person = jComboBox1.getSelectedIndex();

        
            String Err = "You forgot to enter the following data :"+"\n\n";
            if(user_n.equals("")){
                Err += jLabel7.getText()+"\n";
            }
            if(pass_w.equals("")){
                Err += jLabel9.getText()+"\n";
            }
            if(Select_person == -1){
                Err += jLabel6.getText()+"\n";
            }
     
            
            if(!user_n.equals("") && !pass_w.equals("") && jComboBox1.getSelectedIndex() != -1){
                
            switch (Select_person) {
                case 0:
                    AdminLogin();
                    break;
                case 1:
                    ProfessorLogin();
                    break;
                case 2:
                    StudentLogin();
                    break;
                default:
                    break;
            }
                
                
            }else{
                JOptionPane.showMessageDialog(null,Err, "Data Lost",2);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        About about = new About();
        about.setVisible(true);        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
     int Select_person = jComboBox1.getSelectedIndex();
     if(Select_person == 0){
          jLabel7.setText("Username");
     }
     
     
     if(Select_person == 1){
          jLabel7.setText("Professor ID_Number");
     }
     
      if(Select_person == 2){
          jLabel7.setText("Student ID_Number");
     }
      
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
      
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
     if(evt.getKeyCode() == evt.VK_ENTER){
        String user_n = jTextField1.getText();
        String pass_w = jPasswordField1.getText();
        int Select_person = jComboBox1.getSelectedIndex();

        
            String Err = "You forgot to enter the following data :"+"\n\n";
            if(user_n.equals("")){
                Err += jLabel7.getText()+"\n";
            }
            if(pass_w.equals("")){
                Err += jLabel9.getText()+"\n";
            }
            if(Select_person == -1){
                Err += jLabel6.getText()+"\n";
            }
     
            
            if(!user_n.equals("") && !pass_w.equals("") && jComboBox1.getSelectedIndex() != -1){
                
            switch (Select_person) {
                case 0:
                    AdminLogin();
                    break;
                case 1:
                    ProfessorLogin();
                    break;
                case 2:
                    StudentLogin();
                    break;
                default:
                    break;
            }
                
                
            }else{
                JOptionPane.showMessageDialog(null,Err, "Data Lost",2);
            }
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        ChangeStyle cs = new ChangeStyle();

        cs.LookAndFeel(0);
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        ChangeStyle cs = new ChangeStyle();

        cs.LookAndFeel(1);
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        ChangeStyle cs = new ChangeStyle();

        cs.LookAndFeel(2);
        SwingUtilities.updateComponentTreeUI(this);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        ChangeStyle cs = new ChangeStyle();

        cs.LookAndFeel(3);
        SwingUtilities.updateComponentTreeUI(this);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        ChangeStyle cs = new ChangeStyle();

        cs.LookAndFeel(4);
        SwingUtilities.updateComponentTreeUI(this);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        ChangeStyle cs = new ChangeStyle();

        cs.LookAndFeel(5);
        SwingUtilities.updateComponentTreeUI(this);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        ChangeStyle cs = new ChangeStyle();

        cs.LookAndFeel(6);
        SwingUtilities.updateComponentTreeUI(this);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        ChangeStyle cs = new ChangeStyle();

        cs.LookAndFeel(7);
        SwingUtilities.updateComponentTreeUI(this);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        ChangeStyle cs = new ChangeStyle();

        cs.LookAndFeel(8);
        SwingUtilities.updateComponentTreeUI(this);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        ChangeStyle cs = new ChangeStyle();

        cs.LookAndFeel(9);
        SwingUtilities.updateComponentTreeUI(this);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        ChangeStyle cs = new ChangeStyle();

        cs.LookAndFeel(10);
        SwingUtilities.updateComponentTreeUI(this);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        ChangeStyle cs = new ChangeStyle();

        cs.LookAndFeel(11);
        SwingUtilities.updateComponentTreeUI(this);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        ChangeStyle cs = new ChangeStyle();

        cs.LookAndFeel();
        SwingUtilities.updateComponentTreeUI(this);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
  String user_n = jTextField1.getText();
        String pass_w = jPasswordField1.getText();
        int Select_person = jComboBox1.getSelectedIndex();

        
            String Err = "You forgot to enter the following data :"+"\n\n";
            if(user_n.equals("")){
                Err += jLabel7.getText()+"\n";
            }
            if(pass_w.equals("")){
                Err += jLabel9.getText()+"\n";
            }
            if(Select_person == -1){
                Err += jLabel6.getText()+"\n";
            }
     
            
            if(!user_n.equals("") && !pass_w.equals("") && jComboBox1.getSelectedIndex() != -1){
                
            switch (Select_person) {
                case 0:
                    AdminLogin();
                    break;
                case 1:
                    ProfessorLogin();
                    break;
                case 2:
                    StudentLogin();
                    break;
                default:
                    break;
            }
                
                
            }else{
                JOptionPane.showMessageDialog(null,Err, "Data Lost",2);
            }        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

   
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void AdminLogin() {
        id = jTextField1.getText().trim();
        String passA = jPasswordField1.getText().trim();
       try{ 
        if(id.equals("admin") && passA.equals("admin")){
            MainPage mg = new MainPage();
            mg.jMenu2.setEnabled(false);
            mg.jMenu3.setEnabled(false);
            mg.setVisible(true);
            this.setVisible(false);
            JOptionPane.showMessageDialog(this, "Hello "+id);

        }else{     
            JOptionPane.showMessageDialog(null, "Username or Password Not Valid..!","Wrong information",JOptionPane.ERROR_MESSAGE); 
        }
        
       }catch(java.lang.NumberFormatException e)  {
           JOptionPane.showMessageDialog(this, "Username or Password Not Valid..!","Wrong information",JOptionPane.ERROR_MESSAGE);
       }
    }

    private void ProfessorLogin() {
        id = jTextField1.getText().trim();
        String password = jPasswordField1.getText().trim();
       try{ 
        con = ConnectionDataBase.connect();
        com = con.prepareStatement("select*from Professor where id = '" +Integer.parseInt(id)+ "'and password = '"+password+"'");
        rst = com.executeQuery();
        
        if(rst.next()){
            userP = rst.getString("nameP");
            MainPage mg = new MainPage();
            mg.jMenu1.setEnabled(false);
            mg.jMenu3.setEnabled(false);
            mg.setVisible(true);
            this.setVisible(false);
            JOptionPane.showMessageDialog(this, "Hello Professor "+userP);
            
        }else{
            
             JOptionPane.showMessageDialog(null, "ID or Password Not Valid..!","Wrong information",JOptionPane.ERROR_MESSAGE); 

        }
       }catch(SQLException ex){
           System.out.println(ex.getMessage());
           JOptionPane.showMessageDialog(this, "Connection Error");
       }catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(this,"ID or Password Not Valid..!","Wrong information",JOptionPane.ERROR_MESSAGE);
       }
       finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
       }



    }

    private void StudentLogin() {
        id = jTextField1.getText().trim();
        String password = jPasswordField1.getText().trim();
       try{ 
        con = ConnectionDataBase.connect();
        com = con.prepareStatement("select * from Student where id = '" +Integer.parseInt(id)+ "'and password = '"+password+"'");
        rst = com.executeQuery();
        
        if(rst.next()){
            userS = rst.getString("nameS");
            MainPage mg = new MainPage();
            mg.jMenu1.setEnabled(false);
            mg.jMenu2.setEnabled(false);
            mg.setVisible(true);
            this.setVisible(false);
            JOptionPane.showMessageDialog(this, "Hello "+userS);
            
        }else{
            
             JOptionPane.showMessageDialog(null, "ID or Password Not Valid..!","Wrong information",JOptionPane.ERROR_MESSAGE); 

        }
       }catch(SQLException ex){
           System.out.println(ex.getMessage());
           JOptionPane.showMessageDialog(this, "Connection Error");
       }catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(this,"ID or Password Not Valid..!","Wrong information",JOptionPane.ERROR_MESSAGE);
       }
       finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
       }
    }
}
