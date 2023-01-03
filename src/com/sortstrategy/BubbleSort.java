package com.sortstrategy;

public class BubbleSort implements ISort {
    @Override
    public int sort(int[] data) {
        /* TODO */
        int len = data.length;
        int count = 0;

        for (int inLoop1 = 0; inLoop1 < len; inLoop1++) {
            for (int inLoop2 = 1; inLoop2 < len - inLoop1; inLoop2++) {

                if (data[inLoop2 - 1] > data[inLoop2]) {
                    int temp = data[inLoop2 - 1];
                    data[inLoop2 - 1] = data[inLoop2];
                    data[inLoop2] = temp;
                    count++;
                }


            }

        }
        return count;
    }
}
