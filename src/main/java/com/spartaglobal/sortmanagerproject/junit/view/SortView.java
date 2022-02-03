package com.spartaglobal.sortmanagerproject.junit.view;

import com.spartaglobal.sortmanagerproject.junit.model.SortManagerMain;

import java.util.Arrays;
import java.util.Scanner;

public class SortView {

    public int getDesiredSortMethod() {
        enum validOptions{
            Bubble(1),
            Merge(2),
            Quit(3);

            private int id;
            validOptions(int id){
                this.id = id;
            }
            public int getOptionID(){
                return id;
            }
        }
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("============================");
            System.out.println("| SELECT THE TYPE OF SORT  |");
            System.out.println("============================");
            System.out.println("| Options:                 |");
            System.out.println("|        1. Bubble Sort    |");
            System.out.println("|        2. Merge Sort     |");
            System.out.println("|        3.                |");
            System.out.println("|        4. Exit           |");
            System.out.println("============================");
            System.out.printf("Select option: ");
            int desiredSortType = scanner.nextInt();
            if (desiredSortType == 4){
                SortManagerMain.logger.info("User chose to exit.");
                System.exit(0);
            }
            for (validOptions option : validOptions.values()) {
                if (desiredSortType == option.id) {
                    return desiredSortType;
                }
            }


        }
    }

    public void displayResults(int[] result) {
        try {
            System.out.println(Arrays.toString(result));
            SortManagerMain.logger.info("Result displayed correctly.");
        } catch (Exception e){
            SortManagerMain.logger.error("Error displaying result.", e);
        }
    }

}
