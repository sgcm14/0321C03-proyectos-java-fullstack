package Logica;

/**
 *
 * @author sgcm14
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/**
 *
 * VideoJuego
 */

    VideoJuego videoJuegos [] = new VideoJuego [5];
    
    videoJuegos[0]= new VideoJuego(1,"Mario Bross", "Nintendo 64", 2, "adventure");
    videoJuegos[1]= new VideoJuego(2,"   Crash  ", "Play Station 2", 4, "adventure");
    videoJuegos[2]= new VideoJuego(3,"Pacman", "Nintendo 64", 3, "arcade");
    videoJuegos[3]= new VideoJuego(4,"Just Dance", "Play Station 3", 5, "baile");
    videoJuegos[4]= new VideoJuego(5,"Mario Bross 2", "Play Station", 2, "arcade");

        System.out.println(" ");    
        System.out.println("VIDEOJUEGOS:");
        System.out.println(" ");
        System.out.println("Titulo\t\tConsola  \t\tCant. de Jugadores");
        System.out.println("***********\t***************\t\t*****************");
        for(int i=0; i<videoJuegos.length;i++){
            System.out.println(videoJuegos[i].getTitulo()+"  \t "+videoJuegos[i].getConsola()+"\t\t"+videoJuegos[i].getCantidadJugadores());
        }
        System.out.println("********************************************************");

        videoJuegos[1].setTitulo("Kin Kong");
        videoJuegos[2].setTitulo("Mario Bross 3");
        videoJuegos[1].setCantidadJugadores(3);
        videoJuegos[2].setCantidadJugadores(4);
        System.out.println(" ");    
        System.out.println("VIDEOJUEGOS:");
        System.out.println(" ");
        System.out.println("Titulo\t\tConsola  \t\tCant. de Jugadores");
        System.out.println("***********\t***************\t\t*****************");
        for(int i=0; i<videoJuegos.length;i++){
            System.out.println(videoJuegos[i].getTitulo()+"  \t "+videoJuegos[i].getConsola()+"\t\t"+videoJuegos[i].getCantidadJugadores());
        }
        System.out.println("********************************************************");
        
        
        System.out.println(" ");    
        System.out.println("VIDEOJUEGOS:");
        System.out.println(" ");
        System.out.println("Titulo\t\tConsola  \t\tCant. de Jugadores");
        System.out.println("***********\t***************\t\t*****************");
        for(int i=0; i<videoJuegos.length;i++){
            if(videoJuegos[i].getConsola().equals("Nintendo 64")){
            System.out.println(videoJuegos[i].getTitulo()+"  \t "+videoJuegos[i].getConsola()+"\t\t"+videoJuegos[i].getCantidadJugadores());
            }
        }
        System.out.println("********************************************************");
    
/**
 *
 * Fruta
 */
        Fruta frutas [] = new Fruta[5];
        
        frutas[0]= new Fruta("naranja","anaranjado",15,"dura",true);
        frutas[1]= new Fruta(" pera ","verde",10,"dura",true);
        frutas[2]= new Fruta("guanabana","verde",15,"blanda",true);
        frutas[3]= new Fruta("plátano","amarillo",20,"blanda",true);
        frutas[4]= new Fruta("mandarina","anaranjado",15,"blanda",true);
    
        System.out.println(" ");    
        System.out.println("FRUTAS:");
        System.out.println(" ");
        System.out.println("Nombre\t\tCalorias");
        System.out.println("***********\t***************");
        for(int i=0; i<videoJuegos.length;i++){
            System.out.println(frutas[i].getNombre()+"  \t "+frutas[i].getCalorias());
        }
        System.out.println("********************************************************");
        
        frutas[0].setNombre("  uva  ");
        frutas[0].setColor("verde");
        frutas[0].setCalorias(5);
        frutas[0].setTipoCascara("suave");
        frutas[0].setEsCosmetible(true);
        
        frutas[2].setNombre(" coco ");
        frutas[2].setColor("marron");
        frutas[2].setCalorias(15);
        frutas[2].setTipoCascara("duro");
        frutas[2].setEsCosmetible(false);
        System.out.println(" ");    
        System.out.println("FRUTAS:");
        System.out.println(" ");
        System.out.println("Nombre\t\tCalorias");
        System.out.println("***********\t***************");
        for(int i=0; i<videoJuegos.length;i++){
            System.out.println(frutas[i].getNombre()+"  \t "+frutas[i].getCalorias());
        }
        System.out.println("********************************************************");
   
        System.out.println(" ");    
        System.out.println("FRUTAS:");
        System.out.println(" ");
        System.out.println("Nombre\t\tCalorias");
        System.out.println("***********\t***************");
        for(int i=0; i<videoJuegos.length;i++){
            if(frutas[i].getColor().equals("verde")){
            System.out.println(frutas[i].getNombre()+"  \t "+frutas[i].getCalorias());
            }
        }
        System.out.println("********************************************************");

/**
 *
 * Planta
 */        
        Arbol arbol= new Arbol("alto","grueso", 12.5,"blanco","redondas","roble",10.50,true,"invierno");
        Flor flor = new Flor("rojo",10,"amarillo","amazonica","verano","girasol",15.03,true,"otoño");
        Arbusto arbusto = new Arbusto(5.20,false,"americano","azules",true,"Arbustillo",30.2,true,"verano");
       
       System.out.println(" ");    
       System.out.println("PLANTAS:");
       System.out.println(" "); 
       System.out.println(arbol.mostrarMensaje());
       System.out.println(flor.mostrarMensaje());
       System.out.println(arbusto.mostrarMensaje());
    
/**
 *
 * Vehiculo
 */  

        Vehiculo vehiculos[] = new Vehiculo[9];
        vehiculos[0]=new Auto("Cuero", 2, "patente1", 5, "grande", "rojo", "hyunday", "deportivo", 2);
        vehiculos[1] = new Auto("Tela", 3, "patente2", 5, "pequeño", "azul", "toyota", "clasico", 4);
        vehiculos[2] = new Auto("Cuero", 4, "patente3", 5, "mediano", "verde", "hyunday", "deportivo", 4);
        vehiculos[3] = new Moto(10.1, "plastico", "patente1", 4, "gas", "negro", "honda", "ejecutivo", 1);
        vehiculos[4] = new Moto(20.5, "hule", "patente2", 2, "gas", "azul", "honda", "ejecutivo", 1);
        vehiculos[5] = new Moto(8.2, "plastico", "patente3", 1, "combustible", "verde", "hitek", "profesional", 1);
        vehiculos[6] = new Colectivo(false, "posee", "colectivo", "patente1", 9, "pequeño", "blanco", "bosch", "publico", 10);
        vehiculos[7] = new Colectivo(true, "no posee", "colectivo", "patente2", 9, "mediano", "rojo", "bosch", "publico", 8);
        vehiculos[8] = new Camion(true, 2, "patente1", 8, "grande", "blanco", "volskvage", "publico", 2);
       
        
        System.out.println("Autos: ");
        for(int i=0; i<vehiculos.length;i++){
            System.out.println(vehiculos[i].mostrarMensaje());
        }
        
    }
    
}
