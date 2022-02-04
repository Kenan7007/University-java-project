
package university;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConnectionDataBase {
      
    static Connection con = null;
    
    public static Connection connect(){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://university.accdb");
            
          // JOptionPane.showMessageDialog(null, "Connected");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return con;
    }
    public static void main(String[] args) {
        con = connect();
    }
}