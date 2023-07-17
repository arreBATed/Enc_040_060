package servicios;

import entidades.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteServicio {
    Scanner read = new Scanner(System.in);
    private Cliente cliente = new Cliente();
    private static ArrayList<Cliente> clienteArray = new ArrayList<>();
    private static int i = 0;
    public void registrarCliente() {
        cliente.setId(i);
        i += 1;
        System.out.print("Ingrese el nombre del cliente: ");
        cliente.setNombre(read.nextLine());
        System.out.print("Ingrese el objetivo del cliente: ");
        cliente.setObjetivo(read.nextLine());
        System.out.print("Ingrese la edad: ");
        cliente.setEdad(read.nextInt());
        System.out.print("Ingrese la altura en centímetros: ");
        cliente.setAltura(read.nextInt());
        System.out.print("Ingrese el peso en kg: ");
        cliente.setPeso(read.nextInt());
        clienteArray.add(cliente);
    }
    public static void obtenerClientes() {
        System.out.println(clienteArray);
    }
    public static void actualizarCliente(int id, String nombre, int edad, int altura, double peso, String objetivo) {
        for (int i=0; i<clienteArray.size(); i++) {
            if (clienteArray.get(i).getId()==id) {
                clienteArray.get(i).setNombre(nombre);
                clienteArray.get(i).setEdad(edad);
                clienteArray.get(i).setAltura(altura);
                clienteArray.get(i).setPeso(peso);
                clienteArray.get(i).setObjetivo(objetivo);
                System.out.println("El cliente se actualizó correctamente.");
                break;
            }
            if (i == clienteArray.size()-1) {
                System.out.println("No se encontró el cliente.");
            }
        }
    }
    public static void eliminarCliente(int id) {
        for (int i=0; i<clienteArray.size(); i++) {
            if (clienteArray.get(i).getId()==id) {
                clienteArray.remove(i);
                System.out.println("El cliente se eliminó correctamente.");
                break;
            }
            if (i == clienteArray.size()-1) {
                System.out.println("No se encontró el cliente.");
            }
        }
    }
}
