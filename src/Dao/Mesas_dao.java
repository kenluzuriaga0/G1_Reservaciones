package Dao;

import Config.Conexion;
import IDao.IMesa_dao;
import Modelo.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kenlu
 */
public class Mesas_dao implements IMesa_dao {

    static final String INSERT_DEFINIR = "INSERT INTO MESAS (id_mesas,estado,fecha_inicio, num_mesas,mesas_faltantes)values(?,?,?,?,?)";
    static final String SELECT_TOTALMESAS = "SELECT * FROM TOTAL_MESAS";
    static final String UPDATE_TOTALMESAS = "UPDATE TOTAL_MESAS SET TOTAL_MESAS = ?";

    static final String RANGO_TOTAL = "select fecha_inicio from mesas where id_mesas "
            + "= (select min(id_mesas) from mesas) or id_mesas=(select max(id_mesas) from mesas)"; //NUEVO

    public ArrayList<java.sql.Date> obtenerComienzoFinal() { //NUEVO
        Connection conn = Conexion.conectar();
        PreparedStatement ps;
        String query = RANGO_TOTAL;
        ResultSet rs;
        ArrayList<java.sql.Date> fechas = new ArrayList<java.sql.Date>();
        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                fechas.add(new java.sql.Date(rs.getTimestamp(1).getTime()));
            }
            ps.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return fechas;

    }

    @Override
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

    @Override
    public void actualizarTotalMesas() {
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

    @Override
    public void definirDia(Mesa mesa) {
        Connection conn = Conexion.conectar();
        PreparedStatement ps;
        String query = INSERT_DEFINIR;

        try {
            ps = conn.prepareStatement(query);
            for (int i = 0; i < mesa.getFecha().size(); i++) {
                ps.setInt(1, Dao.autoId("MESAS", "ID_MESAS"));
                ps.setString(2, String.valueOf(mesa.getEstado()));
                ps.setString(3, mesa.formatear(mesa.getFecha().get(i), "dd/MM/yyyy"));
                ps.setInt(4, mesa.getNum_mesas());
                ps.setInt(5, mesa.getMesas_faltantes());

                ps.executeUpdate();

            }

            JOptionPane.showMessageDialog(null, "Registro Exitoso\nFecha: " + mesa.formatear(mesa.getFecha().get(0), "dd/MM/yyyy") + " hasta "
                    + mesa.formatear(mesa.getFecha().get(mesa.getFecha().size() - 1), "dd/MM/yyyy")
                    + "\nNumero Mesas: " + mesa.getNum_mesas());

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio algun Error", "Error", JOptionPane.ERROR);
            System.out.println("Definir DIa error " + ex.getMessage());
        }

    }

//------------------------------------------------------------------------------------
    public boolean verificarFecha(java.sql.Date fecha) {
        Connection cn = Conexion.conectar();
        PreparedStatement ps;
        int filas = 0;
        System.out.println(fecha);
        boolean existe = false;
        String query = "select * from mesas where trunc(fecha_inicio)=?";

        try {
            ps = cn.prepareStatement(query);
            ps.setDate(1, fecha);
            filas = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error en verificarFecha " + e);
        }

        if (filas > 0) {
            existe = true;
        } else {
            existe = false;
        }
        return existe;
    }

    public int getMesasExistentes(java.sql.Date fecha) {
        Connection cn = Conexion.conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;
        int mesas = 0;
        String query = " select num_mesas from mesas where fecha_inicio=?";
        try {
            ps = cn.prepareStatement(query);
            ps.setDate(1, fecha);
            rs = ps.executeQuery();
            if (rs.next()) {
                mesas = rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println("Error mi loco, getMesasExistentes " + e.getMessage());
        }
        return mesas;
    }

}
