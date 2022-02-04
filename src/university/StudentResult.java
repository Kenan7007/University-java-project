
package university;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class StudentResult extends javax.swing.JFrame {
    
    int CountHour = 0;
    int TOTAL = 0; 
    Connection con = null;
    PreparedStatement com = null;
    ResultSet rst = null;
    
    public StudentResult() {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("image/university-331279047401mXI3.jpg")).getImage());
        
        jLabel7.setText(Login.id);
        jLabel4.setText(Login.userS);
        
        FisNote();
                
        
                  jTable1.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
        
        @Override
        public Component getTableCellRendererComponent(JTable jtable ,Object value ,boolean isSelected ,boolean hasFocus ,int row ,int col){
            super.getTableCellRendererComponent(jtable, value, isSelected, hasFocus, row, col);
            
            setForeground(Color.BLACK);
            setFont(new Font(jTable1.getFont().getFamily(),jTable1.getFont().getStyle() , 21));
            return this;
            
        }
                
        });
                  
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RESULTS");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Agency FB", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Student ID_Number :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 10, 250, 50);

        jLabel7.setFont(new java.awt.Font("Agency FB", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("-----");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(290, 10, 140, 50);

        jLabel3.setFont(new java.awt.Font("Agency FB", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Student Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(480, 10, 210, 50);

        jLabel4.setFont(new java.awt.Font("Agency FB", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("--------");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(700, 10, 260, 50);

        jTable1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Number", "Course Name", "Nr_Of_Hours", "Mark", "credit", "Rating"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setSelectionBackground(new java.awt.Color(0, 146, 232));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 120, 960, 250);

        jLabel8.setFont(new java.awt.Font("Agency FB", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Semester Average :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 470, 250, 50);

        jLabel9.setFont(new java.awt.Font("Agency FB", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("-----");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(290, 470, 140, 50);

        jLabel5.setFont(new java.awt.Font("Agency FB", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Rating :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(520, 470, 120, 50);

        jLabel10.setFont(new java.awt.Font("Sitka Banner", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("-----");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(650, 470, 70, 50);

        jButton1.setFont(new java.awt.Font("Agency FB", 3, 24)); // NOI18N
        jButton1.setText("Print Student Results");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(780, 460, 220, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/results3.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1050, 620);

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

        setSize(new java.awt.Dimension(1034, 626));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            con = ConnectionDataBase.connect();
            JasperDesign jd = JRXmlLoader.load("Report1.jrxml");
            
            
            String sql = "SELECT\n" +
                    "     RegisterStudentCourse.`nameC` AS RegisterStudentCourse_nameC,\n" +
                    "     RegisterStudentCourse.`hours` AS RegisterStudentCourse_hours,\n" +
                    "     RegisterStudentCourse.`mark1` AS RegisterStudentCourse_mark1,\n" +
                    "     RegisterStudentCourse.`mark2` AS RegisterStudentCourse_mark2\n" +
                    "FROM\n" +
                    "     `RegisterStudentCourse` RegisterStudentCourse\n"
                    +"WHERE\n"
                    +"idS = '"+Integer.parseInt(jLabel7.getText())+"'";
            
            
            
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);
            
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null,con);  
            JasperViewer.viewReport(jp);
//            int DISPOSE_ON_CLOSE1 = JasperViewer.DISPOSE_ON_CLOSE;
//            if(DISPOSE_ON_CLOSE1 == 1){
//            this.setVisible(true);
//            }
        } catch (NumberFormatException | JRException ex) {
           System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       
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
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void FisNote() {
         con = ConnectionDataBase.connect();
      
         
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        try {
            
            com = con.prepareStatement("select * from RegisterStudentCourse where idS = '"+Login.id+"'");
            rst = com.executeQuery();
            
            while(rst.next()){
                int m1 = Integer.parseInt(rst.getString("mark1"));
                int m2 = Integer.parseInt(rst.getString("mark2"));
                
                int hour = Integer.parseInt(rst.getString("hours"));
                String rate = Rate(m2);
                CountHour +=Integer.parseInt(rst.getString("hours"));
                TOTAL += (m2 * hour); 
                model.addRow(new Object[]{rst.getString("idCourse"),rst.getString("nameC"),hour,m2,m1,rate});
                
            }
            
            double media = 10*(float)((float)TOTAL / (float)CountHour);
            media = Math.round(media*100.0)/100.0;
            
            jLabel9.setText(media+"%");
            jLabel10.setText(Rate1((int) media));
            
        } catch (SQLException e) {
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
            }
        }



    }
    
    public static String Rate1(int m2){
         if(m2 >= 90){
            return "A+";
        }
        else if(m2 >= 80){
            return "A";
        }
        else if(m2 >= 70){
            return "B";
        }
        else if(m2 >=60) {
            return "C";
        }
        else if(m2 >= 50){
            return "C-";
        }
        else{
            return "F";
        }
    }

    public static String Rate(int m2) {
       
        
        if(m2 >= 9){
            return "A+";
        }
        else if(m2 >= 8){
            return "A";
        }
        else if(m2 >= 7){
            return "B";
        }
        else if(m2 >=6) {
            return "C";
        }
        else if(m2 >= 5){
            return "C-";
        }
        else{
            return "F";
        }
            
    }
}
