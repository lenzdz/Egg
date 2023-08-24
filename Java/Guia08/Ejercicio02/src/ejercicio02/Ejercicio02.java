package ejercicio02;

import entidad.Circunferencia;
import servicio.ServicioCircunferecia;

public class Ejercicio02 {

    public static void main(String[] args) {
        
        ServicioCircunferecia serviceCirc = new ServicioCircunferecia();
        Circunferencia rad1 = serviceCirc.crearCircunferencia();
        serviceCirc.area(rad1);
        serviceCirc.perimetro(rad1);
    }
    
}
