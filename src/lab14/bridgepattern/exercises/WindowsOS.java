package lab14.bridgepattern.exercises;

public class WindowsOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("WindowsOS");

    }

    @Override
    public void load(String url) {
        System.out.println("WindowsOS load url");
    }
}
