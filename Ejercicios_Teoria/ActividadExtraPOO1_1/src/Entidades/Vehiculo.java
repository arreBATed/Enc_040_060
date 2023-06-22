
package Entidades;

import java.time.Year;
import java.util.Date;


public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int anio;
    private int tipo; 
    
    
    public Vehiculo() {
    
    }

    public Vehiculo(String marca, String modelo, int anio, int tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
}
