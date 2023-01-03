package lab4;

import java.util.Scanner;

public class PerfectNumberList {

    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum != aPosInt) {
            return false;
        }
        return true;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum > aPosInt) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the upper bound :");
        int maxNumber = sc.nextInt();
        sc.close();
        int countPerfect = 0;
        System.out.println("These numbers are perfect :");
        for (int i = 2; i <= maxNumber; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                countPerfect++;
            }
        }
        System.out.println();
        System.out.println("[" + countPerfect + " perfectnumbers found (" + (double) countPerfect / 100 + "%)]");
        System.out.println("These numbers are neither deficient nor perfect :");
        int countDificient = 0;
        for (int i = 2; i <= maxNumber; i++) {
            if (isDeficient(i)) {
                System.out.print(i + " ");
                countDificient++;
            }

        }
        System.out.println();
        System.out.println("[" + countDificient + " numbers found (" + (double) countDificient / 100 + "%)]");
        // TODO Auto-generated method stub

    }

}

