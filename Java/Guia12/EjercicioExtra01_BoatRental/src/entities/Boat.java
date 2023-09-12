package entities;

public class Boat {

    protected Integer plate;
    protected Double totalLength;
    protected Integer year;

    public Boat() {
    }

    public Boat(Integer plate, Double totalLength, Integer year) {
        this.plate = plate;
        this.totalLength = totalLength;
        this.year = year;
    }

    public Integer getPlate() {
        return plate;
    }

    public void setPlate(Integer plate) {
        this.plate = plate;
    }

    public Double getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(Double totalLength) {
        this.totalLength = totalLength;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Boat {" +
                "plate=" + plate +
                ", totalLength=" + totalLength +
                ", year=" + year +
                '}';
    }

    public Double moduleValue() {
        return this.totalLength * 10;
    }

}
