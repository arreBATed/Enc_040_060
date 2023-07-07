
package Services;

import Entities.Puntos;
import java.util.Scanner;

public class PuntosServices {
    
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPunto()   {
        
        Puntos p; 
        
        p = new Puntos();
        System.out.println("Vamos a deifinir el primer punto...");
        System.out.print("Ingrese la coordenada X del primer punto: ");
        p.setX1(leer.nextDouble());
        System.out.println();
        System.out.print("Ingrese la ordenada al origen Y del primer punto: ");
        p.setY1(leer.nextDouble());
        System.out.println();
        System.out.print("Ingrese la coordenada X del segundo punto: ");
        p.setX2(leer.nextDouble());
        System.out.println();
        System.out.print("Ingrese la ordenada al origen Y del segundo punto: ");
        p.setY2(leer.nextDouble());
        System.out.println();
        return p;
    }
    
    public double calcularDistancia(Puntos p1) {
        
        double resultado; 
        
        resultado = Math.sqrt((Math.pow(p1.getX2(),2) - Math.pow(p1.getX1(),2)) + (Math.pow(p1.getY2(),2) - Math.pow(p1.getY1(),2)));
        return resultado; 
    }
}
