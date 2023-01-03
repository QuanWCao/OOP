package hw6.ex1;

import java.math.BigInteger;

public class TestBigInterger {
    public static void main(String[] args) {
        BigInteger i1 = new BigInteger("21832837281973821731798371289738213123");
        BigInteger i2 = new BigInteger("978273826809723781367821638216674621492");
        System.out.println("Sum of two Big Integers: " + i1.add(i2));
        System.out.println("Muliply of two Big Integers: " + i1.multiply(i2));
    }
}
