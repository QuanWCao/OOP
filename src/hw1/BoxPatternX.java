package hw1;

import java.util.Scanner;

public class BoxPatternX {
    public static void patternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || col == 1 || row == size || col == size) {
                    System.out.print("# ");

                } else {
                    System.out.print("  ");

                }
            }
            System.out.println();
        }
    }

    public static void patternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || col == row || row == size) {
                    System.out.print("# ");

                } else {
                    System.out.print("  ");

                }
            }
            System.out.println();
        }
    }

    public static void patternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || col == size - row + 1 || row == size) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void patternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || col == size - row + 1 || row == size || col == row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();

        sc.close();
        System.out.println("a)");
        patternA(size); // goi in ra hinh a
        System.out.println("b)");
        patternB(size); // goi in ra hinh b
        System.out.println("c)");
        patternC(size);// goi in ra hinh c
        System.out.println("d)");
        patternD(size);// goi in ra hinh d

        // TODO Auto-generated method stub

    }

}

