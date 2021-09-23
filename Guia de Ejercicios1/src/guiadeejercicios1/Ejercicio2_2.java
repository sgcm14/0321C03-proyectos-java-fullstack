/*
     * Una mercería vende canutillos y mostacillas al por mayor mediante su página web. Como se 
     * trata de una mercería mayorista, solicita la cantidad de paquetes en cada venta y dependiendo 
     * de esta realiza los siguientes controles:
     * a)  Si la cantidad de productos es menor a 5: Se debe emitir un mensaje indicando que no se 
     *     permiten compras inferiores a 5 productos.
     * b)  Si la cantidad de productos es mayor o igual a 5 pero menor o igual a 15: Se debe emitir un 
     *     mensaje que el costo de envío es de $200.
     * c)  Si la cantidad de productos es mayor o igual a 5 y es mayor a 15: Se debe emitir un mensaje 
     *     de que el envío es gratuito.
     * Realizar el programa necesario para llevar a cabo los 3 controles citados.
 */
package guiadeejercicios1;

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
        // TODO code application logic here
        int cantidad=0;
        
        //cantidad=31;
        Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese cantidad: ");
	cantidad=sc.nextInt();
        
        if(cantidad<5){
            System.out.println("No se permiten compras inferiores a 5 productos");
        }
        else if(cantidad>=5 && cantidad <=15){
            System.out.println("El costo de envío es de $200");
        }
        else if (cantidad>=5 && cantidad >15){
            System.out.println("el envío es gratuito");
        }
    }
    
}
