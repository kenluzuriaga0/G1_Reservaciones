
package Controlador;

import Dao.Usuario_dao;
import Modelo.Usuario;
import Vistas.Admin_view;
import Vistas.Reporte_view;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author kenlu
 */
public class Reporte_control extends Login_control {

    Reporte_view reporte;
    Admin_view admin ;
    Admin_control admin_con;
    
    Reporte_control(Usuario user, Usuario_dao userDao, Reporte_view reporte) {
        super(user,userDao);

        this.reporte = reporte;
        initListener();
        
        }

    private void initListener() {

        reporte.getLbl_administracion().addMouseListener(new Flujo());
        reporte.getBtn_consultarReservaciones().addMouseListener(new Flujo());
    }

    private void consultarReservaciones(){
        
    }
    
    
    class Flujo extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            Object fuente = e.getSource();

            if (fuente.equals(reporte.getLbl_administracion())) { //ir a administracion
                reporte.dispose();
                admin = new Admin_view();
                admin_con = new Admin_control(getUser(),getUserDao(),admin);
                admin.setVisible(true);
            }else if(fuente.equals(reporte.getBtn_consultarReservaciones())){       //BOTON CONSULTAR
                
                consultarReservaciones();
                
                
            }

        }
    }

}
