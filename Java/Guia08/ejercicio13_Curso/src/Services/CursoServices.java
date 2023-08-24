package Services;

import Entities.Curso;
import java.util.Scanner;

public class CursoServices {
    
    Scanner input = new Scanner(System.in, "Windows-1252");
    
    public Curso crearCurso() {
        
        System.out.println("Ingrese el nombre del curso:");
        String nombreCurso = input.nextLine();
        
        System.out.println("Ingrese la cantidad de horas que se imparten por día:");
        int cantidadHorasDia = input.nextInt();
        
        System.out.println("Ingrese la cantidad de días por semana que se imparte el curso:");
        int cantidadDiasPorSemana = input.nextInt();
        
        System.out.println("Ingrese el precio por hora:");
        int precioHora = input.nextInt();
        input.nextLine();
        
        String turno;
        do {
            
            System.out.println("Ingrese el turno (mañana o tarde):");
            turno = input.nextLine().toLowerCase();
            
            if (!turno.equals("mañana") && !turno.equals("tarde")) {
                System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
            
        } while (!turno.equals("mañana") && !turno.equals("tarde"));
        
        String alumnos[] = cargarAlumnos();
        
        return new Curso(nombreCurso, cantidadHorasDia, cantidadDiasPorSemana, turno, precioHora, alumnos);
        
    }
    
    public String[] cargarAlumnos() {
        
        System.out.println("Ingrese a continuación el nombre de sus alumnos.");
        
        String alumnos[] = new String[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno #" + (i+1));
            alumnos[i] = input.nextLine();
        }
        
        return alumnos;
        
    }
    
    public void calcularGananciaSemanal(Curso curso) {
        
        int gananciaSemanal = curso.getCantidadHorasDia() * curso.getPrecioHora() * curso.getCantidadDiasPorSemana() * 5;
        
        System.out.println("La ganancia semanal para el curso \"" + curso.getNombreCurso() + "\" es de " + gananciaSemanal);
        
    }
    
}
