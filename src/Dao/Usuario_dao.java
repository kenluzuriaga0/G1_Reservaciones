package Dao;

import Modelo.*;
import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kenlu
 */
public class Usuario_dao {

    public boolean registrar(Usuario user) {

        Connection conn = Conexion.conectar();
        PreparedStatement ps = null;
        String sql = "INSERT INTO USUARIOS VALUES(?,?,?,?,?,?,?,?,?)";

        try {

            ps = conn.prepareStatement(sql);
            ps.setInt(1,user.getId());
            ps.setInt(2, 2);
            ps.setString(3, user.getUsername());
            ps.setString(4, user.getPassword());
            ps.setString(5, user.getNombre());
            ps.setString(6, user.getApellido());
            ps.setString(7, user.getEmail());
            ps.setString(8, String.valueOf(user.getEstado()));
            ps.setString(9, String.valueOf(user.getSexo()));

            ps.executeUpdate();

            ps.close();
            return true;

        } catch (SQLException ex) {
            System.out.println("Error en ejecucion de query REGISTRAR USUARIO: " + ex.getMessage());

            return false;
        }

    }

    public boolean ingresar(Usuario user) {
        Connection conn = Conexion.conectar();
        PreparedStatement ps = null;
        String sql = "SELECT id_usuarios,username, password, id_roles,nombre,apellido,email,estado, sexo FROM USUARIOS WHERE username = ?";
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);

            ps.setString(1, user.getUsername());

            rs = ps.executeQuery();

            if (rs.next()) {
                if (user.getPassword().equals(rs.getString(3))) {

                    user.setId(rs.getInt(1));
                    user.setUsername(rs.getString(2));
                    user.setPassword(rs.getString(3));
                    user.setId_rol(rs.getInt(4));
                    user.setNombre(rs.getString(5));
                    user.setApellido(rs.getString(6));
                    user.setEmail(rs.getString(7));
                    user.setEstado( rs.getString(8).charAt(0));
                    user.setSexo(rs.getString(8).charAt(0));
                    
                    ps.close();
                    return true;

                } else {
                    ps.close();
                    return false;
                }
            } else {
                ps.close();
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("Ohtia chaval, fallo de SELECT");
            return false;
        }

    }

    public String[] traerContrasena(String email) {
        String[] datos = new String[3];

        Connection conn = Conexion.conectar();
        PreparedStatement ps;
        ResultSet rs;
        String sql = "SELECT NOMBRE, APELLIDO, PASSWORD,USERNAME FROM USUARIOS WHERE EMAIL = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();

            if (rs.next()) {
                datos[0] =rs.getString("NOMBRE").toUpperCase()+" "+rs.getString("APELLIDO").toUpperCase(); //nom completo
                datos[1] = rs.getString("PASSWORD");
                datos[2]= rs.getString("USERNAME");
                
                
            }
            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al encontrar Correo  " + ex.getMessage());
        }

        return datos;
    }

}
