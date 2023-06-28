
package ej_10_clase_array_;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.util.Arrays;

public class Ej_10_Clase_Array_ {

    public static void main(String[] args) {
        
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        CargarArreglo(arregloA);
        System.out.println("Asi quedo el arreglo A cargado orignalmente... ");
        MostrarArreglo(arregloA);
        
        Arrays.sort(arregloA);
        System.out.println("Asi quedo el arreglo A ahora ordenado... ");
        MostrarArreglo(arregloA);
        
        Arrays.fill(arregloB,0.5);
        arregloB = Arrays.copyOf(arregloA,10);
        //Arrays.fill(arregloB,(arregloB.length/2),arregloB.length,0.5);
        System.out.println("Asi quedo el arreglo B ahora rellano...");
        MostrarArreglo(arregloB);
        
        System.out.println("Finalmente... los arreglos quedaron asi");
        System.out.println("Arreglo A");
        MostrarArreglo(arregloA);
        System.out.println("Arreglo B");
        MostrarArreglo(arregloB);
        
    }
    
    public static void MostrarArreglo(double[] a)   {
        
        System.out.print("|");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]+" |");            
        }
        System.out.println();
    }
    
    public static void CargarArreglo(double[] a)   {
        
        double random;
        double roundOff;
        
        for (int i = 0; i < a.length; i++) {
                random = Math.random();
                a[i] = (double) Math.round(random * 100) / 100;            
        }
    }
    
}
