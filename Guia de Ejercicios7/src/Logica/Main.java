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
 * Auto
 */
    Auto auto1 =new Auto ("rojo","toyota","deportivo","patente1",4);
    Auto auto2 =new Auto ("azul","mitsubishi","ejecutivo","patente2",4);
    Auto auto3 =new Auto ("negro","toyota","deportivo","patente3",2);
    Auto auto0 = new Auto();
    
        System.out.println(" ");    
        System.out.println("AUTOS:");
        System.out.println(" ");
        System.out.println("Nombre \t\t Material \t Patente");
        System.out.println("****** \t\t ******** \t *******");
        System.out.println(auto1.getMarca()+" \t\t "+auto1.getModelo()+" \t "+auto1.getPatente());
        System.out.println(auto2.getMarca()+"       "+auto2.getModelo()+" \t "+auto2.getPatente());
        System.out.println(auto3.getMarca()+" \t\t "+auto3.getModelo()+" \t "+auto3.getPatente());
        System.out.println("******************************************");
/**
 *
 * Mueble
 */
    Mueble mueble1 = new Mueble("comoda", 100,50,"melamine",2);
    Mueble mueble2 = new Mueble("mesita", 50,50,"caoba",5);
    Mueble mueble3 = new Mueble("estante", 30,50,"triplay",2);
        
        System.out.println(" ");    
        System.out.println("MUEBLES:");
        System.out.println(" ");
        System.out.println("Nombre \t Material");
        System.out.println("****** \t ********");
        System.out.println(mueble1.getNombre()+" \t "+mueble1.getMaterial());
        System.out.println(mueble2.getNombre()+" \t "+mueble2.getMaterial());
        System.out.println(mueble3.getNombre()+"   "+mueble3.getMaterial());
        System.out.println("*******************");
        
        System.out.println(" ");    
        System.out.println("modificando valores.....");
        System.out.println(" ");
        mueble1.setMaterial("madera");
        mueble2.setMaterial("madera");
        mueble3.setMaterial("madera");
        
        System.out.println("Nombre \t Material");
        System.out.println("****** \t ********");
        System.out.println(mueble1.getNombre()+" \t "+mueble1.getMaterial());
        System.out.println(mueble2.getNombre()+" \t "+mueble2.getMaterial());
        System.out.println(mueble3.getNombre()+"   "+mueble3.getMaterial());
        System.out.println("*******************");
 /**
 *
 * Mascota
 */
    
    Mascota mascotas [] = new Mascota[5];
    
    mascotas[0]=new Mascota("Gordita","perro","hembra","beige","largo","shitzuth");
    mascotas[1]=new Mascota("Maylito","perro","macho","beige","corto","shitzuth");
    mascotas[2]=new Mascota("Killer","perro","macho","blanco y negro","corto","mestizo");
    mascotas[3]=new Mascota("Bombacha","conejo","hembra","blanco y marron","corto","clasico");
    mascotas[4]=new Mascota("Bombacho","conejo","macho","blanco","corto","clasico");
    
        System.out.println(" ");    
        System.out.println("MASCOTAS:");
        System.out.println(" ");
        System.out.println("Nombre\t\tEspecie\t\tSexo");
        System.out.println("******\t\t*******\t\t****");
        for(int i=0; i<mascotas.length;i++){
            System.out.println(mascotas[i].getNombre()+"  \t "+mascotas[i].getEspecie()+"\t\t"+mascotas[i].getSexo());
        }
        System.out.println("**************************************");
       
        
        mascotas[0].setNombre("Puquita");
        mascotas[1].setNombre(" Osito ");
        System.out.println(" ");
        System.out.println("Nombre\t\tEspecie\t\tSexo\t\tColor\t\tPelaje\t\tRaza");
        System.out.println("******\t\t*******\t\t****\t\t*****\t\t******\t\t****");
        System.out.println(mascotas[0].getNombre()+"  \t "+mascotas[0].getEspecie()+"\t\t"+mascotas[0].getSexo()+"\t\t"+mascotas[0].getColor()+"\t\t"+mascotas[0].getPelaje()+"\t\t"+mascotas[0].getRaza());
        System.out.println(mascotas[1].getNombre()+"  \t "+mascotas[1].getEspecie()+"\t\t"+mascotas[1].getSexo()+"\t\t"+mascotas[1].getColor()+"\t\t"+mascotas[1].getPelaje()+"\t\t"+mascotas[1].getRaza());
        System.out.println("****************************************************************************************");
        
        
        System.out.println(" ");
        System.out.println("Nombre\t\tEspecie\t\tSexo");
        System.out.println("******\t\t*******\t\t****");
        for(int i=0; i<mascotas.length;i++){
            if(mascotas[i].getEspecie().equals("perro")){
            System.out.println(mascotas[i].getNombre()+"  \t "+mascotas[i].getEspecie()+"\t\t"+mascotas[i].getSexo());
            }
        }
        System.out.println("**************************************");
   

    
    }
    
}
