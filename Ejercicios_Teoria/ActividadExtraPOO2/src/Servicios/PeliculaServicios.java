
package Servicios;

import Entidades.Pelicula;
import java.util.HashSet;
import java.util.Scanner;

public class PeliculaServicios {
    
    public Pelicula crearPelicula() {
        
        Pelicula p;
        FechaServicios fs;
        int opcion;
        
        p = new Pelicula();
        Scanner leer = new Scanner(System.in);
        System.out.println("Cargando datos de la pelicula...");
        System.out.print("Ingrese el titulo de la pelicula: ");
        p.setTitulo(leer.nextLine());
        System.out.println();
        boolean valido = true;
        do  {
            System.out.println("Ingrese el genero de la pelicula...");
            System.out.println("1. Comedia. ");
            System.out.println("2. Drama.");
            System.out.println("3. Terror.");
            System.out.println("4. Suspenso.");
            System.out.println("5. Ciencia Ficcion.");
            System.out.println("6. Animada."); 
            System.out.print("Ingrese un numero de opcion (1-6): ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1 : 
                        p.setGenero("comedia");
                        valido = false;
                        break;
                case 2 : 
                        p.setGenero("drama");
                        valido = false; 
                        break;
                case 3 : 
                        p.setGenero("terror");
                        valido = false; 
                        break;
                case 4 : 
                        p.setGenero("suspenso");
                        valido = false; 
                        break;
                case 5 : 
                        p.setGenero("ciencia ficcion");
                        valido = false; 
                        break;
                case 6 : 
                        p.setGenero("animada");
                        valido = false; 
                        break;
                default : 
                            System.out.println("La opcion ingresadada no es valida. Intentelo otra vez....");
            }            
        } while (valido);
        fs = new FechaServicios();
        valido = true;
        do {
            System.out.println ("Año de publicacion.... ");
            p.setAño(fs.crearFechaSoloAnio());
            if (fs.devolerAnioFecha(p.getAño()) >= 1900) {
                valido = false;
            }
            else {
                System.out.println("La fecha ingresada no es correcto. Por favor, intentelo nuevamente....");
            }            
        } while (valido);
        System.out.println();
        System.out.print("Ingrese la duracion de la pelicula (en minutos): ");
        p.setDuracion(leer.nextDouble());
        return p;
    }
    
    public void MostrarPelicula(Pelicula p)    {
        
        FechaServicios fs = new FechaServicios();
        
        System.out.println("Datos de la pelicula...");
        System.out.println("Titulo: "+p.getTitulo());
        System.out.println("Genero: "+p.getGenero());
        System.out.println("Año: "+fs.obtenerAnioFecha(p.getAño()));
        System.out.println("Duracion: "+p.getDuracion()+"min");
    }  
    
}
