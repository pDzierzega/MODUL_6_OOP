package Day1_UML.BookAndAuthor;

import java.util.ArrayList;

public class Book {
    private String name;
    private ArrayList<Author> author=new ArrayList<>();
    private double price;
    private int qty=0;

    public Book(String name, double price, Author... authors) {
        this.name = name;
        this.price = price;
        for (Author singleAuthor :authors) {
            this.author.add(singleAuthor);
        }
    }

    public Book(String name, double price, int qty, Author... authors) {
        this(name,price,authors);
        this.qty=qty;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Author> getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return String.format("Book[name=%s ,%s ,price=%.2f ,qty=%d",name,author,price,qty);
    }
}
