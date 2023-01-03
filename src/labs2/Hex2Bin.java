package labs2;

import java.util.Scanner;

public class Hex2Bin {

    public static boolean checkHexStr(String upperStr) {
        for (int inChar = 0; inChar < upperStr.length(); inChar++) {
            if (!((upperStr.charAt(inChar) >= '0' && upperStr.charAt(inChar) <= '9') || (upperStr.charAt(inChar) >= 'A' && upperStr.charAt(inChar) <= 'F'))) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String Str = sc.nextLine();
        String inStr = Str.toUpperCase();

        sc.close();
        System.out.print("The equivalent binary of hexadecimal '" + Str + "' is: ");
        if (checkHexStr(inStr)) {
            for (int inChar = 0; inChar < inStr.length(); inChar++) {
                if (inStr.charAt(inChar) == '0') {
                    System.out.print(HEX_BITS[0] + " ");
                }
                if (inStr.charAt(inChar) == '1') {
                    System.out.print(HEX_BITS[1] + " ");
                }
                if (inStr.charAt(inChar) == '2') {
                    System.out.print(HEX_BITS[2] + " ");
                }
                if (inStr.charAt(inChar) == '3') {
                    System.out.print(HEX_BITS[3] + " ");
                }
                if (inStr.charAt(inChar) == '4') {
                    System.out.print(HEX_BITS[4] + " ");
                }
                if (inStr.charAt(inChar) == '5') {
                    System.out.print(HEX_BITS[5] + " ");
                }
                if (inStr.charAt(inChar) == '6') {
                    System.out.print(HEX_BITS[6] + " ");
                }
                if (inStr.charAt(inChar) == '7') {
                    System.out.print(HEX_BITS[7] + " ");
                }
                if (inStr.charAt(inChar) == '8') {
                    System.out.print(HEX_BITS[8] + " ");
                }
                if (inStr.charAt(inChar) == '9') {
                    System.out.print(HEX_BITS[9] + " ");
                }
                if (inStr.charAt(inChar) == 'A') {
                    System.out.print(HEX_BITS[10] + " ");
                }
                if (inStr.charAt(inChar) == 'B') {
                    System.out.print(HEX_BITS[11] + " ");
                }
                if (inStr.charAt(inChar) == 'C') {
                    System.out.print(HEX_BITS[12] + " ");
                }
                if (inStr.charAt(inChar) == 'D') {
                    System.out.print(HEX_BITS[13] + " ");
                }
                if (inStr.charAt(inChar) == 'E') {
                    System.out.print(HEX_BITS[14] + " ");
                }
                if (inStr.charAt(inChar) == 'F') {
                    System.out.print(HEX_BITS[15] + " ");
                }

            }
        }
    }
}
