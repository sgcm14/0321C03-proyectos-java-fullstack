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
public class XboxOne extends Consola{
    private boolean conectadaInternet;
    private boolean calidad4kActivada;
    private boolean permiteDescargaAutomatica;

    public XboxOne() {
    }

    public XboxOne(int codigoConsola, String nombre,String empresaDesarrollo,int anioLanzamiento,boolean conectadaInternet, boolean calidad4kActivada, boolean permiteDescargaAutomatica) {
        this.codigoConsola=codigoConsola;
        this.nombre=nombre;
        this.empresaDesarrollo=empresaDesarrollo;
        this.anioLanzamiento=anioLanzamiento;
        this.conectadaInternet = conectadaInternet;
        this.calidad4kActivada = calidad4kActivada;
        this.permiteDescargaAutomatica = permiteDescargaAutomatica;
    }

    public boolean isConectadaInternet() {
        return conectadaInternet;
    }

    public void setConectadaInternet(boolean conectadaInternet) {
        this.conectadaInternet = conectadaInternet;
    }

    public boolean isCalidad4kActivada() {
        return calidad4kActivada;
    }

    public void setCalidad4kActivada(boolean calidad4kActivada) {
        this.calidad4kActivada = calidad4kActivada;
    }

    public boolean isPermiteDescargaAutomatica() {
        return permiteDescargaAutomatica;
    }

    public void setPermiteDescargaAutomatica(boolean permiteDescargaAutomatica) {
        this.permiteDescargaAutomatica = permiteDescargaAutomatica;
    }

    public int getCodigoConsola() {
        return codigoConsola;
    }

    public void setCodigoConsola(int codigoConsola) {
        this.codigoConsola = codigoConsola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresaDesarrollo() {
        return empresaDesarrollo;
    }

    public void setEmpresaDesarrollo(String empresaDesarrollo) {
        this.empresaDesarrollo = empresaDesarrollo;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    
    
    
    
    @Override
    public void cargarJuego() {
        System.out.println("Cargando juego. Por favor espere");
    }
    
    public void leerJuegoDigital(String nombreJuego){
        cargarJuego();
        System.out.println("Leyendo... "+nombreJuego+" desde tienda");
    }
}
