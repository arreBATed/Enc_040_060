
package Entities;

public class Ahorcado {
    
    private char [] palabra;
    private int letrasEncontradas;
    private int cantJugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int letrasEncontradas, int cantJugadasMaximas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantJugadasMaximas() {
        return cantJugadasMaximas;
    }

    public void setCantJugadasMaximas(int cantJugadasMaximas) {
        this.cantJugadasMaximas = cantJugadasMaximas;
    }
}
