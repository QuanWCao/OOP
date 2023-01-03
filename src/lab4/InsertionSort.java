package lab4;

import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] array) {

        int len = array.length;
        for (int fisrtLoop = 1; fisrtLoop < len; fisrtLoop++) {
            int temp = array[fisrtLoop];
            int secondLoop;

            for (secondLoop = fisrtLoop - 1; secondLoop >= 0; secondLoop--) {

                if (array[secondLoop] < temp) {
                    break;
                }
                if (array[secondLoop] > temp) {
                    array[secondLoop + 1] = array[secondLoop];

                }

            }

            array[secondLoop + 1] = temp;

            for (int index = 0; index < len; index++) {
                System.out.print(array[index] + " ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("length of array :");
        int len = sc.nextInt();
        int[] array = new int[len];

        System.out.println("all value of array :");
        for (int index = 0; index < len; index++) {
            array[index] = sc.nextInt();
        }
        sc.close();

        insertionSort(array);

    }

}

