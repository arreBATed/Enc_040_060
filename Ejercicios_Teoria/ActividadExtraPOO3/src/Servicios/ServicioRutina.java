
package Servicios;

import Entidades.Rutina;
import java.util.Scanner;

public class ServicioRutina {
    
    Scanner leer = new Scanner(System.in);
    
    public Rutina crearRutina(int nroRutina) {
        
        Rutina r; 
        
        r = new Rutina();
        r.setId(nroRutina);
        System.out.println("Ingrese los datos de la rutina #"+r.getId());
        System.out.print("Ingrese el nombre de la rutina: ");
        r.setNombre(leer.next());
        System.out.println();
        System.out.print("Ingrese la duracion de la rutina (en minutos, por favor); ");
        r.setDuracion(leer.nextInt());
        System.out.println();
        System.out.print("Ingrese el nivel de dificultad de la rutina:  ");
        r.setNivelDificultad(leer.nextInt());
        System.out.println();
        System.out.print("Ingrese la descripcion de la rutina: ");
        r.setDescripcion(leer.next());
        System.out.println();
        return r;
    }
    
    public void ObtenerRutina(Rutina r)   {
        
        System.out.println("---- Datos de la #"+r.getId());
        System.out.println("Nombre: "+r.getNombre());
        System.out.println("Duracion: "+r.getDuracion()+" minutos.");
        System.out.println("Dificultad: Nivel "+r.getNivelDificultad());
        System.out.println("Descripcion: "+r.getDescripcion());  
    }
    
    public Rutina actualizarRutina(Rutina r) {
        
        int opcion;
        
        boolean continuar  = true;
        do {
            System.out.println("---- Actualizar datos de la rutina "+r.getId()+" ----");
            System.out.println("1 - Actualizar nombre. ");
            System.out.println("2 - Actualizar duracion. ");
            System.out.println("3 - Actualizar nivel de dificultad. ");
            System.out.println("4 - Actualizar descripcion de la rutina. ");
            System.out.println("5 - Salir de las actualizaciones. ");
            System.out.print("Ingrese una opcion (1-5); ");
            opcion = leer.nextInt();
            switch  (opcion) {
                    case 1: 
                            System.out.print("Ingrese la actualizacion del nombre de la rutina: ");
                            r.setNombre(leer.next());
                            break;
                    case 2:
                            System.out.print("Ingrese la duracion a actulizar (en minutos, por favor): ");
                            r.setDuracion(leer.nextInt());
                            break;
                    case 3: 
                            System.out.print("Ingrese el nivel de dificultad a acualizar: ");
                            r.setNivelDificultad(leer.nextInt());
                            break;
                    case 4:
                            System.out.print("Ingrese la actualizacion a la descripcion de la rutina: ");
                            r.setDescripcion(leer.next());
                            break;
                    case 5: 
                            System.out.print("Finalizada la actualizacion!");
                            continuar = false;
                            break;
                    default : 
                            System.out.print("Esa opcion no es valida. Ingrese nuevamente un a opcion correcta...");
                
            }  
            System.out.println();
        } while (continuar);
        return r;
    }
    
    public int idRutina(Rutina r) {
        
        int aux;
        
        aux = r.getId();        
        return aux;
    }
    
    public Rutina eliminarRutina(Rutina r) {
        
        r.setId(0);
        return r;
    }
    
    
}
