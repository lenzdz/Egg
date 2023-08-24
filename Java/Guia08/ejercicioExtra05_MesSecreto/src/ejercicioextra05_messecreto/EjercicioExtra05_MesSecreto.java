package ejercicioextra05_messecreto;

import Entities.Mes;
import Services.MesServices;

public class EjercicioExtra05_MesSecreto {

    
    public static void main(String[] args) {
        
        MesServices servMeses = new MesServices();
        
        // Crear objeto de tipo Mes con todos los meses del año en un arreglo
        Mes meses = servMeses.crearMesesAnio();
        
        // Crear mes secreto
        String mesSecreto = servMeses.crearMesSecreto(meses);
        
        // Adivinar mes
        servMeses.adivinarMes(mesSecreto);
    }
    
}
