package lab6.ex2.ex2;


public class TestCylinder {

    public static void main(String[] args) {

        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder: " + "radius =" + cylinder1.getBase().getRadius() +
                " height =" + cylinder1.getHeight() +
                " base area =" + cylinder1.getBase().getArea() +
                " volume =" + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(10.0);
        System.out.println("Cylinder: " + "radius =" + cylinder2.getBase().getRadius() +

                " height =" + cylinder2.getHeight() +
                " base area =" + cylinder2.getBase().getArea() +
                " volume =" + cylinder2.getVolume());

        Cylinder cylinder3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder: " + "radius =" + cylinder3.getBase().getRadius() +
                " height =" + cylinder3.getHeight() +
                " base area =" + cylinder3.getBase().getArea() +
                " volume =" + cylinder3.getVolume());
    }
}

