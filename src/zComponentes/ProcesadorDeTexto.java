/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zComponentes;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.plaf.basic.BasicToggleButtonUI;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BoxView;
import javax.swing.text.ComponentView;
import javax.swing.text.Element;
import javax.swing.text.IconView;
import javax.swing.text.LabelView;
import javax.swing.text.ParagraphView;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;

/**
 *
 * @author luisMenol
 */
public class ProcesadorDeTexto extends JPanel{
    
    private CuadroTexto cuadro_texto;
    private JScrollPane scroll_pane;
    private JPanel panel_superior;
    private JPanel panel_inferior;
    private BordeProcLed borde_iluminado;
    private BordeProc borde_apagado;
    private BotonProcesador boton_negrita;
    private BotonProcesador boton_cursiva;
    private JPopupMenu popup_menu;
    private ItemPopupProcesador copiar;
    private ItemPopupProcesador pegar;
    private ItemPopupProcesador cortar;

    public ProcesadorDeTexto() {
        this.setLayout(new BorderLayout());
        this.setBorder(new BordeProc());
        this.copiar=new ItemPopupProcesador(Color.WHITE,12,"Copiar");
        this.pegar=new ItemPopupProcesador(Color.WHITE,12,"Pegar");
        this.cortar=new ItemPopupProcesador(Color.WHITE,12,"Cortar");
        this.popup_menu=new JPopupMenu();
        this.copiar.addActionListener(new CopiarPegar());
        this.pegar.addActionListener(new CopiarPegar());
        this.cortar.addActionListener(new CopiarPegar());
        this.popup_menu.add(copiar);
        this.popup_menu.add(pegar);
        this.popup_menu.add(cortar);
        this.boton_negrita=new BotonProcesador("N",BotonProcesador.negrita);
        this.boton_cursiva=new BotonProcesador("S",BotonProcesador.cursiva);
        this.cuadro_texto=new CuadroTexto();
       
        this.scroll_pane=new JScrollPane();
        this.panel_superior=new JPanel();
        this.panel_inferior=new JPanel();
        this.borde_iluminado=new BordeProcLed();
        this.borde_apagado=new BordeProc();
        this.cuadro_texto.setComponentPopupMenu(popup_menu);
        this.panel_superior.setBackground(Color.white);
        this.panel_inferior.setBackground(Color.WHITE);
        this.panel_superior.setLayout(new FlowLayout( FlowLayout.LEFT,0,0));
        this.panel_superior.add(this.boton_negrita);
        this.panel_superior.add(this.boton_cursiva);
        this.panel_inferior.setBorder(this.borde_apagado);
        this.setPreferredSize(new Dimension(620, 170));   
        this.scroll_pane.setBorder(new LineBorder(Color.white));
        this.scroll_pane.setVerticalScrollBar(new Scroles());
        add(this.panel_superior, BorderLayout.NORTH);
        add(this.panel_inferior, BorderLayout.CENTER);
        this.scroll_pane.setViewportView(this.cuadro_texto);
        this.panel_inferior.add(this.scroll_pane);
        this.cuadro_texto.addFocusListener(new PoneBorde());
        this.configurarPopup();
     
    }

    public CuadroTexto getCuadro_texto() {
        return cuadro_texto;
    }
    
