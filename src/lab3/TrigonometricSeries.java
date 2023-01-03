package lab3;

import java.util.Scanner;

public class TrigonometricSeries {

    public static double sin(double x, int numTerms) {
        double sinx = x;
        double count = x;
        for (int index = 1; index <= numTerms; index++) {
            count = -(count * x * x) / ((2 * index + 1) * (2 * index));
            sinx += count;

        }
        return sinx;

    }
    public static double sina(double x) {
        double sinx = x;
        double count = x;
        int index =1 ;
        while(count  >   3) {
            count = -(count * x * x) / ((2 * index + 1) * (2 * index));
            sinx += count;
            index++ ;

        }
        return sinx ;

    }


    public static double cos(double x, int numTerms) {
        double cosx = 1;
        double count = 1;
        for (int index = 1; index <= numTerms; index++) {
            count = -(count * x * x) / ((2 * index - 1) * (2 * index));
            cosx += count;

        }
        return cosx;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x :");
        double x = sc.nextDouble();
        System.out.print("Enter index n :");
        int numTerms = sc.nextInt();

        sc.close();
        System.out.println("Taylor sinx :" + sin(x, numTerms));
        System.out.println("Taylor cosx :" + cos(x, numTerms));


            System.out.println(Math.sin(x));

            System.out.println(sina(x));


        // TODO Auto-generated method stub

    }

}
