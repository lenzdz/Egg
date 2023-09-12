package entities;

public class Yatch extends Boat {

    private Double power;
    private Integer cabinNumber;

    public Yatch() {
    }

    public Yatch(Double power, Integer cabinNumber) {
        this.power = power;
        this.cabinNumber = cabinNumber;
    }

    public Yatch(Integer plate, Double totalLength, Integer year, Double power, Integer cabinNumber) {
        super(plate, totalLength, year);
        this.power = power;
        this.cabinNumber = cabinNumber;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Integer getCabinNumber() {
        return cabinNumber;
    }

    public void setCabinNumber(Integer cabinNumber) {
        this.cabinNumber = cabinNumber;
    }

    @Override
    public String toString() {
        return "Yatch {" +
                "plate=" + plate +
                ", totalLength=" + totalLength +
                ", year=" + year +
                ", power=" + power +
                ", cabinNumber=" + cabinNumber +
                '}';
    }

    @Override
    public Double moduleValue() {
        return super.moduleValue() + this.power + this.cabinNumber;
    }
}
