package Dao;

import Config.Conexion;
import IDao.IComentario_dao;
import Modelo.Comentario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author luisMenol
 */
public class Comentario_dao implements IComentario_dao{
    
    private final String query_listar="select us.username, c.comentario, c.id_usuarios, c.fecha_publicacion from usuarios us, comentarios c where us.id_usuarios=c.id_usuarios order by id_comentario desc";
    private final String query_insertar="insert into comentarios values(?,?,?,?)";
    
    
      //METODO PRIMARIO
    @Override
    public ArrayList<Comentario> ListarComentarios(){
        Connection cn = Conexion.conectar();
        PreparedStatement ps;
        ResultSet rs;
        ArrayList<Comentario>arreglo=new ArrayList<Comentario>();
        
        try{
             ps=cn.prepareStatement(query_listar);
             rs=ps.executeQuery();
             while(rs.next()){
               arreglo.add(obtenerComentario(rs));
             }
             cn.close();
        }catch(Exception e){
            System.out.println("error");
        }
       
        return arreglo;
    }
    
    //METODO PRIMARIO
    @Override
    public void insertar(Comentario c){
        Connection cn = Conexion.conectar();
        PreparedStatement ps=null;
        
        int id_siguiente=Dao.autoId("comentarios", "id_comentario");
        try{
          ps=cn.prepareStatement(query_insertar);
          ps.setInt(1, id_siguiente);
          ps.setInt(2,c.getId_usuario() ); //el 3 se refiere al id del usuario que tiene sesion iniciada
          ps.setString(3, c.getComentario());
          ps.setTimestamp(4, c.getFecha_publicacion());
          ps.executeQuery();
          cn.close();
        }catch(Exception e){
            System.out.println(e);
        }
      
    }
     
    
    
    
    
    private int buscarIdSiguiente(Connection cn, String nombre_tabla, String nombre_columna){
        PreparedStatement ps=null;
        ResultSet rs=null;
        int id=0;
        String query="select max("+nombre_columna+") from "+nombre_tabla;
    
       
        try {
            ps=cn.prepareStatement(query);
        } catch (SQLException ex) {
            System.out.println("error en prepared statemente de id siguiente");
        }
        try {
            rs=ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println("error execute query de idsiguiente");
        }
        try {
          rs.next();
          id = rs.getInt(1);
           
           
        } catch (SQLException ex) {
            System.out.println("error en getInt de idsiguiente");
        }
     
       
        return id+1;
    }
    
    
    
    private Comentario obtenerComentario(ResultSet rs) throws SQLException{
        String nombre_usuario=rs.getString(1);
        String comentario_escrito=rs.getString(2);
        int id_usuario=rs.getInt(3);
        Timestamp fecha_publicacion=rs.getTimestamp(4);
        Comentario comentario=new Comentario(nombre_usuario,comentario_escrito,id_usuario,fecha_publicacion);
        return comentario;
    }
    
    
}
