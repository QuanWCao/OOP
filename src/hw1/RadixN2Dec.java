package hw1;

import java.util.Scanner;

public class RadixN2Dec {

    public static void main(String[] args) {
        String inStr ;
        int radix ;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string : ");
        inStr = in.nextLine();

        System.out.print("Enter a radix : ");
        radix = in.nextInt() ;

        in.close();
        if(radix <= 16) {
            int count = Integer.parseInt(inStr,radix) ;
            System.out.println("The equivalent decimal number '"+inStr+"' is : "+count);
        }
        else {
            System.out.println("Erorr");
        }
        // TODO Auto-generated method stub

    }


}

