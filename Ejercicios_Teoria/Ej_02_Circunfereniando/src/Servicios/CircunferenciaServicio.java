
package Servicios;

import Entidad.Circunferencia;
import java.util.Scanner;

public class CircunferenciaServicio {
    
    public Circunferencia crearCircunferencia() {
        
        Circunferencia c;
        
        Scanner leer = new Scanner(System.in);    
        System.out.println("Creando una circunferencia....");
        System.out.print("Ingrese el radio de la circunferencia: ");
        c = new Circunferencia(leer.nextDouble());
        System.out.println();
        return c;
    }
    
    public double area(Circunferencia c)   {
        
        double a;
        
        a = Math.PI * c.getRadio() * c.getRadio();
        
        return a; 
    }

    public double perimetro(Circunferencia c)   {
        
        double p;
        
        p = 2 * Math.PI * c.getRadio();
        
        return p; 
    }
    
}
