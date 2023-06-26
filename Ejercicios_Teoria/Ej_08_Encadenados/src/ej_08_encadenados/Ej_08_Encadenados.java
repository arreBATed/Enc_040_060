
package ej_08_encadenados;

import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

public class Ej_08_Encadenados {

    public static void main(String[] args) {
        
        CadenaServicio cd = new CadenaServicio();
        Cadena c = cd.crearCadena();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("La cantidad de vocales en la frase es "+cd.mostrarVocales(c));
        
        System.out.println("La frase invertida es la siguiente...");
        cd.invertirFrase(c);
        
        System.out.print("Ingrese un caracter para ver si esta presente en la frase: ");
        String ch = leer.nextLine();
        System.out.println();
        System.out.println("El caracter "+ch+" se repite "+cd.vecesRepetido(c,ch)+" veces.");
        
        System.out.println("Ingrese una nueva frase para jugar: ");
        String frase = leer.nextLine();
        if (cd.compararLongitud(c,frase))  {
                System.out.println("Ambas tienen la misma longitud.");
        }
        else    {
                System.out.println("Ambas NO tienen la misma longitud.");
        }
        
        System.out.println("La nueva frase de unir ambas cadenas es....");
        cd.unirFrases(c,frase);
        
        System.out.print("Ingrese un caracter para buscar y reemplazar en la cadena: ");
        ch = leer.nextLine();
        System.out.println();
        System.out.println("Ahora la frase es....");
        cd.reemplazar(c,ch);
        System.out.println();
        
        System.out.println("Ingrese una caracter para ver si esta presente en la cadena: ");
        ch = leer.nextLine();
        if (cd.contiene(c,ch))  {
                System.out.println("El caracter esta presente en la cadena");
        }
        else    {
                System.out.println("El caracter NO esta presente en la cadena");
        }
    }
    
}
