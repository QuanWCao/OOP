package lab6.ex1.ex4;


public class TestShape {

    public static void main(String[] args) {

        Shape shape = new Shape();
        System.out.println(shape);
        shape.setColor("yellow");
        shape.setFilled(false);
        System.out.println(shape);

        Circle circle = new Circle("white", false, 4);
        System.out.println(circle);
        System.out.println("Area of circle is: " + circle.getArea());
        System.out.println("Perimeter of circle is: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle("blue", false, 6.4, 2.8);
        System.out.println(rectangle);
        System.out.println("Area of circle is: " + rectangle.getArea());
        System.out.println("Perimeter of circle is: " + rectangle.getPerimeter());

        Square square = new Square();
        System.out.println(square);
        square.setLength(4);
        System.out.println(square);
        System.out.println("Area of circle is: " + square.getArea());
        System.out.println("Perimeter of circle is: " + square.getPerimeter());

    }
}
