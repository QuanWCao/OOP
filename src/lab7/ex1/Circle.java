package lab7.ex1;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        super();
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle[" + super.toString() +
                ",radius=" + radius +
                ']';
    }


    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }
}
