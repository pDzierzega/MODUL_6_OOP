package Day1_UML.BookAndAuthor;

public class Main {
    public static void main(String[] args) {

        Author tolkien=new Author("Tolkien","email",'m');

        System.out.println(tolkien);

        Book book= new Book("LotR",23.99,tolkien);
        book.setQty(4);
        System.out.println(book);
    }
}
