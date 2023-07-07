
package ej_extra_02_calculos_con_puntos;

import Entities.Puntos;
import Services.PuntosServices;

public class Ej_extra_02_Calculos_con_Puntos {

    public static void main(String[] args) {
        
        PuntosServices ps = new PuntosServices();
        
        Puntos p1 = ps.crearPunto();       
        System.out.println("La distancia entre los puntos es "+ps.calcularDistancia(p1));
    }
    
}
