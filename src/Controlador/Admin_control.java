package Controlador;

import Vistas.Admin_view;
import Vistas.Reporte_view;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author kenlu
 */
public class Admin_control {

    Admin_view admin;
    
    Reporte_view reporte;
    Reporte_control reporte_control;
    

    Admin_control(Admin_view admin) {
        this.admin = admin;
        String usuario_logueado = Login_control.getUser_login().getUsername();
        this.admin.getLbl_nombre().setText(usuario_logueado.toUpperCase());
        initListener();
    }
    
    private void initListener(){
        
        admin.getLbl_reportes().addMouseListener(new Flujo());
        
    }

    class Flujo extends MouseAdapter{
        
        @Override
        public void mousePressed(MouseEvent e){
            Object fuente = e.getSource();
            
            if(fuente.equals(admin.getLbl_reportes())){
                System.out.println(Login_control.getUser_login());
                admin.dispose();
                
                reporte = new Reporte_view();
                reporte_control = new Reporte_control(reporte);
                reporte.setVisible(true);
            }
                
            
            
        }
        
    }
}
