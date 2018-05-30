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
public class PresentadorCobranza implements ContratoPresentadorCobranza{
    
    private final ContratoVistaCobranza vista;
    private float total;
    
    public PresentadorCobranza(ContratoVistaCobranza vista) {
        this.vista = vista;
    }    
    
    public void billeteElegido(Dinero bill){
        this.total = this.total + bill.getDenominacion();
        this.vista.agregarBillete(bill);
    }
    
    public void botonCancelarCobranza(){
        this.vista.cancelarCobranza();
        this.total = 0;
    }
    
    public void botonAceptarCobranza(){
        this.vista.aceptarCobranza();
    }
        
}
