
package ej_03_operaciones;

import Entities.Operation;
import Services.OperationService;

public class Ej_03_Operaciones {

    public static void main(String[] args) {
        
        OperationService serviceOperation = new OperationService();
        
        Operation calculo = serviceOperation.crearOperacion();
        System.out.println("La suma del objeto Operacion es: "+serviceOperation.sumar(calculo));
        System.out.println("La resta del objeto Operacion es: "+serviceOperation.restar(calculo));
        System.out.println("La multiplicacion del objeto Operacion es: "+serviceOperation.multiplicar(calculo));
        System.out.println("La suma del objeto Operacion es: "+serviceOperation.dividir(calculo));
               
    }
    
}
