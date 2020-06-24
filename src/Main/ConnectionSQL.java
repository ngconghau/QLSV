package Main;

/**
 *
 * @author Hau
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConnectionSQL {
    public static void main(String[] args) {
        try {
            String url="jdbc:sqlserver://localhost;databaseName=StudentManagement;user=sa;password=hau@@123";
            Connection conn=DriverManager.getConnection(url);
            System.out.println("hell");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
}
