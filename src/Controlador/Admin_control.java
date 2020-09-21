package Controlador;

import Dao.Dao;
import Dao.Mesas_dao;
import Modelo.Mesa;
import Vistas.Admin_view;
import Vistas.Reporte_view;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author kenlu
 */
public class Admin_control {

    Admin_view admin;

    Reporte_view reporte;
    Reporte_control reporte_control;

    Admin_control(Admin_view admin) {
        this.admin = admin;
        String usuario_logueado = Login_control.getUser_login().getUsername();
        this.admin.getLbl_nombre().setText(usuario_logueado.toUpperCase());
        initListener();
       
        
    }

    private void initListener() {

        admin.getLbl_reportes().addMouseListener(new Flujo());

        admin.getBtn_definirDia().addMouseListener(new Flujo());

    }

    private void definirDia() {

        Mesa mesa = new Mesa();
        Mesas_dao dao = new Mesas_dao();

        Mesa.setTotal_mesas(dao.getTotalMesas()); //obtener el total de mesas

        int num_mesas = (Integer) admin.getSpn_mesasDisp().getValue();
        int mesasFaltantes = Mesa.getTotal_mesas() - num_mesas; //calculo

        mesa.setId_mesas(Dao.autoId("MESAS", "ID_MESAS"));
        mesa.setEstado('S');
        mesa.setFecha(admin.getTxt_diaInicio().getDate());

        mesa.setNum_mesas(num_mesas);
        mesa.setMesas_faltantes(mesasFaltantes);

        dao.definirDia(mesa);
        
        
        
    }

    class Flujo extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            Object fuente = e.getSource();

            if (fuente.equals(admin.getLbl_reportes())) {
                System.out.println(Login_control.getUser_login());//BORRAR DESPUES OJO
                admin.dispose();
                reporte = new Reporte_view();
                reporte_control = new Reporte_control(reporte);
                reporte.setVisible(true);

            } else if (fuente.equals(admin.getBtn_definirDia())) {

                definirDia();
                

            }

        }

    }
}
