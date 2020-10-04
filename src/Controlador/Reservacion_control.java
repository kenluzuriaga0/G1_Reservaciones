package Controlador;

import Dao.DaoReservaciones;
import Dao.Mesas_dao;
import Dao.Usuario_dao;
import Modelo.Reservacion;
import Modelo.Usuario;
import Vistas.Reserva_view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    DaoReservaciones daoReservaciones;

    public Reserva_view getReserva() {
        return reserva;
    }

    public Reservacion_control(Usuario user, Usuario_dao userDao, Reserva_view reserva) {
        super(user, userDao);
        this.reserva = reserva;
        initListener();
        daoDisponibles = new Mesas_dao();
        daoReservaciones = new DaoReservaciones();

    }

    private void initListener() {

        reserva.getBtn_Reservar().addActionListener(new Flujo());

    }

    class Flujo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            java.util.Date fecha = reserva.getCuadroFechaReservacion().getDate();

            long milis = this.setearTiempo(fecha, 0, 0);//fecha.getTime();
            java.sql.Date sqlfecha = new java.sql.Date(milis);
            int hora, minutos, personas;
            hora = Integer.valueOf(String.valueOf(reserva.getSpn_hora().getValue()));
            minutos = Integer.valueOf(String.valueOf(reserva.getSpn_minuto().getValue()));
            personas = Integer.valueOf(String.valueOf(reserva.getCmb_NumPersonas().getSelectedItem()).substring(0, 1));
            if (daoDisponibles.verificarFecha(sqlfecha) == true && daoReservaciones.verificarFechaYaReservada(sqlfecha, Login_control.getUser().getId()) == false) { //Login_control.getUser().getId()
                if (daoDisponibles.getMesasExistentes(sqlfecha) - daoReservaciones.getMesasOcupadas(sqlfecha) > 0) {

                    Timestamp fecha_ingreso = new Timestamp(this.setearTiempo(fecha, hora, minutos));

                    Reservacion r = new Reservacion(Login_control.getUser().getId(), fecha_ingreso, personas);
                    daoReservaciones.insertar(r);

                } else {
                    JOptionPane.showMessageDialog(null, "YA NO HAY MESAS DISPONIBLES PARA ESTA FECHA", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "ESTE DIA NO ESTA DISPONIBLE O YA RESERVA EN ESTE DIA", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }

        private long setearTiempo(java.util.Date fecha, int hora, int minuto) {
            long milis = fecha.getTime();
            Calendar c = Calendar.getInstance();
            c.setTime(fecha);
            c.set(Calendar.HOUR_OF_DAY, hora);
            c.set(Calendar.MINUTE, minuto);
            c.set(Calendar.SECOND, 0);
            return c.getTimeInMillis();
        }

    }

}
