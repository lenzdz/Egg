package main;

import services.PaisesServices;

public class PaisesMain {

    public static void main(String[] args) {
        
        PaisesServices servPaises = new PaisesServices();
        
        servPaises.crearPais();
        servPaises.mostrarPaises();
        servPaises.eliminarPais();
        servPaises.mostrarPaises();
        
    }
    
}
