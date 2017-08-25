package Day3_Polimofrizm.Figure;

public class Rectangle extends Shape {
    protected double width=1.0;
    protected double length=1.0;

    public Rectangle() {}

    @Override
    public double getArea() {
        return length*width;
    }   

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getAre(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return String.format("A Rectangle with width %.2f and length %.2f, which is MyTime subclass of %s",
                width,length,super.toString());
    }
}
