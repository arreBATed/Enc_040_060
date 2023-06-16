
package Services;

import Entities.Operation;
import java.util.Scanner;

public class OperationService {
    
    public Operation crearOperacion() {
        
        Operation o;
        
        o = new Operation();
        Scanner leer = new Scanner(System.in);    
        System.out.println("Cargando los valores...  ");
        System.out.print("Ingrese el valor del numero 1: ");
        o.setNumero1(leer.nextInt()); 
        System.out.println();
         System.out.print("Ingrese el valor del numero 2: ");
        o.setNumero2(leer.nextInt()); 
        System.out.println();
        return o;
        
    }
    
    public int sumar(Operation o)   {
        
        int resultado;
                
        resultado = o.getNumero1() + o.getNumero2();
        
        return resultado; 
    }
    
    public int restar(Operation o)   {
        
        int resultado;
                
        resultado = o.getNumero1() - o.getNumero2();
        
        return resultado; 
    }
    
    public int multiplicar(Operation o)   {
        
        int resultado;
                
        resultado = o.getNumero1() * o.getNumero2();
        
        return resultado; 
    }
    
    public int dividir(Operation o)   {
        
        int resultado;
                
        resultado = o.getNumero1() / o.getNumero2();
        
        return resultado; 
    }
    
}
