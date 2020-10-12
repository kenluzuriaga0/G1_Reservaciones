package Controlador;

import Dao.Reservaciones_dao;
import Dao.Usuario_dao;
import IDao.Ireservaciones;
import Modelo.Mesa;
import Modelo.Reservacion;
import Modelo.Usuario;
import Vistas.Home_view;
import Vistas.Profile_view;
import XComponentes.EditarPerfil;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author kenlu
 */
public class Profile_control extends Login_control {

    private Home_control home_con;
    private Home_view home;
    private Profile_view profile;

    DefaultTableModel model;
    EditarPerfil editarPerfil;

    public Profile_control(Usuario user, Usuario_dao userDao, Profile_view profile) {
        super(user, userDao);
        this.profile = profile;
        setearStats();
        initListener();

        model = new DefaultTableModel();
        consultarHistorico();

    }

    private void initListener() {
        profile.getLbl_home().addMouseListener(new Flujo());
        profile.getBtn_cancelarRes().addMouseListener(new Flujo());
        profile.getLbl_actualizar().addMouseListener(new Flujo());
        profile.getLbl_actualizarWord().addMouseListener(new Flujo());
        profile.getLbl_atras().addMouseListener(new Flujo());
        profile.getBtn_buscar().addMouseListener(new Flujo());
        profile.getBtn_borrarFiltro().addMouseListener(new Flujo());
    }

    private void setearStats() {
        Mesa f = new Mesa();
        Reservaciones_dao dao = new Reservaciones_dao();
        String usuario_logueado = getUser().getNombre() + " " + getUser().getApellido();
        this.profile.getLbl_nombre().setText(usuario_logueado.toUpperCase());
        profile.getLbl_resPendientes().setText(String.valueOf(dao.getPendientes_x_user()));
        profile.getLbl_resHechas().setText(String.valueOf(dao.getHechas_x_user()));
        profile.getLbl_resActual().setText(f.formatear(dao.getProximo(), "dd/MM/yyyy - HH:mm"));

    }

    private void consultarHistorico() {

        Ireservaciones dao = new Reservaciones_dao();
        Mesa f = new Mesa();
        model = (DefaultTableModel) profile.getTabla_historico().getModel();

        ArrayList<Reservacion> lista;

        lista = dao.listarHistorico();
        Object[] rows = new Object[6];
        for (int i = 0; i < lista.size(); i++) {  //OJO
            rows[0] = lista.get(i).getId();
            rows[1] = f.formatear(lista.get(i).getFecha_emision(), "dd/MM/yyyy - HH:mm");
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

    private boolean veriEliminacion(String fecha) {
        Date date;
        long diaMil;
        long milHoy;
        long dia = 60000 * 60 * 24;
        Calendar hoy = Calendar.getInstance();
        try {
            date = new SimpleDateFormat("dd/MM/yyyy - HH:mm").parse(fecha);
            diaMil = date.getTime();
            milHoy = hoy.getTimeInMillis();
            if (Math.abs(milHoy - diaMil) > dia && diaMil > milHoy) { //tiene 24 horas de diferencia?

                return true;

            } else {
                return false;
            }

        } catch (ParseException ex) {
            System.out.println("Error de parseo String a date " + ex.getMessage());
            return false;
        }
    }

    private void eliminar(JTable tabla) {
        int fila = tabla.getSelectedRowCount(); // cuantas filas hay seleccionadas
        if (fila > 0) {
            //obtengo el codigo del producto
            int codigoSeleccinado = Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)));
            String fechita = String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 1));
            if (veriEliminacion(fechita)) {
                int opcion = JOptionPane.showConfirmDialog(null, "Desea eliminar esta reservacion?\n" + fechita, "Aviso", JOptionPane.WARNING_MESSAGE, JOptionPane.NO_OPTION);
                if (opcion == 0) {
                    Ireservaciones dao = new Reservaciones_dao();
                    Reservacion e = new Reservacion();
                    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

                    e.setId(codigoSeleccinado);

                    if (dao.eliminar(e)) {

                        modelo.removeRow(profile.getTabla_historico().getSelectedRow());   //elimino de la tabla
                        tabla.setModel(model);

                        JOptionPane.showMessageDialog(null, "Borrado con exito");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "La reservacion a borrar solo puede ser cancelado 24 horas antes de la fecha acordada"); //OJO
            }
        } else {
            JOptionPane.showMessageDialog(null, "No Selecciono Ninguna Fila", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }

    protected void filtro(String busqueda, JTable tabla, int columna) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) tabla.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelo);
        tabla.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(busqueda, columna));

    }

    class Flujo extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent ev) {
            Object fuente = ev.getSource();

            if (fuente.equals(profile.getLbl_home()) || fuente.equals(profile.getLbl_atras())) {
                profile.dispose();
                home = new Home_view();
                home_con = new Home_control(getUser(), getUserDao(), home);
                home.setVisible(true);
            } else if (fuente.equals(profile.getBtn_cancelarRes())) {
                eliminar(profile.getTabla_historico());
                setearStats();
            } else if (fuente.equals(profile.getLbl_actualizar()) || fuente.equals(profile.getLbl_actualizarWord())) {
                editarPerfil = new EditarPerfil(null, true);
                EditarPerfil_control editControl = new EditarPerfil_control(getUser(), getUserDao(), editarPerfil);
                editarPerfil.setVisible(true);
                setearStats();

            } else if (fuente.equals(profile.getBtn_buscar())) {
                Mesa f = new Mesa();
                System.out.println(f.formatear(profile.getTxt_fecha().getDate(), "dd/MM/yyyy"));
                filtro(f.formatear(profile.getTxt_fecha().getDate(), "dd/MM/yyyy"), profile.getTabla_historico(),1);
            }else if(fuente.equals(profile.getBtn_borrarFiltro())){
                filtro("",  profile.getTabla_historico(), 0);
            }

        }

    }
}
