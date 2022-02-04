package com.spartaglobal.sortmanagerproject.junit.model;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

import static com.spartaglobal.sortmanagerproject.junit.model.SortManagerMain.castVariables.*;
import static com.spartaglobal.sortmanagerproject.junit.model.SortManagerMain.castVariables.arraySize;

public class BinarySearchTreeSort implements Sorter{
    @Override
    public int[] sortArray(int[] binaryTreeSortArray, int arraySize) {

        SortManagerMain.logger.info("Calling treeSort method...");

        //System.out.printf("\nBinary tree array:\n");
        int[] binaryTreeSortedArray = treeSort(binaryTreeSortArray);

        return binaryTreeSortedArray;
    }
    //private static final AtomicInteger count = new AtomicInteger(-1);

    public int[] treeSort(int[] binaryTreeSortArray){

        System.out.printf("\ntreeSort started...\n");
        int arraySize = binaryTreeSortArray.length;
        int[] treeSortedArray = new int[arraySize]; //will store the sorted array
        BinarySearchTreeSort bt = new BinarySearchTreeSort();
        System.out.printf("\nInserting elements: ");
        for (int i = 0; i < arraySize; i++){
            bt.insert(binaryTreeSortArray[i]);
            System.out.printf("%d ", binaryTreeSortArray[i]);
        }
        System.out.printf("\n");
        //System.out.println("Binary search tree after insertion:");
        //Displays the binary tree
        //bt.inorderTraversal(bt.root);

        int[] sss = bt.inorderTraversal(bt.root).clone();
        System.out.println(Arrays.toString(sss));
        return null;
    }

    //Represent a node of binary tree
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            //Assign data to the new node, set left and right children to null
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Represent the root of binary tree
    public Node root;

    public BinarySearchTreeSort(){
        root = null;
    }

    //insert() will add new node to the binary search tree
    public void insert(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Check whether tree is empty
        if (root == null) {
            root = newNode;
            return;
        } else {
            //current node point to root of the tree
            Node current = root, parent = null;

            while (true) {
                //parent keep track of the parent node of current node.
                parent = current;

                //If data is less than current's data, node will be inserted to the left of tree
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                //If data is greater than current's data, node will be inserted to the right of tree
                else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    public static AtomicInteger count = new AtomicInteger(-1);
    //inorder() will perform inorder traversal on binary search tree
    public int[] inorderTraversal(Node node) {
        int[] tempArray = new int[arraySize];
        //Check whether tree is empty
        if(root == null){
            System.out.println("Tree is empty");
            return null;
        }
        switch (count.get()){
            case 39:
                System.out.println("I'm breaking out!!");
                for (int h=0; h < 40; h++){
                    System.out.printf("temp[%d] = %d\n", h, tempArray[h]);
                }
                break;
            default:
                if(node.left!= null){
                    inorderTraversal(node.left);
                }
                //System.out.print(node.data + " ");

                System.out.printf("tempArray[%d] = %d\n", count.incrementAndGet(), node.data);
                tempArray[count.get()] = Integer.valueOf(node.data);
                System.out.printf("real tempArray[%d] = %d\n", count.get(), node.data);
                if(node.right!= null){
                    inorderTraversal(node.right);
                }
        }
        return tempArray;
    }
}
