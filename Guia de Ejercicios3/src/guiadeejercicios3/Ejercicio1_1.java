/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeejercicios3;

import java.util.Scanner;

/**
 *
 * @author sgcm14
 */
public class Ejercicio1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llevar a cabo un programa que incluya un vector que almacene los nombres: Alejandra, 
        // Leonardo,  Rosa,  Guillermo,  Gabriel,  Daniel,  Luisa  y  Ludmila.  Realizar  un  recorrido  del 
        // vector para cargar los datos y otro recorrido para mostrar los mismos por pantalla.
        
        String nombres [] = new String [8];
        String nombre="";
        Scanner teclado= new Scanner(System.in);
        
        
        
        for (int i=0; i<nombres.length;i++)
        {
            System.out.println("Ingrese nombre para guardar");
            nombre=teclado.next();
            nombres[i]=nombre;
        }
        
        System.out.println("Los nombres son:");
        for (int i=0; i<nombres.length;i++)
        {
            System.out.println("-"+nombres[i]);
        }
    }
    
}
