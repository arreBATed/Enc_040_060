
package ej_extra_01_cancionero;

import Entities.Cancion;
import Services.CancionServices;


public class Ej_extra_01_Cancionero {


    public static void main(String[] args) {
        
        CancionServices cs = new CancionServices();
        Cancion c = cs.crearCancion();
        cs.MostrarCancion(c);       
    }
  
}
