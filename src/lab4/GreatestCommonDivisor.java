package lab4;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int gcd(int firstNumber, int secondNumber) {
        if (firstNumber <= secondNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;

        }

        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number one :");
        int firstNumber = sc.nextInt();
        System.out.print("Please enter number two :");
        int secondNumber = sc.nextInt();
        sc.close();

        System.out.print("gcd 2 numbers :" + gcd(firstNumber, secondNumber));
        // TODO Auto-generated method stub

    }

}

