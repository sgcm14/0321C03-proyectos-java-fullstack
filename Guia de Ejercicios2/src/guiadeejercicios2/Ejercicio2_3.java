/*
 * En la ciudad de Oberá, Misiones se realiza año a año la “Maratón del Inmigrante” en el 
 * marco de la Fiesta Nacional del Inmigrante. El evento cuenta con un día de inscripciones 
 * el día anterior a la carrera, por lo que se desconoce la cantidad exacta de inscriptos 
 * que puede llegar a haber. Desde la Federación de Colectividades (Organismo que organiza), 
 * manifestaron que se solicitan los siguientes datos para la inscripción de cada participante: 
 * dni, nombre, apellido y edad.
 *  En cuanto a las categorías posibles para una inscripción, se manejan las siguientes:
 *      - a. Menores A (de 6 a 10 años)
 *      - b. Menores B (de 11 a 17 años)
 *      - c. Juveniles (de 18 a 30 años)
 *      - d. Adultos (de 31 a 50 años)
 *      - e. Adultos mayores (mayores de 50 años)
 *  Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante, 
 *  se muestre por pantalla a qué categoría debe ser inscripto. Cabe destacar que, al finalizar 
 *  el día, para dar fin a las inscripciones, se debe ingresar un dni con el valor 0 y un nombre 
 *  con la palabra “fin”.
 */
package guiadeejercicios2;

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
        String dni,nombre,apellido,categoria="";
        int edad;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Ingrese su DNI:");
        dni=sc.next();
        System.out.println("Ingrese su NOMBRE:");
        nombre=sc.next();
        System.out.println("Ingrese su APELLIDO:");
        apellido=sc.next();
        System.out.println("Ingrese su EDAD:");
        edad=sc.nextInt();
            if(edad>=6 && edad<=10){
                categoria="Menores A";
            }
            else if(edad>=11 && edad<=17){
                categoria="Menores B";
            }
            else if(edad>=18 && edad<=30){
                categoria="Juveniles";
            }
            else if(edad>=31 && edad<=50){
                categoria="Adultos";
            }
            else if(edad>50){
                categoria="Adultos Mayores";
            }
            else{
                categoria="NO TIENE";
            }
            
            System.out.println("Su nombre es: "+nombre+" "+apellido);
            System.out.println("Su edad es: "+edad);
            System.out.println("Su categoría es: "+categoria);
        
        while(!dni.equals("0")&& !nombre.equals("fin") ){
            System.out.println("Ingrese su DNI:");
            dni=sc.next();
            System.out.println("Ingrese sus NOMBRE:");
            nombre=sc.next();
            System.out.println("Ingrese sus APELLIDO:");
            apellido=sc.next();
            System.out.println("Ingrese su EDAD:");
            edad=sc.nextInt();
            
            if(edad>=6 && edad<=10){
                categoria="Menores A";
            }
            else if(edad>=11 && edad<=17){
                categoria="Menores B";
            }
            else if(edad>=18 && edad<=30){
                categoria="Juveniles";
            }
            else if(edad>=31 && edad<=50){
                categoria="Adultos";
            }
            else if(edad>50){
                categoria="Adultos Mayores";
            }
            else{
                categoria="NO TIENE";
            }
            
            System.out.println("Su nombre es: "+nombre+" "+apellido);
            System.out.println("Su edad es: "+edad);
            System.out.println("Su categoría es: "+categoria);
        }
    }
    
}
