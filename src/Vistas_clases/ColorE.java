/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas_clases;

import java.awt.Color;


public class ColorE{
    
    
    public Color obtenerColorEspecifico(int rojo, int verde, int azul){
        float []arr={0,0,0};
        float[] colores=Color.RGBtoHSB(rojo, verde, azul, arr);
        Color color=Color.getHSBColor(colores[0], colores[1], colores[2]);
        return color;
    }
    
}
