package lab10.ex2.ex3;

public interface Poly {
    int degree();

    Poly derivative();

    double coefficient(int degree);

    double[] coefficients();
}
