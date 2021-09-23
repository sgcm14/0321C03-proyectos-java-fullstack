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
public class Suma_numeros_pares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculando la suma de los 10 primeros números pares.
                int   n,suma=0;
        for(n=2;n<=20; n+=2)
        {
            suma=suma+n;
            System.out.println(n);
        }
        System.out.println("La suma es:" + suma);

    }
    
}
