package Modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javafx.scene.control.Spinner;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

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
    
        public String formatear(Date fecha, String formato) {
        SimpleDateFormat dateformat = new SimpleDateFormat(formato);

        if (fecha != null) {
            return dateformat.format(fecha);

        } else {
            JOptionPane.showMessageDialog(null, "Coloque una Fecha correcta Porfavor", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public List<Date> listarFechas(Date inicio, Date fin) {

        List<Date> fechas = new ArrayList<>();

        fin = truncarFecha(fin);
        while (inicio.before(fin) || inicio.equals(fin)) { //atentoooo FIN tienes segundos y fechas - Truncar esos minutos, tu puedes ken del futuro

            fechas.add(inicio);
            inicio = new Date(inicio.getTime() + (1000 * 60 * 60 * 24));

        }

        return fechas;
    }

    public boolean validarDefinirMesas(Date inicio, Date fin, JSpinner mesas) {

        if (inicio == null || fin == null || mesas.getValue().equals(0)) {

            JOptionPane.showMessageDialog(null, "Error, porfavor llene todos los campos", "Error Mensaje", JOptionPane.ERROR_MESSAGE);
            return false;

        } else if (inicio.after(fin)) {
            JOptionPane.showMessageDialog(null, "Error, La fecha Inicio no puede ser mayor que la fecha Final", "Error Mensaje", JOptionPane.ERROR_MESSAGE);

            return false;
            
        } else {
            return true;
        }

    }

    public Date truncarFecha(Date fecha) {
        Calendar calendario = null;
        try {
            calendario = Calendar.getInstance();
            calendario.setTime(fecha);
            calendario.set(Calendar.HOUR_OF_DAY, 0);
            calendario.set(Calendar.MINUTE, 0);
            calendario.set(Calendar.SECOND, 0);
            calendario.set(Calendar.MILLISECOND, 0);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error, porfavor elija un rango de fechas válido", "Error Mensaje", JOptionPane.ERROR_MESSAGE);
        } finally {
            return calendario.getTime();
        }

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
