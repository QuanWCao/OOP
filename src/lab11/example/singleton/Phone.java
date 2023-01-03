package lab11.example.singleton;


public class Phone {

    private static Phone instance;
    public String name;
    public double price;


    private Phone(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static Phone getInstance(String name, double price) {
        if (instance == null) {
            instance = new Phone(name, price);
        }
        return instance;
    }


}
