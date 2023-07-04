
package Servicios;

import Entidades.Alquiler;
import Entidades.Fecha;
import java.util.Scanner;

public class AlquilerServicios {
    
    public Alquiler crearAlquiler() {
        
        Alquiler a;
        Fecha f;
        FechaServicios fs;
                
        a = new Alquiler();
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la pelicula a alquilar: ");
        a.setPeliculaAlquilada(leer.nextLine());
        boolean valido = true;
        int dia, mes, anio;
        fs = new FechaServicios();
        do  {
            System.out.println("Ingrese la fecha de alquiler:");
            System.out.print("Dia: ");
            dia = leer.nextInt();
            System.out.println();
            System.out.print("Mes: ");
            mes = leer.nextInt();
            System.out.println();
            System.out.print("Año: ");
            anio = leer.nextInt();
            System.out.println();
            f = fs.crearFecha(dia,mes,anio);
            if (fs.fechaValida(f))  {
                    a.setDiaAlquiler(f);
                    valido = false;
            }
            else    {
                System.out.println("La fecha ingresada no es correcta. Por favor, ingresela nuevamente...");
            }            
        } while (valido);
        valido = true;
        do  {
            System.out.println("Ingrese la fecha de devolucion:");
            System.out.print("Dia: ");
            dia = leer.nextInt();
            System.out.println();
            System.out.print("Mes: ");
            mes = leer.nextInt();
            System.out.println();
            System.out.print("Año: ");
            anio = leer.nextInt();
            System.out.println();
            f = fs.crearFecha(dia,mes,anio);
            if (fs.fechaValida(f))  {
                    a.setDiaDevolucion(f);
                    valido = false;
            }
            else    {
                System.out.println("La fecha ingresada no es correcta. Por favor, ingresela nuevamente...");
            }            
        } while (valido);
        System.out.print("Ingrese el valor del alquiler: ");
        a.setPrecio(leer.nextDouble());       
        return a;
    }
    
    public void MostrarAlquiler(Alquiler a)    {
        
        FechaServicios fs = new FechaServicios();
        
        System.out.println("Datos del alquiler...");
        System.out.println("Titulo de pelicula alquilada: "+a.getPeliculaAlquilada());
        System.out.println("Dia de alquiler: ");
        fs.MostrarFecha(a.getDiaAlquiler());
        System.out.println();;
        System.out.println("Precio: $"+a.getPrecio());
    }
    
    public String devolverTituloAlquiler(Alquiler a)    {
        
        String cadena;
        
        cadena = a.getPeliculaAlquilada();
        return cadena;
    }
    
    public Fecha devolverFechaAlquiler(Alquiler a)    {
        
        Fecha f; 
        
        f = a.getDiaAlquiler();
        return f;
    }
}
