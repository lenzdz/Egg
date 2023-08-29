package entities;

import java.util.Objects;

public class Theater {
    
    private Movie movie;
    private Seat[][] cinema;
    private Integer price;

    public Theater() {
    }

    public Theater(Movie movie, Seat[][] cinema, Integer price) {
        this.movie = movie;
        this.cinema = cinema;
        this.price = price;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Seat[][] getCinema() {
        return this.cinema;
    }

    public void setCinema(Seat[][] cinema) {
        this.cinema = cinema;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Theater movie(Movie movie) {
        setMovie(movie);
        return this;
    }

    public Theater cinema(Seat[][] cinema) {
        setCinema(cinema);
        return this;
    }

    public Theater price(Integer price) {
        setPrice(price);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Theater)) {
            return false;
        }
        Theater theater = (Theater) o;
        return Objects.equals(movie, theater.movie) && Objects.equals(cinema, theater.cinema) && Objects.equals(price, theater.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, cinema, price);
    }

    @Override
    public String toString() {
        return "{" +
            " movie='" + getMovie() + "'" +
            ", cinema='" + getCinema() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }

}
