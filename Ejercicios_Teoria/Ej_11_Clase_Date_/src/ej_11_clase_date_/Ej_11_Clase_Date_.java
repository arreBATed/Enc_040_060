
package ej_11_clase_date_;

import java.util.Date;
import java.util.Scanner;


public class Ej_11_Clase_Date_ {

    public static void main(String[] args) {
                
        int dia, mes, anio;
        
        Scanner leer = new Scanner(System.in);
        boolean valido = true; 
        do{
            System.out.print("Ingrese el valor de un dia del mes (1 al 31): ");
            dia = leer.nextInt();
            if ((dia <= 31) && (dia >= 1)) {
                valido = false;
            }
        } while (valido);
        valido = true; 
        do{
            System.out.print("Ingrese el valor de mes (1 al 12): ");
            mes = leer.nextInt();
            if ((mes <= 12) && (mes >= 1)) {
                mes = mes - 1;
                valido = false;
            }
        } while (valido);
        valido = true; 
        Date localDate = new Date();
        do{
            System.out.print("Ingrese el valor de un anño (1900 en adelante): ");
            anio = leer.nextInt();
            if((anio >= 1900) &&(anio <= localDate.getYear())) {
                anio = anio - 1900;
                valido = false;
            }
        } while (valido);
        
        Date fechaIngresada = new Date(anio,mes,dia);
        System.out.println(fechaIngresada);
        
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        
        DiferenciaEntreFechas(fechaIngresada,fechaActual);
                
    }
    
    public static void DiferenciaEntreFechas(Date f1, Date f2)    {
        
            int aux1;
            int aux2; 
            
            aux1 = f1.getDay();
            aux2 = f2.getDay();
            aux1 = (f1.getYear() * 365);
            if (esBisiesto(f1))   {
                    aux1 = aux1 + 28;
            }
            else {
                    aux1 = aux1 + 29;
            }
            
            
    }
    
    public static boolean esBisiesto(Date d)    {
     
        boolean bisiesto;
        
        if ((d.getYear()%4 == 0) && (d.getYear()%400 != 0))  {
                bisiesto = true;
        }
        else    {
                bisiesto = (d.getYear()%100 == 0) && (d.getYear()%400 == 0);
        }
        return bisiesto;
    }
}
