package labs2;

import java.util.Scanner;

public class Exponent {

    public static int exponent(int base, int exp) {
        int product = 1;

        for (int i = 1; i <= exp; i++) {
            product *= base;
        }

        return product;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = input.nextInt();

        System.out.print("Enter the exp: ");
        int exp = input.nextInt();

        System.out.println(base + " raises to the power of " + exp + " is: " + (exponent(base, exp)));
    }
}
