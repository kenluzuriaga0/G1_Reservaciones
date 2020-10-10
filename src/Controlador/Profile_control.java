package Controlador;

import Dao.Reservaciones_dao;
import Dao.Usuario_dao;
import IDao.Ireservaciones;
import Modelo.Mesa;
import Modelo.Reservacion;
import Modelo.Usuario;
import Vistas.Home_view;
import Vistas.Profile_view;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kenlu
 */
public class Profile_control extends Login_control {

    private Home_control home_con;
    private Home_view home;
    private Profile_view profile;

    DefaultTableModel model;

    public Profile_control(Usuario user, Usuario_dao userDao, Profile_view profile) {
        super(user, userDao);
        this.profile = profile;
        String usuario_logueado = getUser().getNombre() + " " + getUser().getApellido();
        this.profile.getLbl_nombre().setText(usuario_logueado.toUpperCase());
        setearStats();
        initListener();

        model = new DefaultTableModel();
        consultarHistorico();

    }

    private void initListener() {
        profile.getLbl_home().addMouseListener(new Flujo());

        profile.getBtn_cancelarRes().addMouseListener(new Flujo());

    }

    private void setearStats() {
        Mesa f = new Mesa();
        Reservaciones_dao dao = new Reservaciones_dao();
        profile.getLbl_resPendientes().setText(String.valueOf(dao.getPendientes_x_user()));
        profile.getLbl_resHechas().setText(String.valueOf(dao.getHechas_x_user()));
        profile.getLbl_resActual().setText(f.formatear(dao.getProximo(), "dd/MM/yyyy - HH:mm:ss"));

    }

    private void consultarHistorico() {

        limpiarTabla();

        Ireservaciones dao = new Reservaciones_dao();
        Mesa f = new Mesa();
        model = (DefaultTableModel) profile.getTabla_historico().getModel();

        ArrayList<Reservacion> lista;

        lista = dao.listarHistorico();
        Object[] rows = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            rows[0] = lista.get(i).getId();
            rows[1] = f.formatear(lista.get(i).getFecha_emision(), "dd/MM/yyyy - HH:mm:ss");
            rows[2] = f.formatear(lista.get(i).getFecha_emision(), "EEEE").toUpperCase();
            rows[3] = lista.get(i).getParticipantes() + " Participantes";
            rows[4] = lista.get(i).getMotivo();
            rows[5] = lista.get(i).getDetalleMotivo();
            model.addRow(rows);
        }

        profile.getTabla_historico().setModel(model);

    }

    private void limpiarTabla() {

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

    }

    private void eliminar(JTable tabla) {
        int opcion = JOptionPane.showConfirmDialog(null, "Desea eliminar esta reservacion?");
        if (opcion == 0) {
            Ireservaciones dao = new Reservaciones_dao();
            Reservacion e = new Reservacion();
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            int fila = tabla.getSelectedRowCount(); //cuento cuantas filas hay seleccionadas

            if (fila > 0) {
                int codigoSeleccinado = Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0))); //obtengo el codigo del producto
                e.setId(codigoSeleccinado);
                System.out.println(codigoSeleccinado);
                if (dao.eliminar(e)) {
                    modelo.removeRow(profile.getTabla_historico().getSelectedRow());   //elimino de la tabla
                    tabla.setModel(model);

                    JOptionPane.showMessageDialog(null, "Borrado con exito");
                }

            } else {
                JOptionPane.showMessageDialog(null, "No Selecciono Ninguna Fila", "Aviso", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    class Flujo extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent ev) {
            Object fuente = ev.getSource();

            if (fuente.equals(profile.getLbl_home())) {
                profile.dispose();
                home = new Home_view();
                home_con = new Home_control(getUser(), getUserDao(), home);
                home.setVisible(true);
            } else if (fuente.equals(profile.getBtn_cancelarRes())) {
                eliminar(profile.getTabla_historico());
                setearStats();
            }

        }

    }
}
