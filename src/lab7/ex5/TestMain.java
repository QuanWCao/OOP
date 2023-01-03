package lab7.ex5;

public class TestMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.5);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        ResizableCircle resizableCircle1 = new ResizableCircle(6);
        System.out.println(resizableCircle1);
        System.out.println(resizableCircle1.getArea());
        System.out.println(resizableCircle1.getPerimeter());
    }
}
