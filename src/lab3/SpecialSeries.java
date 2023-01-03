package lab3;

import java.util.Scanner;

public class SpecialSeries {

    public static double SpecialSeries(double x, int numTerms) {

        double result = x;
        for (int index = 1; index < numTerms; index++) {
            double temp = Math.pow(x, 2 * index + 1) / (double) (2 * index + 1);
            for (int j = 2 * index - 1; j > 0; j -= 2) {
                temp *= j / (double) (j + 1);
            }
            result += temp;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x :");
        double x = sc.nextDouble();
        System.out.print("Enter index n :");
        int numTerms = sc.nextInt();

        sc.close();
        System.out.println("Value of SpecialSeries :" + SpecialSeries(x, numTerms));
        // TODO Auto-generated method stub

    }


}

