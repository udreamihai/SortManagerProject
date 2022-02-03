package com.spartaglobal.sortmanagerproject.junit.controller;

import com.spartaglobal.sortmanagerproject.junit.model.*;

public class SortController {
    public int[] initiateSort(int desiredSortType){
        Sorter s = getSort(desiredSortType);
        return s.sortArray(SortManagerMain.castVariables.intsArray,SortManagerMain.castVariables.arraySize);
    }

    public Sorter getSort(int desiredSortType) {
        SortFactory sf;
        if (desiredSortType == 1){
            SortManagerMain.logger.info("User chose Bubble Sort.");
            sf = new BubbleSortFactory();
        }
        else if (desiredSortType == 2){
            SortManagerMain.logger.info("User chose Merge Sort.");
            sf = new MergeSortFactory();
        }
        else
            sf = new MergeSortFactory();
        return sf.getInstance();
    }

}
