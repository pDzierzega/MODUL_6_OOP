package Day3_Polimofrizm.Figure;

public class Squere extends Rectangle {

    public void jestemKwadratem(){
        System.out.println("JESTEM KWADRATEM");
    }

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
        return String.format("A square with side=%.2f, which is MyTime subclass of %s",getSide(), super.toString());
    }
}
