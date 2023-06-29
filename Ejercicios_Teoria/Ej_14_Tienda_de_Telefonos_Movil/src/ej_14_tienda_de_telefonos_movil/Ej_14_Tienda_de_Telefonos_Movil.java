
package ej_14_tienda_de_telefonos_movil;

import Entidades.Movil;
import Servicios.MovilServicios;

public class Ej_14_Tienda_de_Telefonos_Movil {

    public static void main(String[] args) {
        
        MovilServicios ms = new MovilServicios();
        Movil m = ms.cargarCelular();
        ms.MostrarDatosCelular(m);        
    }
    
}
