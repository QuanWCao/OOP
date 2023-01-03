package labs2;

import java.util.Scanner;

public class GradesStatistics {


    public static int[] grades;

    public static void main(String[] args) {

        readGrades();
        System.out.print("The grades are: ");
        print(grades);
        System.out.println("The verage is: " + average(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.println("The median is: " + median(grades));
        System.out.println("The standard deviation is: " + Math.round(stdDev(grades) * 100.0) / 100.0);
    }

    public static void readGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = sc.nextInt();

        grades = new int[num];
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }
        sc.close();

    }

    public static void print(int[] array) {
        for (int i = 0; i < grades.length; i++) {
            if (i == 0) {
                System.out.print("[");
                System.out.print(grades[i]);
            } else if (i == grades.length - 1) {
                System.out.print(", " + grades[i]);
                System.out.print("]");
            } else {
                System.out.print(", " + grades[i]);
            }

        }
        System.out.println();

    }

    public static double average(int[] array) {

        double sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        double average = sum / grades.length;
        return average;
    }

    public static double median(int[] array) {

        double median;

        for (int i = 0; i < grades.length; i++) {
            for (int j = 1; j < grades.length - i; j++) {
                if (grades[j - 1] > grades[j]) {
                    int temp = grades[j - 1];
                    grades[j - 1] = grades[j];
                    grades[j] = temp;
                }
            }
        }

        if (grades.length % 2 != 0) {
            median = grades[(grades.length / 2)];
        } else {
            median = (grades[(grades.length) / 2] + grades[(grades.length / 2) - 1]) / 2;
        }
        return median;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < grades.length; i++) {
            if (max <= grades[i]) {
                max = grades[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] <= min) {
                min = grades[i];
            }
        }
        return min;
    }

    public static double stdDev(int[] array) {

        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        double average = sum / grades.length;

        double result = 0;

        for (int i = 0; i < grades.length; i++) {
            result += (grades[i] - average) * (grades[i] - average);
        }
        result = Math.sqrt(result / (grades.length ));

        return result;
    }
}
