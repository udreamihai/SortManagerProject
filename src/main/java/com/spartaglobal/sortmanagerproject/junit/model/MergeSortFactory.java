package com.spartaglobal.sortmanagerproject.junit.model;

public class MergeSortFactory extends SortFactory{
    @Override
    public Sorter getInstance() {
        SortManagerMain.logger.info("Successfully create MergeSort instance.");
        return new MergeSort();
    }
}
