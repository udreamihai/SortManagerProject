package com.spartaglobal.sortmanagerproject.junit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.spartaglobal.sortmanagerproject.junit.model.*;

class BubbleSortTest {
    public Sorter sorter;
    @BeforeEach
    public void setup(){
        sorter = new BubbleSort();
    }

    @Test
    void testBubbleSortUnsorted() {
        int[] expected = {1,2,3,4,5};
        int[] actual = {2,4,1,3,5};
        int[] actualSorted = sorter.sortArray(actual, actual.length);
        assertArrayEquals(expected, actualSorted);
    }

    @Test
    void testBubbleSortSorted() {
        int[] expected = {1,2,3,4,5};
        int[] actual = {1,2,3,4,5};
        int[] actualSorted = sorter.sortArray(actual, actual.length);
        assertArrayEquals(expected, actualSorted);
    }

    @Test
    void testBubbleSortNull() {
        int[] expected = {};
        int[] actual = {};
        int[] actualSorted = sorter.sortArray(actual, actual.length);
        assertArrayEquals(expected, actualSorted);
    }

    @Test
    void testBubbleSortDuplicates() {
        int[] expected = {1,2,2,3,3};
        int[] actual = {2,1,3,2,3};
        int[] actualSorted = sorter.sortArray(actual, actual.length);
        assertArrayEquals(expected, actualSorted);
    }
}