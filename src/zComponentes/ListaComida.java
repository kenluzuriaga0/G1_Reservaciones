/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zComponentes;

import Modelo.CategoriaPlato;
import Modelo.Plato;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.border.LineBorder;

/**
 *
 * @author luisMenol
 */
public class ListaComida extends JList{
    private DefaultListModel<CeldasLamina> modelo;
    

    public ListaComida(boolean seleccionable) {
        this.setCellRenderer(new MyCellRenderer(seleccionable));
        this.modelo=new DefaultListModel<CeldasLamina>();
        
    }
    
    public void actualizar(ArrayList<Icon> iconos, ArrayList<CategoriaPlato> nombres, int alineacion_etiqueta, int tamanio_letra){
        modelo.clear();
        for(int i=0; i<iconos.size(); i++){
            CeldasLamina celda_lamina=new CeldasLamina(iconos.get(i),nombres.get(i).getNombre(),alineacion_etiqueta,tamanio_letra);
            modelo.addElement(celda_lamina);
        }
        this.setModel(modelo);
        
    }
    
     public void actualizar2(ArrayList<Icon> iconos, ArrayList<Plato> nombres, int alineacion_etiqueta,int tamanio_letra){
        modelo.clear();
        for(int i=0; i<iconos.size(); i++){
            CeldasLamina celda_lamina=new CeldasLamina(iconos.get(i),nombres.get(i).getNombre(),alineacion_etiqueta,tamanio_letra);
            modelo.addElement(celda_lamina);
        }
        this.setModel(modelo);
        
    }
    
    public DefaultListModel<CeldasLamina> getModelo() {
        return modelo;
    }
    
    //CLASE INTERNA CELDAS LAMINA
    class CeldasLamina extends JPanel{
        private JPanel lamina_icono;
        private JPanel lamina_nombre;
        private JLabel etiqueta_icono;
        private JLabel etiqueta_nombre;
        private Icon icono;
        private String nombre;
        

        public CeldasLamina(Icon icono, String nombre, int alineacion_etiqueta, int tamanio_letra) {
            this.icono = icono;
            this.nombre = nombre;
            this.lamina_nombre=new JPanel();
            this.lamina_icono=new JPanel();
            this.etiqueta_icono=new JLabel();
            this.etiqueta_nombre=new JLabel();
            this.etiqueta_nombre.setHorizontalAlignment(alineacion_etiqueta);
            this.fabricarLamina(tamanio_letra);
        }
        
        private void fabricarLamina(int tamanio_letra){
            ColorE e=new ColorE();
            this.setLayout(new BorderLayout());
            this.etiqueta_nombre.setFont(new Font("Century Gothic",3,tamanio_letra));
            this.lamina_nombre.setBorder(new LineBorder(e.obtenerColorEspecifico(187, 187, 200),1));
            this.lamina_nombre.setLayout(new BorderLayout());
            this.lamina_nombre.setBackground(e.obtenerColorEspecifico(29,53,87));
            this.lamina_icono.setBackground(e.obtenerColorEspecifico(29,53,87));
            this.etiqueta_nombre.setForeground(Color.WHITE);
            add(this.lamina_icono,BorderLayout.WEST);
            add(this.lamina_nombre,BorderLayout.CENTER);
            this.lamina_icono.add(this.etiqueta_icono);
            this.lamina_nombre.add(this.etiqueta_nombre,BorderLayout.CENTER);
            this.etiqueta_icono.setIcon(icono);
            this.etiqueta_nombre.setText(nombre);
            this.etiqueta_nombre.add(new JButton("HOLAAA"));
       }

        public JPanel getLamina_nombre() {
            return lamina_nombre;
        }

        public JLabel getEtiqueta_nombre() {
            return etiqueta_nombre;
        }

       
        
        
    }
    //CLASE INTERNA CELDAS LAMINA
    
    
    
    
     //CLASE INTERNA RENDERER
     class MyCellRenderer implements ListCellRenderer<Object>{
         private boolean seleccionable;

        public MyCellRenderer(boolean seleccionable) {
            this.seleccionable=seleccionable;
        }
      
        
        @Override
        public Component getListCellRendererComponent(JList<? extends Object> jlist, Object e, int i, boolean bln, boolean bln1) {
               CeldasLamina e2=(CeldasLamina)e;
              if(seleccionable==true){
                    if(bln==true){
                  e2.getEtiqueta_nombre().setForeground(Color.yellow);
               }else{
                 // e2.getLamina_nombre().setBackground(Color.gray);
                  e2.getEtiqueta_nombre().setForeground(Color.WHITE);
               }
              }
               return e2;
        
              }
             
    }
     //CLASE INTERNA RENDERER
    
     
     
}
