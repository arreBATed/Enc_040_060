
package ej_extra_06_juego_del_ahorcado_.pkg2;

import Entities.Ahorcado;
import Services.AhorcadoServices;
import java.util.Scanner;


public class Ej_extra_06_Juego_del_Ahorcado_2 {


    public static void main(String[] args) {
        
        AhorcadoServices aS = new AhorcadoServices();
        Ahorcado a = aS.crearAhorcado();
        String letra; 
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Bien.. ya estamos listo para jugar al AHORCADO");
        System.out.println("Tengo la palabra a adivinar ya guardada, ahora tenes que decirme una letra verificar si esta en la palabra guardada.");
        System.out.println("Si la letra esta presente, te mostrare la cantidad de repeticiones y en que posision/es esta en la palabra");
        System.out.println("Si la letra no esta presenta, te ire mostrando la palabra AHORCADO letra por letra. Los intentos es hasta completar la palabra");
        System.out.println("Comencemos.....");
        do {
            System.out.print("Ingrese una letra: ");
            letra = leer.nextLine();
            letra = letra.toLowerCase();
            System.out.println();
            if ((aS.buscarLetra(a,letra)) && (aS.letraNoRepetida(a,letra))) {
                a = aS.colocarLetrasEncontradas(a, letra);  
                System.out.println("Bien... acertaste una letra!.. vamos por mas....");
            }
            else {
                    if (aS.letraNoRepetida(a,letra))    {
                        System.out.println("Esa letra no esta... una chance menos, guarda!");
                        a = aS.incrementarPalabraAhorcado(a); 
                    }
                    else {
                        System.out.println("Esa letra ya la dijiste... una chance menos, guarda!");
                    }
                    
            }
            a = aS.sumarCantidadIntentos(a);
            System.out.print("La palabra a adivinar viene asi .... ");
            aS.MostrarPalabraJugada(a);
            System.out.println();
            System.out.print("El ahoracado viene asi .... ");
            aS.MostrarAhorcado(a);
            System.out.println();            
        } while ((!(aS.finalAhorcado(a))) && (!(aS.palabraAcertada(a))));
        if (aS.palabraAcertada(a))  {
                System.out.println("Muy bien.... Ganaste!!!!!");
        }
        else {
                 System.out.println("Ups... una pena, perdiste... bueno, otra vez sera....");
        }
        System.out.print("Gracias por jugarrr!! ");
    }
    
}
