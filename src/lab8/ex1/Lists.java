package lab8.ex1;

import java.util.*;

public class Lists {

    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.set(3, value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        list.remove(3);
    }

    public static void removeEvil(ArrayList<Integer> list) {

        if (list.contains(666)) {

            list.remove(Integer.valueOf(666));
        }
    }

    public static ArrayList<Integer> generateSquare() {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            result.add(i * i);
        }
        return result;

    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        target.removeAll(target);

        for (int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<Integer>(list);

        for (int i = 0; i < temp.size(); i++) {
            list.set(i, temp.get(temp.size() - i - 1));
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(1);
        list.add(666);
        // print list
        for (Integer num : list) {
            System.out.print(num + " ");
        }

        // insert first
        System.out.println("\ninsert 0 into First :");
        insertFirst(list, 0);
        for (Integer num : list) {
            System.out.print(num + " ");
        }

        // insert last
        System.out.println("\ninsert 10 into Last");
        insertLast(list, 10);
        for (Integer num : list) {
            System.out.print(num + " ");
        }

        // replace
        System.out.println("\nreplace 3rd");
        replace(list, 3);
        for (Integer num : list) {
            System.out.print(num + " ");
        }

        //remove 666
        System.out.println("\n remove 666");
        removeEvil(list);
        for (Integer num : list) {
            System.out.print(num + " ");
        }

        //remove 3rd
        System.out.println("\nremove 3rd");
        removeThird(list);
        for (Integer num : list) {
            System.out.print(num + " ");
        }

        //print generateSquare
        System.out.println("\nList generateSquare :" + generateSquare());

        // boolean value
        System.out.println("Contains value in list : " + contains(list, 1));
        //reverse with lib
        System.out.println("Reverse list");
        reverse(list);
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        //reverse without lib
        System.out.println("\nReverse manual list");
        reverseManual(list);
        for (Integer num : list) {
            System.out.print(num + " ");
        }

        // use linkedlist
        LinkedList<Integer> lists = new LinkedList<>(list);
        System.out.println("\ninsertBeginningEnd :");
        insertBeginningEnd(lists, 100);

        for (Integer num : lists) {
            System.out.print(num + " ");
        }


    }


}
