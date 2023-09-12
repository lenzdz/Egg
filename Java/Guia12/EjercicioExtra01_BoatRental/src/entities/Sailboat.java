package entities;

public class Sailboat extends Boat{

    private Integer mastNumber;

    public Sailboat() {
    }

    public Sailboat(Integer mastNumber) {
        this.mastNumber = mastNumber;
    }

    public Sailboat(Integer plate, Double totalLength, Integer year, Integer mastNumber) {
        super(plate, totalLength, year);
        this.mastNumber = mastNumber;
    }

    public Integer getMastNumber() {
        return mastNumber;
    }

    public void setMastNumber(Integer mastNumber) {
        this.mastNumber = mastNumber;
    }

    @Override
    public String toString() {
        return "Sailboat {" +
                "plate=" + plate +
                ", totalLength=" + totalLength +
                ", year=" + year +
                ", mastNumber=" + mastNumber +
                '}';
    }

    @Override
    public Double moduleValue() {
        return super.moduleValue() + this.mastNumber;
    }
}
