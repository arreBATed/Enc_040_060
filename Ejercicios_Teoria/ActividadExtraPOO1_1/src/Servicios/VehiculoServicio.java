
package Servicios;

import Entidades.Vehiculo;
import java.util.Scanner;

public class VehiculoServicio {
    
    public Vehiculo crearVehiculo()   {
        
        Vehiculo v;
        int opcion;
        boolean validez;
        
        v = new Vehiculo();
        Scanner leer = new Scanner(System.in);
        System.out.print ("Ingrese el fabricante del vehiculo: ");
        v.setMarca(leer.nextLine());
        System.out.print("Ingrese el modelo del modelo del vehiculo: ");
        v.setModelo(leer.nextLine());
        validez = true;
        do {
            System.out.println("Ingrese el tipo de vehiculo: ");
            System.out.println("1.- Automovil.");
            System.out.println("2.- Motocicleta.");
            System.out.println("3.- Bicicleta.");
            System.out.print("Elija una de las opciones (1,2 o 3): ");
            opcion = leer.nextInt();
            if ((opcion >= 1) && (opcion <= 3)) {
                    v.setTipo(opcion);
                    validez = false;                    
            }
            else {
                System.out.println("La opcion ingresada no es valida. Por favor, intente nuevamente...");
            }
        } while (validez);
        validez = true;
        do {
            System.out.println("Ingrese el año de fabricacion del vehiculo: ");
            opcion = leer.nextInt();
            if ((opcion >= 1910) && (opcion <= 2023)) {
                    v.setAnio(opcion);
                    validez = false;
            }
            else    {
                    System.out.println("El año ingresado es erroneo.Por favor, intente nuevamente...");
            }   
        } while (validez);
        return v;
    }
    
    public int moverse(Vehiculo v, int t)   {
        
        int distancia;

        switch (v.getTipo()){
            case 1 :  
                    distancia = 3 * t;
                    break;
            case 2 :
                    distancia = 2 * t;
                    break;
            case 3 :
                    distancia = 1 * t;
                    break;
            default:
                    distancia = 0;
                    System.out.println("No se reconoce el tipo");                                                       
        }            
        return distancia;
    }
       
    public int frenar(Vehiculo v, int t)   {
        
        int distancia;

        switch (v.getTipo()){
            case 1 :  
                    distancia = t + 2;
                    break;
            case 2 :
                    distancia = t + 2;
                    break;
            case 3 :
                    distancia = t + 0;
                    break;
            default:
                    distancia = 0;
                    System.out.println("No se reconoce el tipo");                                                       
        }            
        return distancia;
    }


    public String modeloVehiculo(Vehiculo v)    {

        String modelo;
        
        switch (v.getTipo())    {
            case 1: 
                    modelo = "automovil";
                    break;
            case 2: 
                    modelo = "motocicleta";
                    break;
            case 3: 
                    modelo = "bicicleta";
                    break;
            default: 
                    modelo = "";
                    System.out.println("Error. No tiene tipo");
        }
        return modelo;
    }

}
