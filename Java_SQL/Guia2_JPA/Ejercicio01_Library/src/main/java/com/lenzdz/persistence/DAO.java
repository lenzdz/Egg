package com.lenzdz.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DAO {

    protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("libraryPU");
    protected EntityManager em = EMF.createEntityManager();

    protected void connectDB() {
        if (!em.isOpen()) {
            em = EMF.createEntityManager();
        }
    }

    protected void disconnectDB() {
        if (em.isOpen()) {
            em.close();
        }
    }

    protected void save(Object object) {
        connectDB();
        em.getTransaction().begin();
        em.persist(object);
        em.getTransaction().commit();
        disconnectDB();
    }

    protected void update(Object object) {
        connectDB();
        em.getTransaction().begin();
        em.merge(object);
        em.getTransaction().commit();
        disconnectDB();
    }

    protected void delete(Object object) {
        connectDB();
        em.getTransaction().begin();
        if (!em.contains(object)){
            object = em.merge(object);
        }
        em.remove(object);
        em.getTransaction().commit();
        disconnectDB();
    }

}
