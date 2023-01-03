package hw5.ex2.ex8;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(1, 2, 3);
        MyCircle circle2 = new MyCircle(new MyPoint(1, 1), 5);

        System.out.println(circle1);

        circle1.setCenterX(3);
        System.out.println("centerX is: " + circle1.getCenterX());
        circle1.setCenterY(1);
        System.out.println("centerY is: " + circle1.getCenterY());
        circle1.setCenterXY(8, 7);
        System.out.println(circle1);

        System.out.printf("area is: %.2f%n", circle1.getArea());
        System.out.printf("circulum is: %.2f%n", circle1.Circumference());

        System.out.printf("distance is: %.2f%n", circle1.distance(circle2));
    }

}

