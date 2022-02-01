package com.spartaglobal.sortmanagerproject.junit.model;

import com.spartaglobal.sortmanagerproject.junit.controller.SortController;
import com.spartaglobal.sortmanagerproject.junit.view.SortView;

import java.util.*;
import java.util.stream.*;

public class SortManagerMain {
    public static void main(String[] args) {
        final int arraySize = castVariables.arraySize; //array size
        int[] bubbleSortArray = new int[arraySize]; //used for bubble sort
        int[] mergeSortArray = new int[arraySize]; //used for merge sort
        System.arraycopy(castVariables.intsArray, 0, bubbleSortArray, 0, arraySize); //populate bubble sort array
        System.arraycopy(castVariables.intsArray, 0, mergeSortArray, 0, arraySize); //populate merge sort array

        System.out.println("Original array of integers:");
        System.out.println(Arrays.toString(bubbleSortArray));

        SortView view = new SortView();
        String desiredSortType = view.getDesiredSortMethod();
        SortController controller = new SortController();
        int[] result = controller.initiateSort(desiredSortType);

        controller.initiateSort(desiredSortType);
        view.displayResults(result);

    }

    public class castVariables{
        //generate 40 random integers between 0 and 500 and store them in intsArray
        public static int arraySize = 40;
        public static int[] intsArray = IntStream.generate(() -> new Random().nextInt(500)).limit(arraySize).toArray();
    }
}
