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
public class Ejercicio1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // En  tres vectores diferentes  se guardan los  nombres,  temperaturas  mínimas  y  máximas
        // de 5 ciudades de la provincia de  Misiones. En el primer vector se guardan los nombres de 
        // las  ciudades,  en  el  segundo  las  temperaturas  mínimas  alcanzadas  y  en  el  tercero  las 
        // temperaturas  máximas  alcanzadas  en  la  última  semana.  Se  necesita  un  programa  que 
        // permita la carga de las ciudades, sus temperaturas mínimas y máximas; además, deberá 
        // poder informar por pantalla cual fue la ciudad con la temperatura más baja y cual con la 
        // temperatura más alta (dando a conocer al mismo tiempo la cantidad de grados).
        
         String ciudades [] = new String [5];
         int tminimas [] = new int [5];
         int tmaximas [] = new int [5];
         String ciudad="";
         int tempmax=0,tempmin=0,maximo=-999999, minimo=999999,cmaxima=0,cminima=0;
                
        Scanner teclado= new Scanner(System.in);
        
        
        for (int i=0; i<ciudades.length;i++)
        {
            System.out.println("Ingrese ciudad "+i);
            ciudad=teclado.next();
            ciudades[i]=ciudad;
            
            System.out.println("Ingrese temperatura minima para ciudad "+i);
            tempmin=teclado.nextInt();
            tminimas[i]=tempmin;
            
            System.out.println("Ingrese temperatura maxima para ciudad "+i);
            tempmax=teclado.nextInt();
            tmaximas[i]=tempmax;
        }
        
        System.out.println("*******************************");
        
        for (int i=0; i<ciudades.length;i++)
        {
            if (tmaximas[i]>maximo){
                maximo=tmaximas[i];
                cmaxima=i;
            }
            if (tminimas[i]<minimo){
                minimo=tminimas[i];
                cminima=i;
            }
            
            System.out.println(ciudades[i]+" "+tminimas[i]+" "+tmaximas[i]);            
           // System.out.println(tminimas[i]);
           // System.out.println(tmaximas[i]);
            
        }
        
        System.out.println("*******************************");
        System.out.println("La ciudad con la temperatura maxima es: "+ ciudades[cmaxima] +" con temperatura: "+maximo);
        System.out.println("La ciudad con la temperatura minimo es: "+ ciudades[cminima] +" con temperatura: "+minimo);
    }
    
    
}
