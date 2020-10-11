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
