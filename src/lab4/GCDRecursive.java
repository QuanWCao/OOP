package lab4;

import java.util.Scanner;

public class GCDRecursive {

    public static int gcd(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return gcd(number2, number1 % number2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fisrt number : ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number : ");
        int secondNumber = sc.nextInt();
        sc.close();

        System.out.println("gcd 2 number: " + gcd(firstNumber, secondNumber));
    }

}

