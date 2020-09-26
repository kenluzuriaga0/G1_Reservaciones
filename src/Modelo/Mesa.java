package Modelo;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kenlu
 */
public class Mesa {

    static int total_mesas;

    int id_mesas;
    char estado;
    List<Date> fecha;
    int num_mesas;
    int mesas_faltantes;

    public List<Date> listarFechas(Date inicio, Date fin) {

        List<Date> fechas = new ArrayList<>();

        fin = truncarFecha(fin);
        while (inicio.before(fin) || inicio.equals(fin)) { //atentoooo FIN tienes segundos y fechas - Truncar esos minutos, tu puedes ken del futuro
            
            fechas.add(inicio);
            inicio = new Date(inicio.getTime() + (1000 * 60 * 60 * 24));

        }

        return fechas;
    }

    public Date truncarFecha(Date fecha) {
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fecha);
        calendario.set(Calendar.HOUR_OF_DAY, 0);
        calendario.set(Calendar.MINUTE, 0);
        calendario.set(Calendar.SECOND, 0);
        calendario.set(Calendar.MILLISECOND, 0);
        return calendario.getTime();
    }

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

    public List<Date> getFecha() {
        return fecha;
    }

    public void setFecha(List<Date> fecha) {
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
