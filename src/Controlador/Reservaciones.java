package Controlador;

import Controlador.*;
import Dao.Usuario_dao;
import Modelo.Usuario;
import Vistas.Login_view;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class Reservaciones {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Username: admin\nPassword: admin1", "DATOS DE INGRESO", JOptionPane.INFORMATION_MESSAGE);

        Login_view view = new Login_view();
        Usuario user = new Usuario();
        Usuario_dao userDao = new Usuario_dao();

        Login_control control = new Login_control(view, user, userDao);
        
        
        
        
//        String fecha = "09/10/2020 - 02:00:00";
//        veriEliminacion(fecha);
    }

    private static void veriEliminacion(String fecha) {
        Date date;
        long diaMil;
        long milHoy;
        long dia = 60000 * 60 * 24;
        Calendar hoy = Calendar.getInstance();
        try {
            date = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").parse(fecha);
            diaMil = date.getTime();
            milHoy = hoy.getTimeInMillis();
            System.out.println("1 dia : "+dia);
            System.out.println("diaMil: " + diaMil + " milHoy: " + milHoy);
            System.out.println("resta: "+(milHoy - diaMil));
            if (milHoy - diaMil > dia) {
                System.out.println("eliminaaaaaaaa");
            } else {
                System.out.println("no se elimina mi loco");
            }

        } catch (ParseException ex) {
            System.out.println("Error de parseo String a date " + ex.getMessage());
        }
    }
}
