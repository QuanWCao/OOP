package lab14.bridgepattern.exercises;

public abstract class Computer {

    protected OperatingSystem OS;

    public Computer(OperatingSystem OS) {
        this.OS = OS;
    }

    public abstract void startup();

    public abstract void browserInternet(String url);

    public abstract boolean canMove();
}
