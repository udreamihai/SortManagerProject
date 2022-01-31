package com.spartaglobal.sortmanagerproject;

import java.util.*;
import java.util.stream.*;

public class sortManagerMain {
    public static void main(String[] args) {
        int[]  intsArray = IntStream.generate(() -> new Random().nextInt(500)).limit(40).toArray();

        int[] bubbleSortArray = new int[40];
        int[] mergeSortArray = new int[40];
        System.arraycopy(intsArray, 0, bubbleSortArray, 0, 40);
        System.out.println("Array for bubble sort: " + Arrays.toString(bubbleSortArray));
        System.arraycopy(intsArray, 0, mergeSortArray, 0, 40);
        System.out.println("Array for bubble sort: " + Arrays.toString(mergeSortArray));
    }


}
