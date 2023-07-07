
package ej_extra_03_ecuaciones_cuadraticas;

import Entities.Raices;
import Services.RaicesServices;

public class Ej_extra_03_Ecuaciones_Cuadraticas {


    public static void main(String[] args) {
        
        RaicesServices rs = new RaicesServices();
        Raices r = rs.crearRaices();
        rs.MostrarEcuacionRaice(r);
        rs.Calcular(r);      
        
    }
    
}
