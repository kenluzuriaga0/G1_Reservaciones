package Dao;

import Modelo.*;
import Config.Conexion;
import IDao.IUsuario_dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author kenlu
 */
public class Usuario_dao extends Conexion implements IUsuario_dao {

    private static final String INSERT_USUARIO = "INSERT INTO USUARIOS VALUES(?,?,?,?,?,?,?,?,?)";
    private static final String SELECT_USUARIO = "SELECT id_usuarios,username, password, id_roles,nombre,apellido,email,estado, sexo FROM USUARIOS WHERE username = ?";
    private static final String UPDATE_USUARIO = "UPDATE usuarios SET username = ?, password = ?, nombre = ?, apellido = ?, email = ? where id_usuarios = ?";

    public Usuario_dao() {
        super.cerrar();
    }

    @Override
    public boolean registrar(Usuario user) {

        Conexion cn = new Conexion();
        PreparedStatement ps = null;
        String sql = INSERT_USUARIO;

        try {

            ps = cn.getCon().prepareStatement(sql);
            ps.setInt(1, user.getId());
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
            cn.cerrar();
            return true;

        } catch (SQLException ex) {
            System.out.println("Error en ejecucion de query REGISTRAR USUARIO: " + ex.getMessage());
            

            return false;
        }

    }

    @Override
    public boolean ingresar(Usuario user) {
        Conexion cn = new Conexion();
        PreparedStatement ps = null;
        String sql = SELECT_USUARIO;
        ResultSet rs = null;
        try {
            ps = cn.getCon().prepareStatement(sql);

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
                    user.setEstado(rs.getString(8).charAt(0));
                    user.setSexo(rs.getString(8).charAt(0));

                    ps.close();
                    cn.cerrar();
                    return true;

                }
            }
            ps.close();
            cn.cerrar();
            return false;

        } catch (SQLException ex) {
            System.out.println("Ohtia chaval, fallo de SELECT");
            return false;
        }

    }

    @Override
    public boolean actualizar(Usuario user) {
        Conexion cn = new Conexion();
        PreparedStatement ps = null;
        String sql = UPDATE_USUARIO;
        try {
            ps = cn.getCon().prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getNombre());
            ps.setString(4, user.getApellido());
            ps.setString(5, user.getEmail());
            ps.setInt(6, user.getId());

            ps.executeUpdate();
            
            ps.close();
            cn.cerrar();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error en actualizar " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error en la actualizacion "+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;

        }
    }

    @Override
    public List<String> contrasenaPorCorreo(String email) {
        List<String> datos = new ArrayList<>();
        Conexion cn = new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        String sql = "SELECT NOMBRE, APELLIDO, PASSWORD,USERNAME FROM USUARIOS WHERE EMAIL = ?";
        try {
            ps = cn.getCon().prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();

            if (rs.next()) {
                datos.add(rs.getString("NOMBRE").toUpperCase() + " " + rs.getString("APELLIDO").toUpperCase()); //nom completo
                datos.add(rs.getString("PASSWORD"));
                datos.add(rs.getString("USERNAME"));

            }
            ps.close();
            cn.cerrar();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al encontrar Correo  " + ex.getMessage());
        }

        return datos;
    }

}
