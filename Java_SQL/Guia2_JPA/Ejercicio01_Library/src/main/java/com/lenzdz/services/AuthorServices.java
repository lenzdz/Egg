package com.lenzdz.services;

import com.lenzdz.entities.Author;
import com.lenzdz.persistence.AuthorDAO;

import java.util.List;

public class AuthorServices {

    private final AuthorDAO dao;

    public AuthorServices() {
        this.dao = new AuthorDAO();
    }

    public Author searchAuthorById(Long id) {
        return dao.searchAuthorById(id);
    }

    public Author searchAuthorByName(String name) {
        return dao.searchAuthorByName(name);
    }

    public void printAuthors() {
        List<Author> authorList = dao.printAuthors();
        System.out.println(authorList);
    }

    public void searchPrintAuthorByName(String name) {
        Author author = dao.searchAuthorByName(name);
        if (author == null) {
            System.out.println("No se encontró al autor en la base de datos.");
        } else {
            System.out.println(author);
        }
    }

    public Author saveAuthor(String name) throws Exception {
        Author author = new Author();
        try {
            if (name == null || name.isEmpty()) {
                throw new Exception("El nombre no puede estar vacío.");
            }
            if (dao.searchAuthorByName(name) == null) {
                author.setName(name);
                dao.save(author);
                System.out.println("El autor " + name + " se registró correctamente.");
                return author;
            } else {
                System.out.println("El autor " + name + " ya existe.");
                return null;
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new Exception("Error en método saveAuthor en AuthorServices.");
        }
    }

    public Author updateAuthorById(Long id, String name) throws Exception {
        try {
            if (id == null) {
                throw new Exception("Debe indicar un identificador para hacer la actualización del autor.");
            }
            if (name == null || name.isEmpty()) {
                throw new Exception("El nuevo nombre del autor no puede estar vacío.");
            }
            if (dao.searchAuthorById(id) != null) {
                Author updateAuthor = dao.searchAuthorById(id);
                updateAuthor.setName(name);
                dao.update(updateAuthor);
                System.out.println("El autor " + id + " (" + name + ") se actualizó correctamente.");
                return updateAuthor;
            } else {
                System.out.println("No se pudo actualizar el autor porque el ID " + id + " no existe en la base de datos.");
                return null;
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new Exception("Error en método updateAuthorById en AuthorServices.");
        }
    }

    public Author updateAuthorByName(String oldName, String newName) throws Exception {
        try {
            if (oldName == null || oldName.isEmpty()) {
                throw new Exception("El nombre del autor a actualizar no puede estar vacío.");
            }
            if (newName == null || newName.isEmpty()) {
                throw new Exception("El nuevo nombre del autor no puede estar vacío.");
            }
            if (dao.searchAuthorByName(oldName) != null) {
                Author updateAuthor = dao.searchAuthorByName(oldName);
                updateAuthor.setName(newName);
                dao.update(updateAuthor);
                System.out.println("El autor " + newName + " se actualizó correctamente.");
                return updateAuthor;
            } else {
                System.out.println("No se pudo actualizar el autor " + oldName + " porque no existe en la base de datos.");
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new Exception("Error en método updateAuthorByName en AuthorServices.");
        }
    }

    public void deleteAuthorById(Long id) throws Exception {
        try {
            if (id == null) {
                throw new Exception("Debe indicar un identificador para eliminar al autor.");
            }
            if (dao.searchAuthorById(id) != null) {
                Author deleteAuthor = dao.searchAuthorById(id);
                dao.delete(deleteAuthor);
                System.out.println("El autor " + id + " (" + deleteAuthor.getName() + ") se eliminó correctamente.");
            } else {
                System.out.println("No se pudo eliminar el autor " + id + " porque no existe en la base de datos.");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new Exception("Error en método deleteAuthorById en AuthorServices.");
        }
    }

    public void deleteAuthorByName(String name) throws Exception {
        try {
            if (name == null) {
                throw new Exception("Debe indicar un nombre para eliminar al autor.");
            }
            if (dao.searchAuthorByName(name) != null) {
                Author deleteAuthor = dao.searchAuthorByName(name);
                dao.delete(deleteAuthor);
                System.out.println("El autor " + name + " se eliminó correctamente.");
            } else {
                System.out.println("No se pudo eliminar el autor " + name + " porque no existe en la base de datos.");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new Exception("Error en método deleteAuthorById en AuthorServices.");
        }
    }

}
