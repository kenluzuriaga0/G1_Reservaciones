package IDao;

import Modelo.Usuario;
import java.util.List;

/**
 *
 * @author kenlu
 */
public interface IUsuario_dao {
    
    public boolean registrar(Usuario user); //INSERT
    
    public boolean actualizar(Usuario user); //UPDATE
    
    public boolean ingresar(Usuario user);  //SELECT
    
    public List<String> contrasenaPorCorreo(String email); //SELECT
    
    
    
    
}
