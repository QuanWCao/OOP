package hw1;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = 10;

        in.close();

        for (int number = -1; number <= size; number++) { // number == col
            if (number == -1) {
                System.out.print("*" +"\t| " );
            } else if (number == 0) {
                System.out.print("------");
            } else if (number > 0) {
                System.out.printf("%1$d\t|", number);
            }

            for (int col = 1; col <= size; col++) {
                if (number == -1) {
                    System.out.printf("\t%1$d", col);
                    continue;
                } else if (number == 0) {
                    System.out.print("----");
                    continue;
                }

                System.out.printf("\t%1$d", number * col);
            }
            System.out.println();
        }
    }

}

