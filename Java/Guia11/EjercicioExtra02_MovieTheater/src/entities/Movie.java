package entities;
import java.util.Objects;

public class Movie {
    
    private String title;
    private String director;
    private Integer time;
    private Integer minimumAge;

    public Movie() {
    }

    public Movie(String title, String director, Integer time, Integer minimumAge) {
        this.title = title;
        this.director = director;
        this.time = time;
        this.minimumAge = minimumAge;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getTime() {
        return this.time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getMinimumAge() {
        return this.minimumAge;
    }

    public void setMinimumAge(Integer minimumAge) {
        this.minimumAge = minimumAge;
    }

    public Movie title(String title) {
        setTitle(title);
        return this;
    }

    public Movie director(String director) {
        setDirector(director);
        return this;
    }

    public Movie time(Integer time) {
        setTime(time);
        return this;
    }

    public Movie minimumAge(Integer minimumAge) {
        setMinimumAge(minimumAge);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Movie)) {
            return false;
        }
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) && Objects.equals(director, movie.director) && Objects.equals(time, movie.time) && Objects.equals(minimumAge, movie.minimumAge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, director, time, minimumAge);
    }

    @Override
    public String toString() {
        return "{" +
            " title='" + getTitle() + "'" +
            ", director='" + getDirector() + "'" +
            ", time='" + getTime() + "'" +
            ", minimumAge='" + getMinimumAge() + "'" +
            "}";
    }
    
}
