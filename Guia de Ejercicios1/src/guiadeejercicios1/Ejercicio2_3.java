/*
     * Un instituto de inglés desea informar a sus alumnos los días y horarios  de  sus clases. Para 
     * ello, decidió la creación de una aplicación que, a partir del ingreso d e la edad del alumno, le 
     * informe  en qué días y horarios los alumnos  tienen clases. Como información, la academia 
     * proporciona los siguientes datos respecto a los grupos y los diferentes horarios.
     * a) Kinder (de 4 a 6 años inclusive): Lunes y Miércoles de 16 a 17
     * b)  1st year (de 7 a 8 años inclusive): Martes y Jueves de 16:30 a 17:30
     * c) 2nd year (de 9 a 10 años inclusive): Martes y Jueves de 17:30 a 19
     * d)  3rd year (de 11 a 13 años inclusive): Lunes y Miércoles de 17 a 18:30
     * Realizar  el  programa  solicitado  por  el  instituto,  donde  a  partir  del  ingreso  de  la  EDAD  del 
     * alumno, el sistema informe por pantalla los días y horarios de cursada.
 */
package guiadeejercicios1;

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
        // TODO code application logic here
        
        int edad=0;
        //edad=14;
        Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese edad del alumno: ");
        edad=sc.nextInt();
        
        if(edad>=4 && edad<=6){
          System.out.println("Lunes y Miércoles de 16:00 a 17:00 ");
          System.out.println("Kinder ");
        }
        else if(edad>=7 && edad<=8){
          System.out.println("Martes y Jueves de 16:30 a 17:30 ");
          System.out.println("1st year ");
        }
        else if(edad>=9 && edad<=10){
          System.out.println("Martes y Jueves de 17:30 a 19:00 ");
          System.out.println("2nd year ");
        }
        else if(edad>=11 && edad<=13){
          System.out.println("Lunes y Miércoles de 17:00 a 18:30 ");
          System.out.println("3rd year ");
        }
        else{
            System.out.println("No existe grado para esa edad");;
        }
    }
    
}
