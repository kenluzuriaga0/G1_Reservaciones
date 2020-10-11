/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XComponentes;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author kenlu
 */
public class I {
    public static Image get(String nombre) {
        String paquete = "img";
        boolean fallo = false;
        Image imagen = null;

        String url = "src/" + paquete + "/" + nombre + ".png";
        try {
            imagen = ImageIO.read(new File(url));
        } catch (IOException ex) {
            fallo = true;
        }
        if (fallo == true) {
            url = "src/" + paquete + "/" + nombre + ".jpeg";
            try {
                imagen = ImageIO.read(new File(url));
            } catch (IOException ex) {
                fallo = false;
            }
        }

        if (fallo == false) {
            url = "src/" + paquete + "/" + nombre + ".jpg";
            try {
                imagen = ImageIO.read(new File(url));
            } catch (IOException ex) {

            }
        }

        return imagen;

    }

    public static Icon getI(String nombre) {
        String paquete = "img";
        boolean fallo = false;
        Icon icono = null;
        ImageIcon i = new ImageIcon();

        String url = "src/" + paquete + "/" + nombre + ".png";
        icono = new ImageIcon(url);

        if (icono.getIconWidth() == -1) {
            url = "src/" + paquete + "/" + nombre + ".jpeg";
            icono = new ImageIcon(url);
        }

        if (icono.getIconWidth() == -1) {
            url = "src/" + paquete + "/" + nombre + ".jpg";
            icono = new ImageIcon(url);
        }

        return icono;
    }
}
