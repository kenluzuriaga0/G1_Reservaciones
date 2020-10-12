/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XComponentes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author angela
 */
public class ValidaCorreo extends JTextField implements KeyListener{

    public ValidaCorreo() {
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        if(String.valueOf(ke.getKeyChar()).equals("@") || Character.isWhitespace(ke.getKeyChar())){
            ke.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

    
    
    
  
    
    
    
    
    
}
