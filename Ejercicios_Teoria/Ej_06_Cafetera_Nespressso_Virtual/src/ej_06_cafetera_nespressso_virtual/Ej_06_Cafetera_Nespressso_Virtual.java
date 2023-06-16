
package ej_06_cafetera_nespressso_virtual;

import Entidades.Cafetera;
import Servicios.CafeteraServicios;
import java.util.Scanner;

public class Ej_06_Cafetera_Nespressso_Virtual {

    public static void main(String[] args) {
     
        int opcion;
        int taza;
        double masCafe;
        
        CafeteraServicios servicioCafetera = new CafeteraServicios();
        
        Cafetera cafeteraNespresso = servicioCafetera.crearCafetera();
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        do {
            System.out.println("---- Cafetera Virtual NespreSSo ------ ");
            System.out.println("1) LLenar NespreSSo.- ");
            System.out.println("2) Servir taza de cafe.- ");
            System.out.println("3) Vaciar NespreSSo.-");
            System.out.println("4) Agregar mas cafe a la NespreSSo.-");
            System.out.println("5) Apagar.- ");
            System.out.print("Ingrese una de las opciones (1-5):");
            opcion = leer.nextInt();
            System.out.println();
            switch (opcion) {
                case 1: 
                        System.out.println("Llenando NespreSSo......");
                        servicioCafetera.LlenarCafetera(cafeteraNespresso);
                        break;
                case 2:
                        System.out.print("Ingrese la capacidad en CC de la taza a servir: ");
                        taza = leer.nextInt();
                        System.out.println();
                        servicioCafetera.ServirTaza(cafeteraNespresso,taza);
                        break;
                case 3:
                        System.out.println("Vaciando NesPresSSo....");
                        servicioCafetera.VaciarCafetera(cafeteraNespresso);
                        break;
                case 4:        
                        System.out.print("Ingrese la cantidad de cafe en CC que desea agregar a la Nespresso: ");
                        masCafe = leer.nextDouble();
                        System.out.println();
                        servicioCafetera.AgregarCafe(cafeteraNespresso,masCafe);
                        break;
                case 5:
                        System.out.print("Apagando Nespressso.....");
                        continuar = false;
                        break;
                default:
                        System.out.print("La opcion ingresada no es valida. Intente otra vez");
            }              
        } while (continuar);
    }
    
}
