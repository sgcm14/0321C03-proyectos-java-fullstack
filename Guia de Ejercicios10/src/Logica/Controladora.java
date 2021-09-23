package Logica;

import Persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis= new ControladoraPersistencia();
    
    public void altaMascota(int num_cliente, String nombre_perro, String raza, String color, String alergico, String atencion_especial, String nombre_duenio, String celular_duenio, String observaciones){
    
     Mascota masc = new Mascota();
     masc.setNum_cliente(num_cliente);
     masc.setNombre_perro(nombre_perro);
     masc.setRaza(raza);
     masc.setColor(color);
     masc.setAlergico(alergico);
     masc.setAtencion_especial(atencion_especial);
     masc.setNombre_duenio(nombre_duenio);
     masc.setCelular_duenio(celular_duenio);
     masc.setObservaciones(observaciones);
            
      controlPersis.altaMascota(masc);
    }
}
