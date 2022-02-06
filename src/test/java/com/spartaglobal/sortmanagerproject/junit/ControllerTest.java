package com.spartaglobal.sortmanagerproject.junit;

import org.apache.logging.log4j.util.Chars;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.spartaglobal.sortmanagerproject.junit.controller.*;
import com.spartaglobal.sortmanagerproject.junit.model.*;

public class ControllerTest {

    public Sorter sorter;
    @BeforeEach
    public void setup() {

    }

    @Test
    @DisplayName("Test if Bubble Sort is launched properly")
    void checkBubbleSort() {
        sorter = new BubbleSort();
        Sorter e = new SortController().getSort(1);
        String expected = String.valueOf(e.getClass().toString());
        System.out.println(expected);
        String actual = String.valueOf(sorter.getClass().toString());
        System.out.println(actual);
        assertTrue(actual.equals(expected));
    }

    @Test
    @DisplayName("Test if Merge Sort is launched correctly")
    void checkMergeSort() {
        sorter = new MergeSort();
        Sorter e = new SortController().getSort(2);
        String expected = String.valueOf(e.getClass().toString());
        System.out.println(expected);
        String actual = String.valueOf(sorter.getClass().toString());
        System.out.println(actual);
        assertTrue(actual.equals(expected));
    }

}
