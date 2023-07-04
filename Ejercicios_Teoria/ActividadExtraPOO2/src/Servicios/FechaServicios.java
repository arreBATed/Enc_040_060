
package Servicios;

import Entidades.Fecha;
import java.util.Scanner;

public class FechaServicios {
    
    public Fecha crearFecha(int d, int m, int a)    {
        
        Fecha f;
        
        f = new Fecha(d,m,a);
        return f;      
    }
    
    public Fecha crearFechaSoloAnio()   {
        
        Fecha f;
        
        f = new Fecha();
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el año: ");
        f.setAnio(leer.nextInt());
        f.setMes(1);
        f.setDia(1);
        return f;       
    }
    
    public int devolerAnioFecha(Fecha f)    {
        
        int a;
        
        a = f.getAnio();
        return a;        
    }

    public boolean fechaValida(Fecha f) {
        
        boolean validez;
        
        validez = false; 
        if ((f.getMes() >= 1) && (f.getMes() <= 12 ))   {
             switch ( f.getMes() ) {
                case  1 :
                case  3 :
                case  5 :
                case  7 :
                case  8 :
                case 10 :
                case 12 : if ((f.getDia() >= 1) && (f.getDia() <= 31)) {
                                    validez = true;
                          }                            
                          else  {
                                    validez = false;
                          }
                          break;
                case  4 :
                case  6 :
                case  9 :
                case 11 : if ((f.getDia() >= 1) && (f.getDia() <= 30))  {
                                    validez = true;
                          }
                          else  {
                                    validez = false;
                          }
                          break;
                case  2 : if((f.getAnio() % 4 == 0) && (f.getAnio() % 100 != 0) || (f.getAnio() % 400 == 0)) {
                                if ((f.getDia() >= 1) && (f.getDia() <= 29))    {
                                        validez = true;
                                }
                                else    {
                                        validez = false;
                                }
                          }
                          else  {
                                if ((f.getDia() >= 1) && (f.getDia() <= 28)) {
                                        validez = true;
                                }
                                else {
                                        validez = false; 
                                }
                          }   
            }
        }
        else    { 
                validez = false;
        }
        return validez;
    }
    
    public void MostrarFecha(Fecha f)   {
        
        System.out.print(f.getDia()+"/"+f.getMes()+"/"+f.getAnio());
    }
    
    public int obtenerAnioFecha(Fecha f)    {
        
        int anio;
        
        anio = f.getAnio();
        return anio;
    }
    
    public boolean fechasIguales(Fecha f1, Fecha f2)    {
        
        boolean sonIguales;
        
        sonIguales = (f1.getDia() == f2.getDia()) && (f1.getDia() == f2.getDia()) && (f1.getDia() == f2.getDia());
        return sonIguales; 
    }
}
