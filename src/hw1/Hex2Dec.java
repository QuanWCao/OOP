package hw1;

import java.util.Scanner;

public class Hex2Dec {
    public static boolean checkHexStr(String upperStr ,int inStrLen) {
        for(int inChar = 0 ; inChar < inStrLen  ; inChar++) {
            if (!((upperStr.charAt(inChar) >= '0' && upperStr.charAt(inChar) <= '9' ) || (upperStr.charAt(inChar) >= 'A' && upperStr.charAt(inChar) <= 'F' ))) {
                return false ;
            }

        }
        return true;

    }
    public static void main(String[] args) {

        String inStr ;
        int inStrLen ;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal String : ");
        inStr = in.nextLine();
        inStrLen = inStr.length() ;

        String upperStr = inStr.toUpperCase() ;
        in.close();

        if(checkHexStr(upperStr ,inStrLen)) {


            System.out.print("The equivalent decimal number for hexadecimal '"+inStr+"' is: ");
            int count = Integer.parseInt(inStr,16);
            System.out.print(count);
        }
        else  {
            System.out.println("error : invalid hexadecimal string '"+inStr+"'") ;
        }
    }

}

