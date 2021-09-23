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
public class Fruta {
    private String nombre;
    private String color;
    private double calorias;
    private String tipoCascara;
    private boolean esCosmetible;

    public Fruta() {
    }

    public Fruta(String nombre, String color, double calorias, String tipoCascara, boolean esCosmetible) {
        this.nombre = nombre;
        this.color = color;
        this.calorias = calorias;
        this.tipoCascara = tipoCascara;
        this.esCosmetible = esCosmetible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public String getTipoCascara() {
        return tipoCascara;
    }

    public void setTipoCascara(String tipoCascara) {
        this.tipoCascara = tipoCascara;
    }

    public boolean isEsCosmetible() {
        return esCosmetible;
    }

    public void setEsCosmetible(boolean esCosmetible) {
        this.esCosmetible = esCosmetible;
    }
    
    
    
}
