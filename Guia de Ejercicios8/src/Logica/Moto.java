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
public class Moto extends Vehiculo{
    private double cilindrada;
    private String materialManubrio;

    public Moto() {
    }

    public Moto(double cilindrada, String materialManubrio, String patente, int nroChasis, String motor, String color, String marca, String modelo, int asientos) {
        super(patente, nroChasis, motor, color, marca, modelo, asientos);
        this.cilindrada = cilindrada;
        this.materialManubrio = materialManubrio;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMaterialManubrio() {
        return materialManubrio;
    }

    public void setMaterialManubrio(String materialManubrio) {
        this.materialManubrio = materialManubrio;
    }
    
    @Override
    public String mostrarMensaje(){
    return "Hola soy una moto y mi cilindrada es de: "+ cilindrada;
    }
    
}
