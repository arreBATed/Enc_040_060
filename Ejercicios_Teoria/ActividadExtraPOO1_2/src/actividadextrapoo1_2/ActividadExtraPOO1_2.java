
package actividadextrapoo1_2;

import Entidades.Figura;
import Servicios.FiguraServicios;

public class ActividadExtraPOO1_2 {

    public static void main(String[] args) {
      
        FiguraServicios fs = new FiguraServicios();
        Figura f = fs.crearFigura();
        
        fs.MostrarFigura(f);
                
    }
    
}
