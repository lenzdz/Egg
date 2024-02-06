package com.lenzdz.Entities;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    private Long isbn;
    @Basic
    private String name;
    private Integer year;
    @OneToOne
    private Author author;

    public Book() {
    }

    public Book(Long isbn, String name, Integer year, Author author) {
        this.isbn = isbn;
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", author=" + author +
                '}';
    }

}
