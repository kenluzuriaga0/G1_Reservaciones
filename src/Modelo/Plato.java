/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author kenlu
 */
public class Plato {

    private int id;
    private String nombre;
    private int id_categoria_plato;

    public Plato(int id, String nombre, int id_categoria_plato) {
        this.id = id;
        this.nombre = nombre;
        this.id_categoria_plato = id_categoria_plato;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId_categoria_plato() {
        return id_categoria_plato;
    }

}
