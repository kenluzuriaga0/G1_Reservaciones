
package Controlador;

import Vistas.Home_view;
import Vistas.Profile_view2;

/**
 *
 * @author kenlu
 */
public class Profile_control {
    
    private Home_control home_con;
    private Home_view home;
    private Profile_view2 profile;
   

    public Profile_control(Profile_view2 profile) {
        this.profile = profile;
        String usuario_logueado = Login_control.getUser_login().getNombre()+" "+Login_control.getUser_login().getApellido();
        this.profile.getLbl_nombre().setText(usuario_logueado.toUpperCase());
        
    
    }
    
    
    
    
    
}
