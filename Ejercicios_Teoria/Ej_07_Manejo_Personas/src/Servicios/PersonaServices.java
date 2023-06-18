
package Servicios;

import Entidades.Persona;
import java.util.HashSet;
import java.util.Scanner;

public class PersonaServices {
    
    public Persona crearPersona()   {
        
        Persona p;
    
        Scanner leer = new Scanner(System.in);
        p = new Persona();
        System.out.println(".. MODO DIOS... Creando persona....");
        System.out.print("Ingrese el nombre de la persona: ");
        p.setNombre(leer.nextLine());
        System.out.println();
        System.out.print("Ingrese la edad de "+p.getNombre()+": ");
        p.setEdad(leer.nextInt());
        System.out.println();
        boolean correcto = true;
        String aux;
        do {
            System.out.print("Ingrese el sexo de "+p.getNombre()+"(H o M): ");
            aux = leer.nextLine();
            aux = aux.toUpperCase();
            if ((aux.equals("H")) || (aux.equals("M"))) {
                if (aux.equals("H"))    {
                        p.setSexo(aux);
                }
                else    {
                        p.setSexo(aux);
                }
                correcto = false;
            }
            else    {
                System.out.println("Mmmm.. ingresaste mal el tipo de sexo.. es H o M... proba de nuevo");
            }
        } while (correcto);
        System.out.println();
        System.out.print("Ingrese el peso (en Kg) de "+p.getNombre()+": ");
        p.setPeso(leer.nextDouble());
        System.out.println();
        System.out.print("Ingrese la altura (en Mts)de "+p.getNombre()+": ");
        p.setAltura(leer.nextDouble());
        System.out.println("Listo. La "+p.getNombre()+" a sido creado.");
        return p;
    }
    
    public int calcularIMC(Persona p)   {
        
        double valorIMC;
        int imc;
            
        valorIMC = p.getAltura() / (p.getPeso() * p.getPeso());
        if (valorIMC < 20)  {
                imc = -1;
        }
        else    {
            if ((valorIMC >= 20)&&(valorIMC <= 25))    {
                    imc = 0;
            }
            else    {
                    imc = 1;
            }
        }
        return imc;
    }
    
    public boolean esMayorEdad(Persona p)   {
       
        boolean mayoria;
        
        mayoria = false;
        if (p.getEdad() >= 18)  {
                mayoria = (true);
        }
        return mayoria;
    }

    public String mostrarNombrePersona(Persona p)   {
        
        String nombre;
        
        nombre = p.getNombre();
        return nombre;
    }
    
}
