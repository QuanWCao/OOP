package lab12.example.factorymethodpattern;

public class CallingClass {

    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        Fruit fruit = new FruitFactory().provideFruit("banana");
        fruit.produceJuice();
    }
}
