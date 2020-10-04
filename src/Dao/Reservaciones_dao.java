package Dao;

import Config.Conexion;
import IDao.Ireservaciones;
import Modelo.Reservacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Reservaciones_dao implements Ireservaciones {

    private String query_insertar = "insert into reservaciones values (?,?,?,?)";
private final String SELECT_TODO_X_FECHA = "SELECT * FROM RESERVACIONES WHERE FECHA_RESERVACION BETWEEN (? AND ?)";
    @Override
    public void insertar(Reservacion e) {
        Connection cn = Conexion.conectar();
        PreparedStatement ps;
        int id_siguiente = Dao.autoId("reservaciones", "id_reservaciones");
        try {
            ps = cn.prepareStatement(query_insertar);
            ps.setInt(1, id_siguiente);
            ps.setInt(2, e.getId_usuario());
            ps.setTimestamp(3, e.getFecha_emision());
            ps.setInt(4, e.getParticipantes());
            ps.executeUpdate();
            cn.close();
        } catch (Exception ex) {
            System.out.println("Error en insertar reservacion" + ex);
        }

    }

    @Override
    public boolean eliminar(Reservacion e) {
        return false;
    }

    @Override
    public boolean actualizar(Reservacion e) {
        return false;
    }

    @Override
    public ArrayList<Reservacion> listar(Date inicio,Date fin) {
        Connection con = Conexion.conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = SELECT_TODO_X_FECHA;
        
        ArrayList<Reservacion> listaReservacion = new ArrayList<>();    
        
        try{
        ps = con.prepareStatement(query);
        ps.setDate(1, (java.sql.Date) inicio);
        ps.setDate(2, (java.sql.Date) fin);
         
        rs = ps.executeQuery();
        while(rs.next()){
            
        }
        
        
        }catch(SQLException ex){
            System.out.println("Fallo en elinstar "+ex.getMessage());
        }

        return new ArrayList<Reservacion>();
    }

    //VALIDACION-------------------------------------------------------------
    public int getMesasOcupadas(java.sql.Date fecha) {
        Connection cn = Conexion.conectar();
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
        Connection cn = Conexion.conectar();
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
            cn.close();
        } catch (Exception e) {
            System.out.println("Error en verificarFechayaReservada  " + e);
        }

        return existe;
    }

}
