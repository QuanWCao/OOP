package lab4;


public class FibonacciRecursive {
    public static int fibonaci(int n) {

        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonaci(n - 1) + fibonaci(n - 2);
        }
    }

    public static void main(String[] args) {

        int n = 0;

        for (int index = 0; index <= n; index++) {

            if (n == 1 || n == 0) {
                System.out.println("F(" + index + ") = " + fibonaci(index));
                n++;
            } else if ((Integer.MAX_VALUE - fibonaci(n - 1)) > fibonaci(n - 2)) {
                System.out.println("F(" + index + ") = " + fibonaci(index));
                n++;
            } else {
                System.out.println("F(" + index + ") is out of range");
            }
        }

    }

}
