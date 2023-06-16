
package ej_04_rectangulando;

import Entidades.Rectangulo;
import Servicios.RectanguloServicios;

public class Ej_04_Rectangulando {

    public static void main(String[] args) {
        
        RectanguloServicios serviciosRectangulo = new RectanguloServicios();
        
        Rectangulo r = serviciosRectangulo.crearRectangulo();
        System.out.println("El area del rectangulo creado es de "+serviciosRectangulo.superficie(r)+" y el perimetro es "+serviciosRectangulo.perimetro(r));        
    
    }
    
}
