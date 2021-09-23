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
public class PlayStation2 extends Consola{
    private String norma;
    private boolean chipeadaONo;
    private double tamanioMemoryCard;

    public PlayStation2() {
    }

    
    public PlayStation2(int codigoConsola, String nombre,String empresaDesarrollo,int anioLanzamiento,String norma, boolean chipeadaONo, double tamanioMemoryCard) {
        this.codigoConsola=codigoConsola;
        this.nombre=nombre;
        this.empresaDesarrollo=empresaDesarrollo;
        this.anioLanzamiento=anioLanzamiento;
        this.norma = norma;
        this.chipeadaONo = chipeadaONo;
        this.tamanioMemoryCard = tamanioMemoryCard;
    }

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public boolean isChipeadaONo() {
        return chipeadaONo;
    }

    public void setChipeadaONo(boolean chipeadaONo) {
        this.chipeadaONo = chipeadaONo;
    }

    public double getTamanioMemoryCard() {
        return tamanioMemoryCard;
    }

    public void setTamanioMemoryCard(double tamanioMemoryCard) {
        this.tamanioMemoryCard = tamanioMemoryCard;
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
    
    public void leerDvd(String nombreJuego){
        cargarJuego();
        System.out.println("Leyendo DVD... "+nombreJuego);
    }
    
    public void grabarEnMemory(){
        System.out.println("Se guardó correctamente el juego en la memory card ");
    }
    
}
