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
public class Tabla_multiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 3.	Mostrar su Tabla de multiplicar del numero 5.
		int numero=0;
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Ingrese el número: ");
		numero=sc.nextInt();
		
	
		for (int i=1; i<=10;i++) {
		System.out.println(numero +" * "+i+ " = "+ numero*i);
		}
    }
    
}
