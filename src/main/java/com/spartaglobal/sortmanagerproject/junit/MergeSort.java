package com.spartaglobal.sortmanagerproject.junit;
import java.util.Arrays;

public class MergeSort implements Sorter{
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

    }

    @Override
    public int[] sortArray(int[] mergeSortArray, int arraySize) {
        mergeSort(mergeSortArray, arraySize);
        return mergeSortArray;
    }
}
