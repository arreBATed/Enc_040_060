
package Servicios;

import Entidad.Libro;
import java.util.Scanner;

public class LibroServicios {
        
    public Libro crearLibro()    {
        
        Libro l;
        
        l = new Libro();
        
        Scanner leer = new Scanner(System.in);    
        System.out.println("Cargando los datos del libro....");
        System.out.print("Ingrese el ISBN del libro: ");
        l.setIsbn(leer.nextLine());
        System.out.println();
        System.out.print("Ingrese el titulo del libro: ");
        l.setTitulo(leer.nextLine());
        System.out.println();
        System.out.print("Ingrese el autor del libro: ");
        l.setAutor(leer.nextLine());
        System.out.println();
        System.out.print("Ingrese la cantidad de paginas del libro: ");
        l.setPaginas(leer.nextInt());
        System.out.println();
        return l;        
    }
    
    public void MostrarLibro(Libro l)    {
        
        System.out.println("Leyendo los datos del libro....");
        System.out.println("El ISBN del libro es: "+l.getIsbn());
        System.out.println("El titulo del libro es: "+l.getTitulo());
        System.out.println("El autor del libro es: "+l.getAutor());
        System.out.println("La cantidad de paginas del libro es: "+l.getPaginas());    
    }
    
    
    
    
}
