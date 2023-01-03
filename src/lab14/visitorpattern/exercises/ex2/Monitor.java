package lab14.visitorpattern.exercises.ex2;

public class Monitor implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }
}
