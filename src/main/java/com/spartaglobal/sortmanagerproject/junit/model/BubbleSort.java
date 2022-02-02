package com.spartaglobal.sortmanagerproject.junit.model;

import java.util.Arrays;

public class BubbleSort implements Sorter{
    @Override
    public int[] sortArray(int[] bubbleSortArray, int arraySize) {
        return bubbleSort(bubbleSortArray);
    }

    public int[] bubbleSort(int[] bubbleSortArray){
        int arraySize = bubbleSortArray.length;
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
        return Arrays.stream(bubbleSortedArray).toArray();
    }

}
