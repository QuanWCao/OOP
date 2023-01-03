package lab7.ex2;

public class Rectangle implements GeometricObject {

    private double length = 1.0;
    private double width = 1.0;

    public Rectangle() {
        super();
    }

    public Rectangle(double length, double width) {

        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }
}
