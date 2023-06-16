
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicios {
    
        public Cafetera crearCafetera() {
            
            Cafetera c;
            
            c = new Cafetera();
            
            Scanner leer = new Scanner(System.in);
            System.out.println("Creando una cafetera Nespresso.... ");
            System.out.print("Ingrese la capacidad maxima de la cafetera (en cc): ");
            c.setCapacidadMaxima(leer.nextDouble());
            System.out.println();
            c.setCantidadActual(0);            
            return c;
        }
        
        public void LlenarCafetera(Cafetera c) {
            
            c.setCantidadActual(c.getCantidadActual());            
        }
        
        public void ServirTaza(Cafetera c, int taza)    {
            
            if (taza <= c.getCantidadActual())    {
                 System.out.print("Sirviendo cafe en la taza indicada ...... ");
                 c.setCantidadActual(c.getCantidadActual() - taza);
            }
            else    {
                if (c.getCantidadActual() == 0) {
                        System.out.println("La cafetera esta vacia!!!. :(");
                }
                else {
                        System.out.println("El cafe disponible en la cafetera no alcanza para llenar la taza. :(");
                        System.out.println("Se servira en la taza, apenas "+c.getCantidadActual()+"cc de cafe.");
                        c.setCantidadActual(0);
                }
            }
        }
        
        public void VaciarCafetera(Cafetera c) {
            
            c.setCantidadActual(0);            
        }
        
        public void AgregarCafe(Cafetera c, double cantCafe)    {
            
            if (cantCafe > c.getCapacidadMaxima())    {
                    System.out.println("La cantidad que quiere agregar es mayor a la capacidad de la cafetera.");
                    System.out.println("Solo llenaremos la cafetera");
                    c.setCantidadActual(c.getCapacidadMaxima());
            }
            else    {
                if ((cantCafe + c.getCantidadActual()) > c.getCapacidadMaxima())    {
                        System.out.println("La cantidad que quiere agregar, juntpo con la cantidad que ya hay en la cafetera, es mayor a la capacidad de la cafetera.");
                        System.out.println("Solo llenaremos la cafetera");
                        c.setCantidadActual(c.getCapacidadMaxima());
                }
                else {
                        System.out.println("Cargando la cafetera con el cafe......");
                        c.setCantidadActual(c.getCantidadActual() + cantCafe);
                }
            }            
        }
        
}
