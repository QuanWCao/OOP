package hw5.ex2.ex9;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle myTriangle1 = new MyTriangle(2, 6, 4, 8, 10, 0);
        System.out.println(myTriangle1);
        System.out.printf("perimeter is: %.2f%n", myTriangle1.getPerimeter());
        System.out.println(myTriangle1.getType());

        MyPoint point1 = new MyPoint(11, 3);
        MyPoint point2 = new MyPoint(1, 1);
        MyPoint point3 = new MyPoint(4, 7);
        MyTriangle myTriangle2 = new MyTriangle(point1, point2, point3);
        System.out.println(myTriangle2.getType());
    }

}

