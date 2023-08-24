package Entities;

public class Curso {
    
    private String nombreCurso;
    private int cantidadHorasDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private int precioHora;
    private String[] alumnos;

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasDia, int cantidadDiasPorSemana, String turno, int precioHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasDia = cantidadHorasDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasDia() {
        return cantidadHorasDia;
    }

    public void setCantidadHorasDia(int cantidadHorasDia) {
        this.cantidadHorasDia = cantidadHorasDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cantidadHorasDia=" + cantidadHorasDia + ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", turno=" + turno + ", precioHora=" + precioHora + ", alumnos=" + alumnos + '}';
    }
    
}
