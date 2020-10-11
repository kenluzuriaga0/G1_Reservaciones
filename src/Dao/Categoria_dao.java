/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Config.Conexion;
import IDao.ICategoria_dao;
import Modelo.CategoriaPlato;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luisMenol
 */
public class Categoria_dao extends Conexion implements ICategoria_dao {

    private final String query_listar = "select * from categoria_plato";

    public Categoria_dao() {
        super.cerrar();
    }

    @Override
    public ArrayList<CategoriaPlato> listar() {

        ArrayList<CategoriaPlato> categorias = new ArrayList<CategoriaPlato>();
        Conexion cn = new Conexion();
        //   System.out.print("listar");
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = cn.getCon().prepareStatement(query_listar);
            rs = ps.executeQuery();
            while (rs.next()) {
                categorias.add(this.crearObjeto(rs));
            }
            ps.close();
            cn.cerrar();
        } catch (Exception e) {

        }

        return categorias;
    }

    private CategoriaPlato crearObjeto(ResultSet rs) throws SQLException {
        int id = rs.getInt(1);
        String nombre = rs.getString(2);
        CategoriaPlato categoria = new CategoriaPlato(id, nombre);
        return categoria;
    }

}
