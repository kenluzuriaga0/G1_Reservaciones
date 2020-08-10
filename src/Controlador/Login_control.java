package Controlador;

import Vistas.ForgotPassword;
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

public class Login_control {

    private Login_view login;
    private Register_view register;
    private ForgotPassword forgot;

    public Login_view getLogin() {
        return login;
    }

    public Login_control(Login_view login, Register_view register, ForgotPassword forgot) {
        this.login = login;
        this.register = register;
        this.forgot = forgot;
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
        forgot.getBtn_info().addMouseListener(new Flujo_login());
        forgot.getBtn_backToLogin().addMouseListener(new Flujo_login());
        login.getBtn_olvidarContra().addMouseListener(new Flujo_login());

        //PLACEHOLDER EN INPUTS
        login.getTxt_campoUser().addFocusListener(new PlaceHolder_Login());
        login.getTxt_campoPassword().addFocusListener(new PlaceHolder_Login());
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
            if (fuente == login.getBtn_salir()) {                                    //BOTON SALIR

                System.exit(0);

            } else if (fuente == login.getBtn_registrarView()) {                     //CAMBIAR VENTANA A REGISTRAR

                login.dispose();

                register.setVisible(true);

            } else if (fuente == login.getBtn_olvidarContra()) {                      //CAMBIAR VENTANA A RESTABLECER CONTRASEÑA
                login.dispose();
                forgot.setVisible(true);

            } else if (fuente == register.getBtn_backToLogin() || fuente == forgot.getBtn_backToLogin()) {  //REGRESAR AL LOGIN
                register.dispose();
                forgot.dispose();

                login.setVisible(true);

            } else if (fuente == login.getBtn_info() || fuente == register.getBtn_info()
                    || fuente == forgot.getBtn_info()) {                                //BOTON INFO

                printInfo();
            }

            login.setLocationRelativeTo(null);
            register.setLocationRelativeTo(null);
            forgot.setLocationRelativeTo(null);

        }

    }

    public class PlaceHolder_Login implements FocusListener {

        String user;
        char[] password;
        Object foco;

        @Override
        public void focusGained(FocusEvent e) {

            foco = e.getSource();

            if (foco == login.getTxt_campoUser()) {
                user = login.getTxt_campoUser().getText();

                if (user.equals("Usuario")) {
                    login.getTxt_campoUser().setText("");
                    login.getTxt_campoUser().setForeground(Color.black);

                }
            } else if (foco == login.getTxt_campoPassword()) {

                password = login.getTxt_campoPassword().getPassword();
                String palabra = "";
                palabra = palabra.valueOf(password);
                if (palabra.equals("Contraseña")) {
                    login.getTxt_campoPassword().setText("");
                    login.getTxt_campoPassword().setForeground(Color.black);
                    login.getTxt_campoPassword().setEchoChar('*'); //cambia la mascara
                }
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            foco = e.getSource();
            if (foco == login.getTxt_campoUser()) {

                user = login.getTxt_campoUser().getText();

                if (user.equals("")) {
                    login.getTxt_campoUser().setText("Usuario");
                    login.getTxt_campoUser().setForeground(new Color(102, 102, 102));

                }
            } else if (foco == login.getTxt_campoPassword()) {

                password = login.getTxt_campoPassword().getPassword();
                String palabra = "";
                palabra = palabra.valueOf(password);
                if (palabra.equals("")) {
                    login.getTxt_campoPassword().setText("Contraseña");
                    login.getTxt_campoPassword().setForeground(new Color(102, 102, 102));
                    login.getTxt_campoPassword().setEchoChar((char)0); //cambia la mascara
                }
            }
        }

    }

}
