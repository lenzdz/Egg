package com.lenzdz.persistence;

import com.lenzdz.entities.Author;
import com.lenzdz.entities.Publisher;
import jakarta.persistence.NoResultException;

import java.util.List;

public class PublisherDAO extends DAO {

    public void save(Publisher publisher) {
        super.save(publisher);
    }

    public void update(Publisher publisher) {
        super.update(publisher);
    }

    public void delete(Publisher publisher) {
        super.delete(publisher);
    }

    public List<Publisher> printPublishers() {
        connectDB();
        List<Publisher> publisherList = em.createQuery("SELECT p FROM Publisher p").getResultList();
        disconnectDB();
        return publisherList;
    }

    public Publisher searchPublisherById(Long num) {
        try {
            connectDB();
            Publisher foundPublisher = (Publisher) em.createQuery("SELECT p FROM Publisher p WHERE p.id LIKE :id")
                    .setParameter("id", num.toString()).getSingleResult();
            disconnectDB();
            return foundPublisher;
        } catch (NoResultException ex) {
            return null;
        }
    }

    public Publisher searchPublisherByName(String name) {
        try {
            connectDB();
            Publisher foundPublisher = (Publisher) em.createQuery("SELECT a FROM Publisher a WHERE a.name LIKE :name")
                    .setParameter("name", name).getSingleResult();
            disconnectDB();
            return foundPublisher;
        } catch (NoResultException ex) {
            return null;
        }
    }

}
