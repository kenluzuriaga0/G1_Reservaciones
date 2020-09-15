
package Controlador;

import Vistas.Admin_view;
import Vistas.Reporte_view;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author kenlu
 */
public class Reporte_control {

    Reporte_view reporte;
    Admin_view admin;
    Admin_control admin_con;

    Reporte_control(Reporte_view reporte) {
        this.reporte = reporte;
        initListener();
    }

    private void initListener() {

        reporte.getLbl_administracion().addMouseListener(new Flujo());

    }

    class Flujo extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            Object fuente = e.getSource();

            if (fuente.equals(reporte.getLbl_administracion())) {
                reporte.dispose();

                admin = new Admin_view();
                admin_con = new Admin_control(admin);
                admin.setVisible(true);
            }

        }
    }

}
