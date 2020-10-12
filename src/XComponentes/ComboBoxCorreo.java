package XComponentes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author kenlu
 */
 class ComboBoxP extends JComboBox {

    private ColorE colore;

    public ComboBoxP() {
        this.setBorder(new LineBorder(Color.LIGHT_GRAY));
        this.setFont(new Font("Century Gothic", Font.BOLD, 14));
        colore = new ColorE();
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.setFocusable(false);
        this.setBorder(new LineBorder(Color.WHITE, 1, true));
        this.setUI(new CustomUI());

    }
}

 public class ComboBoxCorreo extends ComboBoxP {

    private final static String[] correos = {"@gmail.com", "@hotmail.com", "@ug.edu.ec"};

    public ComboBoxCorreo() {
        super();
        this.setItems();
    }

    private void setItems() {
        for (int i = 0; i < correos.length; i++) {
            this.addItem(correos[i]);
        }
    }

}

class CustomUI extends BasicComboBoxUI {

    @Override
    protected JButton createArrowButton() {
        Boton boton = new Boton();
        return boton;
    }

    class Boton extends JButton {

        public Boton() {
            this.setIcon(I.getI("flecha_abajo"));
            this.setFocusable(false);
            this.setBorderPainted(false);
            this.setSelected(false);
            this.setSelected(false);
            ColorE colore = new ColorE();
            this.setCursor(new Cursor(Cursor.HAND_CURSOR));
            this.addMouseListener(new Deseleccion());
            this.setBackground(colore.obtenerColorEspecifico(238, 239, 248));
        }

        class Deseleccion extends MouseAdapter {

            @Override
            public void mousePressed(MouseEvent me) {
                setSelected(false);
                setEnabled(false);
                setEnabled(true);
            }
        }

    }

    @Override
    protected ListCellRenderer createRenderer() {
        return new DefaultListCellRenderer() {

            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {

                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                ColorE colore = new ColorE();

                //this.setForeground(colore.obtenerColorEspecifico(238, 239, 248));
                list.setForeground(Color.BLACK);
                list.setSelectionBackground(Color.lightGray);
                list.setSelectionForeground(Color.BLACK);
                list.setBackground(Color.WHITE);
                list.setBorder(null);
                list.setCursor(new Cursor(Cursor.HAND_CURSOR));

                return this;
            }
        };
    }
}
