package Vistas;

import Vistas_clases.I;
import Dao.DAOcategoriaPlato;
import Dao.DAOplato;
import Modelo.CategoriaPlato;
import Modelo.Plato;
import Vistas_clases.CuadroBuscador;
import Vistas_clases.ListaComida;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author angela
 */
public class Vista extends javax.swing.JFrame implements ListSelectionListener {

    /**
     * Creates new form Vista
     */
    private ListaComida lista_categoria;
    private ListaComida lista_plato;
    private DAOcategoriaPlato daocategoria;
    private DAOplato daoplato;
    private CuadroBuscador cuadro_buscador;

    public Vista() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        lista_categoria = (ListaComida) this.lista_c;
        lista_plato = (ListaComida) this.lista_p;
        this.lista_categoria.addListSelectionListener(this);
        this.daocategoria = new DAOcategoriaPlato();
        this.daoplato = new DAOplato();
        cuadro_buscador = (CuadroBuscador) this.cuadro;
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_c = new ListaComida(true);
        boton_actualizar = new javax.swing.JButton();
        cuadro = new CuadroBuscador();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_p = new ListaComida(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportView(lista_c);

        boton_actualizar.setText("actualizar");
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        jScrollPane1.setViewportView(lista_p);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cuadro))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(cuadro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(boton_actualizar)
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        ArrayList<CategoriaPlato> nombres = this.daocategoria.listar();
        ArrayList<Icon> iconos = new ArrayList<Icon>();
        iconos.add(I.getI("coffee-cup"));
        iconos.add(I.getI("beer"));
        iconos.add(I.getI("muffin"));
        iconos.add(I.getI("roasted-chicken"));
        iconos.add(I.getI("salad"));
        this.lista_categoria.actualizar(iconos, nombres, JLabel.CENTER, 20);
        this.prepararListaPlato(1);

    }//GEN-LAST:event_boton_actualizarActionPerformed
    private void prepararListaPlato(int categoria) {

        ArrayList<Plato> nombres = this.daoplato.listarPlatos(new CategoriaPlato(categoria));
        ArrayList<Icon> iconos = new ArrayList<Icon>();
        for (int i = 0; i < nombres.size(); i++) {
            iconos.add(I.getI("usuario"));
        }
        this.lista_plato.actualizar2(iconos, nombres, JLabel.LEFT, 12);
        this.cuadro_buscador.setModeloLista(this.lista_plato.getModelo());

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_actualizar;
    private javax.swing.JTextField cuadro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lista_c;
    private javax.swing.JList<String> lista_p;
    // End of variables declaration//GEN-END:variables

    @Override
    public void valueChanged(ListSelectionEvent lse) {
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
