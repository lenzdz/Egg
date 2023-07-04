package Services;

import Entities.Identifier;
import java.util.Scanner;

public class IdentifierServices {
    
    Scanner input = new Scanner(System.in);
    
    public Identifier createId() {
        
        System.out.println("Submit your ID number:");
        long number = input.nextLong();
        
        String[] correspondanceArray = letterNumberCorrespondanceArray();
        
        int reminder = (int) number % 23;
        
        String letter = correspondanceArray[reminder];
        
        return new Identifier(number, letter);
        
        
    }
    
    public void showId(Identifier id) {
        
        System.out.println("The ID is: " + id.getNumber() + "-" + id.getLetter());
        
    }
    
    public String[] letterNumberCorrespondanceArray() {
        
        String[] array = new String[23];
        
        array[0] = "T";
        array[1] = "R";
        array[2] = "W";
        array[3] = "A";
        array[4] = "G";
        array[5] = "M";
        array[6] = "Y";
        array[7] = "F";
        array[8] = "P";
        array[9] = "D";
        array[10] = "X";
        array[11] = "B";
        array[12] = "N";
        array[13] = "J";
        array[14] = "Z";
        array[15] = "S";
        array[16] = "Q";
        array[17] = "V";
        array[18] = "H";
        array[19] = "L";
        array[20] = "C";
        array[21] = "K";
        array[22] = "E";
        
        return array;
        
    }
    
}
