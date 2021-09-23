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
public class Ejercicio1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que permita la carga de 10 números en un vector. Una vez cargados, 
        // se necesita que el programa determine cual es el mayor y cuál es el menor de ellos.
        
        int numeros [] = new int [10];
        int numero=0, maximo=-999999, minimo=999999; 
        //maximo=minimo=numeros[0];
        
        Scanner teclado= new Scanner(System.in);
        
        
        for (int i=0; i<numeros.length;i++)
        {
            System.out.println("Ingrese número");
            numero=teclado.nextInt();
            numeros[i]=numero;
        }
                
        
        for (int i=0; i<numeros.length;i++)
        {
            if (numeros[i]>maximo){
                maximo=numeros[i];
            }
            if (numeros[i]<minimo){
                minimo=numeros[i];
            }
            System.out.println(numeros[i]);
        }
        
        System.out.println("El número mayor es:"+maximo);
        System.out.println("El número menor es:"+minimo);

 
        
    }
    
}
