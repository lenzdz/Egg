package RentalApp;

import entities.Boat;
import entities.MotorBoat;
import entities.Rental;
import entities.Sailboat;
import entities.Yatch;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Rental rental1 = new Rental();
        ArrayList<Boat> boatList = createBoats();

        System.out.println("Los siguientes son los botes en renta:");
        System.out.println(boatList);

        Boat selectedBoat = null;
        Boolean plateExists;
        Integer num;
        do {
            System.out.println("\nEscriba la placa del bote que desea rentar:");
            num = input.nextInt();

            plateExists = false;
            for (Boat aux: boatList) {
                if (num.equals(aux.getPlate())) {
                    selectedBoat = aux;
                    plateExists = true;
                    break;
                }
            }

            if (!plateExists) {
                System.out.println("La placa no existe. Vuelva a intentarlo.");
            }

        } while (!plateExists);

        System.out.println("Indique el día en que devolverá el barco:");
        Integer endDay = input.nextInt();

        System.out.println("Indique el mes en el que devolverá el barco:");
        Integer endMonth = input.nextInt();

        rental1.setInitRental(LocalDate.now());
        rental1.setEndRental(LocalDate.of(2023, endMonth, endDay));

        Integer days = (int) rental1.getInitRental().until(rental1.getEndRental(), ChronoUnit.DAYS);

        System.out.println("\nLa fecha de inicio de su alquiler será " + rental1.getInitRental() + ".");
        System.out.println("La fecha de fin de su alquiler será " + rental1.getEndRental() + ".");
        System.out.println("El precio total de su alquiler será $" + (days * selectedBoat.moduleValue()) + ".");

    }

    public static ArrayList<Boat> createBoats() {

        ArrayList<Boat> boatList = new ArrayList<>();

        Boat b1 = new Boat(111, 15d, 2006);
        boatList.add(b1);

        Boat b2 = new Sailboat(222, 10d, 1994, 3);
        boatList.add(b2);

        Boat b3 = new MotorBoat(333, 20d, 2010, 120d);
        boatList.add(b3);

        Boat b4 = new Yatch(444, 18d, 2018, 130d, 25);
        boatList.add(b4);

        Boat b5 = new Sailboat(555, 15d, 2015, 5);
        boatList.add(b5);

        return boatList;

    }
}