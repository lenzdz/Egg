package actividadextra01_vehiculo;

import Entities.Vehiculo;
import Services.VehiculoServices;

public class ActividadExtra01_Vehiculo {

    public static void main(String[] args) {
        
        VehiculoServices servVehiculo = new VehiculoServices();
        Vehiculo automotor1 = servVehiculo.crearVehiculo();
        Vehiculo automotor2 = servVehiculo.crearVehiculo();
        Vehiculo automotor3 = servVehiculo.crearVehiculo();
        
        servVehiculo.movimiento(automotor1);
        servVehiculo.movimiento(automotor2);
        servVehiculo.movimiento(automotor3);
        
        servVehiculo.movimientoCincoMin(automotor1, automotor2, automotor3);
        
    }
    
}
