
package Vistas;

import Controlador.*;

public class Reservaciones {

    public static void main(String[] args) {
        
        Login_view view = new Login_view();
        SignUp_view register = new SignUp_view();
        ForgotPassword forgot = new ForgotPassword();
        
        Login_control control = new Login_control(view,register,forgot);
        
        
        
    }
}
