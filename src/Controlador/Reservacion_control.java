package Controlador;

import Dao.Dao;
import Dao.Reservaciones_dao;
import Dao.Mesas_dao;
import Dao.Usuario_dao;
import Modelo.Reservacion;
import Modelo.Usuario;
import Vistas.Reserva_view;
import Vistas_aux.PlaceHolder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Timestamp;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author kenlu
 */
public class Reservacion_control extends Login_control {

    Reserva_view reserva;

    Mesas_dao daoDisponibles;
    Reservaciones_dao daoReservaciones;

    public Reserva_view getReserva() {
        return reserva;
    }

    public Reservacion_control(Usuario user, Usuario_dao userDao, Reserva_view reserva) {
        super(user, userDao);
        this.reserva = reserva;
        initListener();
        daoDisponibles = new Mesas_dao();
        daoReservaciones = new Reservaciones_dao();

    }

    private void initListener() {

        reserva.getBtn_Reservar().addActionListener(new Flujo());
        reserva.getTxt_detalleMotivo().addFocusListener(new PlaceHolderr());
    }

    class Flujo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            //Obtencion de datos de los campos en la vista
            java.util.Date fecha = reserva.getCuadroFechaReservacion().getDate();

            long milis = this.setearTiempo(fecha, 0, 0);//fecha.getTime();
            java.sql.Date sqlfecha = new java.sql.Date(milis);
            int hora, minutos, personas;
            String motivo = null, detalleMotivo = null;
            hora = Integer.valueOf(String.valueOf(reserva.getSpn_hora().getValue()));
            minutos = Integer.valueOf(String.valueOf(reserva.getSpn_minuto().getValue()));
            personas = Integer.valueOf(String.valueOf(reserva.getCmb_NumPersonas().getSelectedItem()).substring(0, 1));
            if (reserva.getLaboral().isSelected()) {
                motivo = "LABORAL";
            } else if (reserva.getFamiliar().isSelected()) {
                motivo = "FAMILIAR";
            } else if (reserva.getAmigos().isSelected()) {
                motivo = "AMIGOS";
            }
            
            detalleMotivo = reserva.getTxt_detalleMotivo().getText().trim();
            System.out.println(detalleMotivo);
            if(detalleMotivo.equals("Motivo")|| detalleMotivo==null){
                detalleMotivo = "";
            }
            
            // Comienza VALIDACIONES de fechas
            
            if (daoDisponibles.verificarFecha(sqlfecha) == true && daoReservaciones.verificarFechaYaReservada(sqlfecha, Login_control.getUser().getId()) == false) { 
                if (daoDisponibles.getMesasExistentes(sqlfecha) - daoReservaciones.getMesasOcupadas(sqlfecha) > 0) {

                    Timestamp fecha_ingreso = new Timestamp(this.setearTiempo(fecha, hora, minutos));

                    Reservacion r = new Reservacion(Login_control.getUser().getId(), fecha_ingreso, personas, motivo, detalleMotivo);
                    daoReservaciones.insertar(r);

                    JOptionPane.showMessageDialog(null, "Reservacion Realizada con Exito", "Mensaje Exito", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "YA NO HAY MESAS DISPONIBLES PARA ESTA FECHA", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "ESTE DIA NO ESTA DISPONIBLE O YA RESERVA EN ESTE DIA", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }

        private long setearTiempo(java.util.Date fecha, int hora, int minuto) {
            Calendar c = Calendar.getInstance();
            c.setTime(fecha);
            c.set(Calendar.HOUR_OF_DAY, hora);
            c.set(Calendar.MINUTE, minuto);
            c.set(Calendar.SECOND, 0);
            return c.getTimeInMillis();
        }

    }

    class PlaceHolderr implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            Object fuente = e.getSource();
            if (fuente.equals(reserva.getTxt_detalleMotivo())) {
                PlaceHolder.quitar_PlaceHolder("Motivo", reserva.getTxt_detalleMotivo());
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            Object fuente = e.getSource();
            if (fuente.equals(reserva.getTxt_detalleMotivo())) {

                PlaceHolder.poner_PlaceHolder("Motivo", reserva.getTxt_detalleMotivo());

            }
        }

    }

}
