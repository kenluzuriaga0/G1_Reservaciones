package Controlador;

import Controlador.Login_control.PlaceHolder_Login;
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

        //PLACEHOLDER EN INPUTS
        forgot.getTxt_campoEmail().addFocusListener(new PlaceHolder_Login());
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

    class PlaceHolder_Login implements FocusListener {

        Login_control.PlaceHolder_Login place = new Login_control().new PlaceHolder_Login();

        @Override
        public void focusGained(FocusEvent e) {
            Object foco = e.getSource();

            if (foco == forgot.getTxt_campoEmail()) {

                place.quitar_PlaceHolder("Email", forgot.getTxt_campoEmail());

            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            Object foco = e.getSource();

            if (foco == forgot.getTxt_campoEmail()) {

                place.poner_PlaceHolder("Email", forgot.getTxt_campoEmail());

            }
        }
    

}
}
