package ejercicioextra06_hangman;

import Entities.Hangman;
import Services.HangmanServices;

public class EjercicioExtra06_Hangman {

    public static void main(String[] args) {
        
        HangmanServices servHang = new HangmanServices();
        Hangman hangmanInfo = servHang.createGame();
        
        servHang.game(hangmanInfo);
        
    }
    
}
