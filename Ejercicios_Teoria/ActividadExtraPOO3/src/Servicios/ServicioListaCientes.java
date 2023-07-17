
package Servicios;

import Entidades.Cliente;
import Entidades.ListaClientes;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioListaCientes  {
    
    Scanner leer = new Scanner(System.in);
    
    public ListaClientes crearListaClientes()   {
        
        ListaClientes lC;
        
        lC = new ListaClientes();       
        lC.setClienteArray(new ArrayList<>());
        lC.setNroSecuenciaCliente(0);
        return lC;
        
    }
    
    public void ObtenerClientes(ListaClientes lC)   {
        
        Cliente clienteAux;
        ServicioCliente servicioClienteAuxiliar;
        
        servicioClienteAuxiliar = new ServicioCliente();
        for (int i=0; i<lC.getClienteArray().size(); i++) {
                clienteAux = lC.getClienteArray().get(i);
                servicioClienteAuxiliar.ObtenerCliente(clienteAux);
         }
    }
    
    public ListaClientes actualizarClienteLista(ListaClientes lC)  {
        
        int codigo;
        int i;
        ServicioCliente servicioClienteAux; 
        Cliente clienteAux;
        boolean presente;
        
        servicioClienteAux = new ServicioCliente();
        boolean continuar = true;        
        do {
            System.out.println("--- Actualizar cliente en la lista ----");
            System.out.print("Ingrese el codigo ID del cliente: ");
            codigo = leer.nextInt();
            if (codigoValido(lC,codigo))   {
                    presente = false;
                    i = 0;
                    while ((i <= lC.getClienteArray().size()) && (!(presente)))   {
                        clienteAux= lC.getClienteArray().get(i);
                        if (codigo == servicioClienteAux.idCliente(clienteAux)) {
                                presente = true;
                                servicioClienteAux.actualizarCliente(clienteAux);
                        }
                        else    {
                                i++;
                        }               
                    }
            }
            else {
                System.out.println("El codigo de cliente no existe en el listado. Prueba nuevamente...");
            }            
        } while (continuar);       
        return lC;
    }
    
    public ListaClientes borrarClienteLista (ListaClientes lC) {
        
        int codigo;
        int i;
        ServicioCliente servicioClienteAux; 
        Cliente clienteAux;
        boolean presente;
        
        servicioClienteAux = new ServicioCliente();
        boolean continuar = true;        
        do {
            System.out.println("--- Eliminar cliente en la lista ----");
            System.out.print("Ingrese el codigo ID del cliente: ");
            codigo = leer.nextInt();
            if (codigoValido(lC,codigo))   {
                    presente = false;
                    i = 0;
                    while ((i <= lC.getClienteArray().size()) && (!(presente)))   {
                        clienteAux= lC.getClienteArray().get(i);
                        if (codigo == servicioClienteAux.idCliente(clienteAux)) {
                                presente = true;
                                lC.getClienteArray().remove(i);
                        }
                        else    {
                                i++;
                        }               
                    }
            }
            else {
                System.out.println("El codigo de cliente no existe en el listado. Prueba nuevamente...");
            }            
        } while (continuar);       
        return lC;
        
    }
    
    public ListaClientes insertarClienteLista(ListaClientes lC) {
        
        Cliente clienteAux;
        ServicioCliente servclientAux;
        
        servclientAux = new ServicioCliente();
        lC.setNroSecuenciaCliente(lC.getNroSecuenciaCliente()+1);
        clienteAux = servclientAux.crearCliente(lC.getNroSecuenciaCliente());
        lC.getClienteArray().add(clienteAux);
        return lC; 
    }
    
    private boolean codigoValido(ListaClientes lC, int codigo) {
        
        boolean presente;
        Cliente clienteAux;
        ServicioCliente servicioClienteAux;
        
        servicioClienteAux = new ServicioCliente();
        presente = false;
        int i = 0;
        while ((i <= lC.getClienteArray().size()) && (!(presente))) {
                clienteAux= lC.getClienteArray().get(i);
                if (codigo == servicioClienteAux.idCliente(clienteAux)) {
                    presente = true;
                }
                else    {
                    i++;
                }            
        }
        return presente;
    }   
    
    public ListaClientes insertarCodigoRutinaCliente(ListaClientes lC, int codRutina)  {
                
        int codigo;
        int i;
        ServicioCliente servicioClienteAux; 
        Cliente clienteAux;
        boolean presente;
        
        servicioClienteAux = new ServicioCliente();
        boolean continuar = true;        
        do {
            System.out.println("--- Asignar rutina de gym a un cliente de la lista ----");
            System.out.print("Ingrese el codigo ID del cliente: ");
            codigo = leer.nextInt();
            if (codigoValido(lC,codigo))   {
                    presente = false;
                    i = 0;
                    while ((i <= lC.getClienteArray().size()) && (!(presente)))   {
                        clienteAux= lC.getClienteArray().get(i);
                        if (codigo == servicioClienteAux.idCliente(clienteAux)) {
                                presente = true;
                                lC.getClienteArray().get(i).setIdRutina(codRutina);
                        }
                        else    {
                                i++;
                        }               
                    }
            }
            else {
                System.out.println("El codigo de cliente no existe en el listado. Prueba nuevamente...");
            }            
        } while (continuar);       
        return lC;
        
    }
    
}
