package ejercicioextra03_raices;

import Entities.Valores;
import Services.ValoresServicio;

public class EjercicioExtra03_Raices {

    public static void main(String[] args) {
        
        ValoresServicio servValores = new ValoresServicio();
        Valores val = servValores.asignarValores();
        
        servValores.calcular(val);
        
    }
    
}
