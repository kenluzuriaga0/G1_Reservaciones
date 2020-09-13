package Controlador;

import Vistas.Home_view;
import Vistas.Profile_view2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author kenlu
 */
public class Home_control {

    private Home_view home;
    private Profile_view2 profile;
    
    
    
    public Home_control(Home_view home) {
        this.home=home;
        initListener();
        
    }
    
    private void initListener(){
        
        home.getLbl_perfil().addMouseListener(new Flujo());
        
    }
    
    class Flujo extends MouseAdapter{
        
        @Override
        public void mousePressed(MouseEvent e){
            
            Object fuente = e.getSource();
            if(fuente == home.getLbl_perfil()){
                
            }
            
            
            
        }
        
    }
    
    
    
    
}
