/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zComponentes;

import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import zComponentes.ListaComida.CeldasLamina;

/**
 *
 * @author luisMenol
 */
public class CuadroBuscador extends JTextField {
    private DefaultListModel<CeldasLamina>modelo_lista;
    private DefaultListModel<CeldasLamina>modelo_temporal;
    private ListaComida lista_comida;

    public CuadroBuscador() {
        this.getDocument().addDocumentListener(new ControlarBusqueda());
        this.modelo_temporal=new DefaultListModel<CeldasLamina>();
    }
    
    
    public void setModeloLista(DefaultListModel<CeldasLamina>modelo_lista){
        this.modelo_lista=modelo_lista;
       
    }
    
    public void setListaComida(ListaComida lista_comida){
        this.lista_comida=lista_comida;
    }

    
    //CLASE INTERNA CONTROLAR BUSQUEDA. ABERTURA
    private class ControlarBusqueda implements DocumentListener {
  
        public void buscar() {
           
                modelo_temporal.clear();
            for (int i = 0; i < modelo_lista.size(); i++) {
                String texto_buscador = CuadroBuscador.this.getText().toUpperCase();
                String texto_lista = modelo_lista.get(i).getEtiqueta_nombre().getText().toUpperCase();
                
                if (texto_lista.trim().startsWith(texto_buscador.trim())) {
                    modelo_temporal.addElement(modelo_lista.get(i));
                }
            }

            lista_comida.setModel(modelo_temporal);
           
           

        }

        @Override
        public void insertUpdate(DocumentEvent de) {
            buscar();
        }

        @Override
        public void removeUpdate(DocumentEvent de) {
            buscar();
        }

        @Override
        public void changedUpdate(DocumentEvent de) {
        }

    }//CLASE INTERNA CONTROLAR BUSQUEDA. CIERRE

}
