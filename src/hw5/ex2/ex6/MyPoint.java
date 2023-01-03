package hw5.ex2.ex6;

public class MyPoint {

    private int x = 0;
    private int y = 0;

    public MyPoint() {

    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        int[] arrays = new int[2];
        arrays[0] = x;
        arrays[1] = y;

        this.x = arrays[0];
        this.y = arrays[1];
    }

    public int[] getXY() {
        int[] arrays = new int[2];
        arrays[0] = this.x;
        arrays[1] = this.y;

        return arrays;
    }

    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance() {
        int xDiff = this.x - 0;
        int yDiff = this.y - 0;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

}

