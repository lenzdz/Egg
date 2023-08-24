package peliculas;

import services.PeliculaServices;

public class PeliculasMain {

    public static void main(String[] args) {
        
        PeliculaServices servPeliculas = new PeliculaServices();
        servPeliculas.menuCine();
        
    }
    
}
