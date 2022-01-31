package com.spartaglobal.sortmanagerproject;

import java.util.Arrays;

public class BubbleSort{
    public int[] main(int[] bubbleSortArray) {
        int[] bubbleSortedArray = new int[40]; //will store the sorted array
        System.arraycopy(bubbleSortArray, 0, bubbleSortedArray, 0, 40);
        int temp;
        for (int i = 0; i < bubbleSortedArray.length - 1; i ++) {
            for (int j = 0; j < bubbleSortedArray.length - i - 1; j++) {
                if (bubbleSortedArray[j] > bubbleSortedArray[j + 1]) {
                    temp = bubbleSortedArray[j];
                    bubbleSortedArray[j] = bubbleSortedArray[j + 1];
                    bubbleSortedArray[j + 1] = temp;
                }
            }
        }
        return Arrays.stream(bubbleSortedArray).toArray();
    }
}
