package lab14.bridgepattern.exercises;

public class PC extends Computer {
    public PC(OperatingSystem OS) {
        super(OS);
    }

    @Override
    public void startup() {
        this.OS.startup();

    }

    @Override
    public void browserInternet(String url) {
        this.OS.load(url);
        System.out.println("PC load " + url);

    }

    @Override
    public boolean canMove() {
        return false;
    }
}
