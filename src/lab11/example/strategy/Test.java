package lab11.example.strategy;


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        String action = "Dog";
        String action1 = "Cat";
        String action2 = "Pig";
        StrategyAnimal strategyAnimal = new StrategyAnimal();

        Scanner in = new Scanner(System.in);
        System.out.println("Animal(Dog ,Cat ,Pig): ");
        String desired = in.next();

        in.close();

        if (action.equals(desired)) {
            strategyAnimal.setStrategy(new Dog());

            strategyAnimal.greetsStrategy();
        } else if (action1.equals(desired)) {
            strategyAnimal.setStrategy(new Cat());

            strategyAnimal.greetsStrategy();
        } else if (action2.equals(desired)) {
            strategyAnimal.setStrategy(new Pig());

            strategyAnimal.greetsStrategy();
        } else {
            System.out.println("Error");
        }

    }
}
