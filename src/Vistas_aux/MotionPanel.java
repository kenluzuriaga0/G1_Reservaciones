/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas_aux;


import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author kenlu
 */
public class MotionPanel extends JPanel{
    private Point initialClick;
    private JFrame padre;

    public MotionPanel(final JFrame parent){
    this.padre = parent;

    addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            initialClick = e.getPoint();
            getComponentAt(initialClick);
        }
    });

    addMouseMotionListener(new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {

            // locaclizacion del frame en la pantalla
            int thisX = padre.getLocation().x;
            int thisY = padre.getLocation().y;

            // Cuanto se ha movido el mouse a partir del click inicial
            int xMoved = e.getX() - initialClick.x;
            int yMoved = e.getY() - initialClick.y;

            // Cambiar localizacion del frame
            int X = thisX + xMoved;
            int Y = thisY + yMoved;
            padre.setLocation(X, Y);
        }
    });
    }
}