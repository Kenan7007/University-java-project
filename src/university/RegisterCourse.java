

package university;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;




public class RegisterCourse extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement com = null;
    ResultSet rst = null;
    public RegisterCourse() {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("image/university-331279047401mXI3.jpg")).getImage());
        
        
        
        
        jLabel7.setText(Login.id);
        jLabel4.setText(Login.userS);
        
        DisaplyCourse();
        
        
                  jTable1.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
        
        @Override
        public Component getTableCellRendererComponent(JTable jtable ,Object value ,boolean isSelected ,boolean hasFocus ,int row ,int col){
            super.getTableCellRendererComponent(jtable, value, isSelected, hasFocus, row, col);
            
            setForeground(Color.BLACK);
            setFont(new Font(jTable1.getFont().getFamily(),jTable1.getFont().getStyle() , 18));
            return this;
            
        }
                
        });
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register a Course");
        setResizable(false);

        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(330, 470, 340, 60);

        jTable1.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Register", "Course Number", "Course Name", "Number Of Hours", "Professor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(15);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 950, 220);

        jLabel7.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("-----");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(290, 10, 150, 30);

        jLabel6.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Student ID_Number :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 10, 220, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Student Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(460, 10, 200, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("--------");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(690, 10, 250, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/RegisterCourse.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1070, 600);

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

        setSize(new java.awt.Dimension(1036, 612));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         con = ConnectionDataBase.connect();
        
        try {
            
            for(int row = 0; row<jTable1.getRowCount();row++){
                
                if(jTable1.getModel().getValueAt(row, 0).equals(true)){
                    
                    String nameC = jTable1.getModel().getValueAt(row, 2).toString();
                    
                    com = con.prepareStatement("select * from RegisterStudentCourse where idS = '"+Login.id+"' and  nameC = '"+nameC+"'");
                    rst = com.executeQuery();
                    if(!rst.next()){
                        
                        int idC = Integer.parseInt(jTable1.getModel().getValueAt(row, 1).toString());
                        int hours = Integer.parseInt(jTable1.getModel().getValueAt(row, 3).toString());
                        String nameP = jTable1.getModel().getValueAt(row, 4).toString();
                        
                        com = con.prepareStatement("insert into RegisterStudentCourse (idS, idCourse, nameC, hours, nameP, mark1, mark2) values('"+Login.id+"', '"+idC+"' , '"+nameC+"','"+hours+"','"+nameP+"','0','0')");
                        com.execute();
                    }
                    
                }  
                if(jTable1.getModel().getValueAt(row, 0).equals(false)){
                    String nameC = jTable1.getModel().getValueAt(row, 2).toString();
                     
                     com = con.prepareStatement("Delete from RegisterStudentCourse where idS = '"+Login.id+"' and nameC = '"+nameC+"'");
                     com.execute();
                 }
                
            }
            
            JOptionPane.showMessageDialog(null, "Course(s) Were Registered" , "Done",JOptionPane.INFORMATION_MESSAGE);
            setVisible(false);
            
            
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.out.println(e.getMessage()); 
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

   
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
            java.util.logging.Logger.getLogger(RegisterCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void DisaplyCourse() {
        
        con = ConnectionDataBase.connect();
        
        PreparedStatement com1 ;
        ResultSet rst1 ;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        try {
            
            com = con.prepareStatement("select * from Course where semester = '"+MainPage.sem+"'");
            rst = com.executeQuery();
            
            while(rst.next()){
                com1 = con.prepareStatement("select * from RegisterStudentCourse where idS = '"+Login.id+"' and nameC = '"+rst.getString("nameC")+"'");
                rst1 = com1.executeQuery();
                
                if(rst1.next()){
                    model.addRow(new Object[]{true,rst.getString("idCourse"),rst.getString("nameC"),rst.getString("hours"),rst.getString("nameP")});
                }else{
                    model.addRow(new Object[]{false,rst.getString("idCourse"),rst.getString("nameC"),rst.getString("hours"),rst.getString("nameP")});
                }
            }
            
        } catch (SQLException e) {
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
            }
        }

    }
}
