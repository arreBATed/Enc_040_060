
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class CursoServicios {
    
    public Curso crearCurso()   {
        
        Curso c;
        int opcion;
        
        Scanner leer = new Scanner(System.in);
        c = new Curso();
        System.out.print("Ingrese el nombre del curso: ");
        c.setNombreCurso(leer.nextLine());
        System.out.println();
        System.out.print("Ingrese la duracion del curso por dia (en horas): ");
        c.setCantHorasPorDia(leer.nextInt());
        System.out.println();
        System.out.print("Ingrese la cantidad de clase por semana: ");
        c.setCantDiasPorSemana(leer.nextInt());
        System.out.println();
        boolean valido = true;
        do {
            System.out.println("Ingrese una de las opciones para el turno del curso...");
            System.out.println("1.- Turno Mañana.");
            System.out.println("2.- Turno Tarde.");
            System.out.print("Elija una de las opciones (1 o 2): ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                        c.setTurno("mañana");
                        valido = false;
                        break;
                case 2:
                        c.setTurno("tarde");
                        valido = false;
                        break;
                default:
                        System.out.println("Ingreso una opcion no valida. Intentelo nuevamente...");                        
            }
        } while (valido);
        System.out.println();
        System.out.print("Ingrese el precio por hora del curso: ");
        c.setPrecioPorHora(leer.nextDouble());
        System.out.println();               
        c.setAlumnos(new String[5]);
        c.setAlumnos(cargarAlumnos());
        return c;
    }
    
    private String[] cargarAlumnos()    {
        
        String[] cadenaAux;
        
        Scanner leer = new Scanner(System.in);
        cadenaAux = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del #"+i+1+" alumno: ");
            cadenaAux[i] = leer.nextLine();
            System.out.println();
        }
        return cadenaAux;
    }
    
    public double calcularGananciaSemanal(Curso c) {
        
        double resultado;
        
        resultado = c.getCantDiasPorSemana() * c.getPrecioPorHora() * c.getCantDiasPorSemana() * 5;
        return resultado;
    }
}
