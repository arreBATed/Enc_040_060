import servicios.*;

public class Gimnasio {
    public static void main(String[] args) throws Exception {
        ClienteServicio cliente1 = new ClienteServicio();
        ClienteServicio cliente2 = new ClienteServicio();
        ClienteServicio cliente3 = new ClienteServicio();
        ClienteServicio cliente4 = new ClienteServicio();
        ClienteServicio cliente5 = new ClienteServicio();
        RutinaServicio rutina1 = new RutinaServicio();
        RutinaServicio rutina2 = new RutinaServicio();
        RutinaServicio rutina3 = new RutinaServicio();
        RutinaServicio rutina4 = new RutinaServicio();
        RutinaServicio rutina5 = new RutinaServicio();
        cliente1.registrarCliente();
        cliente2.registrarCliente();
        cliente3.registrarCliente();
        cliente4.registrarCliente();
        cliente5.registrarCliente();
        rutina1.generarRutina();
        rutina2.generarRutina();
        rutina3.generarRutina();
        rutina4.generarRutina();
        rutina5.generarRutina();
        ClienteServicio.obtenerClientes();
        RutinaServicio.obtenerRutinas();
        ClienteServicio.actualizarCliente(2, "yo yo", 24, 175, 84, "llegar al verano");
        ClienteServicio.obtenerClientes();
        RutinaServicio.actualizarRutina(3, "cardio", 1, 1, "resistencia");
        RutinaServicio.obtenerRutinas();
        ClienteServicio.eliminarCliente(3);
        ClienteServicio.obtenerClientes();
        RutinaServicio.eliminarRutina(4);
        RutinaServicio.obtenerRutinas();
    }
}
