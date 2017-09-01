package Day10_Repeat.Zad2_Dekorator.BaseTincture;

import Day10_Repeat.Zad2_Dekorator.AbstractTincture;

public class Alcohol extends AbstractTincture {
    private static final double alcoholConcentration =0.90;  // MUST BE STATIC

    public Alcohol(double quantity) {
        super(quantity, alcoholConcentration);
    }

}
