package Controlador;

import Dao.Dao;
import Modelo.Usuario;
import Vistas.Login_view;
import Vistas.SignUp_view;
import Dao.Usuario_dao;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class SignUp_control extends Login_control {

    private SignUp_view register;
    private Login_view login;
    private Login_control login_con;

    public SignUp_control(Usuario user, Usuario_dao userDao, SignUp_view register) {
        super(user, userDao);
//        this.login = login;
//        this.user = user;
//        this.userDao = userDao;

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
        Dao dao = new Dao();

        char sexo = 'x';
        int id = dao.autoId("USUARIOS", "ID_USUARIOS");
        String nombre = register.getTxt_nombres().getText().toLowerCase().trim();
        String apellido = register.getTxt_apellidos().getText().toLowerCase().trim();
        String email = register.getTxt_email().getText().toLowerCase().trim();
        String dominio = (String) register.getCmb_dominio().getSelectedItem();
        email = email + dominio;
        if (register.getRadio_m().isSelected()) {

            sexo = 'M';
        } else if (register.getRadio_f().isSelected()) {

            sexo = 'F';
        }

        String pass = String.valueOf(register.getTxt_password().getPassword());
        String passConf = String.valueOf(register.getTxt_passwordConfirm().getPassword());

        if (pass.equals(passConf)) {
            user.setId(id);
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
        if (getUserDao().registrar(user)) {

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

                login_con = new Login_control(login, getUser(), getUserDao());
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
