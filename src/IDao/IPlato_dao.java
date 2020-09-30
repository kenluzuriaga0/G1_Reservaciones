/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDao;

import Modelo.CategoriaPlato;
import Modelo.Plato;
import java.util.ArrayList;

/**
 *
 * @author kenlu
 */
public interface IPlato_dao {
    
    public ArrayList<Plato> listarPlatos(CategoriaPlato cp);
    
    
}
