package lab4;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] array) {

        int len = array.length;

        for (int firstIndex = len - 1; firstIndex >= 1; firstIndex--) {
            int max = firstIndex;
            for (int secondIndex = 0; secondIndex < firstIndex; secondIndex++) {

                if (array[secondIndex] >= array[max]) {
                    max = secondIndex;
                }

            }
            int temp = array[max];
            array[max] = array[firstIndex];
            array[firstIndex] = temp;

            System.out.println("Sort :" + (len - firstIndex));
            for (int index = 0; index < len; index++) {

                System.out.print(array[index] + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("length of array :");
        int len = sc.nextInt();
        int[] array = new int[len];

        System.out.println("all value of array :");
        for (int index = 0; index < len; index++) {
            array[index] = sc.nextInt();
        }
        sc.close();

        selectionSort(array);
        // TODO Auto-generated method stub

    }

}

