package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    public Cadena crearCadena() {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase: ");        
        Cadena c = new Cadena(leer.nextLine());
        return c;
    }

    public int mostrarVocales(Cadena cadena) {
        int contador;
        String ch;
        
        contador = 0;
        for (int i = 0; i < cadena.longitud; i++) {
            ch = cadena.frase.substring(i, i + 1).toLowerCase();
            if ("a".equals(ch) || "e".equals(ch) || "i".equals(ch) || "o".equals(ch) || "u".equals(ch)) {
                contador++;
            }
        }
        return contador;
    }

    public void invertirFrase(Cadena cadena) {
        
        for (int i = cadena.longitud; i > 0; i--) {
            System.out.print(cadena.frase.substring(i - 1, i));
        }
        System.out.println();
    }

    public int vecesRepetido(Cadena cadena, String letra) {
        
        int contador;
        String ch;
        
        contador = 0;
        for (int i = 0; i < cadena.longitud; i++) {
            ch = cadena.frase.substring(i, i + 1);
            if (letra.equalsIgnoreCase(ch)) {
                contador++;
            }
        }
        return contador;
    }

    public boolean compararLongitud(Cadena cadena, String frase) {
        
        return (cadena.longitud == frase.length());
    }

    public void unirFrases(Cadena cadena, String frase) {
        
        System.out.println(cadena.frase + " " + frase);
    }

    public void reemplazar(Cadena cadena, String letra) {
        
        String ch;
        
        for (int i = 0; i < cadena.longitud; i++) {
            ch = cadena.frase.substring(i, i + 1);
            if (ch.equalsIgnoreCase("a")) {
                System.out.print(letra);
            } else {
                System.out.print(ch);
            }
        }
        System.out.println();
    }

    public boolean contiene(Cadena cadena, String letra) {
        boolean condicion;
        int contador;

        condicion = false;
        contador = 0;
        while (!condicion && cadena.longitud > contador) {
            if (cadena.frase.substring(contador, contador + 1).equalsIgnoreCase(letra)) {
                condicion = true;
            } 
            else {
                contador++;
            }
        }
        return condicion;
    }

}
