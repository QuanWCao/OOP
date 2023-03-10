package hw5.ex2.ex9;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;

    }

    @Override
    public String toString() {
        return "MyTriangle [v1=(" + v1.getX() + "," + v1.getY() + ", v2=" + v2.getX() + ", " + v2.getY() + "), v3="
                + v3.getX() + " ," + v3.getY() + ")]";
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {
        double tri1 = v1.distance(v2);
        double tri2 = v2.distance(v3);
        double tri3 = v3.distance(v1);

        if (tri1 == tri2 && tri2 == tri3 && tri3 == tri1) {
            return "Equilateral";
        } else if (tri1 == tri2 || tri2 == tri3 || tri3 == tri1) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

}

