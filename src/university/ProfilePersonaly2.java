
package university;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;



public class ProfilePersonaly2 extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement com = null;
    ResultSet rst = null;
    
    public ProfilePersonaly2() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("image/university-331279047401mXI3.jpg")).getImage());
               
        int id = Integer.parseInt(Login.id);
        Information(id);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("My Profile");
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(219, 222, 222));
        jLabel4.setText("Email :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(200, 230, 270, 50);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(219, 222, 222));
        jLabel3.setText("ID_Number :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(200, 140, 290, 50);

        jLabel12.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("jLabel2");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(620, 230, 380, 50);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(219, 222, 222));
        jLabel5.setText("Gender :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(200, 320, 280, 50);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(219, 222, 222));
        jLabel6.setText("Address :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(200, 420, 270, 50);

        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("jLabel2");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(620, 420, 380, 50);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(219, 222, 222));
        jLabel2.setText("Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 50, 270, 50);

        jLabel11.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("jLabel2");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(620, 140, 380, 50);

        jLabel13.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("jLabel2");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(620, 320, 380, 50);

        jLabel10.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("jLabel2");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(620, 50, 380, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/Grey-Frames-PPT-Backgrounds.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1070, 580);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(47, 139, 118));
        jLabel18.setText("Profile Personaly");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1032, 659));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfilePersonaly2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void Information(int id) {
        try {
            con = ConnectionDataBase.connect();
            com =con.prepareStatement("select * from Professor where id = '"+id+"'");
            rst = com.executeQuery();
            
            rst.next();
            
            jLabel11.setText(rst.getString(1));
            jLabel10.setText(rst.getString(5));
            jLabel12.setText(rst.getString(3));
            jLabel13.setText(rst.getString(6));
            jLabel14.setText(rst.getString(4));
            
        } catch (SQLException ex) {
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }
        
    }
}
