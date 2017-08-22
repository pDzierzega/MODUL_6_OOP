package Day1_UML.MyPointAndMyCircle;

public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint() {}

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int[] toReturn={x,y};
        return toReturn;
    }

    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)",x,y);
    }

    public double distance (int x, int y){
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    }

    public double distance (MyPoint another){
        //pomimo ze to inny obiekt, ale jest tej samej klasy mam dostep do prywatnych pol
        return distance(another.x,another.y);
    }

    public double distance(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
}
