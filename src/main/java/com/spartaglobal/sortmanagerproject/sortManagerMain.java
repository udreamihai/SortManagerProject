package com.spartaglobal.sortmanagerproject;

import java.util.*;
import java.util.stream.*;

public class sortManagerMain {
    public static void main(String[] args) {
        //generate 40 random integers between 0 and 500 and store them in intsArray
        int[]  intsArray = IntStream.generate(() -> new Random().nextInt(500)).limit(40).toArray();

        int[] bubbleSortArray = new int[40]; //used for bubble sort
        int[] mergeSortArray = new int[40]; //used for merge sort
        System.arraycopy(intsArray, 0, bubbleSortArray, 0, 40); //populate bubble sort array
        System.arraycopy(intsArray, 0, mergeSortArray, 0, 40); //populate merge sort array
        System.out.println("Original array of integers:");
        System.out.println(Arrays.toString(bubbleSortArray));
        System.out.println("Bubble sorted array of integers:");
        BubbleSort b = new BubbleSort();
        System.out.println(Arrays.toString(b.main(bubbleSortArray)));
    }


}
