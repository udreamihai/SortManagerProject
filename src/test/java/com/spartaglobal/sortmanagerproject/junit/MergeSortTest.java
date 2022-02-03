package com.spartaglobal.sortmanagerproject.junit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.spartaglobal.sortmanagerproject.junit.model.*;

class MergeSortTest {
    public Sorter sorter;
    @BeforeEach
    public void setup(){
        sorter = new MergeSort();
    }

    @Test
    @DisplayName("Test a regular array of ints unsorted")
    void testMergeSortUnsorted() {
        int[] expected = {1,2,3,4,5};
        int[] actual = {2,4,1,3,5};
        int[] actualSorted = sorter.sortArray(actual, actual.length);
        assertArrayEquals(expected, actualSorted);
    }

    @Test
    @DisplayName("Test an array of ints already sorted")
    void testMergeSortSorted() {
        int[] expected = {1,2,3,4,5};
        int[] actual = {1,2,3,4,5};
        int[] actualSorted = sorter.sortArray(actual, actual.length);
        assertArrayEquals(expected, actualSorted);
    }

    @Test
    @DisplayName("Test null array of ints")
    void testMergeSortNull() {
        int[] expected = {};
        int[] actual = {};
        int[] actualSorted = sorter.sortArray(actual, actual.length);
        assertArrayEquals(expected, actualSorted);
    }

    @Test
    @DisplayName("Test duplicate values withing the array of ints")
    void testMergeSortDuplicates() {
        int[] expected = {1,2,2,3,3};
        int[] actual = {2,1,3,2,3};
        int[] actualSorted = sorter.sortArray(actual, actual.length);
        assertArrayEquals(expected, actualSorted);
    }
}