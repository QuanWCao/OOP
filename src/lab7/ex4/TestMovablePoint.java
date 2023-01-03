package lab7.ex4;


public class TestMovablePoint {

    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint(3, 4, 2, 8);
        System.out.println(movablePoint1);
        movablePoint1.moveDown();
        movablePoint1.moveLeft();
        movablePoint1.moveRight();
        movablePoint1.moveUp();

        MovableCircle circle1 = new MovableCircle(3, 4, 2, 8, 10);
        System.out.println(circle1);
        circle1.moveDown();
        circle1.moveLeft();
        circle1.moveRight();
        circle1.moveUp();


    }
}
