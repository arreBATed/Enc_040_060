package Entidades;

import java.util.Date;

public class Alquiler {
    
    private String peliculaAlquilada;
    private Fecha diaAlquiler;
    private Fecha diaDevolucion;
    private double precio;
    
    public Alquiler()   {
        
    }

    public Alquiler(String peliculaAlquilada, Fecha diaAlquiler, Fecha diaDevolucion) {
        this.peliculaAlquilada = peliculaAlquilada;
        this.diaAlquiler = diaAlquiler;
        this.diaDevolucion = diaDevolucion;
    }

    public String getPeliculaAlquilada() {
        return peliculaAlquilada;
    }

    public void setPeliculaAlquilada(String peliculaAlquilada) {
        this.peliculaAlquilada = peliculaAlquilada;
    }

    public Fecha getDiaAlquiler() {
        return diaAlquiler;
    }

    public void setDiaAlquiler(Fecha diaAlquiler) {
        this.diaAlquiler = diaAlquiler;
    }

    public Fecha getDiaDevolucion() {
        return diaDevolucion;
    }

    public void setDiaDevolucion(Fecha diaDevolucion) {
        this.diaDevolucion = diaDevolucion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
