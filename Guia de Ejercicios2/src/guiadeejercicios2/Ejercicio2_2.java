/*
 * Un niño de primaria necesita realizar 10 cálculos diferentes entre dos números. Para esto 
 * necesita un programa que, para cada cálculo, permita el ingreso de los dos números por separado 
 * al igual que la operación que desea hacer entre ambos. Al mismo tiempo debe poder realizar el 
 * cálculo en cuestión y mostrar el resultado por pantalla.
 *  Por ejemplo: Número 1 = 25 Número 2 = 15 Operador = +
 */
package guiadeejercicios2;

import java.util.Scanner;

/**
 *
 * @author sgcm14
 */
public class Ejercicio2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calculos=0;
        double numero1,numero2,resultado=0;
        String operacion;
        Scanner sc=new Scanner(System.in);
        
        
        while(calculos<10){
            System.out.println("Ingrese el 1er número: ");
            numero1=sc.nextDouble();
            System.out.println("Ingrese el 2do número: ");
            numero2=sc.nextDouble();
            System.out.println("Ingrese la operación: ");
            operacion=sc.next();
            
            switch(operacion){
                case "+":
                    resultado=(numero1+numero2);
                break;
           
                case "-":
                    resultado=(numero1-numero2);
                break;
                
                case "*":
                    resultado=(numero1*numero2);
                break;
                
                case "/":
                    resultado=(numero1/numero2);
                break;
                
                default:
                System.out.println("No existe esa operación");
            
            }
            System.out.println("El resultado de la operación es: "+resultado);
            System.out.println("--------------------------------------------------");
            
            calculos++;
        }
    }
    
}
