package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicios {
    
    public Persona crearPersona()   {
        
        Persona p;
        int dia, mes, anio;
        
        Scanner leer = new Scanner(System.in);
        p = new Persona();
        System.out.print("Ingrese el nombre de la persona: ");
        p.setNombre(leer.nextLine());
        System.out.println();
        System.out.println("Ingrese la fecha de nacimiento la persona... ");
        boolean valido = true; 
        do{
            System.out.print("Ingrese el dia del mes (1 al 31): ");
            dia = leer.nextInt();
            if ((dia <= 31) && (dia >= 1)) {
                valido = false;
            }
        } while (valido);
        valido = true; 
        do{
            System.out.print("Ingrese el mes (1 al 12): ");
            mes = leer.nextInt();
            if ((mes <= 12) && (mes >= 1)) {
                mes = mes - 1;
                valido = false;
            }
        } while (valido);
        valido = true; 
        do{
            System.out.print("Ingrese finalmente año (1900 en adelante): ");
            anio = leer.nextInt();
            if((anio >= 1900) &&(anio <= 2023)) {
                anio = anio - 1900;
                valido = false;
            }
        } while (valido);        
        Date auxDate = new Date(anio,mes,dia);
        p.setFechaNacimiento(auxDate);
        return p;       
    }
    
    public int caclularEdad(Persona p)  {
        
        Date fechaActual;
        
        fechaActual = new Date();
        int edadActual = fechaActual.getYear() - p.getFechaNacimiento().getYear();
        return edadActual; 
    }

    public boolean menorQue(Persona p, Date f)  {
        
        boolean menoridad; 
        
        menoridad = (f.compareTo(p.getFechaNacimiento()) < 0);            
        return menoridad;
    }
    
    public void MostrarPersona(Persona p)   {
        
        System.out.println("La persona se llama "+p.getNombre()+" y nacio un "+p.getFechaNacimiento());
    }
      
}
