package lab6.ex1.ex3;

public class Point3D extends Point2D {

    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        super();
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {

        float[] array = new float[3];
        array[0] = super.getX();
        array[1] = super.getY();
        array[2] = this.z;

        return array;
    }

    public void setXY(float x, float y, float z) {
        this.z = z;
        super.setXY(x, y);
    }

    @Override
    public String toString() {
        return "(" +
                "x=" + super.getX() +
                " y=" + super.getY() +
                ", z=" + this.z +
                ')';
    }
}
