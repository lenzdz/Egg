package Entities;

public class Hangman {
    
    private String[] arrayWord;
    private int lettersFound;
    private int maxAttempts;

    public Hangman() {
    }

    public Hangman(String[] word, int lettersFound, int maxAttempts) {
        this.arrayWord = word;
        this.lettersFound = lettersFound;
        this.maxAttempts = maxAttempts;
    }

    public String[] getWord() {
        return arrayWord;
    }

    public void setWord(String[] word) {
        this.arrayWord = word;
    }

    public int getLettersFound() {
        return lettersFound;
    }

    public void setLettersFound(int lettersFound) {
        this.lettersFound = lettersFound;
    }

    public int getMaxTries() {
        return maxAttempts;
    }

    public void setMaxTries(int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }
    
}
