/*
 * Realizar un programa que dado por teclado un límite numérico (por ejemplo 100) 
 * muestre en pantalla todos los números hasta ese límite (empezando por 1).
 */
package guiadeejercicios2;

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
         Scanner sc = new Scanner(System.in);
	
        System.out.println("Ingrese un número: ");
	int n=sc.nextInt();
        System.out.println("************************");
        
        for(int i=1; i<=n;i++){
            System.out.println(i);
        }
    }
    
}
