package hw1;

import java.util.Scanner;

public class TestPalindromicWord {

    public static boolean checkPalindromic(String inStr) {

        int fldx = 0;
        int bldx = inStr.length() - 1;

        for (fldx = 0, bldx = inStr.length() - 1; fldx < bldx; --bldx, fldx++) {

            if (inStr.charAt(fldx) != inStr.charAt(bldx)) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {

        String inStr;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        inStr = in.next().toUpperCase();

        in.close();

        if (checkPalindromic(inStr)) {
            System.out.println(inStr + " is a palindrome");
        } else {
            System.out.println(inStr + " is not a palindrome");
        }

    }

}

