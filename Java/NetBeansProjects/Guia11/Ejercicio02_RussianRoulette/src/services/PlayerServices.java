package services;

import entities.Game;
import entities.Player;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerServices {
    
    Scanner input = new Scanner(System.in);
    ArrayList<Player> playersList = new ArrayList();
    
    public ArrayList<Player> createPlayers() {
        
        int num;
        do {
            
            System.out.println("¿Cuántos jugadores desea agregar a la partida? [min = 1; max = 6]");
            num = input.nextInt();
            
            if (num < 1 || num > 6) {
                System.out.println("Opción inválida. Vuelva a intentarlo.");
            }
            
        } while (num < 1 || num > 6);
        
        
        for (int i = 1; i <= num; i++) {
            Player newPlayer = new Player(i, "Jugador " + i);
            playersList.add(newPlayer);
        }
        
        printPlayers();
        
        return playersList;
        
    }
    
    public Boolean shoot(Game myGame) {
        
        Integer currentPosition = myGame.getPistol().getCurrentPosition();
        
        Boolean ans = false;
        if (myGame.getPistol().getCurrentPosition().equals(myGame.getPistol().getWaterPosition())) {
            ans = true;
            return ans;
        } else {
            
            if (currentPosition.equals(6)) {
                myGame.getPistol().setCurrentPosition(1);
            } else {
                currentPosition++;
                myGame.getPistol().setCurrentPosition(currentPosition);
            }
            
            return ans;
        }
        
    }
    
    public void printPlayers() {
        
        for (Player elem : playersList) {
            System.out.println(elem);
        }
        
    }
    
}
