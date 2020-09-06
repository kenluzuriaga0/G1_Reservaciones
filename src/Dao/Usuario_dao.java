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
        String sql = "INSERT INTO USUARIOS VALUES(SEC_IDUSUARIOS.nextval,?,?,?,?,?,?,?)";

        try {

            ps = conn.prepareStatement(sql);

//            ps.setInt(2, user.getId_rol());
//            ps.setString(3, user.getUsername());
//            ps.setString(4, user.getPassword());
//            ps.setString(5, user.getNombre());
//            ps.setString(6, user.getApellido());
//            ps.setString(7, user.getEmail());
//            ps.setString(8, String.valueOf(user.getEstado()));
            ps.setInt(1, 2);
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getNombre());
            ps.setString(5, user.getApellido());
            ps.setString(6, user.getEmail());
            ps.setString(7, String.valueOf(user.getEstado()));


            ps.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.out.println("Error en ejecucion de query REGISTRAR USUARIO: " + ex.getMessage());

            return false;
        }

    }

}
