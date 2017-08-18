package Circle;

/**
 * Created by RENT on 2017-08-18.
 */
public class Circle {
    private double _radius =1.0;
    private String _color ="red";

    public Circle() {}

    public Circle(double radius) {
        this._radius = radius;
    }

    public Circle(double radius, String color) {
        _radius = radius;
        _color = color;
    }

    public double getRadius() {
        return _radius;
    }

    public String getColor() {
        return _color;
    }

    public void setRadius(double radius) {
        _radius = radius;
    }

    public void setColor(String color) {
        _color = color;
    }

    public double getArea() {
        return Math.PI* Math.pow(_radius,2);
    }

    @Override
    public String toString() {
        return String.format("SimpleCircle[radius=%.2f ,color= %s",_radius,_color);
    }
}

