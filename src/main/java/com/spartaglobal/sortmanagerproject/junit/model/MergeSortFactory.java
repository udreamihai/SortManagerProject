package com.spartaglobal.sortmanagerproject.junit.model;

public class MergeSortFactory extends SortFactory{
    @Override
    public Sorter getInstance() {
        return new MergeSort();
    }
}
