package Controlador;

import Vistas.ForgotPassword_view;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import Vistas.Login_view;
import Vistas.SignUp_view;
import java.awt.event.ComponentListener;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login_control {

    private Login_view login;
    private SignUp_view register;
    private SignUp_control register_con;
    private ForgotPassword_view forgot;
    private ForgotPassword_control forgot_con;

    public Login_control(Login_view login) {

        this.login = login;

        initListener();
        login.setVisible(true);
    }

    public Login_control() {

    }

    private void initListener() {

        //FLUJO DE VENTANAS
        login.getBtn_registrarView().addMouseListener(new Flujo_login());
        login.getBtn_salir().addMouseListener(new Flujo_login());
        login.getBtn_info().addMouseListener(new Flujo_login());
        login.getBtn_olvidarContra().addMouseListener(new Flujo_login());

        //PLACEHOLDER EN INPUTS
//        login.getTxt_campoUser().addFocusListener(new PlaceHolder_Login());
//        login.getTxt_campoPassword().addFocusListener(new PlaceHolder_Login());
    }

    public void printInfo() {

        String[] nombres = {"Ken Luzuriaga", "Luis Rodriguez", "Nicole Vera", "Freya Lopez", "Anthony Galarza"};

        UIManager UI = new UIManager();   //Edita JOptionPane
        UI.put("OptionPane.background", new ColorUIResource(29, 53, 87));
        UI.put("Panel.background", new ColorUIResource(29, 53, 87));
        UI.put("OptionPane.messageForeground", Color.WHITE);

        JOptionPane.showMessageDialog(null, nombres, "About", JOptionPane.INFORMATION_MESSAGE);

    }

   //MOUSE FLUJO DE VENTANAS************************************************
    class Flujo_login extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {

            Object fuente = e.getSource();
            if (fuente == login.getBtn_salir()) {                                    //BOTON SALIR

                System.exit(0);

            } else if (fuente == login.getBtn_registrarView()) {                     //CAMBIAR VENTANA A REGISTRAR

                login.dispose();
                register = new SignUp_view();
                register_con = new SignUp_control(register);
                register.setVisible(true);

            } else if (fuente == login.getBtn_olvidarContra()) {                      //CAMBIAR VENTANA A RESTABLECER CONTRASEÑA
                login.dispose();
                forgot = new ForgotPassword_view();
                forgot_con = new ForgotPassword_control(forgot);
                forgot.setVisible(true);

            } else if (fuente == login.getBtn_info()) {                                //BOTON INFO

                printInfo();
            }

            login.setLocationRelativeTo(null);

        }

    }
//     PLACEHOLDER************************************************************
//    public class PlaceHolder_Login implements FocusListener {
//
//        Object foco;
//
//        public void quitar_PlaceHolder(String placeholder, JTextField campo) {
//
//            if (campo.getText().equals(placeholder)) {
//                campo.setText("");
//                campo.setForeground(Color.black);
//            }
//
//        }
//
//        public void poner_PlaceHolder(String placeholder, JTextField campo) {
//
//            if (campo.getText().equals("")) {
//                campo.setText(placeholder);
//                campo.setForeground(new Color(102, 102, 102));
//
//            }
//
//        }
//
//        public void quitar_PlaceHolder(String placeholder, JPasswordField campo) {
//            String palabra = "";
//            palabra = palabra.valueOf(campo.getPassword());
//            if (palabra.equals(placeholder)) {
//                campo.setText("");
//                campo.setForeground(Color.black);
//                campo.setEchoChar('*'); //cambia la mascara
//            }
//
//        }
//
//        public void poner_PlaceHolder(String placeholder, JPasswordField campo) {
//
//            String palabra = "";
//            palabra = palabra.valueOf(campo.getPassword());
//            if (palabra.equals("")) {
//                campo.setText(placeholder);
//                campo.setForeground(new Color(102, 102, 102));
//                campo.setEchoChar((char) 0); //cambia la mascara
//            }
//
//        }
//
//        @Override
//        public void focusGained(FocusEvent e) {
//
//            foco = e.getSource();
//
//            if (foco == login.getTxt_campoUser()) {
//                
//                quitar_PlaceHolder("Usuario", login.getTxt_campoUser());
//
//            } else if (foco == login.getTxt_campoPassword()) {
//
//                quitar_PlaceHolder("Contraseña", login.getTxt_campoPassword());
//            }
//        }
//
//        @Override
//        public void focusLost(FocusEvent e) {
//            foco = e.getSource();
//            if (foco == login.getTxt_campoUser()) {
//
//              poner_PlaceHolder("Usuario", login.getTxt_campoUser());
//                
//            } else if (foco == login.getTxt_campoPassword()) {
//
//                poner_PlaceHolder("Contraseña", login.getTxt_campoPassword());
//            }
//
//        }
//
//    }

}
