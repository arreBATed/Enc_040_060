
package Servicios;

import Entidades.Rutina;
import Entidades.ListaRutinas;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioListaRutinas {
    
    Scanner leer = new Scanner(System.in);
    
    public ListaRutinas crearListaRutinas()   {
        
        ListaRutinas lR;
        
        lR = new ListaRutinas();       
        lR.setRutinaArray(new ArrayList<>());
        lR.setNroSecuenciaRutina(0);
        return lR;        
    }
    
    public void ObtenerRutinas(ListaRutinas lR)   {
        
        Rutina rutinaAux;
        ServicioRutina servicioRutinaAuxiliar;
        
        servicioRutinaAuxiliar = new ServicioRutina();
        for (int i=0; i<lR.getRutinaArray().size(); i++) {
                rutinaAux = lR.getRutinaArray().get(i);
                servicioRutinaAuxiliar.ObtenerRutina(rutinaAux);
         }
    }
    
    public ListaRutinas actualizarClienteLista(ListaRutinas lR)  {
        
        int codigo;
        int i;
        ServicioRutina servicioRutinaAux; 
        Rutina rutinaAux;
        boolean presente;
        
        servicioRutinaAux = new ServicioRutina();
        boolean continuar = true;        
        do {
            System.out.println("--- Actualizar rutina en la lista ----");
            System.out.print("Ingrese el codigo ID de la rutina: ");
            codigo = leer.nextInt();
            if (codigoValido(lR,codigo))   {
                    presente = false;
                    i = 0;
                    while ((i <= lR.getRutinaArray().size()) && (!(presente)))   {
                        rutinaAux= lR.getRutinaArray().get(i);
                        if (codigo == servicioRutinaAux.idRutina(rutinaAux)) {
                                presente = true;
                                servicioRutinaAux.actualizarRutina(rutinaAux);
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
        return lR;
    }
    
    public ListaRutinas borrarRutinaLista (ListaRutinas lR) {
        
        int codigo;
        int i;
        ServicioRutina servicioRutinaAux; 
        Rutina rutinaAux;
        boolean presente;
        
        servicioRutinaAux = new ServicioRutina();
        boolean continuar = true;        
        do {
            System.out.println("--- Eliminar rutina en la lista ----");
            System.out.print("Ingrese el codigo ID de la rutina: ");
            codigo = leer.nextInt();
            if (codigoValido(lR,codigo))   {
                    presente = false;
                    i = 0;
                    while ((i <= lR.getRutinaArray().size()) && (!(presente)))   {
                        rutinaAux= lR.getRutinaArray().get(i);
                        if (codigo == servicioRutinaAux.idRutina(rutinaAux)) {
                                presente = true;
                                lR.getRutinaArray().remove(i);
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
        return lR;        
    }
    
    public ListaRutinas insertarRutinaLista(ListaRutinas lR) {
        
        Rutina rutinaAux;
        ServicioRutina servrutinaAux;
        
        servrutinaAux = new ServicioRutina();
        lR.setNroSecuenciaRutina(lR.getNroSecuenciaRutina()+1);
        rutinaAux = servrutinaAux.crearRutina(lR.getNroSecuenciaRutina());
        lR.getRutinaArray().add(rutinaAux);
        return lR; 
    }
    
    public boolean codigoValido(ListaRutinas lC, int codigo) {
        
        boolean presente;
        Rutina rutinaAux;
        ServicioRutina servicioRutinaAux;
        
        servicioRutinaAux = new ServicioRutina();
        presente = false;
        int i = 0;
        while ((i <= lC.getRutinaArray().size()) && (!(presente))) {
                rutinaAux= lC.getRutinaArray().get(i);
                if (codigo == servicioRutinaAux.idRutina(rutinaAux)) {
                    presente = true;
                }
                else    {
                    i++;
                }            
        }
        return presente;
    }   
    
}
  
