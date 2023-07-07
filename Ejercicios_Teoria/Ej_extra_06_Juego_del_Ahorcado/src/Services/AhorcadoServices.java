
package Services;

import Entities.Ahorcado;
import java.util.Scanner;

public class AhorcadoServices {
    
    Scanner leer = new Scanner(System.in);
    
    public Ahorcado crearAhorcado()    {
        
        Ahorcado a;
        char[] vectorAux;
        
        a = new Ahorcado();
        System.out.print("Ingrese la palabra que se debera adivinar: ");
        String palabraAdivinar = leer.nextLine();
        int longPalabra = palabraAdivinar.length();
        vectorAux = new char[longPalabra];
        for (int i = 0; i < longPalabra; i++)   {
            vectorAux[i] = palabraAdivinar.charAt(i);
        }
        a.setPalabra(vectorAux);
        System.out.println();
        System.out.print("Ingrese el maximo de jugadas a ejecutarse: ");
        a.setCantJugadasMaximas(leer.nextInt());
        a.setLetrasEncontradas(0);
        return a;        
    }
    
    public void Longitud(Ahorcado a)    {
        
        int l;
        
        l = a.getPalabra().length;
        System.out.println("La palabra contiene "+l+" letras.");
    }
    
    public void Buscar(Ahorcado a, char ch)  {
        
        boolean noPresente = true;
        int i = 0;
        while ((i < a.getPalabra().length) && (noPresente)) {
                if (ch == a.getPalabra()[i])    {
                    noPresente = false;
                }
                else {
                     i++;
                }
        }
        if (noPresente) {
                System.out.println("La letra "+ch+" no esta en la palabra.");
        }
        else    {
                System.out.println("La letra "+ch+" esta en la palabra.");
        }
    }
    
    public boolean encontradas(Ahorcado a, char ch)  {
            
        boolean presente;
        
        int cont = 0;
        for (int i = 0; i < a.getPalabra().length; i++)  {
                 if (ch == a.getPalabra()[i])    {
                    cont++;
                }
        }
        if (cont > 0)   {
            System.out.println("La letra aparece "+cont+" veces en la palabra.");
            presente = true;
        }
        else    {
            System.out.println("La letra no aparecen en la palabra.");
            presente = false;
        }
        return presente;
    }
    
    public void Intentos(Ahorcado a, int j)    {
               
        System.out.println("Quedan "+(a.getCantJugadasMaximas()-j)+" intentos.");
    }
        
    
}
