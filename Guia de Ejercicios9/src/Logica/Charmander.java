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
public class Charmander  extends Pokemon implements IFuego{

    public Charmander(String nombrePokemon) {
        this.nombrePokemon=nombrePokemon;
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public double getPesoPokemon() {
        return pesoPokemon;
    }

    public void setPesoPokemon(double pesoPokemon) {
        this.pesoPokemon = pesoPokemon;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getTemporadaQueAparece() {
        return temporadaQueAparece;
    }

    public void setTemporadaQueAparece(int temporadaQueAparece) {
        this.temporadaQueAparece = temporadaQueAparece;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void atacarPlacaje() {
        System.out.println("Soy "+nombrePokemon+" y estoy atacando con Placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Soy "+nombrePokemon+" y estoy atacando con Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy "+nombrePokemon+"  y estoy atacando con Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy "+nombrePokemon+" y estoy atacando con Puño Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy "+nombrePokemon+" y estoy atacando con Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy "+nombrePokemon+" y estoy atacando con Lanzallamas");
    }
    
}
