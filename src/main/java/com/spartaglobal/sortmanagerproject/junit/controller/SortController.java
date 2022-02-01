package com.spartaglobal.sortmanagerproject.junit.controller;

import com.spartaglobal.sortmanagerproject.junit.model.*;

public class SortController {
    public int[] initiateSort(String desiredSortType){
        Sorter s = getSort(desiredSortType);
        return s.sortArray(SortManagerMain.castVariables.intsArray,SortManagerMain.castVariables.arraySize);
    }

    private Sorter getSort(String desiredSortType) {
        SortFactory sf;
        if (desiredSortType.equals("Bubble")){
            sf = new BubbleSortFactory();
        }
        else if (desiredSortType.equals("Merge")){
            sf = new MergeSortFactory();
        }
        else
            sf = new MergeSortFactory();
        return sf.getInstance();
    }

}
