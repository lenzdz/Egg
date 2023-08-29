package MovieTheaterApp;
import java.util.ArrayList;
import java.util.Random;

import entities.Movie;
import entities.Seat;
import entities.Theater;
import entities.Viewer;
import services.MovieServices;
import services.SeatServices;
import services.TheaterServices;
import services.ViewerServices;

public class App {
    public static void main(String[] args) throws Exception {

        Random rand = new Random();
        TheaterServices servTheater = new TheaterServices();
        SeatServices servSeat = new SeatServices();
        MovieServices servMovies = new MovieServices();
        ViewerServices servViewer = new ViewerServices();

        // Crear sala de cine vacía
        Seat[][] cinema = servSeat.createSeats();

        // Crear películas disponibles para reproducción
        ArrayList<Movie> listMovies = servMovies.createMovies();
        Movie todaysMovie = listMovies.get(rand.nextInt(listMovies.size()));

        // Crear posibles espectadores
        ArrayList<Viewer> listViewers = servViewer.createViewers();

        // Crear cinema
        Theater todaysTheater = servTheater.createTodaysTheater(todaysMovie, cinema);

        // Imprimir información
        System.out.println("La función de hoy presentará " + todaysTheater.getMovie().getTitle() 
            + ", por " + todaysTheater.getMovie().getDirector() + ". [Valor boleta = " + todaysTheater.getPrice() + "]\n");

        // Vender boletos
        todaysTheater = servTheater.sellTickets(todaysTheater, listViewers);

        servSeat.printSeats(todaysTheater.getCinema());


    }
}
