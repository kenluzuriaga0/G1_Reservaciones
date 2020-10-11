package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kenlu
 */
public class Conexion {

    private Connection con = null;

    public Conexion() {
        con = null;
        try {

            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, "ken", "123");

            System.out.print("-");
            StackTraceElement[] elements = Thread.currentThread().getStackTrace();
            String classe = elements[2].getClassName();
            String method = elements[2].getMethodName();
            System.out.print(classe + " _ " + method);
        } catch (ClassNotFoundException e) {
            System.out.println("No encontró el driver");
        } catch (SQLException e) {
            System.out.println("No conecta, falla de url, user o password " + e.getMessage());
        }

    }

    public void cerrar() {

        if (con != null) {
            try {

                con.close();
                //   Thread.sleep(500);
                System.out.print(" X\n");
            } catch (SQLException ex) {
                System.out.println("No se realizó la desconexión: " + ex.getMessage());
            }
        }
    }

    public Connection getCon() {
        return this.con;
    }

}
