package hw5.ex1.ex8;

public class TestMyPolynomial {

    public static void main(String[] args) {

        MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial polynomial3 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);

        double[] coeffs = {1.2, 3.4, 5.6, 7.8};

        System.out.println(polynomial1.toString());
        System.out.println(polynomial1.getDegree());


        MyPolynomial polynomial2 = new MyPolynomial(coeffs);
        System.out.println(polynomial2.toString());
        System.out.println(polynomial2.getDegree());
    }
}
