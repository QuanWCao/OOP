package lab6.ex2.ex1;

public class LineSub extends Point {
    Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    @Override
    public String toString() {
        return "LineSub(" +
                "begin=" + super.toString() +
                "end=" + end +
                ')';
    }

    public Point getBegin() {
        return new Point(super.getX(), super.getY());
    }

    public void setBegin(Point begin) {
        super.setXY(begin.getX(), begin.getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return this.getEndX();
    }

    public int getEndY() {
        return this.getEndY();
    }


    public void setBeginX(int beginX) {
        super.setX(beginX);

    }

    public void setBeginY(int beginY) {
        super.setY(beginY);

    }

    public void setBeginXY(int beginX, int beginY) {
        super.setXY(beginX, beginY);

    }

    public void setEndX(int endX) {
        this.end.setX(endX);

    }

    public void setEndY(int endY) {
        this.end.setX(endY);

    }

    public void setEndXY(int endX, int endY) {
        this.end.setXY(endX, endY);

    }

    public int getLength() {
        int xDiff = this.getEndX() - this.getBeginX();
        int yDiff = this.getEndY() - this.getBeginY();
        return (int) Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }

    public double getGradient() {
        int xDiff = this.getEndX() - this.getBeginX();
        int yDiff = this.getEndY() - this.getBeginY();
        return (int) Math.atan2(xDiff, yDiff);
    }

}
