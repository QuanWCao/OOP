package hw1;

import java.util.Scanner;

public class ExchangeCipher {

    public static void main(String[] args) {
        String inStr;
        int inStrLen;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext String : ");
        inStr = in.next().toUpperCase();
        inStrLen = inStr.length();

        in.close();

        System.out.print("The cipher string is : ");
        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            if (inStr.charAt(charIdx) == 'A') {
                System.out.print("Z");
            } else if (inStr.charAt(charIdx) == 'B') {
                System.out.print("Y");
            } else if (inStr.charAt(charIdx) == 'C') {
                System.out.print("X");
            } else if (inStr.charAt(charIdx) == 'D') {
                System.out.print("V");
            } else if (inStr.charAt(charIdx) == 'E') {
                System.out.print("T");
            } else if (inStr.charAt(charIdx) == 'F') {
                System.out.print("S");
            } else if (inStr.charAt(charIdx) == 'G') {
                System.out.print("R");
            } else if (inStr.charAt(charIdx) == 'H') {
                System.out.print("Q");
            } else if (inStr.charAt(charIdx) == 'I') {
                System.out.print("P");
            } else if (inStr.charAt(charIdx) == 'K') {
                System.out.print("O");
            } else if (inStr.charAt(charIdx) == 'L') {
                System.out.print("N");
            } else if (inStr.charAt(charIdx) == 'M') {
                System.out.print("M");
            } else if (inStr.charAt(charIdx) == 'N') {
                System.out.print("L");
            } else if (inStr.charAt(charIdx) == 'O') {
                System.out.print("K");
            } else if (inStr.charAt(charIdx) == 'P') {
                System.out.print("I");
            } else if (inStr.charAt(charIdx) == 'Q') {
                System.out.print("H");
            } else if (inStr.charAt(charIdx) == 'R') {
                System.out.print("G");
            } else if (inStr.charAt(charIdx) == 'S') {
                System.out.print("F");
            } else if (inStr.charAt(charIdx) == 'T') {
                System.out.print("E");
            } else if (inStr.charAt(charIdx) == 'V') {
                System.out.print("D");
            } else if (inStr.charAt(charIdx) == 'X') {
                System.out.print("C");
            } else if (inStr.charAt(charIdx) == 'Y') {
                System.out.print("B");
            } else {
                System.out.print("A");
            }

        }
        // TODO Auto-generated method stub

    }

}
