
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

public class RegOrDeleteCourse extends javax.swing.JFrame {
    int val;
    Connection con = null;
    PreparedStatement com = null;
    ResultSet rst = null;
    
     ShowForRegis ss = new ShowForRegis();
        
        
        public RegOrDeleteCourse() {
        initComponents();
        ss.setVisible(false);
        setIconImage(new ImageIcon(getClass().getResource("image/university-331279047401mXI3.jpg")).getImage());
        
        jTable1.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
        
        @Override
        public Component getTableCellRendererComponent(JTable jtable ,Object value ,boolean isSelected ,boolean hasFocus ,int row ,int col){
            super.getTableCellRendererComponent(jtable, value, isSelected, hasFocus, row, col);
            setBackground(Color.WHITE);
            setForeground(Color.GRAY);
            setFont(new Font(jTable1.getFont().getFamily(),jTable1.getFont().getStyle() , 24));
            return this;
        }
                
        });
    
        }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register or Delete a Course For a Student");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel3.setLayout(null);

        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(166, 79, 230));
        jButton1.setText("Cancel");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(700, 20, 280, 30);

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(133, 0, 231));
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(70, 20, 280, 30);

        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(133, 41, 133));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(380, 20, 280, 30);

        jButton5.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jButton5.setForeground(new java.awt.Color(133, 41, 133));
        jButton5.setText("Apply");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(360, 410, 320, 50);

        jTable1.setFont(new java.awt.Font("Monotype Corsiva", 3, 20)); // NOI18N
        jTable1.setForeground(new java.awt.Color(204, 51, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registered", "Course Number", "Course Name", "Number Of Hours", "Professor"
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
        jTable1.setToolTipText("");
        jTable1.setDragEnabled(true);
        jTable1.setGridColor(new java.awt.Color(153, 0, 153));
        jTable1.setRowSelectionAllowed(false);
        jTable1.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(70, 100, 910, 170);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/image/purple-wallpaper-blurred-HD.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(0, 0, 1066, 549);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(133, 0, 231));
        jLabel1.setText("     Register");

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(133, 41, 133));
        jLabel3.setText(" a course for");

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(166, 79, 230));
        jLabel4.setText("or delete");

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(166, 83, 166));
        jLabel5.setText("a student");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1050, 627));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ss.setVisible(true);
        try{
        String value = JOptionPane.showInputDialog(null,"Enter the Student ID_Number","REGISTER",JOptionPane.QUESTION_MESSAGE);
         val = Integer.parseInt(value);
        ss.setVisible(false);
        if(JOptionPane.OK_OPTION == 0){
            int result = TableDataBase(val);
            if(result == 1){
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton1.setEnabled(true);
            jButton5.setEnabled(true);
            
            jButton5.setText("Apply the registry");
            
            ss.setVisible(false);
            }
        }
        else{
             ss.setVisible(false);
        }
        }catch(NumberFormatException e){
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        ss.setVisible(true);
        
        try{
        String value = JOptionPane.showInputDialog(null,"Enter the Student ID_Number","DELETE",JOptionPane.QUESTION_MESSAGE);
         val = Integer.parseInt(value);
        ss.setVisible(false);
        if(JOptionPane.OK_OPTION == 0){
            int result = DeleteCourseForStudent(val);
            if (result == 1){
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton1.setEnabled(true);
            jButton5.setEnabled(true);
            
            jButton5.setText("Apply the deletion");
            
            ss.setVisible(false);
            }
        }else{
             ss.setVisible(false);
        }
        }catch(NumberFormatException e){
        }       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
            jButton1.setEnabled(false);
            jButton5.setEnabled(false);
            
            jButton5.setText("Apply");
            
            DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
            model1.setRowCount(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       if(jButton5.getText().equals("Apply the registry")){
           ApplyInsert();
           dispose();
       }else{
           ApplyDelete();
           dispose();
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegOrDeleteCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private int TableDataBase(int id) {
        con = ConnectionDataBase.connect();
        try{
            com = con.prepareStatement("select * from Student where id = '"+id+"'");
            rst = com.executeQuery();
            if(rst.next()){
            
        int sem = MainPage.sem;
        com = con.prepareStatement("select * from Course where semester = '"+sem+"'");
        rst = com.executeQuery();
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        while(rst.next()){
            
            PreparedStatement com1 = con.prepareStatement("select * from RegisterStudentCourse where idS = '"+id+"' and nameC = '"+rst.getString(2)+"'");
            ResultSet rst1 = com1.executeQuery();
            if(rst1.next()){
                
               
                model.addRow(new Object[]{true,rst.getString("idCourse"),rst.getString("nameC"),rst.getString("hours"),rst.getString("nameP")});
               

            }else{
                
               
                model.addRow(new Object[]{false,rst.getString("idCourse"),rst.getString("nameC"),rst.getString("hours"),rst.getString("nameP")});
                

            }
           
            
        }
        }else{
           JOptionPane.showMessageDialog(null, "Student ID_Number Is Not Exist","Not Exist",2);
           return 0;
        }
        
        }catch(SQLException ex){
            
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }
        return 1;
    }

    private int DeleteCourseForStudent(int id) {
        con = ConnectionDataBase.connect();
        DefaultTableModel mod = (DefaultTableModel) jTable1.getModel();
        try {
            
            com = con.prepareStatement("select* from Student where id = '"+id+"'");
            rst = com.executeQuery();
            if(rst.next()){
                
                com = con.prepareStatement("select * from RegisterStudentCourse where idS = '"+id+"'");
                rst = com.executeQuery();
                
                while(rst.next()){
                    
                    mod.addRow(new Object[]{true,rst.getString("idCourse"),rst.getString("nameC"),rst.getString("hours"),rst.getString("nameP")});
                    
                }
                
            }else{
           JOptionPane.showMessageDialog(null, "Student ID_Number Is Not Exist","Not Exist",2);
           return 0;
            }
            
        } catch (SQLException e) {
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }
        return 1;

    }

    private void ApplyInsert() {
        con = ConnectionDataBase.connect();
        
        try {
            
            for(int row = 0; row<jTable1.getRowCount();row++){
                if(jTable1.getModel().getValueAt(row, 0).equals(true)){
                    
                    String nameC = jTable1.getModel().getValueAt(row, 2).toString();
                    
                    com = con.prepareStatement("select * from RegisterStudentCourse where idS = '"+val+"' and  nameC = '"+nameC+"'");
                    rst = com.executeQuery();
                    if(!rst.next()){
                        
                        int idC = Integer.parseInt(jTable1.getModel().getValueAt(row, 1).toString());
                        int hours = Integer.parseInt(jTable1.getModel().getValueAt(row, 3).toString());
                        String nameP = jTable1.getModel().getValueAt(row, 4).toString();
                        
                        com = con.prepareStatement("insert into RegisterStudentCourse (idS, idCourse, nameC, hours, nameP, mark1, mark2) values('"+val+"', '"+idC+"' , '"+nameC+"','"+hours+"','"+nameP+"','0','0')");
                        com.execute();
                    }
                    
                }
            }
            
            JOptionPane.showMessageDialog(null, "Course(s) Were Registered" , "Done",JOptionPane.INFORMATION_MESSAGE);
            
            
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.out.println(e.getMessage()); 
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }
    }

    private void ApplyDelete() {
        con = ConnectionDataBase.connect(); 
        try {
             for(int row = 0; row<jTable1.getRowCount();row++){
                 if(jTable1.getModel().getValueAt(row, 0).equals(false)){
                    String nameC = jTable1.getModel().getValueAt(row, 2).toString();
                     
                     com = con.prepareStatement("Delete from RegisterStudentCourse where idS = '"+val+"' and nameC = '"+nameC+"'");
                     com.execute();
                 }
             }
             
            JOptionPane.showMessageDialog(null, "Course(s) Were Deleted" , "Done",JOptionPane.INFORMATION_MESSAGE);
                         
        } catch (HeadlessException | SQLException e) {
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }
    }
}
