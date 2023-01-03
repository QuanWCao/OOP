package lab6.ex2.ex1;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    @Override
    public String toString() {
        return "Line(" +
                "begin=" + begin +
                ", end=" + end +
                ')';
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.getBeginX();
    }

    public int getBeginY() {
        return this.getBeginY();
    }

    public int getEndX() {
        return this.getEndX();
    }

    public int getEndY() {
        return this.getEndY();
    }


    public void setBeginX(int beginX) {
        this.begin.setX(beginX);

    }

    public void setBeginY(int beginY) {
        this.begin.setY(beginY);

    }

    public void setBeginXY(int beginX, int beginY) {
        this.begin.setXY(beginX, beginY);

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
