package lab3;

public class FactorialInt {

    public static int Factorial(int n) {

        if (n <= 0) {
            return -1;
        }

        if (n == 1) {
            return n;
        }
        return n * Factorial(n - 1);
    }

    public static void main(String[] args) {

        int n = 1;
        for (int index = 1; index <= n; index++) {

            System.out.println("The factorial of " + index + " is " + Factorial(index));

            if ((Integer.MAX_VALUE / Factorial(index)) >= (index + 1)) {

                n++;

            } else {
                System.out.println("The factorial of " + (index +1) + " is out of range");
            }
        }
        // TODO Auto-generated method stub

    }

}
