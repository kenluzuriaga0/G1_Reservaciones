package XComponentes;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author kenlu
 */
public class PlaceHolder {
    
    
    
    public static void quitar_PlaceHolder(String placeholder, JTextField campo) {

            if (campo.getText().equals(placeholder)) {
                campo.setText("");
                campo.setForeground(Color.black);
            }

        }

        public static void poner_PlaceHolder(String placeholder, JTextField campo) {

            if (campo.getText().equals("")) {
                campo.setText(placeholder);
                campo.setForeground(new Color(102, 102, 102));

            }

        }

        public static void quitar_PlaceHolder(String placeholder, JPasswordField campo) {
            String palabra = "";
            palabra = palabra.valueOf(campo.getPassword());
            if (palabra.equals(placeholder)) {
                campo.setText("");
                campo.setForeground(Color.black);
                campo.setEchoChar('*'); //cambia la mascara
            }

        }

        public static void poner_PlaceHolder(String placeholder, JPasswordField campo) {

            String palabra = "";
            palabra = palabra.valueOf(campo.getPassword());
            if (palabra.equals("")) {
                campo.setText(placeholder);
                campo.setForeground(new Color(102, 102, 102));
                campo.setEchoChar((char) 0); //cambia la mascara
            }

        }
}
