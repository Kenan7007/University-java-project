
package university;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;



public class ViewStudEnrolledInCourse extends javax.swing.JFrame {
    
    boolean TrueFalse = false;
    
    Connection con = null;
    PreparedStatement com = null;
    ResultSet rst = null;
    
    public ViewStudEnrolledInCourse() {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("image/university-331279047401mXI3.jpg")).getImage());
        
        CoursesProf();
        
                jTable1.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
        
        @Override
        public Component getTableCellRendererComponent(JTable jtable ,Object value ,boolean isSelected ,boolean hasFocus ,int row ,int col){
            super.getTableCellRendererComponent(jtable, value, isSelected, hasFocus, row, col);
            
            setForeground(Color.DARK_GRAY);
            setFont(new Font(jTable1.getFont().getFamily(),jTable1.getFont().getStyle() , 24));
            return this;
            
        }
                
        });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Students Enrolled In Course");
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 146, 232));
        jLabel2.setText("Choose The Course :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 70, 220, 40);

        jComboBox1.setBackground(new java.awt.Color(0, 146, 232));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
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
        jComboBox1.setBounds(350, 70, 320, 40);

        jButton1.setBackground(new java.awt.Color(45, 161, 230));
        jButton1.setFont(new java.awt.Font("Viner Hand ITC", 3, 24)); // NOI18N
        jButton1.setText("Print ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(730, 70, 240, 40);

        jTable1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID_Number", "Student Name", "Mark", "credit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setGridColor(new java.awt.Color(0, 146, 232));
        jTable1.setSelectionBackground(new java.awt.Color(0, 146, 232));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(5);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(112, 160, 860, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/View Students enrolled in the course-036.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1031, 598);

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

        setSize(new java.awt.Dimension(1019, 626));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
       int rc = model.getRowCount();
       
       if(rc == 0){
           int p =  JOptionPane.showConfirmDialog(null, " Print the Table Empty ?! ", "Empty" , JOptionPane.YES_NO_OPTION);
               if(p == 0){
        
                    try {
                        jTable1.print();
                    } catch (PrinterException ex) {
                    }
               }
       }else{
            try {
                jTable1.print();
            } catch (PrinterException ex) {
            }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
       
      if(TrueFalse){
        
        PreparedStatement com1  ;
        ResultSet rst1  ;
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setRowCount(0);
        
        con = ConnectionDataBase.connect();
       
        try {
            
            com = con.prepareStatement("select * from RegisterStudentCourse where nameC = '"+jComboBox1.getSelectedItem().toString()+"'");
            rst = com.executeQuery();
            
            
            
            while(rst.next()){
                
                int idStud = Integer.parseInt(rst.getString(1));
                com1 = con.prepareStatement("select * from Student where id = '"+idStud+"'");
                rst1 = com1.executeQuery();
                rst1.next();
                
                model.addRow(new Object[]{idStud,rst1.getString("nameS"),rst.getString("mark2"),rst.getString("mark1")});
            }
            
        } catch (SQLException e) {
        }finally{
           try {
               con.close();
           } catch (SQLException ex) {
              System.out.println(ex.getMessage());             
           }
        }
      }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

   
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
            java.util.logging.Logger.getLogger(ViewStudEnrolledInCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStudEnrolledInCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStudEnrolledInCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStudEnrolledInCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudEnrolledInCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void CoursesProf() {
        con = ConnectionDataBase.connect();
        
        try {
            String namePr = Login.userP;
            
            com = con.prepareStatement("select * from Course where nameP = '"+namePr+"'");
            rst = com.executeQuery();
            
            while(rst.next()){
               jComboBox1.addItem(rst.getString("nameC"));
            }
            
            jComboBox1.setSelectedIndex(-1);
            TrueFalse = true;
            
        } catch (SQLException e) {
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }
    }
}
