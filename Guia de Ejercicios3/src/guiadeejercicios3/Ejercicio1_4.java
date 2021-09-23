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
public class Ejercicio1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Un  empleado  desea  almacenar  en  un  vector  sus  12  sueldos  del  año.  A  partir  de  esto, 
        // necesita un programa que determine y muestre por pantalla la suma total de sus  12 sueldos 
        // y el promedio de sueldo que tuvo en el año.
        
        double sueldos [] = new double [12];
        double numero=0,total=0,promedio=0; 
        
        
        Scanner teclado= new Scanner(System.in);
        
        
        for (int i=0; i<sueldos.length;i++)
        {
            System.out.println("Ingrese sueldo");
            numero=teclado.nextInt();
            sueldos[i]=numero;
        }
                
        System.out.println("************************");
        System.out.println("Sueldo:");
        for (int i=0; i<sueldos.length;i++)
        {
            total=total+sueldos[i];
            promedio=total/sueldos.length;
            System.out.println(sueldos[i]);
        }
        
        System.out.println("La suma total de sus sueldos es :"+total);
        System.out.println("El promedio de sus sueldos es :"+promedio);
    }
    
}
