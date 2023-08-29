package services;

import entities.Seat;

public class SeatServices {
    
    public Seat[][] createSeats() {

        Seat[][] seatMatrix = new Seat[8][6];
        String columns = "ABCDEF";

        for (Integer i = 0; i < 8; i++) {
            for (Integer j = 0; j < 6; j++) {
                seatMatrix[i][j] = new Seat((i+1) + columns.substring(j, j+1));
            }
        }

        return seatMatrix;
    }

    public void printSeats(Seat[][] seatMatrix) {

        String row;
        Boolean isSold;
        for (Integer i = 7; i >= 0; i--) {
            row = "";
            for (Integer j = 0; j < 6; j++) {
                isSold = seatMatrix[i][j].isOccupied();
                if (isSold) {
                    row += seatMatrix[i][j].getSeat() + "X| ";
                } else {
                    row += seatMatrix[i][j].getSeat() + " | ";
                }
            }
            System.out.println(row);

        }
        System.out.println(" ____________________________");
        System.out.println("|          PANTALLA          |");
        System.out.println("------------------------------");
    }

}
