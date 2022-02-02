package com.spartaglobal.sortmanagerproject.junit.view;

import java.util.Arrays;
import java.util.Scanner;

public class SortView {

    public String getDesiredSortMethod() {
        enum validOptions{
            Bubble,
            Merge,
            Quit
        }
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("What kind of sort (Bubble or Merge)? Alternatively type Quit to... well... quit ");
            String desiredSortType = scanner.next();
            if (desiredSortType.equals("Quit")) System.exit(0);
            for (validOptions option : validOptions.values()) {
                if (desiredSortType.equals(option.toString())) {
                    return desiredSortType;
                }
            }

        }
    }

    public void displayResults(int[] result) {
        System.out.println(Arrays.toString(result));
    }
}
