package hw5.ex2.ex7;

public class MyLine {

    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);

        end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public void setBeginY(int y) {
        begin.setX(y);
    }

    public int getEndX() {
        return this.end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setEndY(int y) {
        end.setX(y);

    }

    public int[] getBeginXY() {
        int[] array = new int[2];
        array[0] = begin.getX();
        array[1] = begin.getY();

        return array;
    }

    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);

    }

    public int[] getEndXY() {
        int[] array = new int[2];
        array[0] = end.getX();
        array[1] = end.getY();

        return array;
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public double getLength() {
        double len = begin.distance(end);
        return len;
    }

    public double getGradient() {
        int xDiff = begin.getX() - end.getX();
        int yDiff = begin.getY() - end.getY();
        return Math.atan2(xDiff, yDiff);
    }

    @Override
    public String toString() {
        return "MyLine [begin= (" + begin.getX() + "," + begin.getY() + "), end=(" + end.getX() + "," + end.getY()
                + ")]";
    }

}

