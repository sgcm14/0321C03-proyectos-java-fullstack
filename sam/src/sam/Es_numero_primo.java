/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sam;

/**
 *
 * @author sgcm14
 */
public class Es_numero_primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado el numero 23 determinar si es o no es primo
        int n;
        n=23;
        if (n%1==0 && n%n==0 && n%2!=0){
            System.out.println("El numero "+ n +" es primo");
        }
        else{
            System.out.println("El numero "+ n +" no es primo");
        }

    }
    
}
