package services;

import java.util.ArrayList;
import java.util.Random;

import entities.Movie;
import entities.Seat;
import entities.Theater;
import entities.Viewer;

public class TheaterServices {

    Random rand = new Random();
    
    public Theater createTodaysTheater(Movie todaysMovie, Seat[][] cinema) {

        Integer price;
        if (rand.nextBoolean()) {
            price = 5;
        } else {
            price = 10;
        }

        return new Theater(todaysMovie, cinema, price);

    }

    public Theater sellTickets(Theater todaysTheater, ArrayList<Viewer> listViewers) {

        System.out.println("De " + listViewers.size() + " posibles espectadores:");

        Integer i;
        Integer j;

        Integer soldTickets = 0;
        Integer restrictedForAge = 0;
        Integer restrictedForPrice = 0;

        for (Viewer aux : listViewers) {
            if (aux.getAge() >= todaysTheater.getMovie().getMinimumAge()) {

                if (aux.getMoney() >= todaysTheater.getPrice()) {

                    Boolean flag = true;
                    do {

                        i = rand.nextInt(8);
                        j = rand.nextInt(6);

                        if (!todaysTheater.getCinema()[i][j].isOccupied()) {
                            todaysTheater.getCinema()[i][j].setOccupied(true);
                            soldTickets++;
                            flag = false;
                        }

                    } while(flag);

                } else {
                    restrictedForPrice++;
                }

            } else {
                restrictedForAge++;
            }
        }

        System.out.println(soldTickets + " lograron comprar una boleta.");
        System.out.println(restrictedForAge + " no pudieron comprarla por restricción de edad.");
        System.out.println(restrictedForPrice + " no pudieron comprarla por falta de fondos.\n");

        return todaysTheater;
    }

}
