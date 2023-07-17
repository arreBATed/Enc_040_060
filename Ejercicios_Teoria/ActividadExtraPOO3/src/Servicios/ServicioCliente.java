
package Servicios;

import Entidades.Cliente;
import java.util.Scanner;

public class ServicioCliente {
    
    Scanner leer = new Scanner(System.in);

    public Cliente crearCliente(int nroSocio) {
        
        Cliente c; 
        
        c = new Cliente();
        c.setId(nroSocio);
        System.out.println("Ingrese los datos del cliente #"+c.getId());
        System.out.print("Ingrese el nombre del cliente: ");
        c.setNombre(leer.next());
        System.out.println();
        System.out.print("Ingrese la edad del cliente");
        c.setEdad(leer.nextInt());
        System.out.println();
        System.out.print("Ingrese la altura del cliente (en cm, por favor): ");
        c.setAltura(leer.nextInt());
        System.out.println();
        System.out.print("Ingrese el peso del cliente (en gr, por favor): ");
        c.setPeso(leer.nextInt());
        System.out.println();
        System.out.print("Ingrese el objetivo por lo que viene al gym: ");
        c.setObjetivo(leer.next());
        c.setIdRutina(0);
        return c;
    }
    
    public void ObtenerCliente(Cliente c)   {
        
        System.out.println("---- Datos del cliente #"+c.getId());
        System.out.println("Nombre: "+c.getNombre());
        System.out.println("Edad: "+c.getEdad()+" años.");
        System.out.println("Altura: "+c.getAltura()+" centimetros.");
        System.out.println("Peso: "+c.getPeso()+" gramos.");
        System.out.println("Objetivo: "+c.getObjetivo());                
    }
    
    public Cliente actualizarCliente(Cliente c) {
        
        int opcion;
        
        boolean continuar  = true;
        do {
            System.out.println("---- Actualizar datos del cliente "+c.getId()+" ----");
            System.out.println("1 - Actualizar nombre. ");
            System.out.println("2 - Actualizar edad. ");
            System.out.println("3 - Actualizar altura. ");
            System.out.println("4 - Actualizar peso. ");
            System.out.println("5 - Actualizar objetivo en el gym. ");
            System.out.println("6 - Actualizar la rutina de gym. ");
            System.out.println("7 - Salir de las actualizaciones. ");
            System.out.print("Ingrese una opcion (1-6); ");
            opcion = leer.nextInt();
            switch  (opcion) {
                    case 1: 
                            System.out.print("Ingrese la actualizacion del nombre: ");
                            c.setNombre(leer.next());
                            break;
                    case 2:
                            System.out.print("Ingrese la edad a actulizar: ");
                            c.setEdad(leer.nextInt());
                            break;
                    case 3: 
                            System.out.print("Ingrese la acualizacion de la edad: ");
                            c.setEdad(leer.nextInt());
                            break;
                    case 4:
                            System.out.print("Ingrese el nuevo peso (en gramos): ");
                            c.setPeso(leer.nextInt());
                            break;
                    case 5: 
                            System.out.print("Ingrese el nuevo objetivo en el gym: ");
                            c.setObjetivo(leer.next());
                            break;
                    case 6: 
                            System.out.print("Ingrese el ID de la rutina asiganda: ");
                            c.setIdRutina(leer.nextInt());
                            break;          
                    case 7: 
                            System.out.print("Finalizada la actualizacion!");
                            continuar = false;
                            break;
                    default : 
                            System.out.print("Esa opcion no es valida. Ingrese nuevamente un a opcion correcta...");
                
            }  
            System.out.println();
        } while (continuar);
        return c;
    }
    
    public Cliente eliminarCliente(Cliente c) {
        
        c.setId(0);        
        return c;
    }
    
    public int idCliente(Cliente c) {
        
        int aux;
        
        aux = c.getId();        
        return aux;
    }
    
    
}
