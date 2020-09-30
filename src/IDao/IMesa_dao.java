/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDao;

import Modelo.Mesa;

/**
 *
 * @author kenlu
 */
public interface IMesa_dao {
    public int getTotalMesas(); //UPDATE
    
     public void actualizarTotalMesas(); //UPDATE
     
      public void definirDia(Mesa mesa);  //UPDATE
}
