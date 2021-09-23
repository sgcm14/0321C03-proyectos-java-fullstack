/*
 * Realizar un programa que muestre en pantalla palabras que sean ingresadas por 
 * teclado hasta que se ingrese la palabra "salir".
 */
package guiadeejercicios2;

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
        //int i = 0;
        String palabra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra para agregarla: ");
	palabra=sc.next();
        System.out.println("*************************************");
        
        while (!palabra.equals("salir")) {
            System.out.println ("La palabra que ingreso fue: "+palabra);
            System.out.println("Ingrese una palabra para agregarla: ");
            palabra=sc.next();
            System.out.println("*************************************");
        }        
    }
    
}
