/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDao;

import Modelo.Reservacion;
import java.util.ArrayList;

/**
 *
 * @author Nicole
 */
public interface Ireservaciones {
    public void insertar(Reservacion e);
    public boolean eliminar(Reservacion e);
    public boolean actualizar(Reservacion e);
    public ArrayList<Reservacion> listar(Reservacion e);
}
