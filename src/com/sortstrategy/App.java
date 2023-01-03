package com.sortstrategy;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /* TODO */


        int[] array = new int[5];

        System.out.println("All value of array :");
        for (int index = 0; index < array.length; index++) {
            array[index] = (int) (Math.random() * 9 + 1);

        }
        for (int index = 0; index < array.length; index++) {

            System.out.println("Value of array :" + array[index]);
        }


        SortStrategy sortStrategy = SortStrategy.getInstance();
        String result = "";

        sortStrategy.setSortee(new BubbleSort());
        int[] arr = array.clone();
        result += "Bubblesort: Before sorting: " + Arrays.toString(arr) + " After sorting: ";
        int numberOfSwaps = sortStrategy.sort(arr);
        result += Arrays.toString(arr) + "Number of swap: " + numberOfSwaps;


        sortStrategy.setSortee(new SelectionSort());
        arr = array.clone();
        result += "\nSelectionSort :Before sorting: " + Arrays.toString(arr) + " After sorting: ";
        numberOfSwaps = sortStrategy.sort(arr);
        result += Arrays.toString(arr) + "Number of swap: " + numberOfSwaps;

        // insertion sort
        sortStrategy.setSortee(new InsertionSort());
        arr = array.clone();
        result += "\nSelectionSort :Before sorting: " + Arrays.toString(arr) + " After sorting: ";
        numberOfSwaps = sortStrategy.sort(arr);
        result += Arrays.toString(arr) + "Number of swap: " + numberOfSwaps;

        System.out.println(result);

        // Tạo một mảng các số tự nhiên, các số tự nhiên được sinh ngẫu nhiên
        // In ra mảng vừa tạo theo định dạng, ví dụ [1 2 3 4 5].
        // Sắp xếp mảng theo thứ tự tăng dần sử dụng các thuật toán sắp xếp khác nhau.
        // In ra mảng sau khi sắp xếp.
        // In ra số lần đổi vị trí trong thuật toán đang sử dụng.
        // Ví dụ:
        // Using Bubble Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Using Selection Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Kết quả chạy chương trình lưu vào file SortStrategy<Mã sinh viên>.txt và nộp cùng source code.
    }
}
