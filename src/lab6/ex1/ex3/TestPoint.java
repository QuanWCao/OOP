package lab6.ex1.ex3;

public class TestPoint {

    public static void main(String[] args) {

        Point2D p2 = new Point2D(1, 2);
        System.out.println(p2);
        p2.setX(3);
        p2.setY(4);
        System.out.println(p2);
        System.out.println("x is: " + p2.getX());
        System.out.println("x is: " + p2.getY());

        Point3D p3 = new Point3D();
        System.out.println(p3);

        p3.setX(21);
        p3.setY(22);
        p3.setZ(23);
        System.out.println(p3);
        System.out.println("x is: " + p3.getX());
        System.out.println("y is: " + p3.getY());
        System.out.println("z is: " + p3.getZ());
    }
}
