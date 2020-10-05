package Modelo;

import java.sql.Timestamp;
import java.util.Calendar;

/**
 *
 * @author kenlu
 */
public class Reservacion {

    int id;
    int id_usuario;
    Timestamp fecha_emision;
    Calendar hora;
    int participantes;
    String motivo;
    String detalleMotivo;

    public Reservacion(int id_usuario, Timestamp fecha_emision, int participantes, String motivo, String detalleMotivo) {
        this.id_usuario = id_usuario;
        this.fecha_emision = fecha_emision;
        this.participantes = participantes;
        this.motivo = motivo;
        this.detalleMotivo = detalleMotivo;
    }

    public Reservacion() {

    }

    public long setearTiempo(java.util.Date fecha, int hora, int minuto) {
        Calendar c = Calendar.getInstance();
        c.setTime(fecha);
        c.set(Calendar.HOUR_OF_DAY, hora);
        c.set(Calendar.MINUTE, minuto);
        c.set(Calendar.SECOND, 0);
        return c.getTimeInMillis();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDetalleMotivo() {
        return detalleMotivo;
    }

    public void setDetalleMotivo(String detalleMotivo) {
        this.detalleMotivo = detalleMotivo;
    }

    public Timestamp getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Timestamp fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Calendar getHora() {
        return hora;
    }

    public void setHora(Calendar hora) {
        this.hora = hora;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

}
