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
public class Nintendo64 extends Consola{

    private String norma;
    private boolean cartuchosPiratas;

    public Nintendo64() {
    }

    
    public Nintendo64(int codigoConsola, String nombre,String empresaDesarrollo,int anioLanzamiento,String norma, boolean cartuchosPiratas) {
        this.codigoConsola=codigoConsola;
        this.nombre=nombre;
        this.empresaDesarrollo=empresaDesarrollo;
        this.anioLanzamiento=anioLanzamiento;
        this.norma = norma;
        this.cartuchosPiratas = cartuchosPiratas;
    }
    

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public boolean isCartuchosPiratas() {
        return cartuchosPiratas;
    }

    public void setCartuchosPiratas(boolean cartuchosPiratas) {
        this.cartuchosPiratas = cartuchosPiratas;
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
    
    public void leerCartucho(String nombreJuego){
        cargarJuego();
        System.out.println("Leyendo Cartucho... "+nombreJuego);
    }
    
}
