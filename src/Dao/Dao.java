package Dao;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kenlu
 */
public class Dao extends Conexion{

    public Dao() {
        super.cerrar();
    }

    public int autoId(String table, String id_table) {
        Conexion cn = new Conexion();
       // System.out.print("autid");
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT " + id_table + " FROM " + table + " WHERE ROWNUM<=1 ORDER BY " + id_table + " DESC";
        int id = 0;
        try {

            ps = cn.getCon().prepareStatement(query);
            rs = ps.executeQuery();

            if (rs.next()) {
                id = rs.getInt(id_table);

            }
             ps.close();
             cn.cerrar();
        } catch (SQLException ex) {
            System.out.println("No encontró el ultimo id para el auto-incremento " + ex.getMessage());
        }

        return id + 1;

    }

}
