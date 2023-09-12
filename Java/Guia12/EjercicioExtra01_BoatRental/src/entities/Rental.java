package entities;

import java.time.LocalDate;

public class Rental {

    private String clientName;
    private Integer id;
    private LocalDate initRental;
    private LocalDate endRental;
    private Integer position;
    private Boat boat;

    public Rental() {
    }

    public Rental(String clientName, Integer id, LocalDate initRental, LocalDate endRental, Integer position, Boat boat) {
        this.clientName = clientName;
        this.id = id;
        this.initRental = initRental;
        this.endRental = endRental;
        this.position = position;
        this.boat = boat;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getInitRental() {
        return initRental;
    }

    public void setInitRental(LocalDate initRental) {
        this.initRental = initRental;
    }

    public LocalDate getEndRental() {
        return endRental;
    }

    public void setEndRental(LocalDate endRental) {
        this.endRental = endRental;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    @Override
    public String toString() {
        return "Rental {" +
                "clientName='" + clientName +
                ", id=" + id +
                ", initRental=" + initRental +
                ", endRental=" + endRental +
                ", position=" + position +
                ", boat=" + boat +
                '}';
    }

}
