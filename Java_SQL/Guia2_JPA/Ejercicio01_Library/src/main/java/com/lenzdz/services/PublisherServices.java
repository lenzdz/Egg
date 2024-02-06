package com.lenzdz.services;

import com.lenzdz.entities.Author;
import com.lenzdz.entities.Publisher;
import com.lenzdz.persistence.PublisherDAO;

import java.util.List;

public class PublisherServices {

    private final PublisherDAO dao;

    public PublisherServices() {
        this.dao = new PublisherDAO();
    }

    public Publisher searchPublisherById(Long id) {
        return dao.searchPublisherById(id);
    }

    public Publisher searchPublisherByName(String name) {
        return dao.searchPublisherByName(name);
    }

    public void printPublishers() {
        List<Publisher> publishersList = dao.printPublishers();
        System.out.println(publishersList);
    }

    public Publisher savePublisher(String name) throws Exception {
        Publisher publisher = new Publisher();
        try {
            if (name == null ) {
                throw new Exception("El nombre no puede ser nulo.");
            }
            if (dao.searchPublisherByName(name) == null) {
                publisher.setName(name);
                dao.save(publisher);
                System.out.println("La editorial " + name + " se registró correctamente.");
                return publisher;
            } else {
                System.out.println("La editorial " + name + " ya existe.");
                return null;
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new Exception("Error en método savePublisher en PublisherServices.");
        }
    }

    public Publisher updatePublisherById(Long id, String name) throws Exception {
        try {
            if (id == null) {
                throw new Exception("Debe indicar un identificador para hacer la actualización de la editorial.");
            }
            if (name == null) {
                throw new Exception("El nuevo nombre de la editorial no puede ser nulo.");
            }
            if (dao.searchPublisherById(id) != null) {
                Publisher updatePublisher = dao.searchPublisherById(id);
                updatePublisher.setName(name);
                dao.update(updatePublisher);
                System.out.println("La editorial " + id + " (" + name + ") se actualizó correctamente.");
                return updatePublisher;
            } else {
                System.out.println("No se pudo actualizar la editorial porque el ID " + id + " no existe en la base de datos.");
                return null;
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new Exception("Error en método updatePublisherById en PublisherServices.");
        }
    }

    public Publisher updatePublisherByName(String oldName, String newName) throws Exception {
        try {
            if (oldName == null) {
                throw new Exception("El nombre de la editorial a actualizar no puede ser nulo.");
            }
            if (newName == null) {
                throw new Exception("El nuevo nombre de la editorial no puede ser nulo.");
            }
            if (dao.searchPublisherByName(oldName) != null) {
                Publisher updatePublisher = dao.searchPublisherByName(oldName);
                updatePublisher.setName(newName);
                dao.update(updatePublisher);
                System.out.println("La editorial " + newName + " se actualizó correctamente.");
                return updatePublisher;
            } else {
                System.out.println("No se pudo actualizar la editorial " + oldName + " porque no existe en la base de datos.");
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new Exception("Error en método updatePublisherByName en PublisherServices.");
        }
    }

    public void deletePublisherById(Long id) throws Exception {
        try {
            if (id == null) {
                throw new Exception("Debe indicar un identificador para eliminar la editorial.");
            }
            if (dao.searchPublisherById(id) != null) {
                Publisher deletePublisher = dao.searchPublisherById(id);
                dao.delete(deletePublisher);
                System.out.println("La editorial " + id + " (" + deletePublisher.getName() + ") se eliminó correctamente.");
            } else {
                System.out.println("No se pudo eliminar la editorial " + id + " porque no existe en la base de datos.");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new Exception("Error en método deletePublisherById en PublisherServices.");
        }
    }

    public void deletePublisherByName(String name) throws Exception {
        try {
            if (name == null) {
                throw new Exception("Debe indicar un nombre para eliminar al autor.");
            }
            if (dao.searchPublisherByName(name) != null) {
                Publisher deletePublisher = dao.searchPublisherByName(name);
                dao.delete(deletePublisher);
                System.out.println("El autor " + name + " se eliminó correctamente.");
            } else {
                System.out.println("No se pudo eliminar el autor " + name + " porque no existe en la base de datos.");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new Exception("Error en método deletePublisherById en PublisherServices.");
        }
    }

}
