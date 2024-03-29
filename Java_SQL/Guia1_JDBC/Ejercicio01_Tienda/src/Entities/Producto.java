package Entities;

public class Producto {

    private Long codigo;
    private String nombre;
    private Double precio;
    private Long codigoFabricante;

    public Producto() {
    }

    public Producto(Long codigo, String nombre, Double precio, Long codigoFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Long getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(Long codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo= " + codigo +
                ", nombre= '" + nombre + '\'' +
                ", precio= " + precio +
                ", codigoFabricante= " + codigoFabricante +
                '}';
    }
}
