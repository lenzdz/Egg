package gameApp;

import entities.Game;
import entities.Player;
import entities.Watergun;
import java.util.ArrayList;
import services.GameServices;
import services.PlayerServices;
import services.WatergunServices;

public class mainRoulette {

    public static void main(String[] args) {
        
        WatergunServices servWatergun = new WatergunServices();
        Watergun pistol = servWatergun.fillWatergun();
        
        PlayerServices servPlayer = new PlayerServices();
        ArrayList<Player> playersList = servPlayer.createPlayers();
        
        GameServices servGame = new GameServices();
        Game newGame = servGame.fillGame(pistol, playersList);
        
        servGame.round(newGame);
        
    }
    
}
