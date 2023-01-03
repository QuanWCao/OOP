package hw1;

import java.util.Scanner;

public class TriangularPatternX {

    public static void TriangularPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("# ");

            }
            System.out.println();

        }

    }

    public static void TriangularPatternB(int size) {
        for (int row = size; row >= 1; row--) {
            for (int col = row; col >= 1; col--) {
                System.out.print("# ");

            }
            System.out.println();

        }

    }

    public static void TriangularPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row > col) {
                    System.out.print("  ");

                } else {
                    System.out.print("# ");

                }

            }
            System.out.println();

        }

    }

    public static void TriangularPatternD(int size) {
        for (int row = size; row >= 1; row--) {
            for (int col = 1; col <= size; col++) {
                if (col >= row) {
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
        TriangularPatternA(size); // goi in ra hinh a
        System.out.println("b)");
        TriangularPatternB(size); // goi in ra hinh b
        System.out.println("c)");
        TriangularPatternC(size);// goi in ra hinh c
        System.out.println("d)");
        TriangularPatternD(size);// goi in ra hinh d
        // TODO Auto-generated method stub

    }

}
