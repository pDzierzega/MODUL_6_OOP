package Day12_Generics;

public class Suitcase<T extends Clothes&I_CanBeFolded>  {
    private T thing;

    public Suitcase() {}
    public Suitcase(T thing) {
        this.thing = thing;
    }

    public void setThing(T thing) {
        this.thing = thing;
    }

    public T getThing() {
        return thing;
    }

}
