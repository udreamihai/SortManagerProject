package com.spartaglobal.sortmanagerproject.junit.model;

import com.spartaglobal.sortmanagerproject.junit.controller.SortController;
import com.spartaglobal.sortmanagerproject.junit.view.SortView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class
import java.util.*;
import java.util.stream.*;

public class SortManagerMain {
    public static Logger logger = LogManager.getLogger("SortManager Logger");
    public static void main(String[] args) {

        while (true) {
            logger.info("SortManager started successfully.");

            final int arraySize = castVariables.arraySize; //array size
            int[] bubbleSortArray = new int[arraySize]; //used for bubble sort
            int[] mergeSortArray = new int[arraySize]; //used for merge sort
            int[] binaryTreeSortArray = new int[arraySize]; //used for binary tree sort
            try {
                System.arraycopy(castVariables.intsArray, 0, bubbleSortArray, 0, arraySize); //populate bubble sort array
                System.arraycopy(castVariables.intsArray, 0, mergeSortArray, 0, arraySize); //populate merge sort array
                System.arraycopy(castVariables.intsArray, 0, binaryTreeSortArray, 0, arraySize); //populate binary tree sort array
                logger.info("Random array [intsArray] of integers initialized correctly.");
            } catch (Exception e) {
                logger.error("Random array [intsArray] of integers was not initialized.", e);
            }
            System.out.println("===========================");
            System.out.println("Random array of integers:");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < castVariables.intsArray.length; i++) {
                sb.append(castVariables.intsArray[i]);
                sb.append(", ");
            }
            for (int j = 0; j < sb.length(); j++) {
                System.out.printf("=");
            }
            System.out.printf("\n");
            System.out.println(Arrays.toString(bubbleSortArray));


            SortView view = new SortView();
            int desiredSortType = view.getDesiredSortMethod();
            SortController controller = new SortController();
            int[] result = controller.initiateSort(desiredSortType);
            long startTime = System.nanoTime();
            controller.initiateSort(desiredSortType);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);

            //generate filenames to save the timings
            String fileName = "";
            if (desiredSortType == 1){
                fileName += "Bubble";
            } else if (desiredSortType == 2){
                fileName += "Merge";
            } else if (desiredSortType == 3){
                fileName += "Binary";
            }
            fileName += "Timing.txt";

            try {
                FileWriter myWriter = new FileWriter(fileName, true);
                myWriter.write(Long.toString(duration));
                myWriter.write("\n");
                myWriter.close();
                logger.info("Successfully wrote timing to the file.");
            } catch (IOException e) {
                logger.error("Error writing timing to the file.", e);
                //e.printStackTrace();
            }

            if (desiredSortType != 4) {
                System.out.printf("\nThe sort method took %d nanoseconds to run and the result is:\n", duration);
                for (int j = 0; j < sb.length(); j++) {
                    System.out.printf("=");
                }
                System.out.printf("\n");
                if (desiredSortType != 3)
                    view.displayResults(result);
            }

        }
    }

    public class castVariables{
        //generate 40 random integers between 0 and 500 and store them in intsArray
        public static int arraySize = 40;
        public static int[] intsArray = IntStream.generate(() -> new Random().nextInt(500)).limit(arraySize).toArray();
        //public static int[] intsArray;
    }
}
