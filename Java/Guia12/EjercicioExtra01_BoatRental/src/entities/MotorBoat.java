package entities;

public class MotorBoat extends Boat {

    private Double power;

    public MotorBoat() {
    }

    public MotorBoat(Double power) {
        this.power = power;
    }

    public MotorBoat(Integer plate, Double totalLength, Integer year, Double power) {
        super(plate, totalLength, year);
        this.power = power;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "MotorBoat {" +
                "plate=" + plate +
                ", totalLength=" + totalLength +
                ", year=" + year +
                ", power=" + power +
                '}';
    }

    @Override
    public Double moduleValue() {
        return super.moduleValue() + this.power;
    }

}
