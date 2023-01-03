package lab3;

import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int numberSecret = (int) (Math.random() * 100);
        System.out.print("Key in your guess :");
        int numberGuess = sc.nextInt();

        int count = 1; // number of count

        while (numberSecret != numberGuess) {
            if (numberSecret < numberGuess) {
                System.out.println("Try lower");
                numberGuess = sc.nextInt();
                count++;
            }
            if (numberSecret > numberGuess) {
                System.out.println("Try upper");
                numberGuess = sc.nextInt();
                count++;
            }
        }
        sc.close();
        System.out.println("You got it in " + count + " trails!");
    }

}

