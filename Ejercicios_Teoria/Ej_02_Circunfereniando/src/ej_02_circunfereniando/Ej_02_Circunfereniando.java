
package ej_02_circunfereniando;

import Entidad.Circunferencia;
import Servicios.CircunferenciaServicio;

public class Ej_02_Circunfereniando {

    public static void main(String[] args) {
        
        CircunferenciaServicio servicioCircunferencia = new CircunferenciaServicio();
        
        Circunferencia circulo = servicioCircunferencia.crearCircunferencia();
        System.out.println("El area del circulo cargado es de "+servicioCircunferencia.area(circulo)+" y su perimetro es de "+servicioCircunferencia.perimetro(circulo));
               
    }
    
}
