package Controlador;

import Vistas.Login_view;
import Vistas.SignUp_view;
import Vistas_clases.PlaceHolder;
import java.awt.event.*;

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

            }

        }

    }

}
