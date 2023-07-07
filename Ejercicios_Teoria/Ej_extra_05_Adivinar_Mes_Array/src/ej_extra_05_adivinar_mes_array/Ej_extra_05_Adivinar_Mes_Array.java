
package ej_extra_05_adivinar_mes_array;

import Entities.VectorMeses;
import Services.VectorMesesServices;
import java.util.Scanner;

public class Ej_extra_05_Adivinar_Mes_Array {

    public static void main(String[] args) {
        
        VectorMesesServices vms = new VectorMesesServices();
        VectorMeses vectorM = vms.crearVectoMeses();
        boolean continuarJugando, acierto, correcto;
        String palabra, opcion;
 
        Scanner leer = new Scanner(System.in);
        continuarJugando = true;
        do {
            String palabraIncognita = vms.obtenerMesAlAzar(vectorM);
            acierto = true;
            System.out.println("Adivine el mes que estoy pensando....");
            System.out.print("Ingrese un mes del año: ");
            do {
                palabra = leer.nextLine();
                if (palabra.equals(palabraIncognita))   {
                        System.out.println("Bieeeenn... acertaste!!");
                        acierto = false;
                }
                else    {
                        System.out.println("Mmm... .nop.. le erraste!");
                        System.out.print("Intentalo una vez mas, ingresa un mes del año: ");
                }
            } while (acierto);
            correcto = true;
            do  {
                System.out.print("Bien jugado!... queres volver a intentarlo? (s/n): ");
                opcion = leer.nextLine();
                System.out.println();
                opcion = opcion.toLowerCase();
                switch  (opcion) {
                    case "s" : 
                                System.out.println("Bien, juguemos otra vez");
                                correcto = false;
                                break;
                    case "n" :
                                System.out.println("Muchas gracias por jugar. Nos vemos!");
                                continuarJugando = false;
                                correcto = false;
                                break;
                    default : 
                                System.out.println("Ingreso una respuesta incorrecto. Por favor conteste correctamente.");
                }
                
            } while (correcto);           
        } while (continuarJugando);
    }    
}
