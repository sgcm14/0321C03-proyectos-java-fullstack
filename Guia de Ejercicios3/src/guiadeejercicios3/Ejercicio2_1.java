/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadeejercicios3;

/**
 *
 * @author sgcm14
 */
public class Ejercicio2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llevar a cabo un programa que permite cargar completamente con números 5 una matriz 
        // de 4x5 (4 filas, 5 columnas).
        
        int matriz[][] = new int[4][5];
        
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                matriz[x][y] = 5;
            }
        }
        
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y]+" ");
            }
            System.out.println("");
        }
        
    }
    
}
