/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg111mil_panaderia.cobrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pkg111mil_panaderia.modelo.Caja;
import pkg111mil_panaderia.modelo.Dinero;
import pkg111mil_panaderia.modelo.TipoDinero;

/**
 *
 * @author agustin
 */
public class ProveedorCobranza implements ContratoProveedor {
    private List <Dinero> efectivo = new ArrayList<>();
    private Caja caja = new Caja(efectivo);
    
    private final List<Dinero> dineroAutorizado = Arrays.asList(
    new Dinero(0.50f, TipoDinero.MONEDA),new Dinero(1f, TipoDinero.MONEDA),
    new Dinero(2f, TipoDinero.MONEDA),new Dinero(5f, TipoDinero.BILLETE),
    new Dinero(10f, TipoDinero.BILLETE),new Dinero(20f, TipoDinero.BILLETE),
    new Dinero(50f, TipoDinero.BILLETE),new Dinero(100f, TipoDinero.BILLETE),
    new Dinero(200f, TipoDinero.BILLETE),new Dinero(500f, TipoDinero.BILLETE),
    new Dinero(1000f, TipoDinero.BILLETE));

    @Override
    public List<Dinero> getDineroAutorizado() {
        return dineroAutorizado;
    }
    
    @Override
    public void agregarDineroACaja(List<Dinero> dinero){
        caja.agregarDinero(dinero);
    }
}
