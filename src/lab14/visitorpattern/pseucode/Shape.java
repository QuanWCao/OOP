package lab14.visitorpattern.pseucode;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor v);
}
