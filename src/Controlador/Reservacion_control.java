package Controlador;

import Dao.Reservaciones_dao;
import Dao.Mesas_dao;
import Dao.Usuario_dao;
import Modelo.Reservacion;
import Modelo.Usuario;
import Vistas.Reserva_view;
import XComponentes.PlaceHolder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Timestamp;
import java.util.Calendar;
import javax.swing.JOptionPane;
import XComponentes.Alarma;
import XComponentes.Correo;

/**
 *
 * @author kenlu
 */
public class Reservacion_control extends Login_control {

    Reserva_view reserva;

    Mesas_dao daoDisponibles;
    Reservaciones_dao daoReservaciones;
    Correo correito;
    //Alarma alarma;

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
            if (e.getSource() == reserva.getBtn_Reservar()) {
                hacerReservacion();
            }

        }

        private void hacerReservacion() {

            if (reserva.getCuadroFechaReservacion().getDate() == null) {
                JOptionPane.showMessageDialog(null, "Llene todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
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
            if (detalleMotivo.equals("Motivo") || detalleMotivo == null) {
                detalleMotivo = "";
            }

            // Comienza VALIDACIONES de fechas
            Timestamp fecha_ingreso = new Timestamp(this.setearTiempo(fecha, hora, minutos));
            if (fechaEsFuturo(fecha_ingreso)) {

                if (daoDisponibles.verificarFecha(sqlfecha) == true && daoReservaciones.verificarFechaYaReservada(sqlfecha, Login_control.getUser().getId()) == false) {
                    if (daoDisponibles.getMesasExistentes(sqlfecha) - daoReservaciones.getMesasOcupadas(sqlfecha) > 0) {

                        Reservacion r = new Reservacion(Login_control.getUser().getId(), fecha_ingreso, personas, motivo, detalleMotivo);
                        daoReservaciones.insertar(r);
                        //enviar correo
                       // correito = new Correo();
                        //correito.enviarCorreo(getUser().getEmail(), fecha_ingreso.toString(), String.valueOf(hora) + ":"
                        //        + String.valueOf(minutos) + ":00");
                        //confirmar
                        JOptionPane.showMessageDialog(null, "Reservacion Realizada con Exito", "Mensaje Exito", JOptionPane.INFORMATION_MESSAGE);
                        
                        //lanzar alarma
                        getAlarma().llenarReservaciones();
                        getAlarma().sonarAlarma();

                    } else {
                        JOptionPane.showMessageDialog(null, "YA NO HAY MESAS DISPONIBLES PARA ESTA FECHA", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "ESTE DIA NO ESTA DISPONIBLE O YA RESERVA EN ESTE DIA", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "La fecha debe ser posterior a HOY", "ERROR", JOptionPane.ERROR_MESSAGE);
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

        private boolean fechaEsFuturo(Timestamp fecha) { //verifica si lafecha escogida ya pasó

            Calendar hoy = Calendar.getInstance();
            if (fecha.after(hoy.getTime())) {
                System.out.println("es futuro");
                return true;
            } else {
                return false;
            }

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
