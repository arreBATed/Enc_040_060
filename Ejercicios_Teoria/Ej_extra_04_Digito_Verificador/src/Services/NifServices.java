
package Services;

import Entities.Nif;
import java.util.Scanner;

public class NifServices {
    
    Scanner leer = new Scanner(System.in);
    
    public Nif crearNIF()   {
        
        Nif n;
        
        n = new Nif();
        System.out.print("Ingrese su numero de documento: ");
        n.setDni(leer.nextInt());
        n.setLetra(calcularNIF(n.getDni()));
        return n;
    }
    
    private String calcularNIF(long n)  {
    
        int aux;
        String resultado;
        String[] cadenaNIF = {"t","r","w","a","g","m","y","f","p","d","x","b","n","j","z","s","q","v","h","l","c","k","e"};
        
        aux = (int) n % 23;
        resultado = cadenaNIF[aux];
        resultado = resultado.toUpperCase();
        return resultado;
    }
    
    public void mostrar(Nif n)  {
        
        String[] cadenaAux;
        String charAux;
        
        int topeDNI = 10;
        cadenaAux = new String[topeDNI];
        cadenaAux[topeDNI - 1] = n.getLetra();
        cadenaAux[topeDNI - 2] = "-";
        for (int i = 0; i < (topeDNI -2); i++)   {
                cadenaAux[i] = "0";
        }
        long numAux = n.getDni();
        for (int i = (topeDNI - 3); i >=0; i--)    {
                charAux = String.valueOf(numAux % 10);
                cadenaAux[i] = charAux;
                numAux = numAux / 10;                
        }        
        for (int i = 0; i < topeDNI; i++)   {
                System.out.print(cadenaAux[i]);
        }
        System.out.println();
    }  
    
}
