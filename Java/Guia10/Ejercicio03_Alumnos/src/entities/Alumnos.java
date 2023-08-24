package entities;

import java.util.Arrays;

public class Alumnos {
    
    private String nombre;
    private Integer[] calificaciones;

    public Alumnos() {
    }

    public Alumnos(String nombre, Integer[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Integer[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", calificaciones=" + Arrays.toString(calificaciones) + '}';
    }
    
}
