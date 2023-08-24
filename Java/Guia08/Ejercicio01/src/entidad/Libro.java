package entidad;

import java.util.Scanner;

public class Libro {
    
    Scanner input = new Scanner(System.in);
    
    private String title;
    private String author;
    private String isbn;
    private int pages;

    public Libro() {
    }
    
    public Libro(String title, String author, String isbn, int pages) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
    }

    public void añadirDatos() {
        
        System.out.println("Ingrese el nombre del libro:");
        title = input.nextLine();
        
        System.out.println("Ingrese el autor del libro:");
        author = input.nextLine();
        
        System.out.println("Ingrese el número de páginas del libro:");
        pages = input.nextInt();
        input.nextLine();
        
        System.out.println("Ingrese el ISBN del libro:");
        isbn = input.nextLine();
        
    }
    
    public void mostrarDatos() {
        
        System.out.println("ISBN: " + isbn);
        System.out.println("Autor: " + author);
        System.out.println("Título: " + title);
        System.out.println("Páginas: " + pages);
        
    }
    
}
