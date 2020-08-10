package Controlador;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import Vistas.Login_view;
import Vistas.Register_view;
import java.awt.Point;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Login_control {

    private Login_view login;
    private Register_view register;

    public Login_view getLogin() {
        return login;
    }

    public Login_control(Login_view login, Register_view register) {
        this.login = login;
        this.register = register;
        initListener();
        login.setVisible(true);
    }

    private void initListener() {

        //FLUJO DE VENTANAS
        login.getBtn_registrarView().addMouseListener(new Flujo_login());
        login.getBtn_salir().addMouseListener(new Flujo_login());
        register.getBtn_backToLogin().addMouseListener(new Flujo_login());
        login.getBtn_info().addMouseListener(new Flujo_login());
        register.getBtn_info().addMouseListener(new Flujo_login());

        //PLACEHOLDER EN INPUTS
    }

    private void printInfo() {

        String[] nombres = {"Ken Luzuriaga", "Luis Rodriguez", "Nicole Vera", "Freya Lopez", "Anthony Galarza"};

        UIManager UI = new UIManager();   //Edita JOptionPane
        UI.put("OptionPane.background", new ColorUIResource(29, 53, 87));
        UI.put("Panel.background", new ColorUIResource(29, 53, 87));
        UI.put("OptionPane.messageForeground", Color.WHITE);

        JOptionPane.showMessageDialog(null, nombres, "About", JOptionPane.INFORMATION_MESSAGE);

    }

    //clase interna para clicks
    class Flujo_login extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {

            Object fuente = e.getSource();
            if (fuente == login.getBtn_salir()) {                        //BOTON SALIR

                System.exit(0);

            } else if (fuente == login.getBtn_registrarView()) {        //CAMBIAR VENTANA A REGISTRAR

                login.dispose();

                register.setVisible(true);

            } else if (fuente == register.getBtn_backToLogin()) {       //REGRESAR AL LOGIN
                register.dispose();

                login.setVisible(true);

            } else if (fuente == login.getBtn_info() || fuente == register.getBtn_info()) {     //BOTON INFO

                printInfo();
            }
            login.setLocationRelativeTo(null);
            register.setLocationRelativeTo(null);

        }

    }

    public class PlaceHolder_Login implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {

        }

        @Override
        public void focusLost(FocusEvent e) {

        }

    }

}
