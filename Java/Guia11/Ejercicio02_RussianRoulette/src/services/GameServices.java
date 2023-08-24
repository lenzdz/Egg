package services;

import entities.Game;
import entities.Player;
import entities.Watergun;
import java.util.ArrayList;

public class GameServices {
    
    PlayerServices servPlayer = new PlayerServices();
    
    public Game fillGame(Watergun pistol, ArrayList<Player> users) {
        
        Game newGame = new Game();
        
        newGame.setPistol(pistol);
        newGame.setUsers(users);
        
        return newGame;
        
    }
    
    public void round(Game myGame) {
        
        Integer playersQuantity = myGame.getUsers().size();
        Boolean watershot = false;
        Integer i = 1;
        while (!watershot) {
           
            System.out.println("TURNO DEL JUGADOR " + i);
            watershot = servPlayer.shoot(myGame);
            
            if (watershot) {
                System.out.println("¡El jugador " + i + " se ha mojado!\n");
                myGame.getUsers().get(i-1).setWet(watershot);
            } else {
                System.out.println("El jugador " + i + " no ha sido mojado.\n");
                
                if (playersQuantity.equals(i)) {
                    i = 1;
                } else {
                    i++;
                }
                
            }
        }
        
    }
    
}
