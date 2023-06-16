
package ejercicios_teoria;

import Entidad.Persona;


public class Ejercicios_Teoria {


    public static void main(String[] args) {
        
        Persona primeraPersona = new Persona();
        
        Persona segundaPersona = new Persona("Ricardo","Ruben",39);
 
        primeraPersona.setNombre("Mauricio");
        
        String cadena = segundaPersona.getNombre();
    }
    
}
