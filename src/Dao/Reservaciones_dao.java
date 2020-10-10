package Dao;

import Config.Conexion;
import Controlador.Login_control;
import IDao.Ireservaciones;
import Modelo.Reservacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Reservaciones_dao extends Conexion implements Ireservaciones {

    private String INSERTAR_RESERVACION = "INSERT INTO reservaciones VALUES (?,?,?,?,?,?)";
    private final String SELECT_TODO_X_FECHA = "SELECT R.ID_RESERVACIONES, U.USERNAME, R.FECHA_RESERVACION, R.NUMERO_PERSONAS,R.MOTIVO,R.DETALLE_MOTIVO, R.ID_USUARIOS"
            + "    FROM reservaciones R INNER JOIN USUARIOS U ON R.ID_USUARIOS = U.ID_USUARIOS WHERE FECHA_RESERVACION BETWEEN ? AND ? ORDER BY FECHA_RESERVACION";
    private final String DELETE_RESERVACION = "DELETE FROM RESERVACIONES WHERE ID_RESERVACIONES = ?";

    @Override
    public void insertar(Reservacion e) {
        Connection cn = conectar();
        PreparedStatement ps;
        Dao dao = new Dao();
        int id_siguiente = dao.autoId("reservaciones", "id_reservaciones");
        try {
            ps = cn.prepareStatement(INSERTAR_RESERVACION);
            ps.setInt(1, id_siguiente);
            ps.setInt(2, e.getId_usuario());
            ps.setTimestamp(3, e.getFecha_emision());
            ps.setInt(4, e.getParticipantes());
            ps.setString(5, e.getMotivo());
            ps.setString(6, e.getDetalleMotivo());
            ps.executeUpdate();
            cn.close();
        } catch (Exception ex) {
            System.out.println("Error en insertar reservacion" + ex);
        }

    }

    @Override
    public boolean eliminar(Reservacion e) {
        Connection cn = conectar();
        PreparedStatement ps;

        try {
            ps = cn.prepareStatement(DELETE_RESERVACION);
            ps.setInt(1, e.getId());
            ps.executeUpdate();

            ps.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Fallo Eliminar_dao " + ex.getMessage());
            return false;
        }

    }

    @Override
    public boolean actualizar(Reservacion e
    ) {
        return false;
    }

    @Override
    public ArrayList<Reservacion> listar(java.sql.Date inicio, java.sql.Date fin, boolean flag) {
        Connection con = conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = SELECT_TODO_X_FECHA;

        ArrayList<Reservacion> listaReservacion = new ArrayList<>();
        try {
            ps = con.prepareStatement(query);
            ps.setDate(1, inicio);
            ps.setDate(2, fin);

            rs = ps.executeQuery();
            while (rs.next()) {
                Reservacion res = new Reservacion();
                res.setId(rs.getInt(1));
                res.setUsername(rs.getString(2));
                System.out.println(res.getUsername());
                res.setFecha_emision(rs.getTimestamp(3));
                res.setParticipantes(rs.getInt(4));
                res.setMotivo(rs.getString(5));
                res.setDetalleMotivo(rs.getString(6));
                if (flag) {
                   res.setId_usuario(rs.getInt(7)); 
                }
                listaReservacion.add(res);

            }
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Fallo en enlistar " + ex.getMessage());
        }

        return listaReservacion;
    }
    //VISTA-----------------------------------------------------------------
    //--ReporteView--

    public int getTotalHoy() {
        Connection con = conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "select count(*) from reservaciones where trunc(fecha_reservacion) = trunc(sysdate)";

        int paraHoy = 0;
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            if (rs.next()) {
                paraHoy = rs.getInt(1);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Falla de getHoy " + ex.getMessage());
        } finally {
            return paraHoy;
        }

    }

    public int getTotalManana() {
        Connection con = conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "select count(*) from reservaciones where trunc(fecha_reservacion) = trunc(sysdate+1)";

        int paraHoy = 0;
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            if (rs.next()) {
                paraHoy = rs.getInt(1);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Falla de getTomorrow " + ex.getMessage());
        } finally {
            return paraHoy;
        }

    }
    //--FIN ReporteView--

    //--ProfileView--
    public int getPendientes_x_user() {
        Connection con = conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "select count(*) from reservaciones where id_usuarios = ? and fecha_reservacion > sysdate";

        int pendientes = 0;
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, Login_control.getUser().getId());

            rs = ps.executeQuery();

            if (rs.next()) {
                pendientes = rs.getInt(1);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Falla de getTPendientes " + ex.getMessage());
        } finally {
            return pendientes;
        }
    }
