
package Entidades;

import java.util.ArrayList;

public class ListaClientes {
    
    private ArrayList<Cliente> clienteArray; 
    private int nroSecuenciaCliente;

    public ListaClientes() {
    }

    public ListaClientes(ArrayList<Cliente> clienteArray, int nroSecuenciaCliente) {
        this.clienteArray = clienteArray;
        this.nroSecuenciaCliente = nroSecuenciaCliente;
    }

    public ArrayList<Cliente> getClienteArray() {
        return clienteArray;
    }

    public void setClienteArray(ArrayList<Cliente> clienteArray) {
        this.clienteArray = clienteArray;
    }

    public int getNroSecuenciaCliente() {
        return nroSecuenciaCliente;
    }

    public void setNroSecuenciaCliente(int nroSecuenciaCliente) {
        this.nroSecuenciaCliente = nroSecuenciaCliente;
    } 

}


