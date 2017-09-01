package Day10_Repeat.Zad2_Dekorator;

public abstract class AbstractTincture {
    protected String description;
    protected double quanity=0;
    protected double alcoholConcetration=0;

    public AbstractTincture(double quanity) {
        this.quanity = quanity;
    }
}
