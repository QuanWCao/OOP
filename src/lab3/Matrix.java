package lab3;

public class Matrix {

    public static void print(int[][] matrix) {
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix[0].length; row++) {
                System.out.print(matrix[col][row] + " ");
            }
            System.out.println();
        }

    }

    public static void print(double[][] matrix) {
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix[0].length; row++) {
                System.out.print(matrix[col][row] + " ");
            }
            System.out.println();
        }

    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length && (matrix1[0].length != matrix2[0].length)) {
            return false;
        }
        return true;

    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length != matrix2.length && (matrix1[0].length != matrix2[0].length)) {
            return false;
        }
        return true;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] sum = new int[matrix1.length][matrix1[0].length];
        for (int col = 0; col < matrix1.length; col++) {
            for (int row = 0; row < matrix1.length; row++) {

                if (!haveSameDimension(matrix1, matrix2)) {
                    return null;
                } else {
                    sum[col][row] = matrix1[col][row] + matrix2[col][row];
                }
            }
        }
        return sum;

    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] sum = new double[matrix1.length][matrix1[0].length];
        for (int col = 0; col < matrix1.length; col++) {
            for (int row = 0; row < matrix1.length; row++) {
                if (!haveSameDimension(matrix1, matrix2)) {
                    return null;
                } else {
                    sum[col][row] = matrix1[col][row] + matrix2[col][row];
                }
            }
        }
        return sum;

    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int col = 0; col < matrix1.length; col++) {
            for (int row = 0; row < matrix1.length; row++) {
                if (!haveSameDimension(matrix1, matrix2)) {
                    return null;
                } else {
                    result[col][row] = matrix1[col][row] - matrix2[col][row];
                }
            }
        }
        return result;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix1.length][matrix1[0].length];
        for (int col = 0; col < matrix1.length; col++) {
            for (int row = 0; row < matrix1.length; row++) {
                if (!haveSameDimension(matrix1, matrix2)) {
                    return null;
                } else {
                    result[col][row] = matrix1[col][row] - matrix2[col][row];
                }
            }
        }
        return result;

    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int col = 0; col < matrix1.length; col++) {
            for (int row = 0; row < matrix1.length; row++) {
                if (!haveSameDimension(matrix1, matrix2)) {
                    return null;
                } else {
                    result[col][row] = matrix1[col][row] * matrix2[row][col];
                }
            }
        }
        return result;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix1.length][matrix2[0].length];
        for (int col = 0; col < matrix1.length; col++) {
            for (int row = 0; row < matrix1.length; row++) {
                if (!haveSameDimension(matrix1, matrix2)) {
                    return null;
                } else {
                    result[col][row] = matrix1[col][row] * matrix2[row][col];
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {

        // Integer matrix
        int[][] intMatrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] intMatrix2 = {{1, 1, 1}, {1, 1, 0}, {1, 0, 0}};
        System.out.println("(*) Integer matrix: ");
        System.out.println("\nMatrix 1: ");
        print(intMatrix1);
        System.out.println("\nMatrix 2: ");
        print(intMatrix2);
        System.out.println("\nMatrix 1 have same dimension matrix 2: " + haveSameDimension(intMatrix1, intMatrix2));
        System.out.println("\nSum: ");
        print(add(intMatrix1, intMatrix2));
        System.out.println("\nMinus: ");
        print(subtract(intMatrix1, intMatrix2));
        System.out.println("\nMultiply: ");
        print(multiply(intMatrix1, intMatrix2));

        // Double matrix
        double[][] doubleMatrix1 = {{1.1, 2.2, 3.3}, {0.0, 1.1, 2.1}, {3.1, 1.5, 1.9}};
        double[][] doubleMatrix2 = {{1.5, 1.5, 1.5}, {0.2, 0.1, 0}, {1.1, 0.0, 0.0}};
        System.out.println("\n(*) Double matrix: ");
        System.out.println("\nMatrix 1: ");
        print(doubleMatrix1);
        System.out.println("\nMatrix 2: ");
        print(doubleMatrix2);
        System.out
                .println("\nMatrix 1 have same dimension matrix 2: " + haveSameDimension(doubleMatrix1, doubleMatrix2));
        System.out.println("\nSum: ");
        print(add(doubleMatrix1, doubleMatrix2));
        System.out.println("\nMinus: ");
        print(subtract(doubleMatrix1, doubleMatrix2));
        System.out.println("\nMultiply: ");
        print(multiply(doubleMatrix1, doubleMatrix2));
    }

}
