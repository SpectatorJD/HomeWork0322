package task1;


import java.util.Objects;

public class Book  {

    private String nameBook;
    private int yearCreate;
    private final task1.Author author;

    public Book(task1.Author author, String nameBook, int yearCreate) {
        this.nameBook = nameBook;
        this.yearCreate = yearCreate;
        this.author = author;

    }

    public int getYearCreate() {
        return yearCreate;
    }

    public void setYearCreate(int yearCreate) {
        this.yearCreate = yearCreate;
    }

    public String getNameBook() {
        return nameBook;
    }

    public task1.Author getAuthor() {
        return author;
    }
    public String toString() {
        return "Название книги " + this.nameBook + this.yearCreate + " " + author.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearCreate == book.yearCreate && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, yearCreate, author);
    }
}