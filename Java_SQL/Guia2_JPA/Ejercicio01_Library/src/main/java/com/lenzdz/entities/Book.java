package com.lenzdz.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Book {

    @Id
    private Long isbn;
    private String title;
    private Integer publicationYear;
    private Integer totalCopies;
    private Integer borrowedCopies;
    private Integer availableCopies;
    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable(name = "book_author",
            joinColumns = @JoinColumn(name = "isbn"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors;
    @OneToOne
    private Publisher publisher;

    public Book() {
    }

    public Book(Long isbn, String title, Integer publicationYear, Integer totalCopies, Integer borrowedCopies, Integer availableCopies, Set<Author> authors, Publisher publisher) {
        this.isbn = isbn;
        this.title = title;
        this.publicationYear = publicationYear;
        this.totalCopies = totalCopies;
        this.borrowedCopies = borrowedCopies;
        this.availableCopies = availableCopies;
        this.authors = authors;
        this.publisher = publisher;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Integer getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(Integer totalCopies) {
        this.totalCopies = totalCopies;
    }

    public Integer getBorrowedCopies() {
        return borrowedCopies;
    }

    public void setBorrowedCopies(Integer borrowedCopies) {
        this.borrowedCopies = borrowedCopies;
    }

    public Integer getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(Integer availableCopies) {
        this.availableCopies = availableCopies;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", totalCopies=" + totalCopies +
                ", borrowedCopies=" + borrowedCopies +
                ", availableCopies=" + availableCopies +
                ", authors=" + authors.toString() +
                ", publisher=" + publisher +
                '}';
    }

}