//--FIN ProfileView--

    public Date getProximo() {
        Connection con = conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "SELECT fecha_reservacion FROM "
                + "(select fecha_reservacion from reservaciones  WHERE fecha_reservacion > sysdate"
                + " and id_usuarios = ? order by fecha_reservacion asc) WHERE rownum<=1";

        Date fechaReciente = null;
        try {
            
            ps = con.prepareCall(query);
            ps.setInt(1, Login_control.getUser().getId());
            rs = ps.executeQuery();
            if (rs.next()) {

                fechaReciente = rs.getDate(1);
            }
            ps.close();
        } catch (Exception ex) {
            System.out.println("Falla en getProximo Reservaciones  " + ex.getMessage());
        } finally {
            return fechaReciente;
        }

    }

    //--PerfilView--
    @Override
    public ArrayList<Reservacion> listarHistorico() {
        Connection con = conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "select id_reservaciones, fecha_reservacion, numero_personas, motivo, detalle_motivo from reservaciones where id_usuarios = ? order by fecha_reservacion desc";

        ArrayList<Reservacion> listaReservacion = new ArrayList<>();
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, Login_control.getUser().getId());

            rs = ps.executeQuery();
            while (rs.next()) {
                Reservacion res = new Reservacion();
                res.setId(rs.getInt(1));
                res.setFecha_emision(rs.getTimestamp(2));
                res.setParticipantes(rs.getInt(3));
                res.setMotivo(rs.getString(4));
                res.setDetalleMotivo(rs.getString(5));
                listaReservacion.add(res);
            }
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Fallo en enlistarHistorico " + ex.getMessage());
        }

        return listaReservacion;
    }

    //-- FIN PerfilView--
    public int getHechas_x_user() {
        Connection con = conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "select count(*) from reservaciones where id_usuarios = ? and  fecha_reservacion < sysdate";

        int hechas = 0;
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, Login_control.getUser().getId());

            rs = ps.executeQuery();

            if (rs.next()) {
                hechas = rs.getInt(1);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Falla de getTHechas " + ex.getMessage());
        } finally {
            return hechas;
        }
    }

    //VALIDACION-------------------------------------------------------------
    public int getMesasOcupadas(java.sql.Date fecha) {
        Connection cn = conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;
        int mesas = 0;
        String query = "select trunc( fecha_reservacion),count(*) from reservaciones"
                + " where trunc (fecha_reservacion)=? group by trunc(fecha_reservacion) "; //colocarlo
        try {
            ps = cn.prepareStatement(query);
            ps.setDate(1, fecha);
            rs = ps.executeQuery();

            if (rs.next() == true) {
                mesas = rs.getInt(2);
            }

            ps.close();
        } catch (Exception e) {
            System.out.println("Error en getMesasOcupadas " + e);
        }
        return mesas;
    }

    public boolean verificarFechaYaReservada(java.sql.Date fecha, int id) {
        Connection cn = conectar();
        PreparedStatement ps;
        String query = "select * from reservaciones where trunc(fecha_reservacion)=? and id_usuarios=?";
        boolean existe = false;
        try {
            ps = cn.prepareStatement(query);
            ps.setDate(1, fecha);
            ps.setInt(2, id);

            if (ps.executeUpdate() > 0) {
                existe = true;
            }
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en verificarFechayaReservada  " + e);
        }

        return existe;
    }

}
