
package actividadextrapoo2;

import Entidades.Alquiler;
import Entidades.Fecha;
import Entidades.Pelicula;
import Servicios.AlquilerServicios;
import Servicios.FechaServicios;
import Servicios.PeliculaServicios;
import java.util.Scanner;

public class ActividadExtraPOO2 {

    public static void main(String[] args) {
        
        Pelicula[] listadoPeliculas = new Pelicula[10];
        Alquiler[] listadoAlquileres = new Alquiler[10];
        
        menuOpciones(listadoPeliculas,listadoAlquileres);

    }   
        
    public static void menuOpciones(Pelicula[] vectorPeliculas, Alquiler[] vectorAlquileres)    {
        
        int opcion;
        int topeAlquileres, topePeliculas;
        
        Scanner leer = new Scanner(System.in);
        topeAlquileres = 0;
        topePeliculas = 0;
        boolean valido = true;
        do  {
            System.out.println("---- Bienvenidoa al gestor de peliculas ----");
            System.out.println("1.- Cargar pelicular.");
            System.out.println("2.- Cargar alquiler.");
            System.out.println("3.- Mostrar listado de peliculas.");
            System.out.println("4.- Mostrar listado de alquileres");
            System.out.println("5.- Buscar pelicula por titulo.");
            System.out.println("6.- Buscar pelicula por genero.");
            System.out.println("7.- Buscar alquiler por fecha.");
            System.out.println("8.- Salir del gestor.");
            System.out.print("Ingrese la opcion a realizar (1-8): ");
            opcion = leer.nextInt();
            switch  (opcion) {
                case 1:
                        CargarPelicula(vectorPeliculas,topePeliculas);
                        topePeliculas = topePeliculas + 1;
                        break;
                case 2:
                        CargarAlquiler(vectorAlquileres,topeAlquileres);
                        topeAlquileres = topeAlquileres + 1;
                        break;
                case 3:
                        MostrarPeliculas(vectorPeliculas,topePeliculas);
                        break;
                case 4:
                        MostrarAlquileres(vectorAlquileres,topeAlquileres);
                        break;
                case 5:
                        BuscarPeliculaPorTitulo(vectorPeliculas,topePeliculas);
                        break;
                case 6: 
                        BuscarPeliculaPorGenero(vectorPeliculas,topePeliculas);
                        break;
                case 7:
                        BuscarAlquilerPorFecha(vectorAlquileres,topeAlquileres);
                        break;
                case 8:
                        System.out.println("Muchas gracias por utilizar el gestor.");
                        valido = false;
                        break;
                default : 
                        System.out.println("La opcion ingresada es incorreta.");
            }
        } while (valido);
        
    }
        
    public static void CargarPelicula(Pelicula [] vecPeli, int topeP)   {
                
        Pelicula p;
        PeliculaServicios ps;
            
        ps = new PeliculaServicios();
        p = ps.crearPelicula();
        vecPeli[topeP] = p;
    }        
        
    public static void CargarAlquiler(Alquiler[] vecAlqui, int topeA)   {
            
        Alquiler a;
        AlquilerServicios as;
        
        as = new AlquilerServicios();
        a = as.crearAlquiler();
        vecAlqui[topeA] = a;
    }
        
    public static void MostrarPeliculas(Pelicula[] vecPeli, int topeP)   {
        
            PeliculaServicios ps = new PeliculaServicios();
            
            for (int i = 0; i < topeP; i++) {
                    ps.MostrarPelicula(vecPeli[i]);
                    System.out.println();                
            }
    }
        
    public static void MostrarAlquileres(Alquiler[] vecAlq,int topeA) {
        
            AlquilerServicios as = new AlquilerServicios();
            
            for (int i = 0; i < topeA; i++) {
                    as.MostrarAlquiler(vecAlq[i]);
                    System.out.println();    
            }
    }
        
    public static void BuscarPeliculaPorTitulo(Pelicula[] vecPeli,int topeP)    {
        
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        boolean noEsta = true;
        System.out.print("Ingrese el titulo a buscar: ");
        String titulo = leer.nextLine();
        while ((noEsta) && (cont < topeP))  {
                if (titulo.equals(vecPeli[cont]))   {
                    noEsta = false;
                }
                else {
                        cont = cont + 1;
                }
        }
        if (noEsta) {
                System.out.println("El titulo NO esat presente.");
        }
        else    {
                System.out.println("El titulo esta presente.");
        }    
    }
        
    public static void BuscarPeliculaPorGenero(Pelicula[] vecPeli, int topeP)   {
        
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        boolean noEsta = true;
        System.out.print("Ingrese el genero a buscar: ");
        String genero = leer.nextLine();
        while ((noEsta) && (cont < topeP))  {
                if (genero.equals(vecPeli[cont]))   {
                    noEsta = false;
                }
                else {
                        cont = cont + 1;
                }
        }
        if (noEsta) {
                System.out.println("El generp NO esat presente.");
        }
        else    {
                System.out.println("El genero esta presente.");
        }      
    }
        
    public static void BuscarAlquilerPorFecha(Alquiler[] vecAlq, int topeA)    {
        
        
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        boolean noEsta = true;
        cont = 0;
        System.out.print("Ingrese el dia del alquiler: ");
        int dia = leer.nextInt();
        System.out.print("Ingrese el mes del alquiler: ");
        int mes = leer.nextInt();
        System.out.println();
        System.out.print("Ingrese el año del alquiler: ");
        int anio = leer.nextInt();
        System.out.println();
        FechaServicios fs = new FechaServicios();
        Fecha f1 = fs.crearFecha(dia,mes,anio);
        Fecha f2;
        AlquilerServicios as = new AlquilerServicios();
        while ((noEsta) && (cont < topeA))  {
                f2 = as.devolverFechaAlquiler(vecAlq[cont]);
                if (fs.fechasIguales(f1,f2))   {
                        noEsta = false;
                }
                else {
                        cont = cont + 1;
                }
        }
        if (noEsta) {
                System.out.println("La fecha no esta presente");
        }
        else    {
                System.out.println("La fecha esta presente");
        }        
    }    
}
