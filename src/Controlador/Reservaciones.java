package Controlador;

import Controlador.*;
import Vistas.Login_view;
import javax.swing.JOptionPane;

public class Reservaciones {

    public static void main(String[] args) {

        Login_view view = new Login_view();
        JOptionPane.showMessageDialog(null,"Username: admin\nPassword: admin1","DATOS DE INGRESO",JOptionPane.INFORMATION_MESSAGE);
        Login_control control = new Login_control(view);


    }
}
