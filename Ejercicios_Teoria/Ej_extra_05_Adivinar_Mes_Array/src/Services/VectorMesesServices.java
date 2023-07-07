
package Services;

import Entities.VectorMeses;


public class VectorMesesServices {
    
    public VectorMeses crearVectoMeses() {
        
        VectorMeses v;
        String[] vectorAux = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        
        
        v = new VectorMeses();
        v.setMes(vectorAux);
        return v;
    }
    
    public String obtenerMesAlAzar(VectorMeses v)   {
        
        String mes;
        
        int numero = (int) (Math.random() * 11) + 1;
        mes = v.getMes()[numero];
        return mes;
        
    }
    
    
}
