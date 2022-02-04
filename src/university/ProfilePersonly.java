
package university;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;


public class ProfilePersonly extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement com = null;
    ResultSet rst = null;
    
    
    public ProfilePersonly() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("image/university-331279047401mXI3.jpg")).getImage());
        
        int id = Integer.parseInt(Login.id);
        Information(id);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("My Profile");
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 50, 270, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID_Number :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 110, 290, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mobile :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 170, 270, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 230, 280, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("The average :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 290, 270, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(125, 167, 229));
        jLabel7.setText("The amount required : ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(140, 350, 280, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(110, 157, 226));
        jLabel8.setText("The amount paid : ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(140, 410, 270, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(110, 157, 226));
        jLabel9.setText("Remaining fees : ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(140, 470, 270, 50);

        jLabel10.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(74, 130, 211));
        jLabel10.setText("jLabel2");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(710, 50, 220, 50);

        jLabel11.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(74, 130, 211));
        jLabel11.setText("jLabel2");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(710, 110, 220, 50);

        jLabel12.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(74, 130, 211));
        jLabel12.setText("jLabel2");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(710, 170, 220, 50);

        jLabel13.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(74, 130, 211));
        jLabel13.setText("jLabel2");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(710, 230, 220, 50);

        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(74, 130, 211));
        jLabel14.setText("jLabel2");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(710, 290, 220, 50);

        jLabel15.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(74, 130, 211));
        jLabel15.setText("jLabel2");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(710, 350, 220, 50);

        jLabel16.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(74, 130, 211));
        jLabel16.setText("jLabel2");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(710, 470, 220, 50);

        jLabel17.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(74, 130, 211));
        jLabel17.setText("jLabel2");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(710, 410, 220, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/background_white.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1060, 640);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Baskerville Old Face", 3, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(74, 130, 211));
        jLabel18.setText("Profile Personaly");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(353, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(353, 353, 353))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1030, 635));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfilePersonly().setVisible(true);
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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void Information(int id) {
        
        try {
            con = ConnectionDataBase.connect();
            com = con.prepareStatement("select * from Student where id = '"+id+"'");
            rst = com.executeQuery();
            
            rst.next();
            
            jLabel10.setText(rst.getString(2));
            jLabel11.setText(rst.getString(1));
            jLabel12.setText(rst.getString(4));
            jLabel13.setText(rst.getString(9));
            jLabel14.setText(rst.getString(5));
            jLabel15.setText(rst.getString(6)+"  Euro");
            jLabel17.setText(rst.getString(7)+"  Euro");
            jLabel16.setText(rst.getString(8)+"  Euro");
            
            
        } catch (SQLException ex) {
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }

    }
}
