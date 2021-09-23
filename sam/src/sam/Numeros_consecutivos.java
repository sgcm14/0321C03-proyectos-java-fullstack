/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sam;

/**
 *
 * @author sgcm14
 */
public class Numeros_consecutivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado los 5 primeros números consecutivos, mostrar el mayor y menor de ellos
       int a,b,c,d,e;
        a=1;
        b=2;
        c=3;
        d=4;
        e=5;
        
        if(a>b && a>c && a>d && a>e){
            System.out.println("El numero mayor es:"+ a);
        }
        else if (b>a && b>c && b>d && b>e){
            System.out.println("El numero mayor es:"+ b);
        }
        else if (c>a && c>b && c>d && c>e){
            System.out.println("El numero mayor es:"+ c);
        }
        else if (d>a && d>b && d>c && d>e){
            System.out.println("El numero mayor es:"+ d);
        }
        else if (e>a && e>b && e>c && e>d){
            System.out.println("El numero mayor es:"+ e);
        }


        if(a<b && a<c && a<d && a<e){
            System.out.println("El numero menor es:"+ a);
        }
        else if (b<a && b<c && b<d && b<e){
            System.out.println("El numero menor es:"+ b);
        }
        else if (c<a && c<b && c<d && c<e){
            System.out.println("El numero menor es:"+ c);
        }
        else if (d<a && d<b && d<c && d<e){
            System.out.println("El numero menor es:"+ d);
        }
        else if (e<a && e<b && e<c && e<d){
            System.out.println("El numero menor es:"+ e);
        }

    
    }
    
}
