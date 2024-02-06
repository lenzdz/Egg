package com.lenzdz.services;

import com.lenzdz.entities.Author;
import com.lenzdz.entities.Book;
import com.lenzdz.entities.Publisher;
import com.lenzdz.persistence.AuthorDAO;
import com.lenzdz.persistence.BookDAO;
import com.lenzdz.persistence.PublisherDAO;

import java.util.*;

public class BookServices {

    private final BookDAO dao;
    private final AuthorDAO authorDao;
    private final PublisherDAO publisherDao;
    private final AuthorServices servAuthor;
    private final PublisherServices servPublisher;

    public BookServices() {
        this.dao = new BookDAO();
        this.authorDao = new AuthorDAO();
        this.publisherDao = new PublisherDAO();
        this.servAuthor = new AuthorServices();
        this.servPublisher = new PublisherServices();
    }

    public void printBooks() {
        List<Book> bookList = dao.printBooks();
        System.out.println(bookList);
    }

    public Book saveBook(Long isbn, String title, Integer publicationYear, Integer totalCopies, Integer borrowedCopies,
                         Integer availableCopies, List<String> authorNames, String publisherName) throws Exception {

        Book book = new Book();
        try {

            // Validaciones y setteo de ISBN
            if (isbn == null) {
                throw new Exception("El ISBN no puede estar vacío.");
            }
            if ((isbn.toString().length() == 10 && publicationYear < 2006) || (isbn.toString().length() == 13)) {
                book.setIsbn(isbn);
            } else {
                throw new Exception("El ISBN es incorrecto.");
            }

            // Validaciones y setteo de título
            if (title == null || title.isEmpty()) {
                throw new Exception("El título no puede estar vacío.");
            } else {
                book.setTitle(title);
            }

            // Validaciones y setteo de año de publicación
            if (publicationYear == null) {
                throw new Exception("El año de publicación no puede estar vacío.");
            } else {
                book.setPublicationYear(publicationYear);
            }

            // Validaciones y setteo de total de ejemplares
            if (totalCopies == null) {
                throw new Exception("El número total de ejemplares no puede estar vacío.");
            } else if (totalCopies < 0) {
                throw new Exception("El número de ejemplares no puede ser menor a cero.");
            } else {
                book.setTotalCopies(totalCopies);
            }

            // Validaciones y setteo de ejemplares prestados
            if (borrowedCopies == null) {
                throw new Exception("El número de ejemplares prestados no puede estar vacío.");
            } else if (borrowedCopies > totalCopies) {
                throw new Exception("El número de ejemplares prestados no puede ser mayor que el número total de ejemplares.");
            } else if ((borrowedCopies + availableCopies) != totalCopies) {
                throw new Exception("La suma de ejemplares prestados y disponibles no puede ser diferente del número total de ejemplares.");
            } else {
                book.setBorrowedCopies(borrowedCopies);
            }

            // Validaciones y setteo de ejemplares disponibles
            if (availableCopies == null) {
                throw new Exception("El número de ejemplares disponibles no puede estar vacío.");
            } else if (availableCopies > totalCopies) {
                throw new Exception("El número de ejemplares disponibles no puede ser mayor que el número total de ejemplares.");
            } else if ((borrowedCopies + availableCopies) != totalCopies) {
                throw new Exception("La suma de ejemplares prestados y disponibles no puede ser diferente del número total de ejemplares.");
            } else {
                book.setAvailableCopies(availableCopies);
            }

            // Validaciones y setteo de autores
            Set<Author> bookAuthors = new HashSet<>();
            if (authorNames == null) {
                throw new Exception("El nombre del autor/los autores no puede estar vacío.");
            } else {
                for (String author : authorNames) {
                    if (author == null || author.isEmpty()) {
                        continue;
                    } else {
                        Author myAuthor;
                        if (authorDao.searchAuthorByName(author) == null) {
                            System.out.println("El autor " + author + " no se encontró en el sistema, así que se añadirá a la base de datos.");
                            myAuthor = servAuthor.saveAuthor(author);
                            bookAuthors.add(myAuthor);
                        } else {
                            myAuthor = authorDao.searchAuthorByName(author);
                            bookAuthors.add(myAuthor);
                        }
                    }
                }

                if (!bookAuthors.isEmpty()) {
                    book.setAuthors(bookAuthors);
                } else {
                    throw new Exception("El nombre del autor/los autores no puede estar vacío.");
                }

            }

            if (publisherName == null || publisherName.isEmpty()) {
                throw new Exception("El nombre de la editorial no puede estar vacío.");
            } else {
                Publisher myPublisher;
                if (publisherDao.searchPublisherByName("publisherName") == null) {
                    System.out.println("La editorial " + publisherName + " no se encontró en el sistema, así que se añadirá a la base de datos.");
                    myPublisher = servPublisher.savePublisher(publisherName);
                } else {
                    myPublisher = publisherDao.searchPublisherByName("publisherName");
                }
                book.setPublisher(myPublisher);
            }

            dao.save(book);
            System.out.println("El libro " + title + " se registró correctamente.");
            return book;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new Exception("Error en método saveBook en BookServices.");
        }
    }

}
