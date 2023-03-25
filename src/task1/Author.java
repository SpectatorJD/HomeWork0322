package task1;

import java.util.Objects;

public class Author {
    private final String firstNameAuthor;
    private final String nameAuthor;


    public Author(String firstNameAuthor, String nameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.nameAuthor = nameAuthor;
    }

    public String getFirstNameAuthor() {
        return this.firstNameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    @Override
    public String toString() {
        return "ФИО Автора " + this.firstNameAuthor + this.nameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstNameAuthor, author.firstNameAuthor) && Objects.equals(nameAuthor, author.nameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameAuthor, nameAuthor);
    }
}





