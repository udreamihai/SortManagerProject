package com.spartaglobal.sortmanagerproject.junit;

public class MergeSortFactory extends SortFactory{
    @Override
    public Sorter getInstance() {
        System.out.printf("Merge Sort should start\n");
        return new MergeSort();
    }
}
