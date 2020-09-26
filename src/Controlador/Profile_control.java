package Controlador;

import Dao.Usuario_dao;
import Modelo.Usuario;
import Vistas.Home_view;
import Vistas.Profile_view;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author kenlu
 */
public class Profile_control extends Login_control {

    private Home_control home_con;
    private Home_view home;
    private Profile_view profile;

    public Profile_control(Usuario user, Usuario_dao userDao, Profile_view profile) {
        super(user, userDao);
        this.profile = profile;
        String usuario_logueado = getUser().getNombre() + " " + getUser().getApellido();
        this.profile.getLbl_nombre().setText(usuario_logueado.toUpperCase());

        initListener();
    }

    private void initListener() {
        profile.getLbl_home().addMouseListener(new Flujo());

    }

    class Flujo extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent ev) {
            Object fuente = ev.getSource();

            if (fuente.equals(profile.getLbl_home())) {
                profile.dispose();
                home = new Home_view();
                home_con = new Home_control(getUser(), getUserDao(), home);
                home.setVisible(true);
            }

        }

    }
}