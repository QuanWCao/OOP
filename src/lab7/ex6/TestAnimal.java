package lab7.ex6;


public class TestAnimal {
    public static void main(String[] args) {

        Cat cat1 = new Cat("meo1");
        cat1.greets();
        Dog dog1 = new Dog("cho1");
        dog1.greets();
        BigDog bigDog1 = new BigDog("chobu1");
        bigDog1.greets();

        Animal animal1 = new Cat("meo2");
        animal1.greets();
        Animal animal2 = new Dog("cho2");
        animal2.greets();
        Animal animal3 = new BigDog("chobu2");
        animal3.greets();


        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;
        Cat cat2 = (Cat) animal2;
        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);
    }
}