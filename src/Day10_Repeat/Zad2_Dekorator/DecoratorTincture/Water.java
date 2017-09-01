package Day10_Repeat.Zad2_Dekorator.DecoratorTincture;
import Day10_Repeat.Zad2_Dekorator.AbstractTinctureDecorator;

public class Water extends AbstractTinctureDecorator{
    private double quanity;
    private double alcoholConcetration=0.00;

    public Water(double quanity) {
        super(quanity);
        this.quanity=quanity;
    }
}
