package lab13.example.decoratorpattern.ex2;

public class HoneyToppingDecorator extends ToppingDecorator {
    public HoneyToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    public String getDescription() {
        return iceCream.getDescription() + " + " + addTopping(iceCream);
    }

    public String addTopping(IceCream iceCream) {
        return "HoneyTopping";
    }
}
