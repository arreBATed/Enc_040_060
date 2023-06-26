
package Servicios;

import Entidades.Matematica;
import java.util.Scanner;


public class MatematicaServicios {
    
    public Matematica crearMatematica() {
    
        Matematica m;
    
        m = new Matematica();
        double numero = (double) (Math.random() * 10.00);
        m.setNumero1(numero);
        numero = (double) (Math.random() * 10.00);
        m.setNumero2(numero);
        return m;    
    }       
    
    public double devolverMayor(Matematica m)   {
        
            return Math.max(m.getNumero1(),m.getNumero2());
    }
    
    public double calcularPotencia(Matematica m)    {
        
        if (m.getNumero1() <= m.getNumero2())   {
            return (Math.pow(m.getNumero2(),m.getNumero1()));
        }
        else    {
            return (Math.pow(m.getNumero1(),m.getNumero2()));
        }        
    }
    
    public double calcularRaiz(Matematica m)    {
        
        if (m.getNumero1() < m.getNumero2())   {            
            double numAux = Math.abs(m.getNumero1());
            return (Math.pow(numAux,(1 / m.getNumero2())));
        }
        else    {
            double numAux = Math.abs(m.getNumero2());
            return (Math.pow(numAux,(1 / m.getNumero1())));
        }
    }
    
    public void MostrarMatematica(Matematica m) {
        
        System.out.println("El numero 1 tiene valor "+m.getNumero1()+" y el numero 2 tiene valor "+m.getNumero2());
    }
    
}
