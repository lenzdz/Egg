package mainApp;

import java.util.Scanner;

import services.BookServices;

public class LibraryApp {
    
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        BookServices servBook = new BookServices();
        servBook.autofillBooks();

        Integer choice;
        do {

            System.out.println("\n----- MENÚ BIBLIOTECA -----");
            System.out.println("1) Agregar libro");
            System.out.println("2) Prestar libro");
            System.out.println("3) Devolver libro");
            System.out.println("4) Ver libros disponibles");
            System.out.println("5) Salir");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    servBook.createBook();
                    break;
                
                case 2:
                    servBook.borrowBook();
                    break;

                case 3:
                    servBook.returnBook();
                    break;

                case 4:
                    servBook.printBooks();
                    break;

                case 5:
                    continue;

                default:
                    System.out.println("Opción inválida. Vuelva a intentarlo.");
                    break;
            }

        } while (choice != 5);

        input.close();
    }
}
