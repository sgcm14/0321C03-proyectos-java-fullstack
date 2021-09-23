package Persistencia;

import Logica.Mascota;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    MascotaJpaController jpaMascota = new MascotaJpaController();
    
    public void altaMascota(Mascota masc){
    
        try {
            jpaMascota.create(masc);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
