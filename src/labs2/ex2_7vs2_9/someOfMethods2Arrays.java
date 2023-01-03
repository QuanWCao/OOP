package labs2.ex2_7vs2_9;


import java.util.Scanner;

public class someOfMethods2Arrays {

    public static boolean equals(int[] array1, int[] array2) { //2.7
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void swap(int[] array1, int[] array2) { //2.9
        if (array1.length != array2.length) {
            System.out.println("Erorr");
        } else {
            for (int i = 0; i < array1.length; i++) {
                int temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }

        }
        System.out.print("array1 after swap: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        System.out.print("array2 after swap: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of array1: ");
        int inlength1 = in.nextInt();
        int[] array1 = new int[inlength1];

        System.out.print("Enter value of all array1: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = in.nextInt();
        }

        System.out.print("Enter number of array2: ");
        int inlength2 = in.nextInt();
        int[] array2 = new int[inlength2];

        System.out.print("Enter value of all array2: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = in.nextInt();
        }
        in.close();
        //print 2.9
        if (array1.length == array2.length) {
            swap(array1, array2);
            System.out.println();
            //print 2.7
            System.out.println("2 array  " + equals(array1, array2));
        } else {
            System.out.println("Error");
        }
    }
}

