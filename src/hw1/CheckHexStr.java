package hw1;

import java.util.Scanner;

public class CheckHexStr {

    public static boolean checkHexStr(String inStr, int inStrLen) {
        for (int inChar = 0; inChar < inStrLen; inChar++) {
            if (!((inStr.charAt(inChar) >= '0' && inStr.charAt(inChar) <= '9')
                    || (inStr.charAt(inChar) >= 'A' && inStr.charAt(inChar) <= 'F')
                    || (inStr.charAt(inChar) >= 'a' && inStr.charAt(inChar) <= 'f'))) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {

        String inStr;
        int inStrLen;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hex String : ");
        inStr = in.nextLine();
        inStrLen = inStr.length();

        in.close();

        if (checkHexStr(inStr, inStrLen)) {
            System.out.println(inStr + " is a hex string");
        } else {
            System.out.println(inStr + " is NOT a hex string");
        }

        // TODO Auto-generated method stub

    }

}

