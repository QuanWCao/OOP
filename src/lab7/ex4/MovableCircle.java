package lab7.ex4;

public class MovableCircle implements Movable {

    private int radius;
    MovablePoint center;


    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {

        this.radius = radius;

        this.center = new MovablePoint(x, y, xSpeed, ySpeed);


    }

    @Override
    public String toString() {
        return "(" + center.x + ", " + center.y + ") " + "speed = (" + center.x + ", " + center.y + ")" + ", " + radius;
    }

    public void moveUp() {

        center.y -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.y += center.ySpeed;
    }
}
