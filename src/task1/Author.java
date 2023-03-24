package task1;

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
    public int hashCode() {
        return java.util.Objects.hash(firstNameAuthor);
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return firstNameAuthor.equals(c2.firstNameAuthor);
    }
}





