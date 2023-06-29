
package ej_13_clase_para_curso;

import Entidades.Curso;
import Servicios.CursoServicios;

public class Ej_13_Clase_para_Curso {

    public static void main(String[] args) {
        
        CursoServicios cs = new CursoServicios();
        Curso c = cs.crearCurso();
        
        System.out.println("La ganancia generada por el curso es de $"+cs.calcularGananciaSemanal(c));
        
    }
    
}
