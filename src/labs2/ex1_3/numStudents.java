package labs2.ex1_3;

import java.util.Scanner;

public class numStudents {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();
        int[] items = new int[numStudents];


        if (items.length > 0) {

            for (int i = 0; i < items.length; i++) {
                System.out.print("Enter the grade for student " + (i + 1) + ": ");
                items[i] = in.nextInt();

            }
        }
        in.close();

        int max = items[0];
        int min = items[0];
        double avarage = 0;
        for (int i = 0; i < items.length; i++) {
            avarage += items[i];
            if (items[i] >= max) {
                max = items[i];
            }
            if (items[i] <= min) {
                min = items[i];
            }
        }

        System.out.println("The average is: " + Math.round(avarage / items.length * 10.0) / 10.0);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);


    }
}
