package Controlador;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import reservaciones.Login_view;
import reservaciones.Register_view;

public class Login_control {

    private Login_view login;
    private Register_view register;

    public Login_control(Login_view login, Register_view register) {
        this.login = login;
        this.register = register;
        initListener();
        login.setVisible(true);
    }

    private void initListener() {

        login.getBtn_registrarView().addMouseListener(new Flujo_login());
        login.getBtn_salir().addMouseListener(new Flujo_login());
        register.getBtn_backToLogin().addMouseListener(new Flujo_login());
        login.getBtn_info().addMouseListener(new Flujo_login());
        register.getBtn_info().addMouseListener(new Flujo_login());

    }

    private void printInfo() {

        String[] nombres = {"Ken Luzuriaga", "Luis Rodriguez", "Nicole Vera", "Freya Lopez", "Anthony Galarza"};
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", new ColorUIResource(29, 53, 87));
        UI.put("Panel.background", new ColorUIResource(29, 53, 87));
        UI.put("OptionPane.messageForeground", Color.WHITE);
        JOptionPane.showMessageDialog(null, nombres, "About", JOptionPane.INFORMATION_MESSAGE);

    }

    class Flujo_login extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {

            Object fuente = e.getSource();
            if (fuente == login.getBtn_salir()) {

                System.exit(0);

            } else if (fuente == login.getBtn_registrarView()) {

                login.dispose();

                register.setVisible(true);

            } else if (fuente == register.getBtn_backToLogin()) {
                register.dispose();
                login.setVisible(true);

            } else if (fuente == login.getBtn_info() || fuente == register.getBtn_info()) {

                printInfo();
            }

        }

    }

}
