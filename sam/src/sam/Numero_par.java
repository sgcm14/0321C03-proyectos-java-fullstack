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
public class Numero_par {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dado el numero 234 Mostrar por la salida si dicho número es o no par.
			int numero;
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese número: ");
	numero=sc.nextInt();
	System.out.println("---------------------");
	if(numero%2==0) {
		System.out.println("Es par");
	}else {
	System.out.println("Es impar");}
    }
    
}
