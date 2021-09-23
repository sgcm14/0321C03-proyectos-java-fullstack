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
public abstract class Pokemon {
    protected int numPokedex;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected boolean sexo;
    protected int temporadaQueAparece;
    protected String tipo;
    
    public abstract void atacarPlacaje ();
    public abstract void atacarArañazo ();
    public abstract void atacarMordisco ();
}
