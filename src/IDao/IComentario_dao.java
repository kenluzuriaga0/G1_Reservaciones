/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDao;

import Modelo.Comentario;
import java.util.ArrayList;

/**
 *
 * @author kenlu
 */
public interface IComentario_dao {
    
     public void insertar(Comentario c);
     public ArrayList<Comentario> ListarComentarios();
}
