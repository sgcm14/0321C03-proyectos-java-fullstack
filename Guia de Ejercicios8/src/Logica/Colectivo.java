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
public class Colectivo extends Vehiculo{
    private boolean aptoDiscapacitados;
    private String poseeLectorSube;
    private String tipoColectivo;

    public Colectivo() {
    }

    public Colectivo(boolean aptoDiscapacitados, String poseeLectorSube, String tipoColectivo, String patente, int nroChasis, String motor, String color, String marca, String modelo, int asientos) {
        super(patente, nroChasis, motor, color, marca, modelo, asientos);
        this.aptoDiscapacitados = aptoDiscapacitados;
        this.poseeLectorSube = poseeLectorSube;
        this.tipoColectivo = tipoColectivo;
    }

    public boolean isAptoDiscapacitados() {
        return aptoDiscapacitados;
    }

    public void setAptoDiscapacitados(boolean aptoDiscapacitados) {
        this.aptoDiscapacitados = aptoDiscapacitados;
    }

    public String getPoseeLectorSube() {
        return poseeLectorSube;
    }

    public void setPoseeLectorSube(String poseeLectorSube) {
        this.poseeLectorSube = poseeLectorSube;
    }

    public String getTipoColectivo() {
        return tipoColectivo;
    }

    public void setTipoColectivo(String tipoColectivo) {
        this.tipoColectivo = tipoColectivo;
    }

    @Override
    public String mostrarMensaje(){
    return "Hola soy un colectivo y mi cantidad de asientos es de: "+ super.getAsientos();
    }
    
}
