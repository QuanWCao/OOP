package lab3;

public class FibonacciInt {

    public static int Fibonaci(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            return Fibonaci(n - 2) + Fibonaci(n - 1);
        }
    }

    public static void main(String[] args) {

        int n = 0;

        for (int index = 0; index <= n; index++) {
            if (index == 0) {
                System.out.println("F(" + index + ") = " + Fibonaci(index));
                n++;
            } else if ((Integer.MAX_VALUE - Fibonaci(n - 1)) > Fibonaci(n - 2)) {
                System.out.println("F(" + index + ") = " + Fibonaci(index));
                n++;
            } else {
                System.out.println("F(" + index + ") is out of the range of int");
            }
        }

    }

}
