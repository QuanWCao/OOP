package lab6.ex1.ex5;

public class TestAnimal {

    public static void main(String[] args) {

        Dog dog1 = new Dog("shiba");
        System.out.println(dog1.toString());
        Dog dog2 = new Dog("Viet");
        dog2.greets();
        dog2.greets(dog1);


        Cat cat1 = new Cat("Tam the");
        Cat cat2 = new Cat("Ai cap");
        System.out.println(cat1.toString());
        cat2.greets();


    }
}
