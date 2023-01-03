package hw1;

import java.util.Scanner;

public class CountVowelsDigits {

    public static void main(String[] args) {

        String inStr;
        int inStrLen;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        inStr = in.next().toLowerCase();
        inStrLen = inStr.length();

        in.close();
        int countVowels = 0;
        int countDigits = 0;

        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            if ((inStr.charAt(charIdx) >= 'a' && inStr.charAt(charIdx) <= 'x')) {
                countVowels++;
            }
            if ((inStr.charAt(charIdx) >= '0' && inStr.charAt(charIdx) <= '9')) {
                countDigits++;
            }

        }

        double averageVowels = (double) countVowels / inStrLen;
        double averageDigits = (double) countDigits / inStrLen;

        System.out.printf("Number of vowels : " + countVowels + "(" + Math.round(averageVowels * 100.0) / 100.0);
        System.out.println("%)");
        System.out.printf("Number of vowels : " + countDigits + "(" + Math.round(averageDigits * 100.0) / 100.0);
        System.out.println("%)");
        // TODO Auto-generated method stub

    }

}

