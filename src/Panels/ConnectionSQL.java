package Panels;

/**
 *
 * @author Hau
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionSQL {

    private Connection conn;

    public ConnectionSQL() {
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=StudentManagement;user=sa;password=hau@@123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
        }
    }
}
