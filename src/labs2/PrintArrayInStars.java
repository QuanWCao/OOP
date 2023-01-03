package labs2;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = in.nextInt();
        int[] items = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items (separated by space): ");
        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                items[i] = in.nextInt();
            }
        }
        in.close();

        for (int i = 0; i < items.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < items[i]; j++) {
                System.out.print("*");
            }
            System.out.print("(" + items[i] + ")\n");

        }

    }
}
