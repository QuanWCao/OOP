package hw1;

import java.util.Scanner;

public class Bin2Dec {

    public static boolean checkBinarystring(String inStr) {

        for (int inChar = 0; inChar < inStr.length(); inChar++) {

            if (inStr.charAt(inChar) != '0' && inStr.charAt(inChar) != '1') {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        String inStr;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Binary String : ");
        inStr = in.nextLine();

        in.close();
        if (checkBinarystring(inStr)) {
            int count = 0;
            for (int inChar = inStr.length() - 1; inChar >= 0; inChar--) {
                if (inStr.charAt(inChar) == '1') {
                    count += (int) Math.pow(2, inStr.length() - 1 - inChar);
                }

            }
            System.out.print("The equivalent decimal number for binary " + inStr + " is: " + count);

        } else {
            System.out.println("error : invalid binary string '" + inStr + "'");
        }

    }

}

