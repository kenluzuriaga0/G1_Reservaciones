/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Dao.Categoria_dao;
import Dao.Plato_dao;
import Modelo.CategoriaPlato;
import Modelo.Plato;
import Vistas_aux.CuadroBuscador;
import Vistas_aux.I;
import Vistas_aux.ListaComida;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author kenlu
 */
public class ConsultarMenu_view extends javax.swing.JPanel implements ListSelectionListener{


    private ListaComida lista_categoria;
    private ListaComida lista_plato;
    private Categoria_dao daocategoria;
    private Plato_dao daoplato;
    private CuadroBuscador cuadro_buscador;
    
    public ConsultarMenu_view() {
        initComponents();
        this.setVisible(true);
        lista_categoria = (ListaComida) this.lista_c;
        lista_plato = (ListaComida) this.lista_p;
        this.lista_categoria.addListSelectionListener(this);
        this.daocategoria = new Categoria_dao();
        this.daoplato = new Plato_dao();
        cuadro_buscador = (CuadroBuscador) this.cuadro_b;
        this.cuadro_buscador.setListaComida(lista_plato);
        
        ArrayList<CategoriaPlato> nombres = this.daocategoria.listar();
        ArrayList<Icon> iconos = new ArrayList<Icon>();
        iconos.add(I.getI("coffee-cup"));
        iconos.add(I.getI("beer"));
        iconos.add(I.getI("muffin"));
        iconos.add(I.getI("roasted-chicken"));
        iconos.add(I.getI("salad"));
        this.lista_categoria.actualizar(iconos, nombres, JLabel.CENTER, 20);
        this.prepararListaPlato(1);
    }
    
      private void prepararListaPlato(int categoria) {

        ArrayList<Plato> nombres = this.daoplato.listarPlatos(new CategoriaPlato(categoria));
        ArrayList<Icon> iconos = new ArrayList<Icon>();
        for (int i = 0; i < nombres.size(); i++) {
            iconos.add(I.getI("usuario"));
        }
        this.lista_plato.actualizar2(iconos, nombres, JLabel.LEFT, 12);
        this.cuadro_buscador.setModeloLista(this.lista_plato.getModelo());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lista_c = new ListaComida(true);
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cuadro_b = new CuadroBuscador();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_p = new ListaComida(false);
        fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(820, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(29, 53, 87));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Categorias");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lista_c.setBackground(new java.awt.Color(29, 53, 87));
        lista_c.setBorder(null);
        lista_c.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lista_c.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(lista_c, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lista_c, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 250, 360));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Consulta nuestro Menú Aqui");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 40));

        jPanel3.setBackground(new java.awt.Color(29, 53, 87));

        cuadro_b.setBackground(new java.awt.Color(255, 255, 255));
        cuadro_b.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cuadro_b.setForeground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Detalles de platos");

        jScrollPane2.setBorder(null);

        lista_p.setBackground(new java.awt.Color(29, 53, 87));
        lista_p.setBorder(null);
        lista_p.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lista_p.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(lista_p);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cuadro_b, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuadro_b, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 320, 350));

        fondo.setBackground(new java.awt.Color(171, 171, 171));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/animation_food TRANS.png"))); // NOI18N
        fondo.setText("Consulta nuestro Menú Aqui");
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 440));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cuadro_b;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> lista_c;
    private javax.swing.JList<String> lista_p;
    // End of variables declaration//GEN-END:variables

    @Override
    public void valueChanged(ListSelectionEvent e) {
         if (this.lista_categoria.getSelectedIndex() == 0) {
            this.prepararListaPlato(1);
        } else if (this.lista_categoria.getSelectedIndex() == 1) {
            this.prepararListaPlato(2);
        } else if (this.lista_categoria.getSelectedIndex() == 2) {
            this.prepararListaPlato(3);
        } else if (this.lista_categoria.getSelectedIndex() == 3) {
            this.prepararListaPlato(4);
        } else if (this.lista_categoria.getSelectedIndex() == 4) {
            this.prepararListaPlato(5);
        }

    }
}
