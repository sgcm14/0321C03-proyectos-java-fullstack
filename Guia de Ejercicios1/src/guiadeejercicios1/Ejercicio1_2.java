/*
     * Realizar un programa que permita el intercambio de valores entre dos variables. Por ejemplo: 
     * Si  una  variable  numero  vale  35,  y  una  variable  numero2  vale  20,  realizar  las  acciones 
     * necesarias para que numero pase a valer 20 y numero2 pase a valer 35. Una vez realizado el 
     * cambio mostrar el resultado por pantalla.
 */
package guiadeejercicios1;

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
        // TODO code application logic here
        int numero,numero2,variable;
        //numero=35;
        //numero2=20;
        Scanner sc = new Scanner(System.in);
	
        System.out.println("Ingrese 1° número: ");
	numero=sc.nextInt();
        System.out.println("Ingrese 2° número: ");
	numero2=sc.nextInt();
        
        System.out.println("Valor de número: "+numero);
        System.out.println("Valor de número2: "+numero2);
        variable=numero;//35
        numero=numero2;//20
        numero2=variable;
        System.out.println("******************************");
        System.out.println("Cambio de valores");
        System.out.println("******************************");
        System.out.println("Valor de número: "+numero);
        System.out.println("Valor de número2: "+numero2);
        
        
    }
    
}
