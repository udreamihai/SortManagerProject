package com.spartaglobal.sortmanagerproject;
import java.util.Arrays;

public class MergeSort extends sortManagerMain{
    public int[] mergeSort(int[] mergeSortArray, int arraySize){

        if (arraySize < 2) return null;

        int middle = arraySize / 2; //divide the array in 2
        int[] leftArray = new int[middle];
        int[] rightArray = new int[arraySize - middle];

        int k =0; //move the original array in the 2 arrays
        for (int i = 0; i < arraySize; i++){
            if (i < middle){
                leftArray[i] = mergeSortArray[i];
            }
            else {
                rightArray[k] = mergeSortArray[i];
                k++;
            }
        }

        mergeSort(leftArray, middle);
        mergeSort(rightArray, arraySize - middle);

        merge(leftArray, rightArray, mergeSortArray, middle, arraySize - middle, arraySize);


        return mergeSortArray;

    }

    public static void merge(int[] leftArray, int[] rightArray, int[] mergeSortArray, int leftSize, int rightSize, int fullSize){
        long start2 = System.nanoTime(); //start timing
        int i=0,l=0,r = 0;
        //check condition for merging
        while(l < leftSize && r < rightSize){

            if(leftArray[l]<rightArray[r]){
                mergeSortArray[i++] = leftArray[l++];
            }
            else{
                mergeSortArray[i++] = rightArray[r++];
            }
        }
        while(l < leftSize){
            mergeSortArray[i++] = leftArray[l++];
        }
        while(r < rightSize){
            mergeSortArray[i++] = rightArray[r++];
        }
        System.out.printf("fullsize: %d, i: %d\n", fullSize, i);
        if (i == fullSize) {
            long stop2 = System.nanoTime(); //stop timing
            long diff2 = stop2 - start2;
            System.out.println("Merge sort took " + diff2 + " nanoseconds to complete and the result is:");
        }
    }
}
