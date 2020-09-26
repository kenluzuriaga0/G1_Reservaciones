/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author angela
 */
public class CategoriaPlato {
    private int id_categoria_plato;
    private String nombre;

    public CategoriaPlato(int id_categoria_plato, String nombre) {
        this.id_categoria_plato = id_categoria_plato;
        this.nombre = nombre;
    }
    
     public CategoriaPlato(int id_categoria_plato) {
        this.id_categoria_plato = id_categoria_plato;
    }

    public int getId_categoria_plato() {
        return id_categoria_plato;
    }

    public String getNombre() {
        return nombre;
    }
}
