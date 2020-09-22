
package Controlador;

import Dao.Usuario_dao;
import Modelo.Usuario;
import Vistas.Home_view;
import Vistas.Profile_view2;

/**
 *
 * @author kenlu
 */
public class Profile_control extends Login_control {
    
    private Home_control home_con;
    private Home_view home;
    private Profile_view2 profile;
   

    public Profile_control(Usuario user,Usuario_dao userDao,Profile_view2 profile) {
        super(user,userDao);
        this.profile = profile;
        String usuario_logueado = getUser().getNombre()+" "+getUser().getApellido();
        this.profile.getLbl_nombre().setText(usuario_logueado.toUpperCase());
        
    
    }
    
    
    
    
    
}
