package labs2;

import java.util.Scanner;

public class methodCopyOf {

    public static int[] copyOf(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;

    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] copy = new int[newLength];
        if (newLength < array.length) {
            for (int i = 0; i < newLength; i++) {
                copy[i] = array[i];
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                copy[i] = array[i];
            }
            for (int i = array.length; i < newLength; i++) {
                copy[i] = 0;
            }
        }
        return copy;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of array: ");
        int number = in.nextInt();
        int[] array = new int[number];
        int[] copy = copyOf(array);
        System.out.print("Enter values of array: ");
        for (int i = 0; i < copy.length; i++) {

            array[i] = in.nextInt();
        }


        System.out.print("Enter number of array2: ");
        int newLength = in.nextInt();

        in.close();
        int[] copy_2 = copyOf(array, newLength);
        System.out.print("Enter values of array2: ");
        for (int i = 0; i < copy_2.length; i++) {
            System.out.print(copy_2[i] + " ");
        }
        System.out.println();

    }
}
