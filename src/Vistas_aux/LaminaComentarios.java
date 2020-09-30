/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas_aux;

import Controlador.Login_control;
import Dao.Comentario_dao;
import Modelo.Comentario;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

/**
 *
 * @author luisMenol
 */
public class LaminaComentarios extends JPanel implements ActionListener{
    private Comentario_dao dao;
    private ArrayList<Comentario>comentarios;
    private Box caja_vertical;
    private ProcesadorDeTexto procesador_texto;
    private JButton boton_enviar;
    private Login_control login;

    

    public LaminaComentarios() {
        this.setBackground(Color.white);
        procesador_texto=new ProcesadorDeTexto();
        dao=new Comentario_dao();
        boton_enviar=new JButton("ENVIAR COMENTARIO!!");
        caja_vertical=Box.createVerticalBox();
        add(caja_vertical);
        boton_enviar.addActionListener(this);
        this.insertarComentarios();
    }
    
    public void insertarComentarios(){
        comentarios=dao.ListarComentarios();
        caja_vertical.add(this.procesador_texto);
        this.agregarSeparadorConBoton();
        this.agregarSeparador();
        
        for(Comentario e:comentarios){
            LaminaDeComentario lamina=new LaminaDeComentario();
            lamina.getLamina_superior().colocarNombreUsuario(e.getNombre_usuario(),I.getI("usuario"));
            lamina.getLamina_central().colocarComentario(e.getComentario());
            lamina.getLamina_superior().colocarTiempoPublicacion(e.getTiempo_publicacion(), I.getI("reloj"));
            caja_vertical.add(lamina);
            this.agregarSeparador();
        }
       
    }
    
    private void agregarSeparador(){
            JPanel separador=new JPanel();
            separador.setBackground(Color.WHITE);
            separador.setPreferredSize(new Dimension(1,30));
            caja_vertical.add(separador);
    }
    
    private void agregarSeparadorConBoton(){
        JPanel separador=new JPanel();
        separador.setBackground(Color.WHITE);
        separador.setPreferredSize(new Dimension(1,30));
        separador.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
        separador.add(this.boton_enviar);
        caja_vertical.add(separador);
    }

    private void borrar(){
         this.caja_vertical.removeAll();
    }

    private void visualizar(){
         this.caja_vertical.setVisible(false);
         this.caja_vertical.setVisible(true);
         
    }   
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(this.procesador_texto.getCuadro_texto().getText().trim().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "No puede enviar comentarios vacios", "OYE NOOOO!!", JOptionPane.ERROR_MESSAGE);
        }else{
         int opcion=  JOptionPane.showConfirmDialog(null,"Seguro que quieres enviar este comentario?","OYE AGUANTA OE"
                 ,JOptionPane.YES_NO_OPTION);
         if(opcion==JOptionPane.YES_OPTION){
              this.borrar();
          Date fecha=new Date();
          Timestamp fecha_completa=new Timestamp(fecha.getTime());
          Comentario c=new Comentario(Login_control.getUser().getId(),this.procesador_texto.getCuadro_texto().getText(),fecha_completa); //aqui va el id
           //del usuario logueado en el segundo parametro
           dao.insertar(c);
           this.insertarComentarios();
           this.visualizar();
         }
        }
    }
    
}

class LaminaDeComentario extends JPanel{
    private LaminaSuperior lamina_superior;
    private LaminaCentral lamina_central;
    
    public LaminaDeComentario() {
        this.setPreferredSize(new Dimension(630,160));
        this.setLayout(new BorderLayout());
        this.lamina_superior=new LaminaSuperior();
        this.lamina_central=new LaminaCentral();
        add(this.lamina_superior,BorderLayout.NORTH);
        add(this.lamina_central,BorderLayout.CENTER);
    }

    public LaminaSuperior getLamina_superior() {
        return lamina_superior;
    }

    public LaminaCentral getLamina_central() {
        return lamina_central;
    }
    
    
     class LaminaSuperior extends JPanel{
        private JLabel etiqueta_nombre_usuario;
        private JLabel etiqueta_tiempo_publicacion;
        private RoundedBorderLaminaSuperior borde;
        
        public LaminaSuperior() {
            this.setLayout(new FlowLayout(FlowLayout.LEFT,20,0));
            this.etiqueta_nombre_usuario=new JLabel();
            this.etiqueta_tiempo_publicacion=new JLabel();
            this.etiqueta_nombre_usuario.setFont(new Font("Century Gothic",Font.BOLD,12));
            borde=new RoundedBorderLaminaSuperior(1);
            this.setBorder(borde);
            add(this.etiqueta_nombre_usuario);
            add(this.etiqueta_tiempo_publicacion);
            this.setBackground(Color.yellow);
        }
        
        public void colocarNombreUsuario(String nombre,Icon imagen){
            this.etiqueta_nombre_usuario.setText(nombre);
            this.etiqueta_nombre_usuario.setIcon(imagen);
        }
        
          public void colocarTiempoPublicacion(String tiempo,Icon imagen){
            this.etiqueta_tiempo_publicacion.setText("Publicado Hace: "+tiempo);
            this.etiqueta_tiempo_publicacion.setIcon(imagen);
        }
        
    }
    
    class LaminaCentral extends JPanel{
        private JTextArea area_comentarios;

        public LaminaCentral() {
            this.setBackground(Color.BLACK);
            this.setLayout(new FlowLayout(FlowLayout.CENTER,0,5));
            this.area_comentarios=new JTextArea();
            this.area_comentarios.setPreferredSize(new Dimension(620,115));
            this.area_comentarios.setEditable(false);
            this.area_comentarios.setLineWrap(true);
            this.area_comentarios.setFont(new Font("Century Gothic",Font.BOLD,12));
            this.add(this.area_comentarios);
        }
        
        public void colocarComentario(String comentario){
            this.area_comentarios.setText(comentario);
        }
        
        
    }
    
}

class RoundedBorderLaminaSuperior implements Border {

    private int radius;

    RoundedBorderLaminaSuperior(int radius) {
        this.radius = radius;
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
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
        
        RoundRectangle2D rect2=new RoundRectangle2D.Float(x, y, width, height, radius+30, radius+30);
        g2.setColor(Color.yellow);
        g2.setStroke(new BasicStroke(1));
        g2.draw(rect2);
        Rectangle2D rect3=new Rectangle2D.Float(x, y+20, width-((width/2)+300), height/2);
        Rectangle2D rect4=new Rectangle2D.Float(x, y+20, width, height/2);
        
        
        g2.setColor(Color.white);
         
        Path2D path=new Path2D.Float(Path2D.WIND_EVEN_ODD);
        
        
        path.append(rect1, false);
        path.append(rect2, false);
        g2.fill(path);
        g2.setColor(Color.YELLOW);
        g2.fill(rect3);
        g2.fill(rect4);
    }
}
