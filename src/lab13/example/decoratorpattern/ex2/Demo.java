package lab13.example.decoratorpattern.ex2;

public class Demo {

    public static void main(String[] args) {

        IceCream Vani = new VanillaIceCream();

        IceCream Honey = new HoneyToppingDecorator(new VanillaIceCream());

        IceCream Nuts = new NutsToppingIceCream(new VanillaIceCream());

        System.out.println("contain :");

        System.out.println(Vani.getDescription());
        System.out.println(Honey.getDescription());
        System.out.println(Nuts.getDescription());


    }
}
