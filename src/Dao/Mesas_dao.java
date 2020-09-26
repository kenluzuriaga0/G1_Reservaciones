package Dao;

import Config.Conexion;
import Modelo.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kenlu
 */
public class Mesas_dao {

    static final String INSERT_DEFINIR = "INSERT INTO MESAS (id_mesas,estado,fecha_inicio, num_mesas,mesas_faltantes)values(?,?,?,?,?)";
    static final String SELECT_TOTALMESAS = "SELECT * FROM TOTAL_MESAS";
    static final String UPDATE_TOTALMESAS = "UPDATE TOTAL_MESAS SET TOTAL_MESAS = ?";

    public int getTotalMesas() {
        Connection conn = Conexion.conectar();
        PreparedStatement ps;
        String query = SELECT_TOTALMESAS;
        ResultSet rs;
        int total_mesas = 0;
        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            if (rs.next()) {
                total_mesas = rs.getInt("TOTAL_MESAS");

            }
            ps.close();
            conn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            return total_mesas;
        }

    }

    public void definirTotalMesas() {
        Connection conn = Conexion.conectar();
        PreparedStatement ps;
        String query = UPDATE_TOTALMESAS;
        try {
            ps = conn.prepareStatement(query);

            ps.setInt(1, Mesa.getTotal_mesas());
            ps.executeUpdate();
            
        } catch (Exception ex) {
            System.out.println("no se actualizo la tabla " + ex.getMessage());
        }

    }

    public void definirDia(Mesa mesa) {
        Connection conn = Conexion.conectar();
        PreparedStatement ps;
        String query = INSERT_DEFINIR;

        try {
            ps = conn.prepareStatement(query);

            ps.setInt(1, mesa.getId_mesas());
            ps.setString(2, String.valueOf(mesa.getEstado()));
            ps.setString(3, formatear(mesa.getFecha()));
            ps.setInt(4, mesa.getNum_mesas());
            ps.setInt(5, mesa.getMesas_faltantes());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Exitoso\nFecha: " + mesa.getFecha() + "\nNumero Mesas: " + mesa.getNum_mesas());

            ps.close();

        } catch (SQLException ex) {

            System.out.println("Definir DIa error " + ex.getMessage());
        }

    }

    public String formatear(Date fecha) {
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");

        if (fecha != null) {
            return dateformat.format(fecha);

        } else {
            JOptionPane.showMessageDialog(null, "Coloque una Fecha correcta Porfavor", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

}
