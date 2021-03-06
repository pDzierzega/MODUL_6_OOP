package Day2_Inheritance.Figure;

public class Circle2 extends Shape {
    private double radius=1.0;

    public Circle2() { }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public Circle2(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return String.format("A circle wit radius=%.2f ,witch is MyTime subclass of %s",
                            radius,super.toString());

    }
}
