package task1;


public class Main {
    public static void main(String[] args) {
        task1.Author author1 = new task1.Author("Пушкин ", "Александр Сергеевич ");
        task1.Book book1 = new task1.Book(author1, "Капитанская дочка ", 1836);
        //System.out.println(author1.getFirstNameAuthor()+author1.getNameAuthor()+book1.getNameBook()+book1.getYearCreate());
        System.out.print(author1);

        task1.Author author2 = new task1.Author("Литвак ","Михаил Ефимович ");
        task1.Book book2 = new task1.Book(author2, "Капитанская дочка ", 1836);
       // System.out.println(author2.getFirstNameAuthor()+author2.getNameAuthor()+book2.getNameBook()+book2.getYearCreate());
        System.out.print(author2);
        System.out.println(book2);
        book2.setYearCreate(2011);
        System.out.print(author2);
        System.out.println(book2);
    }

}