package Entities;

public class Cadena {
    
    private String cad;
    private Integer length;

    public Cadena() {
    }

    public String getCad() {
        return cad;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Cadena{" + "cad=" + cad + ", length=" + length + '}';
    }
    
}
