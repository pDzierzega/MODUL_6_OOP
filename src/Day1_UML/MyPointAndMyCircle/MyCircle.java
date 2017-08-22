package Day1_UML.MyPointAndMyCircle;

public class MyCircle {
    private MyPoint center=new MyPoint(0,0);
    private int radius=1;

    public MyCircle() {}

    public MyCircle(int x,int y,int radius){
        this.center=new MyPoint(x,y);
        this.radius=radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX(){
        return center.getX();
    }

    public void setCenterX(int x){
        center.setX(x);
    }

    public int getCenterY(){
        return center.getY();
    }

    public void setCenterY(int y){
        center.setY(y);
    }

    public int[] getCenterXY(){
        int[] toReturn={center.getX(),center.getY()};
        return toReturn;
    }

    public void setCenterXY(int x,int y){
        center.setX(x);
        center.setY(y);
    }

    @Override
    public String toString() {
        return String.format("MyCircle[radius=%d ,center=%s",radius,center);
    }

    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    public double distance(MyCircle another){
        return center.distance(another.center);
    }
}
