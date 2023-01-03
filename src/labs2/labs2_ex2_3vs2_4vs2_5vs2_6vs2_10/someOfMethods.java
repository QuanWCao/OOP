package labs2.labs2_ex2_3vs2_4vs2_5vs2_6vs2_10;

import java.util.Arrays;
import java.util.Scanner;

public class someOfMethods {

    public static void print(int[] array) { //2.3
        System.out.print("Valus of arrays: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static String arraytoString(int[] array) { //2.4

        return Arrays.toString(array);
    }

    public static boolean contains(int[] array, int key) { //2.5
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int search(int[] array, int key) { //2.6
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i + 1;

            }
        }
        return -1;
    }


    public static void reverse(int[] array) {//2.10
        int[] reverse = new int[array.length];
        for (int fldx = 0, bldx = array.length - 1; (fldx < array.length && bldx >= 0); fldx++, bldx--) {
            reverse[fldx] = array[bldx];
        }
        System.out.print("The reverse array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(reverse[i] + " ");
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of array: ");
        int number = in.nextInt();
        int[] array = new int[number];

        System.out.print("Enter value of all array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        // print 2.3
        print(array);
        // print 2.4
        System.out.println("String array :" + arraytoString(array));
        System.out.print("Enter value of key :");
        int key = in.nextInt();

        in.close();
        //print 2.5
        System.out.println("contain key :" + contains(array, key));
        //print 2.6
        System.out.println("Search key :" + search(array, key));

        //print2.10
        reverse(array);
        System.out.println();

    }
}
