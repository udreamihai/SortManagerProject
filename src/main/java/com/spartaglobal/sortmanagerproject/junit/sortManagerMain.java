package com.spartaglobal.sortmanagerproject.junit;

import java.util.*;
import java.util.stream.*;

public class sortManagerMain {
    public static void main(String[] args) {
        int arraySize = 40; //array size
        //generate 40 random integers between 0 and 500 and store them in intsArray
        int[] intsArray = IntStream.generate(() -> new Random().nextInt(500)).limit(arraySize).toArray();

        int[] bubbleSortArray = new int[arraySize]; //used for bubble sort
        int[] mergeSortArray = new int[arraySize]; //used for merge sort
        System.arraycopy(intsArray, 0, bubbleSortArray, 0, arraySize); //populate bubble sort array
        System.arraycopy(intsArray, 0, mergeSortArray, 0, arraySize); //populate merge sort array

        System.out.println("Original array of integers:");
        System.out.println(Arrays.toString(bubbleSortArray));

        SortView view = new SortView();
        String desiredSortType = view.getDesiredSortMethod();
        SortController controller = new SortController();
        String result = controller.initiateSort(desiredSortType);
        System.out.printf("Result: %s\n", result);
        controller.initiateSort(desiredSortType);
        view.displayResults(result);

        /*BubbleSort b = new BubbleSort();
        System.out.println(Arrays.toString(b.bubbleSort(bubbleSortArray, arraySize)));

        MergeSort m = new MergeSort();
        System.out.println(Arrays.toString(m.mergeSort(mergeSortArray, arraySize)));*/
    }


}
