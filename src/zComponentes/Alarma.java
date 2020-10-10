package zComponentes;

import Controlador.Login_control;
import Dao.Mesas_dao;
import Dao.Reservaciones_dao;
import Modelo.Reservacion;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author luisMenol
 */
public class Alarma extends TimerTask {

    private Reservaciones_dao reservaciones_dao;
    private Mesas_dao mesas_dao;
    private int cont;
    private ArrayList<Reservacion> reservaciones;

    public Alarma() {
        this.reservaciones_dao = new Reservaciones_dao();
        this.mesas_dao = new Mesas_dao();
        cont = 0;
        reservaciones = new ArrayList<Reservacion>();
        Timer temporizador = new Timer();
        temporizador.schedule(this, 0, 1000);
        
        llenarReservaciones();
    }

    @Override
    public void run() {
        this.sonarAlarma();

    }

    public void sonarAlarma() {
        for (int i = 0; i < reservaciones.size(); i++) {
            boolean activar_alarma = this.determinarReservacionCerca(reservaciones.get(i));
            if (activar_alarma == true) {
                Reservacion r = reservaciones.get(i);
                r.setNotificado(true);
                reservaciones.set(i, r);
                JOptionPane.showMessageDialog(null, "AHHHHHHHHHHHHHHH", "AHHHHHHHHHHHHHH", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private boolean determinarReservacionCerca(Reservacion e) {
        boolean activar_alarma = false;
        Calendar calendario = Calendar.getInstance();
        Date fecha_actual = new Date();
        long mili_fecha_actual = fecha_actual.getTime();
        long mili_fecha_reservacion = e.getFecha_emision().getTime(); //utilizar e con el metodo get
        calendario.setTimeInMillis(mili_fecha_reservacion);//utilizar e con el metodo get
        calendario.add(Calendar.HOUR_OF_DAY, -8);
        long mili_fecha_reservacion_8hmenos = calendario.getTimeInMillis(); //le restar 8 horas a la reservacion mas reciente

        if (mili_fecha_actual < mili_fecha_reservacion && mili_fecha_actual > mili_fecha_reservacion_8hmenos && e.isNotificado() == false) {
            activar_alarma = true;
        }
        return activar_alarma;
    }

    public void llenarReservaciones() {
        ArrayList<java.sql.Date> fechas = mesas_dao.obtenerComienzoFinal();
        ArrayList<Reservacion> reservaciones = reservaciones_dao.listar(fechas.get(0), fechas.get(1), true); //aqui va la llamada a listar

        for (Reservacion e : reservaciones) {
            if (e.getId_usuario() == Login_control.getUser().getId()) {
                this.reservaciones.add(e);

            }
        }
        cont = 70;
    }

}
