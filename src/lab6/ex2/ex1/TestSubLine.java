package lab6.ex2.ex1;

public class TestSubLine {

    public static void main(String[] args) {
        LineSub sl1 = new LineSub(0, 0, 3, 4);
        System.out.println(sl1);

        Point p1 = new Point(10, 20);
        Point p2 = new Point(100, 10);
        LineSub sl2 = new LineSub(p1, p2);
        System.out.println(sl2);

    }
}
