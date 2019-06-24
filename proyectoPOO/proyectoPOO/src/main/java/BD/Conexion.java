package BD;

/**
 *
 * @author David VM
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Connection conn = null;
    private String user = "root";
    private String password = "admin";
    private String host = "localhost";
    private String port = "3306";
    private String bd = "employees";
    

    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+bd+"?"
                    + "user="+user+"&password="+password+"&serverTimezone=UTC");

        } catch (Exception ex) {
            System.out.println("SQLException: " + ex.getMessage());            
        }
    }
    public Connection getConnection(){
        return conn;
    }
}