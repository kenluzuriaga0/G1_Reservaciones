package Dao;

import Modelo.*;
import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author kenlu
 */
public class Usuario_dao {

    public static boolean registrar(Usuario user) {

        Connection conn = Conexion.conectar();
        PreparedStatement ps = null;
        String sql = "INSERT INTO USUARIOS (USERNAME, PASSWORD,NOMBRE,APELLIDO,EMAIL,ID_ROLES) "
                + "VALUES (?,?,?,?,?,?)";

        try {

            ps = conn.prepareStatement(sql);

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getNombre());
            ps.setString(4, user.getApellido());
            ps.setString(5, user.getEmail());
            ps.setInt(6, user.getId_rol());

            ps.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.out.println("Error en ejecucion de query REGISTRAR USUARIO: " + ex.getMessage());

            return false;
        }

    }

}
