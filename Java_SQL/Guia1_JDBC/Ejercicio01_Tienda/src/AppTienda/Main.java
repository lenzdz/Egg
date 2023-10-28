package AppTienda;

import Services.FabricanteServices;

public class Main {

    public static void main(String[] args) {

        FabricanteServices servFabricante = new FabricanteServices();

        try {
            servFabricante.createFabricante("Acer");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}