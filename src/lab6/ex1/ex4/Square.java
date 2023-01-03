package lab6.ex1.ex4;

public class Square extends Rectangle {

    private double side;

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);

    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }


}
