
package Vistas;

import Controlador.*;

public class Reservaciones {

    public static void main(String[] args) {
        
        Login_view view = new Login_view();
        Register_view register = new Register_view();
        
        Login_control control = new Login_control(view,register);
        
        
        
    }
}
