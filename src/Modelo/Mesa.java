package Modelo;

import java.util.Date;

/**
 *
 * @author kenlu
 */
public class Mesa {
    
    static int total_mesas;
    
    int id_mesas;
    char estado;
    Date fecha;
    int num_mesas;
    int mesas_faltantes;

    public int getId_mesas() {
        return id_mesas;
    }

    public void setId_mesas(int id_mesas) {
        this.id_mesas = id_mesas;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNum_mesas() {
        return num_mesas;
    }

    public void setNum_mesas(int num_mesas) {
        this.num_mesas = num_mesas;
    }

    public int getMesas_faltantes() {
        return mesas_faltantes;
    }

    public void setMesas_faltantes(int mesas_faltantes) {
        this.mesas_faltantes = mesas_faltantes;
    }

    public static int getTotal_mesas() {
        return total_mesas;
    }

    public static void setTotal_mesas(int total_mesas) {
        Mesa.total_mesas = total_mesas;
    }
    
    
    
    
}
