package com.spartaglobal.sortmanagerproject;

import java.util.Arrays;

public class BubbleSort extends sortManagerMain{
    public int[] bubbleSort(int[] bubbleSortArray, int arraySize) {
        long start1 = System.nanoTime(); //start timing
        int[] bubbleSortedArray = new int[arraySize]; //will store the sorted array
        System.arraycopy(bubbleSortArray, 0, bubbleSortedArray, 0, arraySize);
        int temp; //will use to switch integers within the array
        for (int i = 0; i < bubbleSortedArray.length - 1; i ++) {
            for (int j = 0; j < bubbleSortedArray.length - i - 1; j++) {
                if (bubbleSortedArray[j] > bubbleSortedArray[j + 1]) {
                    temp = bubbleSortedArray[j]; //start switching
                    bubbleSortedArray[j] = bubbleSortedArray[j + 1];
                    bubbleSortedArray[j + 1] = temp;
                }
            }
        }
        long stop1 = System.nanoTime(); //stop timing
        long diff1 = stop1 - start1;
        System.out.println("Bubble sort took " + diff1 + " nanoseconds to complete and the result is:");
        return Arrays.stream(bubbleSortedArray).toArray();
    }
}
