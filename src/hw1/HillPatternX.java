package hw1;

import java.util.Scanner;

public class HillPatternX {
    public static void HillPatternA(int sizeRow) {
        for (int row = 1; row <= sizeRow; row++) {
            int sizeCol = 2 * sizeRow - 1;
            for (int col = 1; col <= sizeCol; col++) {
                if ((row + col >= sizeRow + 1) && (row >= col - sizeRow + 1)) {
                    System.out.print("# ");

                } else {
                    System.out.print("  ");

                }

            }
            System.out.println();

        }

    }

    public static void HillPatternB(int sizeRow) {
        for (int row = sizeRow; row > 0; row--) {
            int sizeCol = 2 * sizeRow - 1;
            for (int col = 1; col <= sizeCol; col++) {
                if ((row + col >= sizeRow + 1) && (row >= col - sizeRow + 1)) {
                    System.out.print("# ");

                } else {
                    System.out.print("  ");

                }

            }
            System.out.println();

        }

    }

    public static void HillPatternC(int sizeRow) {
        for (int row = 1; row < sizeRow; row++) {
            int numCol = 2 * sizeRow - 1;
            for (int col = 1; col <= numCol; col++) {
                if ((row + col >= sizeRow + 1) && (row >= col - sizeRow + 1)) {
                    System.out.print("# ");

                } else {
                    System.out.print("  ");

                }

            }
            System.out.println();
        }

        for (int row = sizeRow; row > 0; row--) {
            int sizeCol = 2 * sizeRow - 1;
            for (int col = 1; col <= sizeCol; col++) {
                if ((row + col >= sizeRow + 1) && (row >= col - sizeRow + 1)) {
                    System.out.print("# ");

                } else {
                    System.out.print("  ");

                }

            }
            System.out.println();

        }

    }

    public static void HillPatternD(int sizeRow) {
        for (int row = 1; row < sizeRow; row++) {
            int numCol = 2 * sizeRow - 1;
            for (int col = 1; col <= numCol; col++) {
                if ((row + col > sizeRow + 1) && (row > col - sizeRow + 1)) {
                    System.out.print("  ");

                } else {
                    System.out.print("# ");

                }

            }
            System.out.println();
        }

        for (int row = sizeRow; row > 0; row--) {
            int sizeCol = 2 * sizeRow - 1;
            for (int col = 1; col <= sizeCol; col++) {
                if ((row + col > sizeRow + 1) && (row > col - sizeRow + 1)) {
                    System.out.print("  ");

                } else {
                    System.out.print("# ");

                }

            }
            System.out.println();

        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sizeRow : ");
        int sizeRow = sc.nextInt();

        sc.close();
        System.out.println("a)");
        HillPatternA(sizeRow);
        System.out.println("b)");
        HillPatternB(sizeRow);
        System.out.println("c)");
        HillPatternC(sizeRow);
        System.out.println("d)");
        HillPatternD(sizeRow);


        // TODO Auto-generated method stub

    }

}

