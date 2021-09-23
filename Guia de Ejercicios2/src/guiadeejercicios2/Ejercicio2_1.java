/*
 * Un gerente de una empresa prestadora de servicios de internet necesita un programa que 
 * permita realizar el cálculo del monto a pagar de la factura de consumo de internet de 5 clientes 
 * de una empresa. Para ello, el algoritmo debe solicitar por teclado dos datos: DNI del cliente y 
 * el tipo de servicio. Los tipos de servicio son 3:
 *	- a. Internet 30 megas (cuyo valor es de $890 – 10% de descuento)
 *	- b. Internet 50 megas (Cuyo valor es de $1050 – 5% de descuento)
 *	- c. Internet 100 megas (Cuyo valor fijo es de $1600)
 *	El programa debe poder calcular el monto a pagar (dependiendo del tipo de servicio con el que 
 *      cuente el cliente) e informar por pantalla el DNI del mismo junto con el monto a pagar y el número de 
 *      servicio con el que cuenta.
 */
package guiadeejercicios2;

import java.util.Scanner;

/**
 *
 * @author sgcm14
 */
public class Ejercicio2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nroClientes=5;
        double pago =0;
        String dni, tipoServicio,servicio="";
        Scanner sc=new Scanner(System.in);
        
        
        while(nroClientes>0){
            System.out.println("******************************");
            System.out.println("TIPOS DE SERVICIO: ");
            System.out.println("1-Internet 30 megas ");
            System.out.println("2-Internet 50 megas ");
            System.out.println("3-Internet 100 megas ");
            System.out.println("******************************");
            System.out.println("Ingrese el DNI del cliente: ");
            dni=sc.next();
            System.out.println("Ingrese el tipo de servicio: ");
            tipoServicio=sc.next();
            switch(tipoServicio){
                case "1":
                    pago=890-(890*0.10);
                    servicio="Internet 30 megas";
                break;
           
                case "2":
                    pago=1050-(1050*0.05);
                    servicio="Internet 50 megas";
                break;
                
                case "3":
                    pago=1600;
                    servicio="Internet 100 megas";
                break;
                
                default:
                System.out.println("No existe ese servicio");
            
            }
            System.out.println("-----------------------------------------");
            System.out.println("            BOLETA A PAGAR");
            System.out.println("-----------------------------------------");
            System.out.println("El DNI  del cliente es: "+dni);
            System.out.println("El TIPO DE SERVICIO es: "+servicio);
            System.out.println("El TOTAL A PAGAR es: "+pago);
            System.out.println("-----------------------------------------");
            nroClientes--;
        }
    }
    
}
