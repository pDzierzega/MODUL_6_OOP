package Day2_Inheritance.Figure;

/**
 * Created by RENT on 2017-08-22.
 */
public class Squere extends Rectangle {
    public Squere() {}

    public Squere(double side) {
        super(side, side);
    }

    public Squere(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide(){
        return getLength();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return String.format("A square with side=%.2d, which is a subclass of %s", super.toString());
    }
}
