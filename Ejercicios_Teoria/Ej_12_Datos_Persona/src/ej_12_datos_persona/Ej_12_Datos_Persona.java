
package ej_12_datos_persona;

import Entidades.Persona;
import Servicios.PersonaServicios;
import java.util.Date;
import java.util.Scanner;

public class Ej_12_Datos_Persona {

    public static void main(String[] args) {
        
        
        PersonaServicios ps = new PersonaServicios();
        Persona p = ps.crearPersona();        
        ps.MostrarPersona(p);
        System.out.println("La persona tiene "+ps.caclularEdad(p)+" años de edad.");
        System.out.println("Vamos a cargar una fecha valida...");
        Date fechaAlt = new Date();
        fechaAlt = cargarFechaValida();
        if (ps.menorQue(p,fechaAlt))    {
            System.out.println("La fecha ingresada es menor que la fecha de nacimiento de la persona");
        }
        else    {
            System.out.println("La fecha ingresada es mayor que la fecha de nacimiento de la persona");
        }
    }
    
    public static Date cargarFechaValida()  {
        
        Date dateAux;
        int dia, mes, anio;
        
        Scanner leer = new Scanner(System.in);
        boolean valido = true; 
        do{
            System.out.print("Ingrese el valor de un dia del mes (1 al 31): ");
            dia = leer.nextInt();
            if ((dia <= 31) && (dia >= 1)) {
                valido = false;
            }
        } while (valido);
        valido = true; 
        do{
            System.out.print("Ingrese el valor de mes (1 al 12): ");
            mes = leer.nextInt();
            if ((mes <= 12) && (mes >= 1)) {
                mes = mes - 1;
                valido = false;
            }
        } while (valido);
        valido = true; 
        do{
            System.out.print("Ingrese el valor de un anño (1900 en adelante): ");
            anio = leer.nextInt();
            if((anio >= 1900) && (anio <= 2023)) {
                anio = anio - 1900;
                valido = false;
            }
        } while (valido);
        dateAux = new Date(anio,mes,dia);
        return dateAux;
    }
    
}
