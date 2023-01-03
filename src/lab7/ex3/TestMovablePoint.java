package lab7.ex3;

public class TestMovablePoint {

    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint(3, 4, 2, 8);
        System.out.println(movablePoint1);
        movablePoint1.moveDown();
        movablePoint1.moveLeft();
        movablePoint1.moveRight();
        movablePoint1.moveUp();


    }
}
