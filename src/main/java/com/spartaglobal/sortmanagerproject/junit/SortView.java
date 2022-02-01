package com.spartaglobal.sortmanagerproject.junit;

import java.util.Scanner;

public class SortView {
    public String getDesiredSortMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("What kind of sort? ");
        String desiredSortType = scanner.next();
        return desiredSortType;
    }

    public void displayResults(String result) {
        System.out.printf("Here's the display results\n");
        System.out.println(result);
    }
}
