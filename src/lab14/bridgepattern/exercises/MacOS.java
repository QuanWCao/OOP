package lab14.bridgepattern.exercises;

public class MacOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("MacOS");
    }

    @Override
    public void load(String url) {
        System.out.println("MacOS load url");

    }
}
