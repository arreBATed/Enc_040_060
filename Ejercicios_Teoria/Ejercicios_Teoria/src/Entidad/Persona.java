package Entidad;

public class Persona {
    
    public String nombre;
    public String apellido;
    public int edad;
    
    public Persona()    {
        
    }
    
    public Persona(String n, String a, int e)   {
        
        nombre = n;
        apellido = a;
        edad = e;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
   
    
}
