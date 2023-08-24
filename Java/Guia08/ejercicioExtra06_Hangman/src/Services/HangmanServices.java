package Services;

import Entities.Hangman;
import java.util.Arrays;
import java.util.Scanner;

public class HangmanServices {
    
    Scanner input = new Scanner(System.in);
    
    public Hangman createGame() {
        
        System.out.println("Submit the word to initilize the game:");
        String word = input.nextLine().toUpperCase();
        
        String[] arrayWord = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            arrayWord[i] = word.substring(i, i+1);
        }
        
        System.out.println("Choose the maximum amount of attempts:");
        int attempts = input.nextInt();
        input.nextLine();
        
        return new Hangman(arrayWord, 0, attempts);
        
    }
    
    public void game(Hangman hangmanInfo) {
        
        System.out.println("Let's begin!");
        
        // I know transforming the array that has the secret word to a String rather than directly creating the variable printGuesses as an array to compare their final outputs, uses more lines, but I did this to practice using String methods.
        
        String secretWord = "";
        for (int i = 0; i < hangmanInfo.getWord().length; i++) {
            secretWord += hangmanInfo.getWord()[i];
        }
        
        String printGuesses = "";
        for (int i = 0; i < hangmanInfo.getWord().length; i++) {
            printGuesses += "_";
        }
        
        String guessedLetters = "";
        int attempts = hangmanInfo.getMaxTries();
        int lettersFound = hangmanInfo.getLettersFound();
        do {
            
            System.out.println("\nWhich letter would you like to guess?");
            String guess;
            do {
                
                guess = input.nextLine().toUpperCase();
                
                if (guess.length() != 1) {
                    System.out.println("Ups! Your guess must be ONE letter. Try again!");
                }
                
            } while (guess.length() != 1);
            
            lettersFound = searchLetter(hangmanInfo, guess, lettersFound, guessedLetters);
            guessedLetters += guess;
            attempts = numAttempts(attempts);
            printGuesses = foundLetters(hangmanInfo, guess, printGuesses);
            
        } while (attempts >= 1 && !secretWord.equals(printGuesses));
        
        if (secretWord.equals(printGuesses)) {
            System.out.println("Congrats! Your man wasn't hanged!");
        } else {
            System.out.println("Sorry, mate! Game over.");
        }
        
    }
    
    public int wordLength(Hangman hangmanInfo) {
        
        return hangmanInfo.getWord().length;
        
    }
    
    public int numAttempts(int attempts) {
        
        attempts--;
        System.out.println("You still have " + attempts + " attempts.");
        
        return attempts;
        
    }
    
    public int searchLetter(Hangman hangmanInfo, String guess, int lettersFound, String guessedLetters) {
        
        if (Arrays.asList(hangmanInfo.getWord()).contains(guess) && !guessedLetters.contains(guess)) {
            
            System.out.println("The letter is in the secret word c:");
            lettersFound++;
            hangmanInfo.setLettersFound(lettersFound);
            return lettersFound;
            
        } else {
            
            System.out.println("The letter isn't in the secret word :c");
            return lettersFound;
            
        }
        
    }
    
    public String foundLetters(Hangman hangmanInfo, String guess, String printGuesses) {
        
        System.out.println("The secret word has " + wordLength(hangmanInfo) + " letters and you've found " + hangmanInfo.getLettersFound() + ".");
        
        String originalString = printGuesses;
        for (int i = 0; i < hangmanInfo.getWord().length; i++) {
            if (hangmanInfo.getWord()[i].equals(guess)) {
                printGuesses = originalString.substring(0, i) + guess + originalString.substring(i+1);
                originalString = printGuesses;
            }
        }
        
        System.out.println(printGuesses);
        
        return printGuesses;
        
    }
    
}
