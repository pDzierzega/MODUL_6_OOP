package Day10_Repeat.Zad2_Dekorator.BaseTincture;

import Day10_Repeat.Zad2_Dekorator.AbstractTincture;

public class Alcohol extends AbstractTincture {
    private final double alcoholConcetration=0.90;

    public Alcohol(double quanity) {
        super(quanity);
        super.alcoholConcetration=this.alcoholConcetration;
    }

}
