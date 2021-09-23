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
public class Mayor_numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dado los números 56, 34, 120  Mostrar el mayor de ellos.
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese 1° número: ");
		int n1=sc.nextInt();
		System.out.println("Ingrese 2° número: ");
		int n2=sc.nextInt();
		System.out.println("Ingrese 3° número: ");
		int n3=sc.nextInt();
	if(n1>n2 && n1>n3) {
		System.out.println("El mayor es "+n1);
	}
	else if(n2>n1 && n2>n3) {
		System.out.println("El mayor es "+n2);
	}
	else if(n3>n1 && n3>n2) {
		System.out.println("-------------------");
		System.out.println("El mayor es "+n3);
	}
    }
    
}
