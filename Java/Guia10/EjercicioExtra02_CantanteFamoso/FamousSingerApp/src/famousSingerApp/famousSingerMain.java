package famousSingerApp;

import java.util.Scanner;

import services.FamousSingerServices;

public class famousSingerMain {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        FamousSingerServices servFamSinger = new FamousSingerServices();
        servFamSinger.createSingers();

        Integer choice;
        do {
            
            System.out.println("------- MENÚ DE CANTANTES -------");
            System.out.println("1) Añadir cantante");
            System.out.println("2) Eliminar cantante");
            System.out.println("3) Mostrar cantantes");
            System.out.println("4) Salir");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    servFamSinger.addSinger();
                    break;
                case 2:
                    servFamSinger.removeSinger();
                    break;
                case 3:
                    servFamSinger.printSingers();
                    break;
                case 4:
                    continue;
                default:
                    System.out.println("Opción inválida. Vuelva a intentarlo.");
                    break;
            }

        } while (choice != 4);

        input.close();
    }
}
