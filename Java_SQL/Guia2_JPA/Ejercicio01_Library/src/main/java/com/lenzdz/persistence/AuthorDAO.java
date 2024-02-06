package com.lenzdz.persistence;

import com.lenzdz.entities.Author;
import jakarta.persistence.NoResultException;

import java.util.List;

public class AuthorDAO extends DAO {

    public void save(Author author) {
        super.save(author);
    }

    public void update(Author author) {
        super.update(author);
    }

    public void delete(Author author) {
        super.delete(author);
    }

    public List<Author> printAuthors() {
        connectDB();
        List<Author> authorList = em.createQuery("SELECT a FROM Author a").getResultList();
        disconnectDB();
        return authorList;
    }

    public Author searchAuthorById(Long num) {
        try {
            connectDB();
            Author foundAuthor = (Author) em.createQuery("SELECT a FROM Author a WHERE a.id LIKE :id")
                    .setParameter("id", num.toString()).getSingleResult();
            disconnectDB();
            return foundAuthor;
        } catch (NoResultException ex) {
            return null;
        }

    }

    public Author searchAuthorByName(String name) {
        try {
            connectDB();
            Author foundAuthor = (Author) em.createQuery("SELECT a FROM Author a WHERE a.name LIKE :name")
                    .setParameter("name", name).getSingleResult();
            disconnectDB();
            return foundAuthor;
        } catch (NoResultException ex) {
            return null;
        }
    }

}
