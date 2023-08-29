package entities;
import java.util.Objects;

public class Seat implements Comparable<Seat> {
    
    private String seat;
    private Boolean occupied;

    public Seat() {
    }

    public Seat(String seat) {
        this.seat = seat;
        this.occupied = false;
    }

    public String getSeat() {
        return this.seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public Boolean isOccupied() {
        return this.occupied;
    }

    public Boolean getOccupied() {
        return this.occupied;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }

    public Seat seat(String seat) {
        setSeat(seat);
        return this;
    }

    public Seat occupied(Boolean occupied) {
        setOccupied(occupied);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Seat)) {
            return false;
        }
        Seat seat = (Seat) o;
        return Objects.equals(seat, seat.seat) && Objects.equals(occupied, seat.occupied);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seat, occupied);
    }

    @Override
    public String toString() {
        return "{" +
            " seat='" + getSeat() + "'" +
            ", occupied='" + isOccupied() + "'" +
            "}";
    }

    @Override
    public int compareTo(Seat seat) {
        return seat.getSeat().compareTo(this.getSeat());
    }

}
