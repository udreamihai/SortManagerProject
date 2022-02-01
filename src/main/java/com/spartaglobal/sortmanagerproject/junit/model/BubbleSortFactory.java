package com.spartaglobal.sortmanagerproject.junit.model;

public class BubbleSortFactory extends SortFactory{
    @Override
    public Sorter getInstance() {
        return new BubbleSort();
    }
}
