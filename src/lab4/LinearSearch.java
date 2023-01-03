package lab4;

import java.util.Scanner;

public class LinearSearch {

    public static boolean linearSearch(int[] array, int key) {

        for (int index = 0; index < array.length; index++) {
            if (array[index] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSeachIndex(int[] array, int key) {

        if (linearSearch(array, key)) {
            for (int index = 0; index < array.length; index++) {
                if (array[index] == key) {
                    return index;

                }

            }
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of array : ");

        int number = in.nextInt();
        int[] array = new int[number];

        System.out.print("Enter value of all array :");
        for (int index = 0; index < array.length; index++) {
            array[index] = in.nextInt();
        }
        System.out.print("Enter value of key : ");
        int key = in.nextInt();

        in.close();
        if (linearSearch(array, key)) {
            System.out.print("The index key of array : " + linearSeachIndex(array, key));
        } else {
            System.out.print("NULL");
        }

    }

}

