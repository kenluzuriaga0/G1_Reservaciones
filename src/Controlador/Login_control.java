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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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
        register.getTxt_nombres().addFocusListener(new PlaceHolder_Login());
        register.getTxt_apellidos().addFocusListener(new PlaceHolder_Login());
        register.getTxt_email().addFocusListener(new PlaceHolder_Login());
        register.getTxt_password().addFocusListener(new PlaceHolder_Login());
        register.getTxt_passwordConfirm().addFocusListener(new PlaceHolder_Login());
        forgot.getTxt_campoEmail().addFocusListener(new PlaceHolder_Login());
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

        Object foco;

        private void quitar_PlaceHolder(String placeholder, JTextField campo) {

            if (campo.getText().equals(placeholder)) {
                campo.setText("");
                campo.setForeground(Color.black);
            }

        }

        private void poner_PlaceHolder(String placeholder, JTextField campo) {

            if (campo.getText().equals("")) {
                campo.setText(placeholder);
                campo.setForeground(new Color(102, 102, 102));

            }

        }

        private void quitar_PlaceHolder_Mascara(String placeholder, JPasswordField campo) {
            String palabra = "";
            palabra = palabra.valueOf(campo.getPassword());
            if (palabra.equals(placeholder)) {
                campo.setText("");
                campo.setForeground(Color.black);
                campo.setEchoChar('*'); //cambia la mascara
            }

        }

        private void poner_PlaceHolder_Mascara(String placeholder, JPasswordField campo) {

            String palabra = "";
            palabra = palabra.valueOf(campo.getPassword());
            if (palabra.equals("")) {
                campo.setText(placeholder);
                campo.setForeground(new Color(102, 102, 102));
                campo.setEchoChar((char) 0); //cambia la mascara
            }

        }

        @Override
        public void focusGained(FocusEvent e) {

            foco = e.getSource();

            if (foco == login.getTxt_campoUser()) {

                quitar_PlaceHolder("Usuario", login.getTxt_campoUser());

            } else if (foco == login.getTxt_campoPassword()) {

                quitar_PlaceHolder_Mascara("Contraseña", login.getTxt_campoPassword());
            } else if (foco == register.getTxt_nombres()) {

                quitar_PlaceHolder("Nombres", register.getTxt_nombres());

            } else if (foco == register.getTxt_apellidos()) {

                quitar_PlaceHolder("Apellidos", register.getTxt_apellidos());

            } else if (foco == register.getTxt_email()) {

                quitar_PlaceHolder("Email", register.getTxt_email());

            }else if (foco == register.getTxt_password()) {

                quitar_PlaceHolder_Mascara("Contraseña", register.getTxt_password());

            }else if (foco == register.getTxt_passwordConfirm()) {

                quitar_PlaceHolder_Mascara("Repetir Contraseña", register.getTxt_passwordConfirm());

            } else if (foco == forgot.getTxt_campoEmail()) {

                quitar_PlaceHolder("Email", forgot.getTxt_campoEmail());

            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            foco = e.getSource();
            if (foco == login.getTxt_campoUser()) {

                poner_PlaceHolder("Usuario", login.getTxt_campoUser());
            } else if (foco == login.getTxt_campoPassword()) {

                poner_PlaceHolder_Mascara("Contraseña", login.getTxt_campoPassword());
            } else if (foco == register.getTxt_nombres()) {

                poner_PlaceHolder("Nombres", register.getTxt_nombres());

            } else if (foco == register.getTxt_apellidos()) {

                poner_PlaceHolder("Apellidos", register.getTxt_apellidos());

            } else if (foco == register.getTxt_email()) {

                poner_PlaceHolder("Email", register.getTxt_email());

            } else if (foco == register.getTxt_password()) {

                poner_PlaceHolder_Mascara("Contraseña", register.getTxt_password());

            } else if (foco == register.getTxt_passwordConfirm()) {

                poner_PlaceHolder_Mascara("Repetir Contraseña", register.getTxt_passwordConfirm());

            } else if (foco == forgot.getTxt_campoEmail()) {

                poner_PlaceHolder("Email", forgot.getTxt_campoEmail());

            }
        }

    }

}
