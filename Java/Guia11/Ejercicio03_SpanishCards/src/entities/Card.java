package entities;

import enums.CardNumber;
import enums.Suit;

public class Card {
    
    private CardNumber num;
    private Suit suit;

    public Card() {
    }

    public Card(CardNumber num, Suit suit) {
        this.num = num;
        this.suit = suit;
    }

    public CardNumber getNum() {
        return num;
    }

    public void setNum(CardNumber num) {
        this.num = num;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "{" + num.toString() + " DE " + suit.toString() + "}";
    }
    
}