    private void configurarPopup(){
        this.cuadro_texto.getInputMap().put(KeyStroke.getKeyStroke("ctrl C"), "copiar");
        this.cuadro_texto.getActionMap().put("copiar", new AbstractAction() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                 cuadro_texto.copy();
             }
         });
        
        this.cuadro_texto.getInputMap().put(KeyStroke.getKeyStroke("ctrl V"), "pegar");
        this.cuadro_texto.getActionMap().put("pegar", new AbstractAction() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                 cuadro_texto.paste();
             }
         });
        
        this.cuadro_texto.getInputMap().put(KeyStroke.getKeyStroke("ctrl B"), "cortar");
        this.cuadro_texto.getActionMap().put("cortar", new AbstractAction() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                 cuadro_texto.cut();
             }
         });
    }
    
    class CopiarPegar extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource()==copiar){
                cuadro_texto.copy();
            }
            
            if(ae.getSource()==pegar){
                cuadro_texto.paste();
            }
            
              if(ae.getSource()==cortar){
                cuadro_texto.cut();
            }
        }
        
    }
    
    
    
    class PoneBorde implements FocusListener{

        @Override
        public void focusGained(FocusEvent fe) {
            panel_inferior.setBorder(borde_iluminado);
        }

        @Override
        public void focusLost(FocusEvent fe) {
            panel_inferior.setBorder(borde_apagado);
        }

    
        
    }
    
    class ItemPopupProcesador extends JMenuItem{
     private final Color color;
     private ColorE colore;
    
    public  ItemPopupProcesador(Color color,int tamano_letra, String texto_item) {
        this.color=color;
        this.setBackground(color);
        this.setText(texto_item);
        colore=new ColorE();
        this.setForeground(colore.obtenerColorEspecifico(47, 47, 49));
        this.setFont(new Font("Times New Roman", Font.ITALIC, tamano_letra));
        this.addMouseListener(new ColorSeleccion());
       
    }
    
    class ColorSeleccion extends MouseAdapter{
        
        @Override
         public void mouseEntered(MouseEvent me) {
             setEnabled(false);
             setEnabled(true);
             setBackground(colore.obtenerColorEspecifico(174,174,178));
        }
         
           public void mouseExited(MouseEvent me) {
             setBackground(color);
         }
           
            public void mousePressed(MouseEvent me) {
              setBackground(color);
            }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
       
        //g.fillRect(0, 0, this.getWidth(), this.getHeight());
        
        
    }
    
    
   }
    
    class Scroles extends JScrollBar{

    public Scroles() {
       
        this.setUI(new MyScrollUI());
        this.setBorder(new ScrollBorder());
        this.setPreferredSize(new Dimension(10,0));
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
     
    }
    
     class ScrollBorder implements Border {

     
    //Borde redondeado clasico
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2=(Graphics2D)g;
        g2.addRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON));
        g2.setStroke(new BasicStroke(2));
        g2.setColor(c.getParent().getParent().getBackground());
       
      
        Rectangle2D rect1=new Rectangle2D.Float(x, y+2, width, height-4);
        RoundRectangle2D oval=new RoundRectangle2D.Float(x, y+2, width, height-4,16,16);
        
    
       
      
        
        Path2D path = new Path2D.Float(Path2D.WIND_EVEN_ODD);
        path.append(rect1, false);
        path.append(oval, false);
        g2.fill(path);

        }
    
    

        public Insets getBorderInsets(Component c) {
            return new Insets(0, 0, 0, 0);
        }

        public boolean isBorderOpaque() {
            return true;
        }
    }

    
    
    
    
    class MyScrollUI extends BasicScrollBarUI{
         ColorE colore=new ColorE();

        public MyScrollUI() {
       
        }
        
     

        @Override
        protected JButton createIncreaseButton(int i) {
             JButton boton=new JButton();
            boton.setVisible(false);
          
           ColorE colore = new ColorE();
           boton.setBackground(Color.WHITE);
            boton.setBorder(new LineBorder(null));
            return boton;
        }

        @Override
        protected JButton createDecreaseButton(int i) {
             JButton boton=new JButton();
            boton.setVisible(false);
           ColorE colore = new ColorE();
            boton.setBackground(Color.WHITE);
            boton.setBorder(new LineBorder(null));
            return boton;
        }
        
     
 @Override
      protected void paintThumb(Graphics g, JComponent c, Rectangle r) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       
        g2.setPaint(colore.obtenerColorEspecifico(178, 179, 189));
        g2.fillRect(0,0 ,c.getWidth() , c.getHeight());
         g2.setPaint(Color.white);
        Rectangle2D rect1=new Rectangle2D.Float(0, 0, c.getWidth(), 2);
        g2.fill(rect1);
         Rectangle2D rect2=new Rectangle2D.Float(0, c.getHeight()-2, c.getWidth(), 4);
        g2.fill(rect2);
        
        g2.drawImage(I.get("egg"), r.x-1, r.y, c);
       
        }

        @Override
        protected Dimension getMaximumThumbSize() {
            return new Dimension(20,20);
        }
      }
    }
    
    class CuadroTexto extends JTextPane implements KeyListener{

  
    
    public CuadroTexto()  {
      this.setEditorKit(new WrapEditorKit());
      this.setGrande(600, 130); //*************************************************************************
      this.addKeyListener(this);
    
      

  
    
  }
    
    public void setGrande(int x, int y){
       this.setPreferredSize(new Dimension(x,y));
     }

        @Override
        public void keyTyped(KeyEvent ke) {
            if(this.getText().length()>517)ke.consume();
        }

        @Override
        public void keyPressed(KeyEvent ke) {
        }

        @Override
        public void keyReleased(KeyEvent ke) {
        }
    }
  



  class WrapEditorKit extends StyledEditorKit {
        ViewFactory defaultFactory=new WrapColumnFactory();
        public ViewFactory getViewFactory() {
            return defaultFactory;
        }
 
    }
 
    class WrapColumnFactory implements ViewFactory {
        public View create(Element elem) {
            String kind = elem.getName();
            if (kind != null) {
                if (kind.equals(AbstractDocument.ContentElementName)) {
                    return new WrapLabelView(elem);
                } else if (kind.equals(AbstractDocument.ParagraphElementName)) {
                    return new ParagraphView(elem);
                } else if (kind.equals(AbstractDocument.SectionElementName)) {
                    return new BoxView(elem, View.Y_AXIS);
                } else if (kind.equals(StyleConstants.ComponentElementName)) {
                    return new ComponentView(elem);
                } else if (kind.equals(StyleConstants.IconElementName)) {
                    return new IconView(elem);
                }
            }
 
            // default to text display
            return new LabelView(elem);
        }
    }
 
    class WrapLabelView extends LabelView {
        public WrapLabelView(Element elem) {
            super(elem);
        }
 
        public float getMinimumSpan(int axis) {
            switch (axis) {
                case View.X_AXIS:
                    return 0;
                case View.Y_AXIS:
                    return super.getMinimumSpan(axis);
                default:
                    throw new IllegalArgumentException("Invalid axis: " + axis);
            }
        }
 
    }


    class BotonProcesador extends JButton{
    private MiBoton b=new MiBoton();
    private Color encima=new Color(193, 200, 199);
    private Color seleccionado=new Color(143, 150, 149);
    private Color no_seleccionado=Color.white;
    private Color actual=no_seleccionado;
    public final static int negrita=1;
    public final static int cursiva=2;

    public BotonProcesador(String letra, int tipo) {
        this.setPreferredSize(new Dimension(44,30));
        this.setFocusable(false);
        this.setUI(b);
        this.setText(letra);
        this.setBorder(null);
        this.b.pintar(this, no_seleccionado);
        this.addMouseListener(new ColoreaBoton(this));
        this.setSelected(false);
        this.definirTipo(tipo);
       
    }
    
   
    
    private void definirTipo(int tipo){
        if(tipo==BotonProcesador.negrita){
            this.setFont(new Font("Century Gothic",Font.BOLD,12));
            this.addActionListener(new StyledEditorKit.BoldAction());
        }else if(tipo==BotonProcesador.cursiva){
            this.setFont(new Font("Century Gothic",3,12));
            this.addActionListener(new StyledEditorKit.ItalicAction());
            
        }
    }
    
    class ColoreaBoton extends MouseAdapter{
        private BotonProcesador boton;

        public ColoreaBoton(BotonProcesador boton) {
            this.boton=boton;
        }
         
         @Override
        public void mouseClicked(MouseEvent me) {
            b.pintar(this.boton, encima);
        }
        
        @Override
        public void mousePressed(MouseEvent me) {
            b.pintar(boton, seleccionado);
        }

       
        @Override
        public void mouseEntered(MouseEvent me) {
            b.pintar(this.boton, encima);
        }
        

        @Override
        public void mouseExited(MouseEvent me) {
            b.pintar(boton, no_seleccionado);
        }
        
    }
    
    
    
    
     class MiBoton extends BasicToggleButtonUI{

       

        public void pintar(JButton b, Color color){
            b.setBackground(color);
        }
        
     
    }
    
}
    
    
    public class BordeProcLed implements Border {

   

    BordeProcLed() {
        
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(0, 0, 0, 0);
    }

    public boolean isBorderOpaque() {
        return true;
    }
     
    //Borde redondeado clasico
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2=(Graphics2D)g;
        g2.setColor(c.getParent().getBackground());
      
        g2.addRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON));
        Rectangle2D rect1=new Rectangle2D.Float(x, y, width, height);
        
        RoundRectangle2D rect2=new RoundRectangle2D.Float(x, y, width, height, 10, 10);
       
         ColorE colore=new ColorE();
         g2.setColor(colore.obtenerColorEspecifico(154, 241, 232));
         g2.setStroke(new BasicStroke(5));
         RoundRectangle2D rectled=new RoundRectangle2D.Float(x, y, width-1, height-1, 10, 10); 
         g2.draw(rectled);
       
         g2.setColor(c.getParent().getBackground());
         
        Path2D path=new Path2D.Float(Path2D.WIND_EVEN_ODD);
        
        
        path.append(rect1, true);
        path.append(rect2, true);
        g2.fill(path);
       
    }
}

 class BordeProc implements Border {

   

    BordeProc() {
        
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(0, 0, 0, 0);
    }

    public boolean isBorderOpaque() {
        return true;
    }
     
    //Borde redondeado clasico
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2=(Graphics2D)g;
        g2.setColor(c.getParent().getBackground());
      
        g2.addRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON));
        Rectangle2D rect1=new Rectangle2D.Float(x, y, width, height);
        
        RoundRectangle2D rect2=new RoundRectangle2D.Float(x, y, width, height, 10, 10);
       

         g2.setColor(c.getParent().getBackground());
         
        Path2D path=new Path2D.Float(Path2D.WIND_EVEN_ODD);
        
        
        path.append(rect1, true);
        path.append(rect2, true);
        g2.fill(path);
       
    }
}

    
    
}
