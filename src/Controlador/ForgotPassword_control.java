package Controlador;


import Vistas.*;
import java.awt.event.*;

public class ForgotPassword_control {

//Se conecta con:
    private ForgotPassword_view forgot;
    private Login_view login;
    private Login_control login_con;

    public ForgotPassword_control(ForgotPassword_view forgot) {
        this.forgot = forgot;
        initListener();

    }

    private void initListener() {

        //FLUJO DE VENTANAS
        forgot.getBtn_info().addMouseListener(new Flujo_login());
        forgot.getBtn_backToLogin().addMouseListener(new Flujo_login());

 
    }

    public class Flujo_login extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            Object fuente = e.getSource();

            if (fuente == forgot.getBtn_backToLogin()) {  //REGRESAR AL LOGIN
                forgot.dispose();

                login = new Login_view();
                login_con = new Login_control(login);
                login.setVisible(true);

            } else if (fuente == forgot.getBtn_info()) {      //BOTON INFO
                login_con = new Login_control();
                login_con.printInfo();
            }

        }

    }

    
}
