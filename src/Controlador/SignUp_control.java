
package Controlador;

import Vistas.Login_view;
import Vistas.SignUp_view;
import java.awt.event.*;


public class SignUp_control extends Login_control{
    
    private SignUp_view register;

    public SignUp_control(SignUp_view register,Login_view log) {
        super(log);
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
                
            }
            
        }
        
        
        public class Focus implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
            
        }

        @Override
        public void focusLost(FocusEvent e) {

        }
            
            
            
            
        }
}
