
package Controlador;

import Vistas.ForgotPassword_view;
import Vistas.Login_view;
import Vistas.SignUp_view;
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

        //PLACEHOLDER EN INPUTS
        register.getTxt_nombres().addFocusListener(new Focus());
        register.getTxt_apellidos().addFocusListener(new Focus());
        register.getTxt_email().addFocusListener(new Focus());
        register.getTxt_password().addFocusListener(new Focus());
        register.getTxt_passwordConfirm().addFocusListener(new Focus());
    }
    
        
        public class Flujo extends MouseAdapter{
            
            @Override
            public void mousePressed(MouseEvent e){


            Object fuente = e.getSource();
            
            if (fuente == register.getBtn_backToLogin()) {  //REGRESAR AL LOGIN
                register.dispose();
                
                login = new Login_view();
                
                login_con = new Login_control(login);
                login.setVisible(true);

            } else if ( fuente == register.getBtn_info()) {  //BOTON INFO
                login_con = new Login_control();
                login_con.printInfo();
            }

            
                
            }
            
        }
        
        
        public class Focus implements FocusListener{
            
        //INSTANCIAR LASE INTERNA PARA CREAR PLACEHOLDERS------------------    
        Login_control.PlaceHolder_Login place = new Login_control().new PlaceHolder_Login();   
        //------------------------------------------------------------------
        @Override
        public void focusGained(FocusEvent e) {
            Object foco = e.getSource();
          

            if (foco == register.getTxt_nombres()) {

                place.quitar_PlaceHolder("Nombres", register.getTxt_nombres());

            } else if (foco == register.getTxt_apellidos()) {

                place.quitar_PlaceHolder("Apellidos", register.getTxt_apellidos());

            } else if (foco == register.getTxt_email()) {

                 place.quitar_PlaceHolder("Email", register.getTxt_email());

            } else if (foco == register.getTxt_password()) {

                 place.quitar_PlaceHolder("Contraseña", register.getTxt_password());

            } else if (foco == register.getTxt_passwordConfirm()) {

                 place.quitar_PlaceHolder("Repetir Contraseña", register.getTxt_passwordConfirm());

            } 
        }

        @Override
        public void focusLost(FocusEvent e) {
            Object foco = e.getSource();
                        
            
            if (foco == register.getTxt_nombres()) {

                place.poner_PlaceHolder("Nombres", register.getTxt_nombres());

            } else if (foco == register.getTxt_apellidos()) {

                place.poner_PlaceHolder("Apellidos", register.getTxt_apellidos());

            } else if (foco == register.getTxt_email()) {

                 place.poner_PlaceHolder("Email", register.getTxt_email());

            } else if (foco == register.getTxt_password()) {

                 place.poner_PlaceHolder("Contraseña", register.getTxt_password());

            } else if (foco == register.getTxt_passwordConfirm()) {

                 place.poner_PlaceHolder("Repetir Contraseña", register.getTxt_passwordConfirm());

            } 
        }
            
            
            
            
        }
}
