package Modelo;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author kenlu
 */
public class Reservacion {
    
    int id;
    int id_usuario;
    int id_mesas;
    Date fecha_emision;
    Calendar hora;
    int participantes;
    String estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cliente() {
        return id_usuario;
    }

    public void setId_cliente(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_mesas() {
        return id_mesas;
    }

    public void setId_mesas(int id_mesas) {
        this.id_mesas = id_mesas;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Calendar getHora() {
        return hora;
    }

    public void setHora(Calendar hora) {
        this.hora = hora;
    }

    public int getSillas() {
        return participantes;
    }

    public void setSillas(int participantes) {
        this.participantes = participantes;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
