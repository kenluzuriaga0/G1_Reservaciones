package Controlador;

import Dao.Usuario_dao;
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

    public Reservacion_control(Usuario user, Usuario_dao userDao, Reserva_view reserva) {
        super(user, userDao);
        this.reserva = reserva;
        initListener();

    }

    private void initListener() {

        reserva.getBtn_Reservar().addActionListener(new Flujo());

    }

    class Flujo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
//            java.util.Date fecha = this.cuadroFechaReservacion.getDate();
//
//            long milis = this.setearTiempo(fecha, 0, 0);//fecha.getTime();
//            java.sql.Date sqlfecha = new java.sql.Date(milis);
//            int hora, minutos, personas;
//            hora = Integer.valueOf(String.valueOf(this.comboBox_Hora.getSelectedItem()));
//            minutos = Integer.valueOf(String.valueOf(this.comboBox_Minutos.getSelectedItem()));
//            personas = Integer.valueOf(String.valueOf(this.spinner_NumPersonas.getValue()));
//            if (this.daoDisponibles.verificarFecha(sqlfecha) == true && this.daoReservaciones.verificarFechaYaReservada(sqlfecha, 2) == false) { //id user
//
//                if (this.daoDisponibles.getMesasExistentes(sqlfecha) - this.daoReservaciones.getMesasOcupadas(sqlfecha) > 0) {
//
//                    Timestamp fecha_ingreso = new Timestamp(this.setearTiempo(fecha, hora, minutos));
//
//                    EReservaciones r = new EReservaciones(2, fecha_ingreso, personas);
//                    this.daoReservaciones.insertar(r);
//
//                } else {
//                    JOptionPane.showMessageDialog(null, "YA NO HAY MESAS DISPONIBLES PARA ESTA FECHA", "ERROR", JOptionPane.ERROR_MESSAGE);
//                }
//
//            } else {
//                JOptionPane.showMessageDialog(null, "ESTE DIA NO ESTA DISPONIBLE O YA RESERVA EN ESTE DIA", "ERROR", JOptionPane.ERROR_MESSAGE);
//            }

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
