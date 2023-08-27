package services;

import java.util.ArrayList;
import java.util.Scanner;

import entities.FamousSinger;

public class FamousSingerServices {

    Scanner input = new Scanner(System.in);
    ArrayList<FamousSinger> singersInfo = new ArrayList<>();
    
    public void createSingers() {

        singersInfo.add(new FamousSinger("Luis Miguel", "Romance"));
        singersInfo.add(new FamousSinger("Lady Gaga", "The Fame/The Fame Monster"));
        singersInfo.add(new FamousSinger("IU", "Lilac"));
        singersInfo.add(new FamousSinger("Rubén Blades", "Siembra"));
        singersInfo.add(new FamousSinger("Katy Perry", "Teenage Dream"));

    }

    public void addSinger() {

        System.out.println("Ingrese el nombre del artista a agregar:");
        String name = input.nextLine();

        System.out.println("Ingrese el álbum más vendido del artista:");
        String album = input.nextLine();

        singersInfo.add(new FamousSinger(name, album));

        System.out.println("Artista agregado con éxito.\n");
    }

    public void removeSinger() {

        System.out.println("Ingrese el nombre del artista a eliminar:");
        String name = input.nextLine();

        FamousSinger singerToRemove = null;
        for (FamousSinger aux : singersInfo) {
            if (aux.getName().equalsIgnoreCase(name)) {
                singerToRemove = aux;
                break;
            }
        }

        if (singerToRemove == null) {
            System.out.println("No se encontró al artista.\n");
        } else {
            singersInfo.remove(singerToRemove);
            System.out.println("Artista eliminado correctamente.\n");
        }

    }

    public void printSingers() {

        System.out.println("------- LISTA DE CANTANTES -------");
        System.out.println(singersInfo);
        System.out.println("\n");
        
    }

}
