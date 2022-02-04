package com.spartaglobal.sortmanagerproject.junit.model;

import java.util.Arrays;

import static com.spartaglobal.sortmanagerproject.junit.model.SortManagerMain.castVariables.*;
import static com.spartaglobal.sortmanagerproject.junit.model.SortManagerMain.castVariables.arraySize;

public class BinarySearchTreeSort implements Sorter{
    @Override
    public int[] sortArray(int[] binaryTreeSortArray, int arraySize) {
        SortManagerMain.logger.info("Calling treeSort method...");

        BinaryTree bt = new BinaryTree();
        System.out.printf("\nBinary tree array:\n");
        for (int i = 0; i < arraySize; i++){
            bt.add(binaryTreeSortArray[i]);
            System.out.printf("%d ", binaryTreeSortArray[i]);
        }
        System.out.printf("\n");
        return treeSort(binaryTreeSortArray);
    }


    public int[] treeSort(int[] binaryTreeSortArray){
        int arraySize = binaryTreeSortArray.length;
        int[] treeSortedArray = new int[arraySize]; //will store the sorted array


        return Arrays.stream(treeSortedArray).toArray();
    }
    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }
    public class BinaryTree {

        Node root;

        private Node addRecursive(Node current, int value) {
            if (current == null) {
                return new Node(value);
            }

            if (value < current.value) {
                current.left = addRecursive(current.left, value);
            } else if (value > current.value) {
                current.right = addRecursive(current.right, value);
            } else {
                // value already exists
                return current;
            }

            return current;
        }
        public void add(int value) {
            Node root = new Node(0);
            root = addRecursive(root, value);
        }
    }


}
