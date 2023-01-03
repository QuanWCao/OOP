package lab13.example.decoratorpattern.ex2;

public abstract class ToppingDecorator implements IceCream {

    IceCream iceCream;

    public ToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {

        return iceCream.getDescription()
                + addTopping(iceCream);
    }

    public String addTopping(IceCream iceCream) {
        return "Topping";
    }


}
