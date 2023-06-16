
package ej_05_banco;

import Entidades.Cuenta;
import Servicios.CuentaServicios;
import java.util.Scanner;

public class Ej_05_Banco {

    public static void main(String[] args) {
        
        int opcion;
        double dinero;
        
        CuentaServicios cuentaServicio = new CuentaServicios();
        
        Cuenta cuentaBancaria = cuentaServicio.crearCuenta();
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        do {
            System.out.println("---- Menu Banelco ------ ");
            System.out.println("1) Ingresar dinero.- ");
            System.out.println("2) Retirar dinero.- ");
            System.out.println("3) Extraccion rapida (solo 20%).- ");
            System.out.println("4) Consultar saldo.- ");
            System.out.println("5) Consultar datos de la cuenta.- ");
            System.out.println("6) Salir.- ");
            System.out.print("Ingrese una de las opciones (1-6):");
            opcion = leer.nextInt();
            System.out.println();
            switch (opcion) {
                case 1: 
                        System.out.print("Ingrese el monto a ingresar :$ ");
                        dinero = leer.nextDouble();
                        System.out.println();
                        cuentaServicio.Ingresar(cuentaBancaria,dinero);
                        break;
                case 2:
                        System.out.print("Ingrese el monto a retirar :$ ");
                        dinero = leer.nextDouble();
                        System.out.println();
                        cuentaServicio.Retirar(cuentaBancaria,dinero);
                        break;
                case 3:
                        System.out.print("Ingrese el monto de extraccion rapida a retirar :$ ");
                        dinero = leer.nextDouble();
                        System.out.println();
                        cuentaServicio.ExtraccionRapida(cuentaBancaria,dinero);
                        break;
                case 4:        
                        cuentaServicio.ConsultarSaldo(cuentaBancaria);
                        System.out.println();
                        break;
                case 5:
                        cuentaServicio.ConsultarDatos(cuentaBancaria);
                        System.out.println();
                        break;
                case 6:
                        System.out.print("Gracias por utilizar el Banelco!");
                        continuar = false;
                        break;
                default:
                        System.out.print("La opcion ingresada no es valida. Intente otra vez");
            }              
        } while (continuar);       
    }
    
}
