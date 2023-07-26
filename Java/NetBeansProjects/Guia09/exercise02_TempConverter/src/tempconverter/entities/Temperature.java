package tempconverter.entities;

public class Temperature {
    
    private String unit;
    private double temp;

    public Temperature() {
    }

    public Temperature(String unit, double temp) {
        this.unit = unit;
        this.temp = temp;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
    
    
    
}
