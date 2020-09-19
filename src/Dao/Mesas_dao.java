package Dao;

import Config.Conexion;
import Modelo.Mesa;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kenlu
 */
public class Mesas_dao {

    static final String INSERT_DEFINIR = "INSERT INTO MESAS (estado,fecha_inicio, num_mesas,mesas_faltantes)values(?,?,?,?)";

    public void definirDia(Mesa mesa) {
        Connection conn = Conexion.conectar();
        PreparedStatement ps;
        String query = INSERT_DEFINIR;

        try {
            ps = conn.prepareStatement(query);

            ps.setString(1, String.valueOf(mesa.getEstado()));
            ps.setString(2, formatear((Date) mesa.getFecha()));
            ps.setInt(3, mesa.getNum_mesas());
            ps.setInt(4, mesa.getMesas_faltantes());

            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Definir DIa error " + ex.getMessage());
        }

    }

    private String formatear(Date fecha) {
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        return dateformat.format(fecha);

    }

    public int autoId(String table, String id_table) {
        Connection conn = Conexion.conectar();
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT " + id_table + " FROM " + "(SELECT " + id_table + " FROM " + table + " ORDER BY " + id_table + " DESC) " + "WHERE ROWNUM<2";
        int id = 0;
        try {

            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            if (rs.next()) {
                id = rs.getInt(id_table);

            }

        } catch (SQLException ex) {
            System.out.println("No encontró el ultimo id para el auto-incremento " + ex.getMessage());
        }

        return id+1;

    }
}
