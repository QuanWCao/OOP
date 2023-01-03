package lab4;

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int array[]) {

        int len = array.length;

        for (int inLoop1 = 0; inLoop1 < len; inLoop1++) {
            for (int inLoop2 = 1; inLoop2 < len - inLoop1; inLoop2++) {

                if (array[inLoop2 - 1] > array[inLoop2]) {
                    int temp = array[inLoop2 - 1];
                    array[inLoop2 - 1] = array[inLoop2];
                    array[inLoop2] = temp;
                }

            }
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

        bubbleSort(array);

        // TODO Auto-generated method stub

    }

}
