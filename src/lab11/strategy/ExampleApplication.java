package lab11.strategy;

import java.util.Scanner;


public class ExampleApplication {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Context context = new Context();
        int firstNumber = 5;
        int secondNumber = 6;

        String action = "addition";
        String action1 = "subtraction";
        String action2 = "multiplication";


        System.out.println("Phep toan mong muon(addition ,subtraction or multiplication): ");
        String desired = in.next();

        in.close();

        if (action.equals(desired)) {
            context.setStrategy(new ConcreteStrategyAdd());
            int result = context.executeStrategy(firstNumber, secondNumber);
            System.out.println(result);
        } else if (action1.equals(desired)) {
            context.setStrategy(new ConcreteStrategySubtract());
            int result = context.executeStrategy(firstNumber, secondNumber);
            System.out.println(result);
        } else if (action2.equals(desired)) {
            context.setStrategy(new ConcreteStrategyMultiply());
            int result = context.executeStrategy(firstNumber, secondNumber);
            System.out.println(result);
        } else {
            System.out.println("Error");
        }
    }
}
