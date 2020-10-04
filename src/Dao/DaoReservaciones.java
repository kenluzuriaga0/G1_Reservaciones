/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class DaoReservaciones implements Ireservaciones {

    private String query_insertar = "insert into reservaciones values (?,?,?,?)";

    @Override
    public void insertar(Reservacion e) {
        Connection cn = Conexion.conectar();
        PreparedStatement ps;
        int id_siguiente = this.buscarIdSiguiente(cn, "reservaciones", "id_reservaciones");
        try {
            ps = cn.prepareStatement(query_insertar);
            ps.setInt(1, id_siguiente);
            ps.setInt(2,e.getId_usuario());
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
    public ArrayList<Reservacion> listar(Reservacion e) {
        return new ArrayList<Reservacion>();
    }

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

    private int buscarIdSiguiente(Connection cn, String nombre_tabla, String nombre_columna) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        int id = 0;
        String query = "select max(" + nombre_columna + ") from " + nombre_tabla;

        try {
            ps = cn.prepareStatement(query);
        } catch (SQLException ex) {
            System.out.println("error en prepared statemente de id siguiente");
        }
        try {
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println("error execute query de idsiguiente");
        }
        try {
            rs.next();
            id = rs.getInt(1);

        } catch (SQLException ex) {
            System.out.println("error en getInt de idsiguiente");
        }

        return id + 1;
    }
}
