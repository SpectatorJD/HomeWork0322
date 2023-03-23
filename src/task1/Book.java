package task1;



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

}