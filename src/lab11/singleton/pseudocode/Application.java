package lab11.singleton.pseudocode;

public class Application {

    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT ...foo");
        Database bar = Database.getInstance();
        bar.query("SELECT ...bar");

        System.out.println(foo == bar);

    }
}
