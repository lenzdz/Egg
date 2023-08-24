package alumnos;

import services.AlumnosServices;


public class AlumnosMain {
    
    public static void main(String[] args) {
    
        AlumnosServices servAlumnos = new AlumnosServices();
        
        servAlumnos.crearAlumnos();
        servAlumnos.mostrarAlumnos();
        
        servAlumnos.notaFinal();
        
    }
    
}
