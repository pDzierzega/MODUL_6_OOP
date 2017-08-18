package SimpleCircle;

/**
 * Created by RENT on 2017-08-18.
 */
public class SimpleCircle {
    private double radius=1.0;

    public SimpleCircle() {}

    public SimpleCircle(double radius) {
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

    public double getCircumference(){
        return 2.0*Math.PI*radius;
    }

    @Override
    public String toString(){
        return String.format("SimpleCircle[radius=%.2f",radius);
    }
}
