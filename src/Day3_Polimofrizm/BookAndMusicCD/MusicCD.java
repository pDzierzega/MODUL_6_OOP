package Day3_Polimofrizm.BookAndMusicCD;

public abstract class MusicCD implements IProduct{
    protected int price;
    protected String name;
    protected String title;
    protected String performer;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getProductName() {
        return name;
    }

    @Override
    public void setProductName(String name) {
        this.name=name;
    }

    @Override
    public void setPrice(int price) {
        this.price=price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }
}
