package com.spartaglobal.sortmanagerproject.junit.model;

public class BubbleSortFactory extends SortFactory{
    @Override
    public Sorter getInstance() {
        SortManagerMain.logger.info("Successfully created BubbleSort instance.");
        return new BubbleSort();
    }
}
