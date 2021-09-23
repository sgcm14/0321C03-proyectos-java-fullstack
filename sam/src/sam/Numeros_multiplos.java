/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sam;

import java.util.Scanner;

/**
 *
 * @author sgcm14
 */
public class Numeros_multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado una secuencia de 20 numero, mostrar los 3 primeros números múltiplos de 3.
        
        int numero=0,n=0;
        int numeros[]= new int [20];
        
        
        while(n<20){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese número: ");
            numero=sc.nextInt();
            if(numero%3==0) {
                    numeros[n]=numero;
               System.out.println("Es múltiplo de 3");
               System.out.println("---------------------");  
            }else {
                    numeros[n]=1;
               System.out.println("No es múltiplo de 3");
               System.out.println("---------------------");
            }
            n++;
        }
        
        System.out.println("---------------------");
        System.out.println("Los 3 primeros números múltiplos de 3 son: ");
        for(int i=0;i<numeros.length;i++){
            if(!(numeros[i]==1)){
                 System.out.println(numeros[i]);
            }
        }
    }
    
}
