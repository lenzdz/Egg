package Entities;

public class Fabricante {

    private Long codigo;
    private String nombre;

    public Fabricante() {
    }

    public Fabricante(Long codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Fabricante{" +
                "codigo= " + codigo +
                ", nombre= '" + nombre + '\'' +
                '}';
    }
}
