package entities;
import java.util.Objects;

public class Book {
    
    private String title;
    private String author;
    private Integer totalCopies;
    private Integer borrowedCopies;

    public Book() {
    }

    public Book(String title, String author, Integer totalCopies, Integer borrowedCopies) {
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        this.borrowedCopies = borrowedCopies;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getTotalCopies() {
        return this.totalCopies;
    }

    public void setTotalCopies(Integer totalCopies) {
        this.totalCopies = totalCopies;
    }

    public Integer getBorrowedCopies() {
        return this.borrowedCopies;
    }

    public void setBorrowedCopies(Integer borrowedCopies) {
        this.borrowedCopies = borrowedCopies;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(totalCopies, book.totalCopies) && Objects.equals(borrowedCopies, book.borrowedCopies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, totalCopies, borrowedCopies);
    }

    @Override
    public String toString() {
        return "{" +
            " title='" + getTitle() + "'" +
            ", author='" + getAuthor() + "'" +
            ", totalCopies='" + getTotalCopies() + "'" +
            ", borrowedCopies='" + getBorrowedCopies() + "'" +
            "}";
    }


}
