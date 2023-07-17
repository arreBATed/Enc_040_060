
package Services;

import Entities.Ahorcado; 
import java.util.Scanner;


public class AhorcadoServices {
    
    Scanner leer = new Scanner(System.in);
    
    public Ahorcado crearAhorcado()    {
        
        Ahorcado a;
        String[] vectorAux;
        String[] vectorAux1;
        String[] vectorAux2;
        
        a = new Ahorcado();
        System.out.print("Ingrese la palabra que se debera adivinar: ");
        String palabraAdivinar = leer.nextLine();
        palabraAdivinar = palabraAdivinar.toLowerCase();
        a.setExtensionPalabra(palabraAdivinar.length());
        vectorAux = new String[a.getExtensionPalabra()];
        for (int i = 0; i < a.getExtensionPalabra(); i++)   {
            vectorAux[i] = palabraAdivinar.substring(i,i+1);
        }
        a.setPalabraIngresada(vectorAux);
        vectorAux1 = new String[a.getExtensionPalabra()];
        for (int j = 0; j < a.getExtensionPalabra(); j++)   {
            vectorAux1[j] = "_";
        }
        a.setPalabraJugada(vectorAux1);
        vectorAux2 = new String[a.getExtensionPalabra()];
        for (int h = 0; h < a.getExtensionPalabra(); h++)   {
            vectorAux2[h] = " "; 
        }
        a.setLetrasJugadas(vectorAux2);
        String[] vectorAux3 = {"A","H","O","R","C","A","D","O"};
        a.setAhorcado(vectorAux3);
        a.setPosicionAhorcado(0);
        a.setCantidadAciertos(1);        
        return a;        
    }
    
    public boolean buscarLetra(Ahorcado a, String ch)  {
        
        String[] vectorAux;
        boolean presente; 
        
        vectorAux = a.getPalabraIngresada();
        presente = false;
        int i = 0;
        while ((!(presente)) && (i < a.getExtensionPalabra())) {
                if (ch.equals(vectorAux[i]))    {
                    presente = true;
                }
                else {
                     i++;
                }
        }
        return presente; 
    }
    
    public Ahorcado colocarLetrasEncontradas(Ahorcado a, String ch) {
    
           String[] vectorAuxPalabra = a.getPalabraIngresada();
           String[] vectorAuxPalabraJugada = a.getPalabraJugada(); 
           for (int i = 0; i < a.getExtensionPalabra(); i++)    {
                if (ch.equals(vectorAuxPalabra[i])) {
                   vectorAuxPalabraJugada[i] = ch;
                }
           }
           a.setCantidadAciertos(a.getCantidadAciertos()+1);
           a.setPalabraJugada(vectorAuxPalabraJugada);
           return a; 
    }
    
    public boolean finalAhorcado(Ahorcado a)   {
        
        boolean fin;
        
        fin = (a.getPosicionAhorcado() == 8);
        return fin;
    }
    
    public boolean palabraAcertada(Ahorcado a)  {
        
        boolean acierto; 
        
        acierto = a.getCantidadAciertos() == a.getExtensionPalabra();
        return acierto;
    }

    
    public Ahorcado completandoLetrasJugadas(Ahorcado a, String ch)   {
     
            String[] vectorAux;
            int cont;
            int cantAux; 
            
            
            cantAux = a.getCantidadIntentos() + 1;
            if (cantAux < 8)  {
                    cont = 0;
                    vectorAux = a.getLetrasJugadas();
                    while ((cont  < cantAux) && (!(vectorAux[cont].equals(" "))))  {
                        cont = cont + 1;
                    }
                    vectorAux[cont] = ch;
                    a.setCantidadIntentos(cantAux -1); 
                    a.setLetrasJugadas(vectorAux);
            }
            else    {
                    System.out.println("Cantidad intantos agotados!!!");
            }            
            return a;
    }
    
    public boolean letraNoRepetida(Ahorcado a, String ch) {
   
        boolean noPresencia;
        int cont;
        String[] vectorAux;
        
        cont = 0;
        noPresencia = true;
        vectorAux = a.getLetrasJugadas();
        while ((cont < a.getExtensionPalabra()) && (noPresencia))    {
                if (ch.equals(vectorAux[cont])) {
                    noPresencia = false;
                }
                else    {
                    cont = cont + 1;
                }
        }
        return noPresencia; 
    }
    
    public Ahorcado sumarCantidadIntentos(Ahorcado a)   {
        
        a.setCantidadIntentos(a.getCantidadIntentos() + 1); 
        return a;
    }
    
    public Ahorcado incrementarPalabraAhorcado(Ahorcado a) {
        
        a.setPosicionAhorcado(a.getPosicionAhorcado() + 1);
        return a;
    }

    public void MostrarPalabraJugada(Ahorcado a)    {
        
        String[] vectorAux;
        
        vectorAux = a.getPalabraJugada();
        for (int i = 0; i < a.getExtensionPalabra(); i++)   {
            System.out.print(vectorAux[i]+" ");
        }
    }

    public void MostrarAhorcado(Ahorcado a)  {
        
        String[] vectorAux;
        
        vectorAux = a.getAhorcado();
        for (int i = 0; i < a.getPosicionAhorcado(); i++)   {
            System.out.print(vectorAux[i]+" ");
        }
    }
        
    public void MostrarLetrasJugadas(Ahorcado a)  {
        
        String[] vectorAux;
        int cont;
        
        vectorAux = a.getLetrasJugadas(); 
        cont = 0;
        while (cont < a.getExtensionPalabra() && (vectorAux[cont].equals(" ")))   {
            System.out.print(vectorAux[cont]);
            cont = cont + 1; 
        }
    }
      
    
}
