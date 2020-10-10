package Controlador;

import Dao.Dao;
import Dao.Mesas_dao;
import Dao.Usuario_dao;
import IDao.IMesa_dao;
import Modelo.Mesa;
import Modelo.Usuario;
import Vistas.Admin_view;
import Vistas.Reporte_view;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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

        admin.getBtn_definirTotal().addMouseListener(new Flujo());
    }

    private void definirDia() {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea Realizar esta transaccion?", "Confirmacion", JOptionPane.YES_OPTION);
        if (opcion == 0) {
            Mesa mesa = new Mesa();
            IMesa_dao dao = new Mesas_dao();

            Mesa.setTotal_mesas(dao.getTotalMesas()); //obtener el total de mesas

            if (mesa.validarDefinirMesas(admin.getTxt_diaInicio().getDate(), admin.getTxt_diaFin().getDate(), admin.getSpn_mesasDisp())) {
                int num_mesas = (Integer) admin.getSpn_mesasDisp().getValue();
                int mesasFaltantes = Mesa.getTotal_mesas() - num_mesas; //calculo
                Date fechaInicio = admin.getTxt_diaInicio().getDate();
                Date fechaFin = admin.getTxt_diaFin().getDate();

                mesa.setEstado('S');
                mesa.setFecha(mesa.listarFechas(fechaInicio, fechaFin));

                mesa.setNum_mesas(num_mesas);
                mesa.setMesas_faltantes(mesasFaltantes);

                dao.definirDia(mesa);

            }
        }
    }

    private void definirTotal() {
        IMesa_dao dao = new Mesas_dao();

        String input = JOptionPane.showInputDialog(null, "Total de mesas actual: " + Mesa.getTotal_mesas() + " mesas", "Defina Total de Mesas", JOptionPane.QUESTION_MESSAGE);

        try {

            Mesa.setTotal_mesas(Integer.parseInt(input));
            dao. actualizarTotalMesas();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite un numero válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
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

            } else if (fuente.equals(admin.getBtn_definirTotal())) {
                definirTotal();
            }

        }

    }
}
