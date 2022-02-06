package com.spartaglobal.sortmanagerproject.junit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import com.spartaglobal.sortmanagerproject.junit.controller.*;
import com.spartaglobal.sortmanagerproject.junit.model.*;

public class AverageTimesTest {
    @Test
    @DisplayName("Check if exception is caught when file doesn't exist")
    void checkFileNotFound(){
        String expected = null;
        String fileName = "";
        Scanner scanner = null;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(fileName)));
        } catch (FileNotFoundException e){
            expected = e.toString();
        }
        assertNotNull(expected);
    }

    @Test
    @DisplayName("Check if the average is calculated correctly.")
    void checkCorrectAverage(){
        long runningTime[] = {2,4,6,8};
        double expected = 5;
        double actual = Arrays.stream(runningTime).sum() / 4;
        assertTrue(actual== expected);
    }
}
