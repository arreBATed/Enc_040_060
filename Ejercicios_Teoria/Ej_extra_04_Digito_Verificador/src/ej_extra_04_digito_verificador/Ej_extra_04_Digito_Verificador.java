
package ej_extra_04_digito_verificador;

import Entities.Nif;
import Services.NifServices;

public class Ej_extra_04_Digito_Verificador {

    public static void main(String[] args) {
        
            NifServices ns = new NifServices();
            Nif n = ns.crearNIF();
            ns.mostrar(n);        
    }
    
}
