package Controlador;

import Dao.Reservaciones_dao;
import Dao.Usuario_dao;
import Modelo.Reservacion;
import Modelo.Usuario;
import Vistas.Admin_view;
import Vistas.Reporte_view;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kenlu
 */
public class Reporte_control extends Login_control {

    Reporte_view reporte;
    Admin_view admin;
    Admin_control admin_con;
    
    DefaultTableModel model;

    Reporte_control(Usuario user, Usuario_dao userDao, Reporte_view reporte) {
        super(user, userDao);

        this.reporte = reporte;
        initListener();
        model = new DefaultTableModel();

    }

    private void initListener() {

        reporte.getLbl_administracion().addMouseListener(new Flujo());
        reporte.getBtn_consultarReservaciones().addMouseListener(new Flujo());
    }

    private void consultarReservaciones() {
        
        limpiarTabla();
        Reservacion reserve = new Reservacion();
        Reservaciones_dao dao = new Reservaciones_dao();

        model = (DefaultTableModel) reporte.getTabla_consultas().getModel();

        ArrayList<Reservacion> lista;

        java.sql.Date desde, hasta;
        desde = new java.sql.Date(reserve.setearTiempo(reporte.getTxt_desde().getDate(), 0, 0));
        hasta = new java.sql.Date(reserve.setearTiempo(reporte.getTxt_hasta().getDate(), 0, 0));

        lista = dao.listar(desde, hasta);
        Object[] rows = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            rows[0] = lista.get(i).getId();
            rows[1] = lista.get(i).getId_usuario();
            rows[2] = lista.get(i).getFecha_emision();
            rows[3] = lista.get(i).getParticipantes();
            rows[4] = lista.get(i).getMotivo();
            rows[5] = lista.get(i).getDetalleMotivo();
            model.addRow(rows);
        }

        reporte.getTabla_consultas().setModel(model);

    }
    private void limpiarTabla() {

       
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

    }
    class Flujo extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            Object fuente = e.getSource();

            if (fuente.equals(reporte.getLbl_administracion())) { //ir a administracion
                reporte.dispose();
                admin = new Admin_view();
                admin_con = new Admin_control(getUser(), getUserDao(), admin);
                admin.setVisible(true);
            } else if (fuente.equals(reporte.getBtn_consultarReservaciones())) {       //BOTON CONSULTAR

                consultarReservaciones();

            }

        }
    }

}
