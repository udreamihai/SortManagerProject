package com.spartaglobal.sortmanagerproject.junit.view;

import com.spartaglobal.sortmanagerproject.junit.model.AverageTimes;
import com.spartaglobal.sortmanagerproject.junit.model.SortManagerMain;

import java.util.Arrays;
import java.util.Scanner;

import static com.spartaglobal.sortmanagerproject.junit.model.SortManagerMain.*;

public class SortView {

    public int getDesiredSortMethod() {
        enum validOptions{
            Bubble(1),
            Merge(2),
            Binary(3),
            Timing(4),
            Quit(5);

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
            //show the menu
            System.out.println("=====================================");
            System.out.println("| SELECT THE TYPE OF SORT           |");
            System.out.println("=====================================");
            System.out.println("| Options:                          |");
            System.out.println("|        1. Bubble Sort             |");
            System.out.println("|        2. Merge Sort              |");
            System.out.println("|        3. Binary Tree             |");
            System.out.println("|        4. Compare timings         |");
            System.out.println("|        5. Exit                    |");
            System.out.println("=====================================");
            System.out.printf("Select option: ");
            Boolean isValid = false;
            int desiredSortType = scanner.nextInt();
            if (desiredSortType == 4){
                AverageTimes a = new AverageTimes();
                a.main();
                isValid = false;
            }
            if (desiredSortType == 5){ //quit
                logger.info("User chose to exit.");
                System.out.printf("Quitting...");
                System.exit(0);
            }

            for (validOptions option : validOptions.values()) {
                if (desiredSortType == option.id) {
                    isValid = true;
                    return desiredSortType;
                }

            }
            if(!isValid) {
                System.out.printf("Please enter a valid option!\n");
                logger.info("User tried to be funny.");
            }


        }
    }

    public void displayResults(int[] result) {
        try {
            System.out.println(Arrays.toString(result));
            logger.info("Result displayed correctly.");
        } catch (Exception e){
            logger.error("Error displaying result.", e);
        }
    }

}
