package entities;

public class Watergun {
    
    private Integer currentPosition;
    private Integer waterPosition;

    public Watergun() {
    }

    public Watergun(Integer currentPosition, Integer waterPosition) {
        this.currentPosition = currentPosition;
        this.waterPosition = waterPosition;
    }

    public Integer getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Integer getWaterPosition() {
        return waterPosition;
    }

    public void setWaterPosition(Integer waterPosition) {
        this.waterPosition = waterPosition;
    }

    @Override
    public String toString() {
        return "Watergun{" + "currentPosition=" + currentPosition + ", waterPosition=" + waterPosition + '}';
    }
    
    
    
}
