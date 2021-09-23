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
public abstract class Consola {
    protected int codigoConsola;
    protected String nombre;
    protected String empresaDesarrollo;
    protected int anioLanzamiento;
    
    public abstract void cargarJuego ();
}
