/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Config.Conexion;
import Modelo.CategoriaPlato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luisMenol
 */
public class Categoria_dao extends Conexion {
   private final String query_listar="select * from categoria_plato";
    
    
   public ArrayList<CategoriaPlato> listar(){
       
       
        ArrayList<CategoriaPlato> categorias = new ArrayList<CategoriaPlato>();
        Connection cn = conectar();
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = cn.prepareStatement(query_listar);
            rs = ps.executeQuery();
            while (rs.next()) {
                categorias.add(this.crearObjeto(rs));
            }
            ps.close();
        } catch (Exception e) {

        }

        return categorias;
    }
   
   private CategoriaPlato crearObjeto(ResultSet rs) throws SQLException{
       int id=rs.getInt(1);
       String nombre=rs.getString(2);
       CategoriaPlato categoria=new CategoriaPlato(id,nombre);
       return categoria;
   }
   
   
    
}
