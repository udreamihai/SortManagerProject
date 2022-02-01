package com.spartaglobal.sortmanagerproject;

import java.util.*;
import java.util.stream.*;

public class sortManagerMain {
    public static void main(String[] args) {
        int arraySize = 40;
        //generate 40 random integers between 0 and 500 and store them in intsArray
        int[]  intsArray = IntStream.generate(() -> new Random().nextInt(500)).limit(arraySize).toArray();

        int[] bubbleSortArray = new int[arraySize]; //used for bubble sort
        int[] mergeSortArray = new int[arraySize]; //used for merge sort
        System.arraycopy(intsArray, 0, bubbleSortArray, 0, arraySize); //populate bubble sort array
        System.arraycopy(intsArray, 0, mergeSortArray, 0, arraySize); //populate merge sort array
        System.out.println("Original array of integers:");
        System.out.println(Arrays.toString(bubbleSortArray));
        BubbleSort b = new BubbleSort();
        System.out.println(Arrays.toString(b.bubbleSort(bubbleSortArray, arraySize)));
        MergeSort m = new MergeSort();
        System.out.println(Arrays.toString(m.mergeSort(mergeSortArray, arraySize)));
    }


}
