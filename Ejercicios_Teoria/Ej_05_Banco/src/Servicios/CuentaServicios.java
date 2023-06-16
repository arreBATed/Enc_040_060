
package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

public class CuentaServicios {
    
        public Cuenta crearCuenta() {
            
            Cuenta c;
            
            c = new Cuenta();
            Scanner leer = new Scanner(System.in);    
            System.out.println("Creando una cuenta bancaria...  ");
            System.out.print("Ingrese el DNI del cliente: ");
            c.setDniCliente(leer.nextLong()); 
            System.out.println();
            int nroAux = (int) (Math.random() * 1000);
            System.out.println("Se genero automaticamente el numero de cuenta "+nroAux);
            c.setNumeroCuenta(nroAux); 
            System.out.print("Ingrese el saldo incial de la cuenta "+nroAux+": ($)"); 
            c.setSaldoActual(leer.nextDouble()); 
            System.out.println();
            return c;
        }
        
        public void Ingresar(Cuenta c, double ingreso)    {
    
            double saldo = c.getSaldoActual();
            c.setSaldoActual((saldo + ingreso));
            
        } 
        
        public void Retirar(Cuenta c, double egreso)    {
    
            double saldo = c.getSaldoActual();
            if (saldo >= c.getSaldoActual())    {
                    c.setSaldoActual((saldo - egreso));
            }
            else    {
                System.out.println("El saldo actual de la cuenta es de $"+saldo+". Se retira ese saldo y su cuenta quedara vacia.");
                c.setSaldoActual(0);                
            }          
        } 
        
        public void ExtraccionRapida(Cuenta c, double extraccion)    {
    
            if (extraccion < (c.getSaldoActual() * 0.20))    {
                    c.setSaldoActual(c.getSaldoActual() - (c.getSaldoActual()*0.20));
            }
            else    {
                System.out.println("El valor de extraccion supera el 20% del valor del saldo. No sera posible una extraccion rapida.");           
            }          
        } 
        
        public void ConsultarSaldo(Cuenta c) {
            
            System.out.println("El saldo actual es $"+c.getSaldoActual());
        }
        
        public void ConsultarDatos(Cuenta c) {
            
            System.out.println("El numero de cuenta es #"+c.getNumeroCuenta());
            System.out.println("El numero de DNI del propietario es #"+c.getDniCliente());
            System.out.println("El saldo actual de la cuenta es de $"+c.getSaldoActual());
        }
        
}
