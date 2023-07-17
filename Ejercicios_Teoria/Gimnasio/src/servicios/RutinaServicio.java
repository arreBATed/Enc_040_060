package servicios;

import java.util.ArrayList;
import entidades.Rutina;
import java.util.Scanner;

public class RutinaServicio {
    private Rutina rutina = new Rutina();
    private static ArrayList<Rutina> rutinaArray = new ArrayList<>();
    private static int i = 0;
    Scanner read = new Scanner(System.in);
    public void generarRutina() {
        rutina.setId(i);
        i += 1;
        System.out.print("Ingrese el nombre de la rutina: ");
        rutina.setNombre(read.nextLine());
        System.out.print("Ingrese una descripción de la rutina: ");
        rutina.setDescripcion(read.nextLine());
        System.out.print("Ingrese el nivel de dificultad: ");
        rutina.setNivelDificultad(read.nextInt());
        System.out.print("Ingrese la duración de la rutina: ");
        rutina.setDuracion(read.nextInt());
        crearRutina(rutina);
    }
    public void crearRutina(Rutina rutina) {
        rutinaArray.add(rutina);
        System.out.println("Rutina agregada exitosamente.");
    }
    public static void obtenerRutinas() {
        System.out.println(rutinaArray);
    }
    public static void actualizarRutina(int id, String nombre, int duracion, int nivelDificultad, String descripcion) {
        for (int i=0; i<rutinaArray.size(); i++) {
            if (rutinaArray.get(i).getId()==id) {
                rutinaArray.get(i).setNombre(nombre);
                rutinaArray.get(i).setDuracion(duracion);
                rutinaArray.get(i).setNivelDificultad(nivelDificultad);
                rutinaArray.get(i).setDescripcion(descripcion);
                System.out.println("La rutina se actualizó correctamente.");
                break;
            }
            if (i == rutinaArray.size()-1) {
                System.out.println("No se encontró la rutina.");
            }
        }
    }
    public static void eliminarRutina(int id) {
        for (int i=0; i<rutinaArray.size(); i++) {
            if (rutinaArray.get(i).getId()==id) {
                rutinaArray.remove(i);
                System.out.println("La rutina se eliminó correctamente.");
                break;
            }
            if (i == rutinaArray.size()-1) {
                System.out.println("No se encontró la rutina.");
            }
        }
    }
}
