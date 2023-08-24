package services;

import entities.Card;
import entities.Deck;
import enums.CardNumber;
import enums.Suit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DeckServices {
    
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    Deck myDeck = new Deck();
    
    ArrayList<Card> usedCards = new ArrayList();
    Deck usedDeck = new Deck();
    
    
    public void menu() {
        
        System.out.println("¡Bienvenido al juego con baraja española!");
        
        int choice;
        do {
            
            System.out.println("\n----- MENÚ DE JUEGO -----");
            System.out.println("1) Barajar mazo");
            System.out.println("2) Dar una carta");
            System.out.println("3) Dar varias cartas");
            System.out.println("4) Mostrar cartas en el montón");
            System.out.println("5) Mostrar cantidad de cartas disponibles");
            System.out.println("6) Mostrar cartas disponibles");
            System.out.println("7) Salir");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    shuffle();
                    System.out.println("¡Mazo barajado con éxito!");
                    break;
                case 2:
                    nextCard();
                    break;
                case 3:
                    nextSetOfCards();
                    break;
                case 4:
                    printUsedDeck();
                    break;
                case 5:
                    System.out.println("Hay " + myDeck.getDeck().size() + " carta(s) disponible(s) en el mazo. ");
                    break;
                case 6:
                    printDeck();
                    break;
                case 7:
                    continue;
                default:
                    System.out.println("Opción inválida. Vuelva a intentarlo.");
                    break;
            }
            
        } while (choice != 7);
        
    }
    
    public void createDeck() {
        
        ArrayList<Card> thisDeck = new ArrayList();
        
        for (Suit currentSuit : Suit.values()) { // Para cada elemento de enumeración en el ENUM de palos (es decir, para cado palo), hacer lo siguiente:
            for (CardNumber currentNumber : CardNumber.values()) { // Para cada elemento de enumeración en el ENUM de cartas (es decir, para cada número), hacer lo siguiente:
                thisDeck.add(createCard(currentNumber, currentSuit)); // Agrega la nueva carta a la baraja.
            }
        }
        
        myDeck.setDeck(thisDeck);
        
    }
    
    public Card createCard(CardNumber currentNumber, Suit currentSuit) {
        
        Card newCard = new Card();
        
        newCard.setNum(currentNumber); // Asígnale el actual número a la nueva carta.
        newCard.setSuit(currentSuit); // Asíganale el actual palo a la nueva carta.
        
        return newCard;
        
    }
    
    public void printDeck() {
        
        Integer deckSize = myDeck.getDeck().size();
        
        if (deckSize == 0) {
            System.out.println("El mazo está vacío.");
        } else {
            
            for (int i = 0; i < deckSize; i++) {
            System.out.println("Posición " + i + " " + myDeck.getDeck().get(i).toString());
        }
            
        }
        
    }
    
    public void printUsedDeck() {
        
        Integer deckSize = usedDeck.getDeck().size();
        
        if (deckSize == 0) {
            System.out.println("Aún no se han utilizado cartas.");
        } else {
        
            for (int i = 0; i < deckSize; i++) {
                System.out.println("Posición " + i + " " + usedDeck.getDeck().get(i).toString());
            }
            
        }
        
    }
    
    public void shuffle() {
        
        ArrayList<Card> thisDeck = new ArrayList(); // Nuevo mazo barajado
        ArrayList<Integer> usedPositions = new ArrayList();
                
        for (int i = 0; i < 40; i++) {
            
            Integer randPosition;
            do { // El bucle de creación de número aleatorio se repite hasta que se encuentre un número que no haya sido utilizado aún
                randPosition = random.nextInt(40); // Obtener un número entre 0 y el tamaño de la colección de posiciones libres - 1 para tener nuestra posición aleatoria
            } while (usedPositions.contains(randPosition));
            
            usedPositions.add(randPosition);
            
            thisDeck.add(myDeck.getDeck().get(randPosition)); // Añadir al nuevo mazo ordenado el elemento en la posición aleatoria que se encuentra en la baraja creada inicialmente, myDeck
        }
        
        myDeck.setDeck(thisDeck);
    }
    
    public void nextCard() {
        
        if (myDeck.getDeck().size() > 0) {
            getAndRemoveCard();            
        } else {
            System.out.println("No hay mas cartas.");
        }
        
    }
    
    public void nextSetOfCards() {
        
        System.out.println("¿Cuántas cartas desea sacar del mazo?");
        Integer quantity = input.nextInt();
        
        if (quantity <= myDeck.getDeck().size()) {
            
            for (int i = 0; i < quantity; i++) {
               getAndRemoveCard();
            }
            
        } else {
            System.out.println("No hay cartas suficientes en el mazo para realizar la jugada.");
        }
        
    }
    
    public void getAndRemoveCard() {
        
        System.out.println("Obtuviste: " + myDeck.getDeck().get(0));
        
        usedCards.add(myDeck.getDeck().get(0));
        usedDeck.setDeck(usedCards);
        myDeck.getDeck().remove(0);
        
    }
}
