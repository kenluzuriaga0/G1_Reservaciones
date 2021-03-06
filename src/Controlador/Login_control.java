package Controlador;

import Dao.Usuario_dao;
import Modelo.Usuario;
import Vistas.Admin_view;
import Vistas.ForgotPassword_view;
import Vistas.Home_view;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import Vistas.Login_view;
import Vistas.SignUp_view;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import XComponentes.Alarma;

public class Login_control {

    private Login_view login;
    private SignUp_view register;
    private SignUp_control register_con;
    private ForgotPassword_view forgot;
    private ForgotPassword_control forgot_con;

    private Home_control home_con;
    private Home_view home;
    private Admin_view admin;
    private Admin_control admin_control;

    private static Usuario user;
    private Usuario_dao userDao;
    private static Alarma alarma;

    public Login_control(Login_view login, Usuario user, Usuario_dao userDao) {

        this.login = login;
        this.user = user;
        this.userDao = userDao;

        initListener();
        login.setVisible(true);

    }

    public Login_control(Usuario user, Usuario_dao userDao) {
        this.user = user;
        this.userDao = userDao;

    }

    public Login_control() {

    }

    private void initListener() {

        //FLUJO DE VENTANAS
        login.getBtn_registrarView().addMouseListener(new Flujo_login());
        login.getBtn_salir().addMouseListener(new Flujo_login());
        login.getBtn_info().addMouseListener(new Flujo_login());
        login.getBtn_olvidarContra().addMouseListener(new Flujo_login());

        login.getBtn_ingresar().addMouseListener(new Flujo_login());

        login.getTxt_campoPassword().addKeyListener(new KeyAdapter() { //evento de ENTER sin implementar
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entrar_Enter(evt);
            }

        });

    }

    private void entrar_Enter(KeyEvent ev) {
        int letra = ev.getKeyCode();

        if (letra == KeyEvent.VK_ENTER) {
            ingresar();
        }

    }

    private void ingresar() {

        this.user.setUsername(this.login.getTxt_campoUser().getText());
        this.user.setPassword(String.valueOf(this.login.getTxt_campoPassword().getPassword()));
        if (this.userDao.ingresar(user)) {

            this.login.dispose();

            if (user.getId_rol() == 1) {
                admin = new Admin_view();
                admin_control = new Admin_control(user, userDao, admin);
                admin.setVisible(true);

            } else {
                home = new Home_view();
                home_con = new Home_control(user, userDao, home);
                home.setVisible(true);

                 alarma = new Alarma();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Campos incorrectos", "Error de ingreso", JOptionPane.ERROR_MESSAGE);

        }
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
                register_con = new SignUp_control(user, userDao, register);
                register.setVisible(true);

            } else if (fuente == login.getBtn_olvidarContra()) {                      //CAMBIAR VENTANA A RESTABLECER CONTRASEÑA
                login.dispose();
                forgot = new ForgotPassword_view();
                forgot_con = new ForgotPassword_control(user, userDao, forgot);
                forgot.setVisible(true);
            } else if (fuente == login.getBtn_info()) {                                //BOTON INFO

                printInfo();
            } else if (fuente == login.getBtn_ingresar()) {                         //BOTON INGRESAR!!!

                ingresar();

            } else if (true) {

            }

            login.setLocationRelativeTo(null);

        }

    }
    //TERMINA CLASE PARA FLUJO**************************************************

    public void printInfo() {

        String[] nombres = {"Ken Luzuriaga", "Luis Rodriguez", "Nicole Vera", "Freya Lopez", "Anthony Galarza"};

        //Cambio el color del JOptionPane
        UIManager UI = new UIManager();   //Edita JOptionPane
        UI.put("OptionPane.background", new ColorUIResource(29, 53, 87));
        UI.put("Panel.background", new ColorUIResource(29, 53, 87));
        UI.put("OptionPane.messageForeground", Color.WHITE);

        JOptionPane.showMessageDialog(null, nombres, "About GRUPO1", JOptionPane.INFORMATION_MESSAGE);

    }

    public static Usuario getUser() {
        return user;
    }

    public Usuario_dao getUserDao() {
        return userDao;
    }

    public Alarma getAlarma() {
        return alarma;
    }
    

}
