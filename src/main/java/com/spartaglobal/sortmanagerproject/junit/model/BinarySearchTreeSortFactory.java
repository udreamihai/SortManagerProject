package com.spartaglobal.sortmanagerproject.junit.model;

public class BinarySearchTreeSortFactory extends SortFactory{
    @Override
    public Sorter getInstance() {
        SortManagerMain.logger.info("Successfully create Binary Search Tree Sort instance.");
        return new BinarySearchTreeSort();
    }
}
