package lab13.example.decoratorpattern.ex2;

public class NutsToppingIceCream extends ToppingDecorator {
    public NutsToppingIceCream(IceCream iceCream) {
        super(iceCream);
    }

    public String getDescription() {
        return iceCream.getDescription() + " + " + addTopping(iceCream);
    }

    public String addTopping(IceCream iceCream) {
        return "NutsTopping";
    }
}
