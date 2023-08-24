package guia7_extras;

public class ejercicioExtra02 {
    
    public static void main(String[] args) {
        
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        
        String cadA = "El valor original de A es " + Integer.toString(a) + ". ";
        String cadB = "El valor original de B es " + Integer.toString(b) + ". ";
        String cadC = "El valor original de C es " + Integer.toString(c) + ". ";
        String cadD = "El valor original de D es " + Integer.toString(d) + ". ";
        
        int tempB = b;
        
        b = c;
        c = a;
        a = d;
        d = tempB;
        
        cadA = cadA + "Su segundo valor es " + Integer.toString(a) + ".";
        cadB = cadB + "Su segundo valor es " + Integer.toString(b) + ".";
        cadC = cadC + "Su segundo valor es " + Integer.toString(c) + ".";
        cadD= cadD+ "Su segundo valor es " + Integer.toString(d) + ".";
        
        System.out.println(cadA);
        System.out.println(cadB);
        System.out.println(cadC);
        System.out.println(cadD);
        
        
    }
    
}