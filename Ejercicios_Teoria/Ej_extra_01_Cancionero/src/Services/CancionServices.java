
package Services;

import Entities.Cancion;
import java.util.Scanner;


public class CancionServices {
    
    Scanner leer = new Scanner(System.in);
    
    public Cancion crearCancion()   {
        
        Cancion song;
        
        song = new Cancion();
        System.out.print("Ingrese el titulo de la cancion: ");
        String cadenaAux = leer.nextLine();
        song.setTitulo(cadenaAux);
        System.out.println();
        System.out.print("Ingrese el autor de la cancion: ");
        cadenaAux = leer.nextLine();
        song.setAutor(cadenaAux);
        return song;
    }
    
    public void MostrarCancion(Cancion c)    {
        
        System.out.println("---- Datos de la cancion ----");
        System.out.println("Titulo: "+c.getTitulo());
        System.out.println("Autor: "+c.getAutor());
    }
    
}
