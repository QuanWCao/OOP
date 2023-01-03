package lab13.example.decoratorpattern.ex1;

public class RedShapeDecorator extends ShapeDecorator {


    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw() {
        shape.draw();
        setRedBorder(shape);

    }

    private void setRedBorder(Shape shape) {
        System.out.println("Border Color: Red");
    }
}
