/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Config.Conexion;
import Modelo.CategoriaPlato;
import Modelo.Plato;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author angela
 */
public class DAOplato {
    private final String query_listar_platos="select * from plato where id_categoria_plato=?";
    
    public ArrayList<Plato> listarPlatos(CategoriaPlato cp){
        Connection cn = Conexion.conectar();
        PreparedStatement ps;
        ResultSet rs;      
        ArrayList<Plato>platos=new  ArrayList<Plato>();
        try{
            ps=cn.prepareStatement(query_listar_platos);
        ps.setInt(1, cp.getId_categoria_plato());
        rs=ps.executeQuery();
        while(rs.next()){
            platos.add(this.obtenerPlato(rs));
        }
        cn.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
        return platos;
    }
    
    private Plato obtenerPlato(ResultSet rs) throws SQLException{
        int id=rs.getInt(1);
        String nombre=rs.getString(2);
        int id_categoria=rs.getInt(3);
        Plato p=new Plato(id,nombre,id_categoria);
        return p;
        
    }
    
    
}
