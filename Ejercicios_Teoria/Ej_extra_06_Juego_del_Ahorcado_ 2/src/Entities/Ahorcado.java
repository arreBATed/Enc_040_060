
package Entities;

public class Ahorcado {
    
    private String[] palabraIngresada;
    private String[] ahorcado;
    private String[] letrasJugadas;
    private String[] palabraJugada;
    private int extensionPalabra;
    private int cantidadAciertos;
    private int cantidadIntentos;
    private int posicionAhorcado; 


    public Ahorcado() {
    }

    public Ahorcado(String[] palabraIngresada, String[] ahorcado, String[] letrasJugadas, String[] palabraJugada, int extensionPalabra, int cantidadAciertos, int cantidadIntentos, int posicionAhorcado) {
        this.palabraIngresada = palabraIngresada;
        this.ahorcado = ahorcado;
        this.letrasJugadas = letrasJugadas;
        this.palabraJugada = palabraJugada;
        this.extensionPalabra = extensionPalabra;
        this.cantidadAciertos = cantidadAciertos;
        this.cantidadIntentos = cantidadIntentos;
        this.posicionAhorcado = posicionAhorcado;
    }

    public String[] getPalabraIngresada() {
        return palabraIngresada;
    }

    public void setPalabraIngresada(String[] palabraIngresada) {
        this.palabraIngresada = palabraIngresada;
    }

    public String[] getAhorcado() {
        return ahorcado;
    }

    public void setAhorcado(String[] ahorcado) {
        this.ahorcado = ahorcado;
    }

    public String[] getLetrasJugadas() {
        return letrasJugadas;
    }

    public void setLetrasJugadas(String[] letrasJugadas) {
        this.letrasJugadas = letrasJugadas;
    }

    public String[] getPalabraJugada() {
        return palabraJugada;
    }

    public void setPalabraJugada(String[] palabraJugada) {
        this.palabraJugada = palabraJugada;
    }

    public int getExtensionPalabra() {
        return extensionPalabra;
    }

    public void setExtensionPalabra(int extensionPalabra) {
        this.extensionPalabra = extensionPalabra;
    }

    public int getCantidadAciertos() {
        return cantidadAciertos;
    }

    public void setCantidadAciertos(int cantidadAciertos) {
        this.cantidadAciertos = cantidadAciertos;
    }

    public int getCantidadIntentos() {
        return cantidadIntentos;
    }

    public void setCantidadIntentos(int cantidadIntentos) {
        this.cantidadIntentos = cantidadIntentos;
    }

    public int getPosicionAhorcado() {
        return posicionAhorcado;
    }

    public void setPosicionAhorcado(int posicionAhorcado) {
        this.posicionAhorcado = posicionAhorcado;
    }

}