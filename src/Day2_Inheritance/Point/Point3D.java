package Day2_Inheritance.Point;

/**
 * Created by RENT on 2017-08-22.
 */
public class Point3D extends Point2D {
    private float z=0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {}

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ (float x, float y, float z){
        setXY(x,y);
        this.z=z;
    }

    public float[] getXYZ(){
        float[] toReturn={getX(),getY(),z};
        return toReturn;
    }

    @Override
    public String toString() {
        return String.format("( %.2f , %.2f , %.2f )",getX(),getY(),z);
    }
}
