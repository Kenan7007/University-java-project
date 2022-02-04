    
package university;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;


public class Average extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement com = null;
    ResultSet rst = null;
    
     
    int CountHour = 0;
    int TOTAL = 0;
    public Average() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("image/university-331279047401mXI3.jpg")).getImage());
        
        jLabel7.setText(Login.id);
        jLabel4.setText(Login.userS);
        
        Info();
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("My AVERAGE");
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Agency FB", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Student ID_Number :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 10, 160, 50);

        jLabel7.setFont(new java.awt.Font("Agency FB", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("-----");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(200, 10, 110, 50);

        jLabel3.setFont(new java.awt.Font("Agency FB", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Student Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(340, 10, 120, 50);

        jLabel4.setFont(new java.awt.Font("Agency FB", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("--------");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(470, 10, 190, 50);

        jLabel9.setFont(new java.awt.Font("Sitka Banner", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Hours Of  Success  :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(320, 210, 220, 60);

        jLabel11.setFont(new java.awt.Font("Sitka Banner", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Repetition hours  :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(320, 280, 220, 60);

        jLabel13.setFont(new java.awt.Font("Sitka Banner", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Rating  :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(320, 140, 220, 60);

        jLabel14.setFont(new java.awt.Font("Sitka Banner", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("AVERAGE  :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(320, 70, 220, 60);

        jLabel17.setFont(new java.awt.Font("Sitka Banner", 3, 24)); // NOI18N
        jLabel17.setText("AVERAGE  :");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(30, 70, 240, 60);

        jLabel18.setFont(new java.awt.Font("Sitka Banner", 3, 24)); // NOI18N
        jLabel18.setText("Rating  :");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(30, 140, 240, 60);

        jLabel19.setFont(new java.awt.Font("Sitka Banner", 3, 24)); // NOI18N
        jLabel19.setText("Hours Of  Success  :");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(30, 210, 240, 60);

        jLabel20.setFont(new java.awt.Font("Sitka Banner", 3, 24)); // NOI18N
        jLabel20.setText("Repetition hours  :");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(30, 280, 240, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/AVG.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 690, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(638, 384));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Average.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Average.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Average.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Average.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Average().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void Info() {
        
       
        int countFail = 0 ;
        con = ConnectionDataBase.connect();
        
        
        try {
            
            com = con.prepareStatement("select mark1 ,mark2 , hours from RegisterStudentCourse where idS = '"+Login.id+"'");
            rst = com.executeQuery();
            
            while(rst.next()){
                
                
                int m2 = Integer.parseInt(rst.getString("mark2"));
                
                int hour = Integer.parseInt(rst.getString("hours"));
                String rate = StudentResult.Rate(m2);
                CountHour +=Integer.parseInt(rst.getString("hours"));
                TOTAL += (m2 * hour); 
                
                if(m2 < 5){
                    countFail += Integer.parseInt(rst.getString("hours"));
                }
            }
            
            double media = 10*(double)((double)TOTAL / (double)CountHour);
            media = Math.round(media*100.0)/100.0;
            jLabel14.setText(media+"%");
            jLabel13.setText(StudentResult.Rate1((int) media));
            
            jLabel9.setText(CountHour - countFail+"  hours");
            jLabel11.setText(countFail+"  hours");
           
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e.getMessage());
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }

    }
}
