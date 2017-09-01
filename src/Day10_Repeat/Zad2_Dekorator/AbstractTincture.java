package Day10_Repeat.Zad2_Dekorator;

public abstract class AbstractTincture {
    private String description;
    private double quantity=0;
    private double alcohol=0;
    private double alcoholConcentration=0;

    public AbstractTincture(double quantity,double alcoholConcentration) {
        this.quantity += quantity;
        this.alcohol += alcoholConcentration*quantity;
        this.alcoholConcentration=this.alcohol/this.quantity;
    }
}
