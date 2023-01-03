package hw1;

import java.util.Scanner;

public class PhoneKeyPad {

    public static void nestIf(String inStr, int inStrLen) {
        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            if ((inStr.charAt(charIdx) == 'a') || (inStr.charAt(charIdx) == 'b') || (inStr.charAt(charIdx) == 'c')) {
                System.out.print("2");
            } else if ((inStr.charAt(charIdx) == 'd') || (inStr.charAt(charIdx) == 'e')
                    || (inStr.charAt(charIdx) == 'f')) {
                System.out.print("3");
            } else if ((inStr.charAt(charIdx) == 'g') || (inStr.charAt(charIdx) == 'h')
                    || (inStr.charAt(charIdx) == 'i')) {
                System.out.print("4");
            } else if ((inStr.charAt(charIdx) == 'j') || (inStr.charAt(charIdx) == 'k')
                    || (inStr.charAt(charIdx) == 'h')) {
                System.out.print("5");
            } else if ((inStr.charAt(charIdx) == 'm') || (inStr.charAt(charIdx) == 'n')
                    || (inStr.charAt(charIdx) == 'o')) {
                System.out.print("6");
            } else if ((inStr.charAt(charIdx) == 'p') || (inStr.charAt(charIdx) == 'q')
                    || (inStr.charAt(charIdx) == 'r') || (inStr.charAt(charIdx) == 's')) {
                System.out.print("7");
            } else if ((inStr.charAt(charIdx) == 't') || (inStr.charAt(charIdx) == 'u')
                    || (inStr.charAt(charIdx) == 'v')) {
                System.out.print("8");
            } else {
                System.out.print("9");
            }

        }

    }

    public static void switchCase(String inStr, int inStrLen) {

        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            switch (inStr.charAt(charIdx)) {
                case 'a':
                case 'b':
                case 'c':
                    System.out.print(2);
                    break;
                case 'd':
                case 'e':
                case 'f':
                    System.out.print(3);
                    break;
                case 'g':
                case 'h':
                case 'i':
                    System.out.print(4);
                    break;
                case 'j':
                case 'k':
                case 'l':
                    System.out.print(5);
                    break;
                case 'm':
                case 'n':
                case 'o':
                    System.out.print(6);
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    System.out.print(7);
                    break;
                case 't':
                case 'u':
                case 'v':
                    System.out.print(8);
                    break;
                default:
                    System.out.print(9);
                    break;
            }
        }

    }

    public static void main(String[] args) {

        String inStr;
        int inStrLen;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        inStr = in.next().toLowerCase();
        inStrLen = inStr.length();

        in.close();
        System.out.print("Convert String to numbers with if : ");
        nestIf(inStr, inStrLen);

        System.out.println();
        System.out.print("Convert String to numbers with switch : ");
        switchCase(inStr, inStrLen);

    }

}

