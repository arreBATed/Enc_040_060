
package Entidades;

public class Pelicula {
    
    private String titulo;
    private String genero;
    private Fecha año;
    private double duracion;
    
    public Pelicula() {
        
    }

    public Pelicula(String titulo, String genero, Fecha año, double duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.año = año;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Fecha getAño() {
        return año;
    }

    public void setAño(Fecha año) {
        this.año = año;
    }
    
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getDuracion() {
        return duracion;    
    }
}
