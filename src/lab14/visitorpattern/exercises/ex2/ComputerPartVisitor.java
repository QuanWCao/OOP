package lab14.visitorpattern.exercises.ex2;

public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Keyboard keyboard);

    void visit(Mouse mouse);

    void visit(Monitor monitor);
}
