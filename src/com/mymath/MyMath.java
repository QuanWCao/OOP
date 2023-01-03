package com.mymath;

public class MyMath {

    public static double cosx(double x) {

        double min = 1e-12;
        double cos = 1;
        double phanso = 1;
        int index = 2;

        while (Math.abs(phanso) > min) {
            phanso = -phanso * x * x / index / (index - 1);
            cos += phanso;
            index += 2;
        }


        return cos;
    }

    public static double expx(double e) {

        double min = 1e-12;
        double exp = 1;
        double phanso = 1;
        int index = 1;

        while (Math.abs(phanso) > min) {
            phanso = phanso * e / index;
            exp += phanso;
            index++;
        }

        return exp;
    }

    public static String decimalTo(String x, int number) {
        int decimal = Integer.parseInt(x);
        String result = "";
        while (decimal > 0) {
            int temp = decimal % number;
            if (temp < 10) {
                result = temp + result;
            } else {
                result = (char) (temp + 55) + result;
            }
            decimal /= number;
        }
        return result;
    }

    public static String toDecimal(String x, int number) {
        x = x.toUpperCase();
        int result = 0;
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (c >= '0' && c <= '9') {
                int d = c - '0';
                result = result * number + d;
            } else if (c >= 'A' && c <= 'F') {
                int d = c - 'A' + 10;
                result = result * number + d;
            }
        }
        return result + "";
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return in;
        }
        if (outRadix == 10) {
            return toDecimal(in, inRadix);
        }
        if (inRadix == 10) {
            return decimalTo(in, outRadix);
        }
        String dec = toDecimal(in, inRadix);
        return decimalTo(dec, outRadix);
    }


    public static void main(String[] args) {
        double x = 3.3;
        double e = 2.2;


        System.out.println("Gia tri bieu thuc" + (cosx(x) * expx(e)));
        String string1 = toRadix("123456789123456789", 13, 8);
        System.out.println("chuyen doi: " + string1);


    }
}
