/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeejercicios3;

import java.util.Scanner;

/**
 *
 * @author sgcm14
 */
public class Ejercicio2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundario. 
        // Cada fila corresponde a las notas y al promedio de cada alumno.
        // i.  Se  necesita  un  programa  que  permita  a  un  profesor  cargar  en  las  3  primeras 
        //      posiciones de cada fila las notas del alumno y que en la última columna se calculen 
        //      los promedios.
        // ii.  Una vez realizados los cálculos, se desea mostrar las 3 notas de cada alumno y el 
        //      promedio correspondiente recorriendo la matriz.
        
        double notas[][] = new double[4][4];
        Scanner teclado=new Scanner(System.in);
        double nota=0,suma=0,promedio=0;
        
        for (int x=0; x < notas.length; x++) {
            System.out.println("Ingrese las nota del alumno ("+(x)+") :");
            suma=0;
            for (int y=0; y < 3; y++) {
                System.out.print("Ingrese la nota ("+ (y)+") a guardar: ");
                nota=teclado.nextDouble();
                notas[x][y] = nota;
                suma=suma+notas[x][y];
                promedio=suma/3;
            }
            notas[x][3]=promedio;
        }
        
        System.out.println("***********************************************************");
        System.out.println("**********Nota(1)**Nota(2)**Nota(3)********Promedio********");
        for (int x=0; x < notas.length; x++) {
            System.out.print("Alumno("+(x)+")  ");
            for (int y=0; y < notas[x].length; y++) {
                System.out.print(notas[x][y]+"     ");
            }
            System.out.println("");
        }
        System.out.println("***********************************************************");
    }
    
}
