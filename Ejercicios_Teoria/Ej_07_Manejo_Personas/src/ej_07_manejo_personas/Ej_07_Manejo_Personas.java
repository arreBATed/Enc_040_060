
package ej_07_manejo_personas;

import Entidades.Persona;
import Servicios.PersonaServices;
import java.util.Scanner;

public class Ej_07_Manejo_Personas {

    public static void main(String[] args) {
        
        int opcion; 
        
        PersonaServices servicioPersona = new PersonaServices();
        
        Scanner leer = new Scanner(System.in);
        Persona persona1 = servicioPersona.crearPersona();
        Persona persona2 = servicioPersona.crearPersona();
        Persona persona3 = servicioPersona.crearPersona();
        Persona persona4 = servicioPersona.crearPersona();
        boolean continuar = true;
        do {
            System.out.println("---- Analisis de Personas ------ ");
            System.out.println("1) Listar las personas.- ");
            System.out.println("2) Analizar el IMC de cada persona.- ");
            System.out.println("3) Saber quien es mayor de edad.-");
            System.out.println("4) Salir.- ");
            System.out.print("Ingrese una de las opciones (1-4):");
            opcion = leer.nextInt();
            System.out.println();
            switch (opcion) {
                case 1: 
                        System.out.println("Las personas creadas son......");
                        System.out.println("1.- "+servicioPersona.mostrarNombrePersona(persona1));
                        System.out.println("2.- "+servicioPersona.mostrarNombrePersona(persona2));
                        System.out.println("3.- "+servicioPersona.mostrarNombrePersona(persona3));
                        System.out.println("4.- "+servicioPersona.mostrarNombrePersona(persona4));
                        break;
                case 2:
                        System.out.println("Analizar IMC de las personas......");
                        AnalizarIMCPersonas(persona1,persona2,persona3,persona4,servicioPersona);
                        break;
                case 3:
                        System.out.println("Analizar quien es mayor de edad......");
                        AnalizarMayoriaEdad(persona1,persona2,persona3,persona4,servicioPersona);
                        break;
                case 4:        

                        break;
                default:
                        System.out.print("La opcion ingresada no es valida. Intente otra vez");
            }              
        } while (continuar);
        
    }
    
    public static void AnalizarIMCPersonas (Persona p1, Persona p2, Persona p3, Persona p4, PersonaServices sp) {
        
        
        int contPesoIdeal = 0;
        int contBajoPesoIdeal = 0;
        int contSobrePeso = 0;
        int auxIMCp1 = sp.calcularIMC(p1);
        int auxIMCp2 = sp.calcularIMC(p2);
        int auxIMCp3 = sp.calcularIMC(p3);
        int auxIMCp4 = sp.calcularIMC(p4);
        switch (auxIMCp1) {
            case 0:
                    contPesoIdeal = contPesoIdeal + 1;
                    break;
            case -1: 
                    contBajoPesoIdeal = contBajoPesoIdeal + 1;
                    break;
            case 1:
                    contSobrePeso = contSobrePeso + 1;
                    break;
            default: 
                    System.out.println("Error!!!");
        }
         switch (auxIMCp2) {
            case 0:
                    contPesoIdeal = contPesoIdeal + 1;
                    break;
            case -1: 
                    contBajoPesoIdeal = contBajoPesoIdeal + 1;
                    break;
            case 1:
                    contSobrePeso = contSobrePeso + 1;
                    break;
            default: 
                    System.out.println("Error!!!");
        }
         switch (auxIMCp3) {
            case 0:
                    contPesoIdeal = contPesoIdeal + 1;
                    break;
            case -1: 
                    contBajoPesoIdeal = contBajoPesoIdeal + 1;
                    break;
            case 1:
                    contSobrePeso = contSobrePeso + 1;
                    break;
            default: 
                    System.out.println("Error!!!");
        }
         switch (auxIMCp4) {
            case 0:
                    contPesoIdeal = contPesoIdeal + 1;
                    break;
            case -1: 
                    contBajoPesoIdeal = contBajoPesoIdeal + 1;
                    break;
            case 1:
                    contSobrePeso = contSobrePeso + 1;
                    break;
            default: 
                    System.out.println("Error!!!");
             
        }
        System.out.println("En el grupo de personas hay "+contPesoIdeal+" con su peso ideal, "+contBajoPesoIdeal+" con bajo peso y "+contSobrePeso+" con sobrepeso.");        
    }
    
    public static void AnalizarMayoriaEdad(Persona p1, Persona p2, Persona p3, Persona p4, PersonaServices ps)   {
        
        if (ps.esMayorEdad(p1))   {
            System.out.println(ps.mostrarNombrePersona(p1)+" es mayor de edad.");
        }
        else    {
            System.out.println(ps.mostrarNombrePersona(p1)+" es menor de edad.");
        }
        if (ps.esMayorEdad(p2))   {
            System.out.println(ps.mostrarNombrePersona(p2)+" es mayor de edad.");
        }
        else    {
            System.out.println(ps.mostrarNombrePersona(p2)+" es menor de edad.");
        }
        if (ps.esMayorEdad(p3))   {
            System.out.println(ps.mostrarNombrePersona(p3)+" es mayor de edad.");
        }
        else    {
            System.out.println(ps.mostrarNombrePersona(p3)+" es menor de edad.");
        }
        if (ps.esMayorEdad(p4))   {
            System.out.println(ps.mostrarNombrePersona(p4)+" es mayor de edad.");
        }
        else    {
            System.out.println(ps.mostrarNombrePersona(p4)+" es menor de edad.");
        }
    } 
    
}
