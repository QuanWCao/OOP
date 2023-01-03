package lab12.example.factorymethodpattern;

public class FruitFactory {

    public Fruit provideFruit(String type) {
        if (type.equals("apple")) {
            return new Apple();
        } else if (type.equals("banana")) {
            return new Banana();
        } else {
            return new Orange();
        }


    }
}
