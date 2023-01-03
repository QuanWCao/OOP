package hw5.ex1.ex2;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double Circumference() {
        return this.radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

}

