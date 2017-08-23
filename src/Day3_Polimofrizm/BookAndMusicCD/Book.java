package Day3_Polimofrizm.BookAndMusicCD;

/**
 * Created by RENT on 2017-08-23.
 */
public class Book implements IProduct {
    protected int price;
    protected String name;
    protected String title;
    protected String Author;

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public String getProductName() {
        return null;
    }

    @Override
    public void setProductName(String name) {
    }

    @Override
    public void setPrice(int price) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
