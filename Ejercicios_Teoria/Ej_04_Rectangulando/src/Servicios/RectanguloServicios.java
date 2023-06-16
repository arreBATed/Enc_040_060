
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

public class RectanguloServicios {
    
    public Rectangulo crearRectangulo() {
    
       Rectangulo r;
       
        r = new Rectangulo();
        Scanner leer = new Scanner(System.in);    
        System.out.println("Creando el rectangulo...  ");
        System.out.print("Ingrese el valor de la base del rectangulo: ");
        r.setBase(leer.nextDouble()); 
        System.out.println();
        System.out.print("Ingrese el valor de la altura del rectangulo: ");
        r.setAltura(leer.nextDouble()); 
        System.out.println();
        return r;
    }
    
    public double superficie(Rectangulo r)  {
        
        double resultado;
        
        resultado = r.getBase() * r.getAltura();
        return resultado;
    }
    
    public double perimetro(Rectangulo r)  {
        
        double resultado;
        
        resultado = (r.getBase() + r.getAltura()) / 2;
        return resultado;
    }
    
}
