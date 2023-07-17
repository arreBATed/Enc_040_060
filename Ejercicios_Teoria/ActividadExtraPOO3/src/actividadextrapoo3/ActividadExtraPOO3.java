
package actividadextrapoo3;

import Entidades.ListaClientes;
import Entidades.ListaRutinas;
import Servicios.ServicioListaCientes;
import Servicios.ServicioListaRutinas;
import java.util.Scanner;

public class ActividadExtraPOO3 {

    public static void main(String[] args) {
        
        ListaClientes listadoClientesGym;
        ServicioListaCientes servicioClientesGym;
        ListaRutinas listadoRutinasGym;
        ServicioListaRutinas servicioRutinasGym;
        int opcion, codigoRutina;
        
        servicioClientesGym = new ServicioListaCientes();
        listadoClientesGym = servicioClientesGym.crearListaClientes();
        servicioRutinasGym = new ServicioListaRutinas();
        listadoRutinasGym = servicioRutinasGym.crearListaRutinas();
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        do {
            System.out.println("--- Gestor de clientes y rutinas de Gym ---");
            System.out.println("1. Ingresar cliente al sistema.");
            System.out.println("2. Actualizar datos de un cliente.");
            System.out.println("3. Asociar una rutina al perfil del cliente. ");
            System.out.println("4. Mostrar listado de clientes en el sistema.");
            System.out.println("5. Eliminar el cliente del sistema.");
            System.out.println("6. Ingresar una nueva rutina al sistema.");
            System.out.println("7. Actualizar datos de una rutina.");
            System.out.println("8. Mostrar listado de rutinas en el sistema.");
            System.out.println("9. Eliminar una rutina del sistema.");
            System.out.println("0. Salir del gestor.");
            System.out.print("Que es lo que desea realizar? Elija una opcion (1-9):");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1 :    
                            listadoClientesGym = servicioClientesGym.insertarClienteLista(listadoClientesGym);                                                      
                            break;
                case 2 :    
                            listadoClientesGym = servicioClientesGym.actualizarClienteLista(listadoClientesGym);
                            break;
                case 3 :    
                            System.out.print("Ingrese el codigo de la rutina a asignarle al cliente: ");
                            codigoRutina = leer.nextInt();
                            if (servicioRutinasGym.codigoValido(listadoRutinasGym,codigoRutina))    {
                                    listadoClientesGym = servicioClientesGym.insertarCodigoRutinaCliente(listadoClientesGym,codigoRutina);
                                }
                            else    {
                                    System.out.println("El codigo de rtuina que ingreso no es valido.");
                            }
                            break;
                case 4 :
                            servicioClientesGym.ObtenerClientes(listadoClientesGym);
                            break;
                case 5 :    
                            listadoClientesGym = servicioClientesGym.borrarClienteLista(listadoClientesGym);
                            break;
                case 6 :    
                            listadoRutinasGym = servicioRutinasGym.insertarRutinaLista(listadoRutinasGym);
                            break;
                case 7 :    
                            listadoRutinasGym = servicioRutinasGym.actualizarClienteLista(listadoRutinasGym);
                            break;
                case 8 :
                            servicioRutinasGym.ObtenerRutinas(listadoRutinasGym);
                            break;
                case 9 :
                            listadoRutinasGym = servicioRutinasGym.borrarRutinaLista(listadoRutinasGym);
                            break;
                case 0 :
                            System.out.println("Gracias por utilizar el gestor.");
                            continuar = false;
                            break;
                default :
                            System.out.println("Esa opcion no es correcta. Intente nuevamente...");
            }
        } while (continuar);
    }
    
}
