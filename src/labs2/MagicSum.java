package labs2;

import java.util.Scanner;

public class MagicSum {

    public static boolean hasEight(int number) {

        String numbers = String.valueOf(number);
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == '8') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final int SENTIEL = -1;
        int number;
        int sum = 0;

        System.out.print("Enter a positive integer (or -1 to end): ");
        number = in.nextInt();

        while (number != SENTIEL) {
            if (hasEight(number)) {
                sum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
        }

        in.close();

        System.out.print("The magic sum is: " + sum);

        // TODO Auto-generated method stub

    }

}
