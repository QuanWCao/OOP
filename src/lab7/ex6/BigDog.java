package lab7.ex6;

public class BigDog extends Dog {


    public BigDog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }


    public void greets(Dog another) {
        System.out.println("Woooof");
    }
}
