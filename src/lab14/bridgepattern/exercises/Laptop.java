package lab14.bridgepattern.exercises;

public class Laptop extends Computer {


    public Laptop(OperatingSystem OS) {
        super(OS);
    }

    @Override
    public void startup() {
        this.OS.startup();

    }

    @Override
    public void browserInternet(String url) {
        this.OS.load(url);
        System.out.println("Laptop load " + url);
    }

    @Override
    public boolean canMove() {
        return true;
    }
}
