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
    int id_mesas;
    Timestamp fecha_emision;
    Calendar hora;
    int participantes;
    String estado;

    public Reservacion(int id_usuario, Timestamp fecha_emision, int participantes) {
        this.id_usuario = id_usuario;
        this.fecha_emision = fecha_emision;
        this.participantes = participantes;
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

    public int getId_mesas() {
        return id_mesas;
    }

    public void setId_mesas(int id_mesas) {
        this.id_mesas = id_mesas;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
