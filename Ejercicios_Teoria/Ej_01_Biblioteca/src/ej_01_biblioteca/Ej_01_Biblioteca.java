
package ej_01_biblioteca;

import Servicios.LibroServicios;
import Entidad.Libro;

public class Ej_01_Biblioteca {

    public static void main(String[] args) {
        
        
        LibroServicios servicioslibro = new LibroServicios();
        
        Libro libro = servicioslibro.crearLibro();
        servicioslibro.MostrarLibro(libro);      
        
    }
    
}
