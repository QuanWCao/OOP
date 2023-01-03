package hw5.ex2.ex8;

public class MyCircle {

    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle() {

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

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        int[] array = new int[2];
        array[0] = center.getX();
        array[1] = center.getY();

        return array;
    }

    public void setCenterXY(int x, int y) {
        center.setX(x);
        center.setY(y);

    }

    @Override
    public String toString() {
        return "MyCircle [radius=" + radius + ", center=(" + center.getX() + "," + center.getY() + "]";
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double Circumference() {
        return 2 * Math.PI * radius;

    }

    public double distance(MyCircle another) {
        return center.distance(another.getCenter());

    }

}

