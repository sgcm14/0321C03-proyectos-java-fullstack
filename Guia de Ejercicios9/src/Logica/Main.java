package Logica;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Nintendo:");
        Nintendo64 nintendo = new Nintendo64(123,"Consola 1","Sony",1990,"norma1", true);
        nintendo.leerCartucho("Mario");
        System.out.println("*********************************************************************");
        System.out.println("");
        
        System.out.println("Play:");
        PlayStation2 play = new PlayStation2();
        play.leerDvd("Crash");
        play.grabarEnMemory();
        System.out.println("*********************************************************************");
        System.out.println("");
        
        System.out.println("Xbox:");
        XboxOne xbox = new XboxOne ();
        xbox.leerJuegoDigital("King Kong");
        System.out.println("*********************************************************************");
        
        System.out.println("");
        System.out.println("Pokemones: ");
        
        Pokemon pokemones [] = new Pokemon [4];
        pokemones[0]= new Pikachu("Pikachu");
        pokemones[1]= new Charmander("Charmander");
        pokemones[2]= new Bulbasaur("Bulbasaur");
        pokemones[3]= new Squirtle("Squirtle");
        
        Pikachu pika= new Pikachu("Pikachu");
        Charmander charman= new Charmander("Charmander");
        Bulbasaur bulba = new Bulbasaur("Bulbasaur");
        Squirtle squi= new Squirtle("Squirtle");
        
        
        System.out.println("****************************************************");
        for(int i=0; i<pokemones.length;i++){
            pokemones[i].atacarArañazo();
            pokemones[i].atacarMordisco();
            pokemones[i].atacarPlacaje();
            if(pokemones[i].nombrePokemon.equals("Pikachu")){
                pika.atacarImpactrueno();
                pika.atacarPunioTrueno();
                pika.atacarRayo();
                pika.atacarRayoCarga();
            }
            else if(pokemones[i].nombrePokemon.equals("Charmander")){
                charman.atacarPunioFuego();
                charman.atacarAscuas();
                charman.atacarLanzallamas();
            }
            else if(pokemones[i].nombrePokemon.equals("Bulbasaur")){
                bulba.atacarDrenaje();
                bulba.atacarHojaAfilada();
                bulba.atacarLatigoCepa();
                bulba.atacarParalizar();
            }
            else if(pokemones[i].nombrePokemon.equals("Squirtle")){
                squi.atacarBurbuja();
                squi.atacarHidrobomba();
                squi.atacarHidropulso();
                squi.atacarPistolaAgua();
            }
            System.out.println("****************************************************");
        }
        
            
    
    }
}
