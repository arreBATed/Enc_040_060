
package Services;

import Entities.Raices;
import java.util.Scanner;

public class RaicesServices {
    
    Scanner leer = new Scanner(System.in);
    
    public Raices crearRaices() {
     
        Raices root;
        
        root = new Raices();
        System.out.println("--- Iniciando la formula cuadratica ax²+ bx + c = 0 ---");
        System.out.print("Ingrese el valor de a para la ecuacion: ");
        root.setA(leer.nextDouble());
        System.out.println();
        System.out.print("Ingrese el valor de b para la ecuacion: ");
        root.setB(leer.nextDouble());
        System.out.println();
        System.out.print("Ingrese el valor de c para la ecuacion: ");
        root.setC(leer.nextDouble());
        System.out.println();
        return root;
    }
    
    public void MostrarEcuacionRaice(Raices r)  {
        
        System.out.println(r.getA()+"x² + "+r.getB()+"x + "+r.getC()+" = 0");
    }
    
    public double getDiscriminante(Raices r)    {
        
        double discriminante;
        
        discriminante = (Math.sqrt(r.getB())) + (4 * r.getA() * r.getC());
        return discriminante;
    }
    
    public boolean tieneRaices(Raices r)    {
        
        boolean tiene;
        
        tiene = getDiscriminante(r) > 0;
        return tiene;        
    }
    
    public boolean tieneRaiz(Raices r)    {
        
        boolean tiene;
        
        tiene = getDiscriminante(r) == 0;
        return tiene;
    }
    
    public void ObtenerRaices(Raices r)    {
        
        if (tieneRaices(r)) {
            double raiz1 = -(r.getB()) + getDiscriminante(r);
            double raiz2 = -(r.getB()) - getDiscriminante(r);
            System.out.println("Las raices de la ecuacion son...");
            System.out.println("Raiz 1: "+raiz1);
            System.out.println("Raiz 2: "+raiz2);
        }
        else {
            System.out.println("La ecuacion no tienen raices en los numeros reales.");
        }            
    }
    
    public void ObtenerRaiz(Raices r)   {
        
        if (tieneRaiz(r)) {
            double raiz = -(r.getB());
            System.out.println("Las unica raiz de la ecuacion es...");
            System.out.println("Raiz: "+raiz);
        }
        else {
            System.out.println("La ecuacion no tienen raices en los numeros reales.");
        }        
    }
    
    public void Calcular(Raices r)   {
        
        if (tieneRaices(r) || tieneRaices(r))   {
            if (getDiscriminante(r) > 0)   {
                    ObtenerRaices(r);
            }
            else    {
                    ObtenerRaiz(r);
            }
        }
        else    {
            System.out.println("No se pude calcular sus raices pues no tienen solucion en lo numeros reales");
        }        
    }
    
}

