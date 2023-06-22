
package actividadextrapoo1_1;

import Entidades.Vehiculo;
import Servicios.VehiculoServicio;

public class ActividadExtraPOO1_1 {


    public static void main(String[] args) {
        
        VehiculoServicio vs = new VehiculoServicio();
        Vehiculo vehiculo1 = vs.crearVehiculo();
        Vehiculo vehiculo2 = vs.crearVehiculo();
        Vehiculo vehiculo3 = vs.crearVehiculo();
        
        int t = 5; 
        System.out.println("Para "+t+" segundos....");
        System.out.println("El vehiculo 1 ("+vs.modeloVehiculo(vehiculo1)+") avanzo "+vs.moverse(vehiculo1,t)+" metros.");
        System.out.println("El vehiculo 2 ("+vs.modeloVehiculo(vehiculo2)+") avanzo "+vs.moverse(vehiculo2,t)+" metros.");
        System.out.println("El vehiculo 3 ("+vs.modeloVehiculo(vehiculo3)+") avanzo "+vs.moverse(vehiculo3,t)+" metros.");
        t = 10; 
        System.out.println("Para "+t+" segundos....");
        System.out.println("El vehiculo 1 ("+vs.modeloVehiculo(vehiculo1)+") avanzo "+vs.moverse(vehiculo1,t)+" metros.");
        System.out.println("El vehiculo 2 ("+vs.modeloVehiculo(vehiculo2)+") avanzo "+vs.moverse(vehiculo2,t)+" metros.");
        System.out.println("El vehiculo 3 ("+vs.modeloVehiculo(vehiculo3)+") avanzo "+vs.moverse(vehiculo3,t)+" metros.");
        t = 60; 
        System.out.println("Para "+t+" segundos....");
        System.out.println("El vehiculo 1 ("+vs.modeloVehiculo(vehiculo1)+") avanzo "+vs.moverse(vehiculo1,t)+" metros.");
        System.out.println("El vehiculo 2 ("+vs.modeloVehiculo(vehiculo2)+") avanzo "+vs.moverse(vehiculo2,t)+" metros.");
        System.out.println("El vehiculo 3 ("+vs.modeloVehiculo(vehiculo3)+") avanzo "+vs.moverse(vehiculo3,t)+" metros.");
        
        t = 300; 
        System.out.println("Para "+t+" segundos (con freanje)....");
        System.out.println("El vehiculo 1 ("+vs.modeloVehiculo(vehiculo1)+") avanzo "+vs.frenar(vehiculo1,(vs.moverse(vehiculo1,t)))+" metros.");
        System.out.println("El vehiculo 2 ("+vs.modeloVehiculo(vehiculo2)+") avanzo "+vs.frenar(vehiculo2,(vs.moverse(vehiculo2,t)))+" metros.");
        System.out.println("El vehiculo 3 ("+vs.modeloVehiculo(vehiculo3)+") avanzo "+vs.frenar(vehiculo3,(vs.moverse(vehiculo3,t)))+" metros.");
    }  

}
