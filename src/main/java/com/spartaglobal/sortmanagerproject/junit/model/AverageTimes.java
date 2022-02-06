package com.spartaglobal.sortmanagerproject.junit.model;

import java.io.File;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import static com.spartaglobal.sortmanagerproject.junit.model.SortManagerMain.logger;

public class AverageTimes {
    public static void main() throws NumberFormatException {
        String[] timeFiles = {"BinaryTiming.txt", "BubbleTiming.txt", "MergeTiming.txt"};
        for (int i = 0; i < timeFiles.length; i++) {
            String fileName = timeFiles[i];
            Scanner scanner = null;
            try {
                scanner = new Scanner(new BufferedReader(new FileReader(fileName)));
            } catch (FileNotFoundException e) {
                logger.error("Timing file not found.", e);
            }
            long[] runningTime = new long[1000];
            int j = 0;
            while (scanner.hasNextInt()) {
                runningTime[j] = scanner.nextInt();
                j++;
            }
            String method = "";
            if ("BinaryTiming.txt".equals(fileName)) method = "Binary Tree Search";
            else if ("BubbleTiming.txt".equals(fileName)) method = "Bubble Sort";
            else if ("MergeTiming.txt".equals(fileName)) method = "Merge Sort";
            double average = Arrays.stream(runningTime).sum() / j;
            System.out.printf("Average time for %s sort method, based on %d entries is: %.0f nanoseconds\n", method, j, average);
        }
    }
}
