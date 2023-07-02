package ejercicio14_registro;

import Entities.Movil;
import Services.MovilServices;

public class Ejercicio14_Registro {

    public static void main(String[] args) {
        
        MovilServices servMovil = new MovilServices();
        Movil celular = servMovil.cargarCelular();
        
        System.out.println(celular);
    }
    
}
