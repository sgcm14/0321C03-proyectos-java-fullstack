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
public class Ejercicio2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llevar a  cabo un programa que permita cargar mediante teclado una matriz de 3 x 3 (3 filas, 
        // 3 columnas) con razas de perros. Una vez cargada,  se debe permitir  al usuario ingresar por 
        // teclado  una  raza  de  perro  que  quiera  buscar;  el  programa  deberá  poder  encontrarla  y 
        // mostrar un mensaje con la posición (fila,  columna) donde la encontró. En caso de que  la 
        // raza de perro no  se encuentre en la matriz,  se deberá informar  la  situación  mediante un 
        // mensaje por pantalla.
        
        String matriz[][] = new String[3][3];
        Scanner teclado=new Scanner(System.in);
        String raza="",buscar="",resultado="",posicion="";
        
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                System.out.println("Ingrese la raza a guardar: ");
                raza=teclado.next();
                matriz[x][y] = raza;
            }
        }
        
        System.out.println("************************************");
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y]+" ");
            }
            System.out.println("");
        }
        System.out.println("************************************");
        
        System.out.println("Ingrese la raza a buscar: ");
        buscar=teclado.next();
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                if(matriz[x][y].equals(buscar)){
                    resultado=matriz[x][y];
                    posicion="La raza se encuentra en: ("+(x)+","+(y)+")";
                }
            }
        }
        if(resultado.length()>2){
            System.out.println(posicion);
        }
        else{
           System.out.println("La raza de perro no se encontró");
        }
    }
    
}
