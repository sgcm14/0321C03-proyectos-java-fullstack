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
public class Ejercicio2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Una compañía de vuelos cuenta con 6 destinos a los que realiza 3 vuelos diariamente, uno 
        // por la mañana, otro  al mediodía y otro por la noche. Para administrar estos datos, utiliza 
        // una matriz, donde cada fila es un destino y  en  cada columna  se  guarda  la cantidad de 
        // asientos disponibles.
        // i.  Se  necesita  un  programa  que  permita  la  carga  de  la  matriz  con  la  cantidad  de 
        //      asientos para cada vuelo.
        // ii.  Al  mismo  tiempo,  el  programa  debe  permitir  a  un  usuario  ingresar  el  número  de 
        //      destino al que quiere dirigirse, el número de vuelo (dependiendo si quiere viajar a la 
        //      mañana, al mediodía o a la noche) y la cantidad de pasajes que necesita. 
        // iii.  A partir de la solicitud del  usuario, el programa debe controlar  si  hay la cantidad 
        //      suficiente de asientos para la cantidad de pasajes que se requiere. En caso de que 
        //      así sea,  se debe mostrar un cartel  por pantalla  que diga  “su reserva  fue realizada 
        //      con éxito” y se debe descontar del total de asientos los solicitados por el usuario. En 
        //      caso de no haber más asientos disponibles, se debe informar otro cartel que diga 
        //      “disculpe, no se pudo completar su operación dado que no hay asientos disponibles”.
        //iv.  Desde  la  compañía  de  vuelos  manifiestan  que  NO  CONOCEN  cuantas 
        //      ventas/reservas se hacen por día. Por lo cual, para finalizar las ventas se ingresa la 
        //      palabra “finish”.
        
        int vuelos[][] = new int[6][3];
        String destinos[] = {"Rio de Janeiro","    Cancún    ", "    Madrid    ", "     Roma     ", "     Milán    ", "    Iguazú    "};
        Scanner teclado=new Scanner(System.in);
        int asientos=0,destino=0,vuelo=0,pasajes=0,pasajeSistema=0,asientosNuevos=0;
        String respuesta="";
        
        //ingresa datos a matriz
        for (int x=0; x < vuelos.length; x++) {
            System.out.println("Ingrese para destino("+(x)+") :"+ destinos[x]);
            for (int y=0; y <vuelos[x].length; y++) {
                System.out.print("Ingrese asientos para turno ("+ (y)+") a guardar: ");
                asientos=teclado.nextInt();
                vuelos[x][y] =asientos;
            }
        }
        
        //imprime datos de matriz
        System.out.println("*************************************************************************");
        System.out.println("******************************Mañana(0)*****Mediodia(1)*****Noche(2)*****");
        for (int x=0; x < vuelos.length; x++) {
            System.out.print(x+" "+destinos[x]+"\t\t");
            for (int y=0; y < vuelos[x].length; y++) {
                System.out.print(vuelos[x][y]+"\t\t");
            }
            System.out.println("");
        }
        System.out.println("*************************************************************************");
        
        
        
        while(!respuesta.equals("finish")){
            asientosNuevos=0;
            
            System.out.println("Ingrese a que destino quiere ir: ");
            destino=teclado.nextInt();
            System.out.println("Ingrese el # de vuelo: ");
            vuelo=teclado.nextInt();
            System.out.println("Ingrese la cantidad de pasajes: ");
            pasajes=teclado.nextInt();


            for (int x=0; x < vuelos.length; x++) {
                for (int y=0; y < vuelos[x].length; y++) {
                    if(x==destino && y==vuelo){
                        pasajeSistema=vuelos[x][y];
                        if(pasajeSistema>=pasajes){
                           asientosNuevos=pasajeSistema-pasajes;
                           vuelos[x][y]=asientosNuevos;
                           System.out.println("Su reserva  fue realizada con éxito ");
                        }
                        else{
                        System.out.println("Disculpe, no se pudo completar su operación dado que no hay asientos disponibles");  
                        }
                    }
                }
            }
            
            System.out.println("¿Va comprar mas pasajes? (si / finish)");
            respuesta=teclado.next();
        }
        
        
        System.out.println("*************************************************************************");
        System.out.println("******************************Mañana(0)*****Mediodia(1)*****Noche(2)*****");
        for (int x=0; x < vuelos.length; x++) {
            System.out.print(x+" "+destinos[x]+"\t\t");
            for (int y=0; y < vuelos[x].length; y++) {
                System.out.print(vuelos[x][y]+"\t\t");
            }
            System.out.println("");
        }
        System.out.println("*************************************************************************");
        
        
        
    }
    
}
