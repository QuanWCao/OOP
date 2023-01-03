package lab7.ex7;

public class Dog extends Animal {


    @Override
    public void greeting() {
        System.out.println("Woof");
    }


    public void greeting(Dog another) {
        System.out.println("Woooof");
    }
}



