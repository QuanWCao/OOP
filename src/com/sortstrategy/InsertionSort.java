package com.sortstrategy;

public class InsertionSort implements ISort {
    @Override
    public int sort(int[] data) {
        /* TODO */
        int len = data.length;
        int count = 0;
        for (int fisrtLoop = 1; fisrtLoop < len; fisrtLoop++) {
            int temp = data[fisrtLoop];
            int secondLoop;

            for (secondLoop = fisrtLoop - 1; secondLoop >= 0; secondLoop--) {

                if (data[secondLoop] < temp) {
                    break;
                }
                if (data[secondLoop] > temp) {
                    data[secondLoop + 1] = data[secondLoop];

                }

            }

            data[secondLoop + 1] = temp;
            count++;


        }
        return count;
    }
}
