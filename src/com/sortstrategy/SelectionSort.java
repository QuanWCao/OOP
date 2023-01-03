package com.sortstrategy;

public class SelectionSort implements ISort {
    @Override
    public int sort(int[] data) {

        int len = data.length;
        int count = 0;

        for (int firstIndex = len - 1; firstIndex >= 1; firstIndex--) {
            int max = firstIndex;
            for (int secondIndex = 0; secondIndex < firstIndex; secondIndex++) {

                if (data[secondIndex] >= data[max]) {
                    max = secondIndex;
                }

            }
            int temp = data[max];
            data[max] = data[firstIndex];
            data[firstIndex] = temp;

            count++;


        }
        /* TODO */
        return count;
    }
}
