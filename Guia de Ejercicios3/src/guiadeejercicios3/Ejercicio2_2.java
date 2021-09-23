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
public class Ejercicio2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llevar a cabo un programa que permita completar con números 1 toda la diagonal principal 
        // de una matriz de 6 x 6. Entiéndase por diagonal principal aquella  que comienza en [0,0] y 
        // termina en [6,6].
        
        int matriz[][] = new int[6][6];
        
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                
                if(x==y){
                matriz[x][y] = 1;  
                }
                else{
                matriz[x][y] = 0;
                }
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
