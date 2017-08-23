package Day3_Polimofrizm.Figure;

public abstract class Shape {
    protected String color= "red";
    protected boolean filled=true;

    public Shape() {}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return String.format("A Shape with color of %s and %s",
                            color, filled?"filled":"not filled");
    }
}
