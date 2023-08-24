package spanishCardsApp;

import services.DeckServices;

public class main {

    public static void main(String[] args) {
        
        DeckServices servDeck = new DeckServices();
        servDeck.createDeck();
        
        servDeck.menu();
        
    }
    
}
