package lab11.example.singleton;

public class Test {

    public static void main(String[] args) {

        Phone singleton = Phone.getInstance("Iphone", 10000);
        Phone anotherSingleton = Phone.getInstance("SamSung", 8000);
        System.out.println("\nName: ");
        System.out.println(singleton.name);
        System.out.println(anotherSingleton.name);

        System.out.println("\nPrice: ");
        System.out.println(singleton.price);
        System.out.println(anotherSingleton.price);

    }
}
