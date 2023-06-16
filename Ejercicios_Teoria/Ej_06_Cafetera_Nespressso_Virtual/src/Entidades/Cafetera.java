
package Entidades;

public class Cafetera {
    
        double capacidadMaxima;
        double cantidadActual;
        
        public Cafetera()   {
            
        }
        
        public Cafetera(double cMax, double cMin)   {
            
            capacidadMaxima = cMax;
            cantidadActual = cMin;
        }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
        
        
    
}
