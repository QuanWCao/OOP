package lab11.example.strategy.paystategy;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
