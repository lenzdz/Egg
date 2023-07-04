package Entities;

public class Identifier {
    
    private long number;
    private String letter;

    public Identifier() {
    }

    public Identifier(long number, String letter) {
        this.number = number;
        this.letter = letter;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "Identifier{" + "number=" + number + ", letter=" + letter + '}';
    }
    
}
