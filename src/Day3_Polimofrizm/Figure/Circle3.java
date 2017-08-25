package Day3_Polimofrizm.Figure;

public class Circle3 extends Shape {
    protected double radius=1.0;

    public Circle3() { }

    public Circle3(double radius) {
        this.radius = radius;
    }

    public Circle3(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return String.format("A circle wit radius=%.2f ,witch is MyTime subclass of %s",
                            radius,super.toString());

    }
}
