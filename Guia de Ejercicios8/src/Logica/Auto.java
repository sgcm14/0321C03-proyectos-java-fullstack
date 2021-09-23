/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.materialasientos, cantidad_caballos
 */
package Logica;

/**
 *
 * @author sgcm14
 */
public class Auto extends Vehiculo{
    private String materialAsientos;
    private int cantidadCaballos;

    public Auto() {
    }

    public Auto(String materialAsientos, int cantidadCaballos, String patente, int nroChasis, String motor, String color, String marca, String modelo, int asientos) {
        super(patente, nroChasis, motor, color, marca, modelo, asientos);
        this.materialAsientos = materialAsientos;
        this.cantidadCaballos = cantidadCaballos;
    }

    public String getMaterialAsientos() {
        return materialAsientos;
    }

    public void setMaterialAsientos(String materialAsientos) {
        this.materialAsientos = materialAsientos;
    }

    public int getCantidadCaballos() {
        return cantidadCaballos;
    }

    public void setCantidadCaballos(int cantidadCaballos) {
        this.cantidadCaballos = cantidadCaballos;
    }
    
    @Override
    public String mostrarMensaje(){
    return "Hola  soy  un  auto y mi  marca es: "+super.getMarca();
    }
    
}
