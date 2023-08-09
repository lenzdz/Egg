package tienda;

import services.TiendaServices;

public class MainTienda {

    public static void main(String[] args) {
        
        TiendaServices servTienda = new TiendaServices();
        servTienda.menu();
        
    }
    
}
