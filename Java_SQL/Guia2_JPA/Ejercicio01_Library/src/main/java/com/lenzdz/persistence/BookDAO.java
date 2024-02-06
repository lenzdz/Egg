package com.lenzdz.persistence;

import com.lenzdz.entities.Book;
import jakarta.persistence.NoResultException;

import java.util.List;

public class BookDAO extends DAO{

    public void save(Book book) {
        super.save(book);
    }

    public void update(Book book) {
        super.update(book);
    }

    public void delete(Book book) {
        super.delete(book);
    }

    public List<Book> printBooks() {
        connectDB();
        List<Book> bookList = em.createQuery("SELECT b FROM Book b").getResultList();
        disconnectDB();
        return bookList;
    }

    public Book searchBookByIsb(Long isbn) {
        try {
            connectDB();
            Book foundBook = (Book) em.createQuery("SELECT b FROM Book b WHERE a.isbn LIKE :isbn")
                    .setParameter("isbn", isbn.toString()).getSingleResult();
            disconnectDB();
            return foundBook;
        } catch (NoResultException ex) {
            return null;
        }
    }

    public List<Book> searchBookByName(String name) {
        try {
            connectDB();
            List<Book> foundBook = em.createQuery("SELECT b FROM Book b WHERE b.name LIKE :name")
                    .setParameter("name", name).getResultList();
            disconnectDB();
            return foundBook;
        } catch (NoResultException ex) {
            return null;
        }
    }
}
