
package Servicios;

import Entidades.Figura;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class FiguraServicios {
    
    public Figura crearFigura() {
    
        Figura auxFig;
        boolean validez;
        int opcion;
        double aux1, aux2, aux3;
        
        Scanner leer = new Scanner(System.in);
        auxFig = new Figura();
        System.out.println("Creando una figura....");
        validez = true;
        do  {
            System.out.println("Ingrese que figura quiere crear...");
            System.out.println("1.- Cuadrado.");
            System.out.println("2.- Rectangulo.");
            System.out.println("3.- Triangulo.");
            System.out.println("4.- Circulo.");
            System.out.println("5.- Hexagono.");
            System.out.println("6.- Pentagono.");
            System.out.println("7.- Rombo.");
            System.out.print("Que figura desea crear? (1 a 7): ");
            opcion = leer.nextInt();
            auxFig.setTipo(opcion);
            switch (opcion) {
                case 1 : 
                        System.out.print("Ingrese la medida de lado del cuadrado: ");
                        aux1 = leer.nextDouble();                
                        auxFig.setArea(Math.pow(aux1,2));
                        auxFig.setPerimetro(4*aux1);
                        validez = false;
                        break;
                case 2 :
                        System.out.print("Ingrese la medida de la base del rectangulo: ");
                        aux1 = leer.nextDouble();
                        System.out.print("Ingrese la medida de la altura del rectangulo: ");
                        aux2 = leer.nextDouble();
                        auxFig.setArea(aux1 * aux2);
                        auxFig.setPerimetro((2*aux1)+(2*aux2));
                        validez = false;
                        break;
                case 3 :
                        System.out.print("Ingrese la medida de la base del triangulo equilatero: ");
                        aux1 = leer.nextDouble();
                        System.out.print("Ingrese la medida de la altura del triangulo equilatero: ");
                        aux2 = leer.nextDouble();
                        auxFig.setArea((aux1 * aux2) / 2);
                        auxFig.setPerimetro(3 * aux1);
                        validez = false;
                        break;
                case 4 :
                        System.out.print("Ingrese el radio del circulo: ");
                        aux1 = leer.nextDouble();
                        auxFig.setArea(aux1 * Math.PI);
                        auxFig.setPerimetro(2 * aux1 * Math.PI);
                        validez = false;
                        break;
                case 5 :
                        System.out.print("Ingrese la medida de los lados del hexagono: ");
                        aux1 = leer.nextDouble();
                        auxFig.setPerimetro(6 * aux1);
                        System.out.print("Ingrese la medida de la apotema del hexagono: ");
                        aux2 = leer.nextDouble();
                        auxFig.setArea((auxFig.getPerimetro() * aux2)/2);                        
                        validez = false;
                        break;
                case 6 :
                        System.out.print("Ingrese la medida de los lados del pentagono: ");
                        aux1 = leer.nextDouble();
                        auxFig.setPerimetro(5 * aux1);
                        System.out.print("Ingrese la medida de la apotema del pentagono: ");
                        aux2 = leer.nextDouble();
                        auxFig.setArea((auxFig.getPerimetro() * aux2)/2);                        
                        validez = false;
                        break;
                case 7: 
                        System.out.print("Ingrese la medida de la diagonal mayor del rombo: ");
                        aux1 = leer.nextDouble();
                        System.out.print("Ingrese la medida de la digaonal menor del rombo: ");
                        aux2 = leer.nextDouble();
                        System.out.print("Ingrese la medida de los lados del rombo: ");
                        aux3 = leer.nextDouble();
                        auxFig.setArea((aux1 * aux2) / 2); 
                        auxFig.setPerimetro(4 * aux3);                       
                        validez = false;
                        break;
                default:     
                        System.out.println("Esa opcion no es correcta. Intente de nuevo....");
            }
        } while (validez);
        return auxFig;   
    }
    
    public void MostrarFigura(Figura f) {
        
        switch (f.getTipo()) {
            case 1: 
                    System.out.print("La figura es un cuadrado ");
                    break;
            case 2: 
                    System.out.print("La figura es un rectangulo ");
                    break;
            case 3: 
                    System.out.print("La figura es un triangulo ");
                    break;
            case 4: 
                    System.out.print("La figura es un cirulo");
                    break;
            case 5: 
                    System.out.print("La figura es un hexagono ");
                    break;
            case 6: 
                    System.out.print("La figura es un pentagono ");
                    break;
            case 7: 
                    System.out.print("La figura es un rombo ");
                    break;
            default:
                    System.out.println("Error con la figura");
        }
        System.out.println("y su area es "+f.getArea()+" y su perimetro es "+f.getPerimetro()+".");    
    }
}
