package hw5.ex1.ex7;

import java.util.Scanner;

public class TestMyComplex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = sc.nextDouble();
        double imag1 = sc.nextDouble();

        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = sc.nextDouble();
        double imag2 = sc.nextDouble();

        sc.close();
        System.out.println();

        MyComplex numberOne = new MyComplex(real1, imag1);
        System.out.println("Number 1 is: " + numberOne.toString());

        if (numberOne.isReal()) {

            System.out.println(numberOne.toString() + " is a pure real number");
        } else {

            System.out.println(numberOne.toString() + " is NOT a pure real number");
        }

        if (numberOne.isImagianry()) {
            System.out.println(numberOne.toString() + " is a pure imaginary number");
        } else {
            System.out.println(numberOne.toString() + " is NOT a pure imaginary number");
        }

        System.out.println();
        MyComplex numberTwo = new MyComplex(real2, imag2);
        System.out.println("Number 2 is: " + numberTwo.toString());

        if (numberTwo.isReal()) {
            System.out.println(numberTwo.toString() + " is a pure real number");
        } else {
            System.out.println(numberTwo.toString() + " is NOT a pure real number");
        }

        if (numberTwo.isImagianry()) {
            System.out.println(numberTwo.toString() + " is a pure imaginary number");
        } else {
            System.out.println(numberTwo.toString() + " is NOT a pure imaginary number");
        }
        System.out.println();
        if (numberOne.equals(numberTwo)) {
            System.out.println(numberOne.toString() + " is equal to " + numberTwo.toString());
        } else {
            System.out.println(numberOne.toString() + " is NOT equal to " + numberTwo.toString());
        }

        System.out.println(numberOne.toString() + " + " + numberTwo.toString() + " = " + numberOne.addNew(numberTwo).toString());


    }
}
