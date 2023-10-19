import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 10, y, z;
        System.out.print("Ingrese y: ");
        try {
            y = new Scanner(System.in).nextInt();
            z = x / y;
            System.out.println("Resultado: " + z);

            z = x / 0;
            System.out.println("Resultado: " + z);
        }
        catch (Exception ex) {
            System.out.println("Ocurrió un error");
        }
        System.out.println("Adiós");

    }
}