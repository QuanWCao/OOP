package hw1;

import java.util.Scanner;

public class CaesarCode {

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
            char temp = (char) (inStr.charAt(charIdx) + 3);
            System.out.print(temp);

        }
        // TODO Auto-generated method stub

    }

}

