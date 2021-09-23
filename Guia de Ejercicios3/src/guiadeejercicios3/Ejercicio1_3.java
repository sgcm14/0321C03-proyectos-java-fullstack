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
public class Ejercicio1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que permita la carga de 15 números en un vector. Una vez cargados, 
        // se  necesita  que  el  programa  cuente  e  informe  por  pantalla  cuántas  veces  se  cargó  el 
        // número 3.
        
         int numeros [] = new int [15];
        int numero=0,contador=0; 
        
        
        Scanner teclado= new Scanner(System.in);
        
        
        for (int i=0; i<numeros.length;i++)
        {
            System.out.println("Ingrese número");
            numero=teclado.nextInt();
            numeros[i]=numero;
        }
                
        System.out.println("************************");
        for (int i=0; i<numeros.length;i++)
        {
            if (numeros[i]==3){
                contador=contador+1;
            }
            
            System.out.println(numeros[i]);
        }
        
        System.out.println("El número 3 se ingreso :"+contador+" veces");
    }
    
}
