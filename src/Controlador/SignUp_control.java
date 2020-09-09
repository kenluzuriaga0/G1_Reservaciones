package Controlador;

import Modelo.Usuario;
import Vistas.Login_view;
import Vistas.SignUp_view;
import Dao.Usuario_dao;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class SignUp_control {

    private SignUp_view register;
    private Login_view login;
    private Login_control login_con;

    public SignUp_control(SignUp_view register) {
        //    super();
        this.register = register;
        initListener();
    }

    private void initListener() {

        //FLUJO DE VENTANAS
        register.getBtn_backToLogin().addMouseListener(new Flujo());
        register.getBtn_info().addMouseListener(new Flujo());

        register.getBtn_ingresar().addMouseListener(new Flujo());

    }

    private void registrarUsuario() {

        Usuario user = new Usuario();
        char sexo='x';
        String nombre = register.getTxt_nombres().getText();
        String apellido = register.getTxt_apellidos().getText();
        String email = register.getTxt_email().getText();
        if (register.getRadio_m().isSelected()) {
            System.out.println("elegiste masculino");
            sexo = 'M';
        } else if (register.getRadio_f().isSelected()) {
            System.out.println("femeninaaa");
            sexo =  'F';
        }

        String pass = String.valueOf(register.getTxt_password().getPassword());
        String passConf = String.valueOf(register.getTxt_passwordConfirm().getPassword());

        if (pass.equals(passConf)) {
            user.setPassword(pass);
            user.setNombre(nombre);
            user.setApellido(apellido);
            user.setEmail(email);
            user.setId_rol(2);
            user.setEstado('A');
            user.setSexo(sexo);
            user.setUsername(user.getNombre().charAt(0) + user.getApellido());
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña no coincide");
        }
        if (Usuario_dao.registrar(user)) {

            JOptionPane.showMessageDialog(null, "USER NAME: " + user.getNombre().charAt(0) + user.getApellido());

        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar");
        }
    }

    public class Flujo extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {

            Object fuente = e.getSource();

            if (fuente == register.getBtn_backToLogin()) {  //REGRESAR AL LOGIN
                register.dispose();

                login = new Login_view();

                login_con = new Login_control(login);
                login.setVisible(true);

            } else if (fuente == register.getBtn_info()) {  //BOTON INFO
                login_con = new Login_control();
                login_con.printInfo();

            } else if (fuente == register.getBtn_ingresar()) {
                registrarUsuario();
            }

        }

    }

}
