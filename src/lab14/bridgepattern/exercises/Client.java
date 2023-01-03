package lab14.bridgepattern.exercises;

public class Client {

    public static void main(String[] args) {
        OperatingSystem windows = new WindowsOS();
        OperatingSystem mac = new MacOS();

        Computer laptop1 = new Laptop(windows);
        laptop1.startup();
        laptop1.browserInternet("OOP");
        System.out.println(laptop1.canMove());

        System.out.println();
        Computer laptop2 = new PC(mac);
        laptop2.startup();
        laptop2.browserInternet("12P");
        System.out.println(laptop2.canMove());
    }
}
