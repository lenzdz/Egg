package com.lenzdz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    private Long isbn;
    private String title;
    private Integer publicationYear;
    private Integer totalCopies;
    private Integer borrowedCopies;
    private Integer availableCopies;
    private Author author;
    private Publisher publisher;

    public Book() {
    }


}
