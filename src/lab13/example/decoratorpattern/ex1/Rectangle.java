package lab13.example.decoratorpattern.ex1;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw: Rectangle");
    }
}
