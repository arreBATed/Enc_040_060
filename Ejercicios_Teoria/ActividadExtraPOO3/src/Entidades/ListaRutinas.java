
package Entidades;

import java.util.ArrayList;

public class ListaRutinas {
    
    private ArrayList<Rutina> rutinaArray; 
    private int nroSecuenciaRutina;

    public ListaRutinas() {
    }

    public ListaRutinas(ArrayList<Rutina> rutinaArray, int nroSecuenciaRutina) {
        this.rutinaArray = rutinaArray;
        this.nroSecuenciaRutina = nroSecuenciaRutina;
    }

    public ArrayList<Rutina> getRutinaArray() {
        return rutinaArray;
    }

    public void setRutinaArray(ArrayList<Rutina> rutinaArray) {
        this.rutinaArray = rutinaArray;
    }

    public int getNroSecuenciaRutina() {
        return nroSecuenciaRutina;
    }

    public void setNroSecuenciaRutina(int nroSecuenciaRutina) {
        this.nroSecuenciaRutina = nroSecuenciaRutina;
    }
    
    
}
