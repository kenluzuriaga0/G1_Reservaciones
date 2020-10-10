package Controlador;

import Dao.Reservaciones_dao;
import Dao.Usuario_dao;
import Modelo.Mesa;
import Modelo.Reservacion;
import Modelo.Usuario;
import Vistas.Admin_view;
import Vistas.Reporte_view;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
        setearNow_Tomorrow();

    }

    private void initListener() {

        reporte.getLbl_administracion().addMouseListener(new Flujo());
        reporte.getBtn_consultarReservaciones().addMouseListener(new Flujo());      
        reporte.getLbl_refrescar().addMouseListener(new Flujo());
    }

    private void consultarReservaciones() {

        limpiarTabla();
     //VALIDACIONES *************
        if (reporte.getTxt_desde().getDate() == null || reporte.getTxt_hasta().getDate() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese los campos de fecha", "Error Mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (reporte.getTxt_desde().getDate().after(reporte.getTxt_hasta().getDate())) {
            JOptionPane.showMessageDialog(null, "La fecha Desde no puede ser posterior a la fecha Hasta", "Error Mensaje", JOptionPane.ERROR_MESSAGE);
            return;
            
        }
      //FIN DE VALIDACIONES  
        
        Reservacion reserve = new Reservacion();
        Reservaciones_dao dao = new Reservaciones_dao();
        Mesa f = new Mesa();
        model = (DefaultTableModel) reporte.getTabla_consultas().getModel();

        ArrayList<Reservacion> lista;

        java.sql.Date desde, hasta;
        desde = new java.sql.Date(reserve.setearTiempo(reporte.getTxt_desde().getDate(), 0, 0));
        hasta = new java.sql.Date(reserve.setearTiempo(reporte.getTxt_hasta().getDate(), 0, 0));

        lista = dao.listar(desde, hasta, false);
        Object[] rows = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            rows[0] = lista.get(i).getId();
            rows[1] = lista.get(i).getUsername();
            rows[2] = f.formatear(lista.get(i).getFecha_emision(),"dd/MM/yyyy");
            rows[3] = lista.get(i).getParticipantes()+" Personas";
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
    
    private void setearNow_Tomorrow(){
        Reservaciones_dao dao = new Reservaciones_dao();
        reporte.getLbl_hoy().setText(String.valueOf(dao.getTotalHoy()));
        reporte.getLbl_tomorrow().setText(String.valueOf(dao.getTotalManana()));
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

            }else if(fuente.equals(reporte.getLbl_refrescar())){
                setearNow_Tomorrow();
            }

        }
    }

}
