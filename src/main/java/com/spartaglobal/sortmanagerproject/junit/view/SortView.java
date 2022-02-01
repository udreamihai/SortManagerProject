package com.spartaglobal.sortmanagerproject.junit.view;

import java.util.Arrays;
import java.util.Scanner;

public class SortView {
    public String getDesiredSortMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("What kind of sort? ");
        String desiredSortType = scanner.next();
        return desiredSortType;
    }

    public void displayResults(int[] result) {
        System.out.println(Arrays.toString(result));
    }
}
