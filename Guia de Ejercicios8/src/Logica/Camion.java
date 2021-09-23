/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 */
package Logica;

/**
 *
 * @author sgcm14
 */
public class Camion  extends Vehiculo{
    private boolean tieneAcoplado;
    private int cantidadEjes;

    public Camion() {
    }

    public Camion(boolean tieneAcoplado, int cantidadEjes, String patente, int nroChasis, String motor, String color, String marca, String modelo, int asientos) {
        super(patente, nroChasis, motor, color, marca, modelo, asientos);
        this.tieneAcoplado = tieneAcoplado;
        this.cantidadEjes = cantidadEjes;
    }

    public boolean isTieneAcoplado() {
        return tieneAcoplado;
    }

    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }
    
    @Override
    public String mostrarMensaje(){
    return "Hola soy un camión y mi cantidad de Ejes es de: "+ cantidadEjes;
    }
    
}
