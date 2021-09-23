/*
     * Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de los 
     * mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3-supervisor.
     * a)  Los repositores cobran $15.890 + un bono de 10%.
     * b)  Los cajeros cobran $25.630,89 fijos.
     * c)  Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación.
     * Se necesita una aplicación  que, dependiendo el tipo de empleado del que  se trate, calcule y 
     * muestre en pantalla el correspondiente sueldo.
 */
package guiadeejercicios1;

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
        // TODO code application logic here
       double sueldorepositor=15890;
       double sueldocajero=25630.89;
       double sueldosupervisor=35560.20;
       String puesto;
       //puesto="supervisor";
       Scanner sc = new Scanner(System.in);
	
        System.out.println("Puestos: ");
        System.out.println("Repositor");
        System.out.println("Cajero");
        System.out.println("Supervisor");
        System.out.println("***************************");
        System.out.println("Ingrese puesto: ");
	puesto=sc.next();
        System.out.println("***************************");
        System.out.println("Su puesto es: "+puesto);
       
       switch(puesto){
           case "Repositor":
               System.out.println("El sueldo es: "+(sueldorepositor+(sueldorepositor*0.10)));
                break;
           
           case "Cajero":
               System.out.println("El sueldo es: "+sueldocajero);
                break;
                
           case "Supervisor":
               System.out.println("El sueldo es: "+(sueldosupervisor-(sueldosupervisor*0.11)));
                break;
                
           default:
               System.out.println("Puesto erroneo");
       }
        
    }
    
}
