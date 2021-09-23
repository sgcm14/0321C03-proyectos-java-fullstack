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
public class Promedio_notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado 3 notas al azar mostrar la suma y promedio de las notas.
          int a,b,c,suma,promedio;
            a=12;
            b=15;
            c=10;
            suma=(a+b+c);
            promedio=((a+b+c)/3);
          System.out.println("La suma de las notas es:" + suma);
          System.out.println("El promedio de las notas es:" + promedio);

    }
    
}
