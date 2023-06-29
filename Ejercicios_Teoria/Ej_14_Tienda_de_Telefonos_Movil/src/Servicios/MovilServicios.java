
package Servicios;

import Entidades.Movil;
import java.util.Scanner;

public class MovilServicios {
    
    public Movil cargarCelular() {
        
        Movil m;
        
        m = new Movil();
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la marca del dispositivo movil: ");
        m.setMarca(leer.nextLine());
        System.out.println();
        System.out.print("Ingrese el modelo del dispositivo movil: ");
        m.setModelo(leer.nextLine());
        System.out.println();
        System.out.print("Ingrese el precio del dispositivo movil: $");
        m.setPrecio(leer.nextDouble());
        System.out.println();
        System.out.print("Ingrese la cantidad de memoria RAM del dispositivo movil: $");
        m.setMemoriaRAM(leer.nextInt());
        System.out.println();
        System.out.print("Ingrese el espacio de almacenamiento en Megabytes (MB): ");
        m.setAlmacenamiento(leer.nextDouble());
        System.out.println();
        System.out.println("Ingresemoe el codigo del usuario...");
        m.setCodigo(new int[7]);
        m.setCodigo(ingresarCodigo());
        return m;
    }
    
    private int[] ingresarCodigo()  {
        
        int[] arrayAux;
        
        Scanner leer = new Scanner(System.in);
        arrayAux = new int[7];
        for (int i = 0; i < 7; i++ )    {
            System.out.print("Ingrese el #"+(i+1)+" numero: ");
            arrayAux[i] = leer.nextInt();
            System.out.println();
        }
        return arrayAux;
    }
    
    public void MostrarDatosCelular(Movil m)    {
        
        System.out.println("Marca: "+m.getMarca());
        System.out.println("Modelo: "+m.getModelo());
        System.out.println("RAM: "+m.getMemoriaRAM());
        System.out.println("Almacenamiento: "+m.getAlmacenamiento());
        System.out.print("Codigo del dispositivo movil: ");
        int[] arrayAux = m.getCodigo();
        for (int i = 0; i < 7; i++) {
            System.out.print(arrayAux[i]);
        }
        System.out.println();
        System.out.println("Precio del dispositivo: $"+m.getPrecio());
    }
    
}

