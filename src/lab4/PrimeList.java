package lab4;

import java.util.Scanner;

public class PrimeList {

    public static boolean isPrime(int aPosInt) {

        for (int i = 2; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the upper bound :");
        int maxNumber = sc.nextInt();
        sc.close();
        int countPrime = 0;

        for (int i = 1; i <= maxNumber; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                countPrime++;
            }
        }
        System.out.println("[" + countPrime + " perfectnumbers found (" + (double) countPrime / 100 + "%)]");

    }

}

