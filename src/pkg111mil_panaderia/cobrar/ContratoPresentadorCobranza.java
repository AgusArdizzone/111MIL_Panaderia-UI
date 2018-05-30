/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg111mil_panaderia.cobrar;

import pkg111mil_panaderia.modelo.Dinero;

/**
 *
 * @author utku34
 */
public interface ContratoPresentadorCobranza {
    public void agregarBillete(Dinero bill);
    public void botonCancelarCobranza();
    public void botonAceptarCobranza();
    
}
