package lab6.ex2.ex2;

public class Cylinder {

    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double height) {
        base = new Circle();
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius, "pink");
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder[" +
                "base=" + base +
                ", height=" + height +
                ']';
    }
}
