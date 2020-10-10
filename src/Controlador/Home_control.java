package Controlador;

import Dao.Usuario_dao;
import Modelo.Usuario;
import Vistas.Home_view;
import Vistas.Profile_view;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author kenlu
 */
public class Home_control extends Login_control {

    private Home_view home;
    private Profile_view profile;
    private Profile_control profile_con;

    public Home_control(Usuario user, Usuario_dao userDao, Home_view home) {

        super(user, userDao);
        this.home = home;
        this.home.getLbl_PerfilName().setText(getUser().getUsername());
        initListener();

//        profile = new Profile_view();
//        profile_con = new Profile_control(getUser(), getUserDao(), profile);

    }

    private void initListener() {

        home.getLbl_perfil().addMouseListener(new Flujo());

    }

    class Flujo extends MouseAdapter {

        CardLayout vista;

        @Override
        public void mousePressed(MouseEvent e) {

            Object fuente = e.getSource();
            if (fuente == home.getLbl_perfil()) {              //FOTO DE PERFIL
                home.dispose();

                profile = new Profile_view();
                profile_con = new Profile_control(getUser(), getUserDao(), profile);
                profile.setVisible(true);

            }

        }

    }

}
