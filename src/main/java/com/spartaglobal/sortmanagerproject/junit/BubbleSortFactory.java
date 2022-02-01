package com.spartaglobal.sortmanagerproject.junit;

public class BubbleSortFactory extends SortFactory{
    @Override
    public Sorter getInstance() {
        System.out.printf("Bubble Sort should start!\n");
        return new BubbleSort();
    }
}
