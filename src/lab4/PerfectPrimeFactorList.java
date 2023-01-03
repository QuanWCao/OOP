package lab4;

import java.util.Scanner;

public class PerfectPrimeFactorList {

    public static boolean isPrime(int aPosInt) {

        for (int i = 2; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int multy = 1;
        for (int i = 2; i < aPosInt; i++) {
            if (isPrime(i) && aPosInt % i == 0) {
                multy *= i;
            }
        }
        if (multy != aPosInt) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the upper bound :");
        int limitNumber = sc.nextInt();
        sc.close();
        int countPerfectPrime = 0;
        System.out.println("These numbers are equal to the product of prime factors :");
        for (int i = 1; i <= limitNumber; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                countPerfectPrime++;
            }
        }
        System.out.println();
        System.out.println(
                "[" + countPerfectPrime + " perfectnumbers found (" + (double) countPerfectPrime / 100 + "%)]");

    }

}

