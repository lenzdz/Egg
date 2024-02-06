package com.lenzdz.libraryApp;

import com.lenzdz.entities.Author;
import com.lenzdz.entities.Book;
import com.lenzdz.services.AuthorServices;
import com.lenzdz.services.BookServices;
import com.lenzdz.services.PublisherServices;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AuthorServices servAuthor = new AuthorServices();
        PublisherServices servPublisher = new PublisherServices();
        BookServices servBook = new BookServices();

        try {
            addBooks(servAuthor, servPublisher, servBook);

            servBook.printBooks();
            servAuthor.searchPrintAuthorByName("Marvel Moreno");


        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void addBooks(AuthorServices servAuthor, PublisherServices servPublisher, BookServices servBook) {

        try {
            List<String> authorList = new ArrayList<>();
            authorList.add("Albalucíane Ángel");
            servBook.saveBook(9789585118539L,"Estaba la pájara pinta sentada en el verde limón", 2022,
                    10, 5, 5, authorList, "Alfaguara");

            authorList.clear();
            authorList.add("Leopoldo María Panero");
            servBook.saveBook(8475229891L,"Poesía completa", 2001,
                    6, 2, 4, authorList, "Visor Libros");

            authorList.clear();
            authorList.add("Gabriel Cuevas");
            authorList.add("Fernando Cortés");
            servBook.saveBook(9681671058L, "Introducción a la química computacional", 2003,
                    2, 2, 0, authorList, "FCE");

            authorList.clear();
            authorList.add("Marvel Moreno");
            servBook.saveBook(9789585118065L, "El tiempo de las amazonas", 2020,
                    1, 0, 1, authorList, "Alfaguara");

            authorList.clear();
            authorList.add("Marvel Moreno");
            servBook.saveBook(9786287513525L, "En diciembre llegaban las brisas", 2022,
                    5, 3, 2, authorList, "Debolsillo");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}