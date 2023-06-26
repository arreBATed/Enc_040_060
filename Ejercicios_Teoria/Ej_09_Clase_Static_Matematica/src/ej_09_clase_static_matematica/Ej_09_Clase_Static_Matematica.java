
package ej_09_clase_static_matematica;

import Entidades.Matematica;
import Servicios.MatematicaServicios;


public class Ej_09_Clase_Static_Matematica {


    public static void main(String[] args) {
        
        MatematicaServicios ms = new MatematicaServicios();
        Matematica m1 = ms.crearMatematica();
        
        ms.MostrarMatematica(m1);
        System.out.println("El valor mas grande de los ingresados es "+ms.devolverMayor(m1));
        System.out.println("La potencia del numero mas grande elevado por el numero mas pequeño es "+ms.calcularPotencia(m1));
        System.out.println("La raiz del numero mas pequeño por el numero mas grande es "+ms.calcularRaiz(m1));
            
        
    }
    
}
