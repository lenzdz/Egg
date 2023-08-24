package ejercicio13_curso;

import Entities.Curso;
import Services.CursoServices;

public class Ejercicio13_Curso {

    public static void main(String[] args) {
        
        CursoServices servCurso = new CursoServices();
        
        Curso curso1 = servCurso.crearCurso();
        System.out.println(curso1);
        
        servCurso.calcularGananciaSemanal(curso1);
        
    }
    
}
