package utilidades;

import entities.Pelicula;
import java.util.Comparator;

public class Comparadores {
    
    public static Comparator<Pelicula> ordenarPorTitulo_AZ = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDirector_AZ = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDuracion_mM = new Comparator<Pelicula> () { // Menor a mayor
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDuracion_Mm = new Comparator<Pelicula> () { // Mayor a menor
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
}
