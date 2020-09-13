
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kenlu
 */
public class Conexion {
    
    public static Connection conectar() {
        Connection conn = null;
        try {

            String url = "jdbc:oracle:thin:@KEN-PC:1521:XE";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, "ken", "123");

            System.out.println("se conectó a la BD exitosamente");

        } catch (ClassNotFoundException e) {
            System.out.println("no encontró el driver");
        } catch (SQLException e) {
            System.out.println("no conecta, falla de url, user o password");
        }

        return conn;
    }
    
}