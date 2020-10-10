package Controlador;

import Controlador.*;
import Dao.Usuario_dao;
import Modelo.Usuario;
import Vistas.Login_view;
import javax.swing.JOptionPane;

public class Reservaciones {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Username: admin\nPassword: admin1", "DATOS DE INGRESO", JOptionPane.INFORMATION_MESSAGE);

        Login_view view = new Login_view();
        Usuario user = new Usuario();
        Usuario_dao userDao = new Usuario_dao();

        Login_control control = new Login_control(view, user, userDao);
        
    }


}
