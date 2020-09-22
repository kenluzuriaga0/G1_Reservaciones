package Controlador;

import Dao.Dao;
import Dao.Mesas_dao;
import Dao.Usuario_dao;
import Modelo.Mesa;
import Modelo.Usuario;
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
public class Admin_control extends Login_control {

    Admin_view admin;

    Reporte_view reporte;
    Reporte_control reporte_control;

    public Admin_control() {
    }

    Admin_control(Usuario user, Usuario_dao userDao, Admin_view admin) {
        super(user, userDao);
        this.admin = admin;

        initListener();
        admin.getLbl_nombre().setText(getUser().getUsername().toUpperCase());
        System.out.println(getUser());
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

            if (fuente.equals(admin.getLbl_reportes())) {       //ir a Reporte
                System.out.println(getUser());//BORRAR DESPUES OJO
                admin.dispose();
                reporte = new Reporte_view();
                reporte_control = new Reporte_control(getUser(), getUserDao(), reporte);
                reporte.setVisible(true);

            } else if (fuente.equals(admin.getBtn_definirDia())) {

                definirDia();

            }

        }

    }
}
