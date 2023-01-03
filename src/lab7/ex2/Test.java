package lab7.ex2;


public class Test {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.5);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        Rectangle rectangle1 = new Rectangle(2, 3);
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());

    }
}
