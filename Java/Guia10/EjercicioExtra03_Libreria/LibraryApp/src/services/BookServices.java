package services;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Book;

public class BookServices {
    
    Scanner input = new Scanner(System.in);
    Set<Book> booksInLibrary = new HashSet<>();
    
    public void autofillBooks() {

        booksInLibrary.add(new Book("PRIMERA PERSONA", "MARGARITA GARCÍA ROBAYO", 10, 2));
        booksInLibrary.add(new Book("OLIVER TWIST", "MARK TWAIN", 21, 13));
        booksInLibrary.add(new Book("CIEN AÑOS DE SOLEDAD", "GABRIEL GARCÍA MÁRQUEZ", 12, 11));
        booksInLibrary.add(new Book("EL RETRATO DE DORIAN GRAY", "OSCAR WILDE", 5, 1));
        booksInLibrary.add(new Book("EL EXTRANJERO", "ALBERT CAMUS", 8, 0));

    }

    public Boolean checkBook(String title) {

        Boolean bookExists = false;
        for (Book elementBook : booksInLibrary) {
            if (elementBook.getTitle().hashCode() == title.hashCode()) {
                bookExists = true;
                break;
            }
        }

        return bookExists;

    }

    public void createBook() {

        System.out.println("Escriba el nombre del libro a ingresar:");
        String newTitle = input.nextLine().toUpperCase();

        Boolean bookExists = checkBook(newTitle);

        if (bookExists) {
            
            String key;
            do {
                System.out.println("El libro ya se encuentra en nuestra biblioteca. ¿Desea añadir un ejemplar? (s/n)");
                key = input.nextLine().toUpperCase();

                if (!key.equals("N") && !key.equals("S")) {
                    System.out.println("Opción inválida. Vuelva a intentarlo.");
                }
            } while (!key.equals("N") && !key.equals("S"));

            if (key.equals("S")) {
                addCopy(newTitle);
            }

        } else {

            System.out.println("Escriba el nombre del autor:");
            String author = input.nextLine().toUpperCase();

            System.out.println("Escriba el número de ejemplares a ingresar:");
            Integer copies = input.nextInt();
            input.nextLine();

            booksInLibrary.add(new Book(newTitle, author, copies, 0));

            System.out.println("Libro añadido exitosamente.");

        } 

    }

    public void addCopy(String newCopyTitle) {

        for (Book elementBook : booksInLibrary) {
            if (elementBook.getTitle().hashCode() == newCopyTitle.hashCode()) {
                elementBook.setTotalCopies(elementBook.getTotalCopies()+1);
                break;
            }
        }

        System.out.println("Ejemplar añadido con éxito.");

    }

    public void borrowBook() {

        System.out.println("Escriba el nombre del libro a prestar:");
        String title = input.nextLine().toUpperCase();

        Boolean bookExists = checkBook(title);

        if (bookExists) {

            for (Book elementBook : booksInLibrary) {
            if (elementBook.getTitle().hashCode() == title.hashCode() && elementBook.getTotalCopies() > elementBook.getBorrowedCopies()) {
                elementBook.setBorrowedCopies(elementBook.getBorrowedCopies()+1);
                System.out.println("Libro prestado con éxito.");
                break;
            } else if (elementBook.getTitle().hashCode() == title.hashCode() && elementBook.getTotalCopies() == elementBook.getBorrowedCopies()) {
                System.out.println("Todas las copias están prestadas. No es posible realizar la acción.");
            }
        }

        } else {
            System.out.println("El libro no se encuentra en nuestro sistema.");
        }

    }

    public void returnBook() {

        System.out.println("Escriba el nombre del libro a devolver:");
        String title = input.nextLine().toUpperCase();

        Boolean bookExists = checkBook(title);

        if (bookExists) {

            for (Book elementBook : booksInLibrary) {
                if (elementBook.getTitle().hashCode() == title.hashCode()) {
                    elementBook.setBorrowedCopies(elementBook.getBorrowedCopies()-1);
                    System.out.println("Libro devuelto con éxito.");
                    break;
                }
            } 

        } else {
            System.out.println("El título ingresado no se encontró en el sistema. Por favor, vuelva a intentarlo.");
        }

    }

    public void printBooks() {
        for (Book elementBook : booksInLibrary) {
            System.out.println(elementBook);
        }
    }

}
