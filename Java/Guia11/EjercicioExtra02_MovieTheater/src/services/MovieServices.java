package services;

import java.util.ArrayList;

import entities.Movie;

public class MovieServices {
    
    public ArrayList<Movie> createMovies() {
        
        ArrayList<Movie> listMovies = new ArrayList<>();

        listMovies.add(new Movie("Barbie", "Greta Gerwig", 114, 13));
        listMovies.add(new Movie("Ponyo", "Hayao Miyazaki", 103, 0));
        listMovies.add(new Movie("El aro", "Gore Verbinski", 115, 18));
        listMovies.add(new Movie("Guerra fría", "Pawel Pawlikowski", 90, 12));
        listMovies.add(new Movie("Super Mario Bros. La película", "Aaron Horvath", 92, 7));

        return listMovies;

    }

}
