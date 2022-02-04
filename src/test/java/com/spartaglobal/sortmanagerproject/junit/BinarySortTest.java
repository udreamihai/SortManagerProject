package com.spartaglobal.sortmanagerproject.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.spartaglobal.sortmanagerproject.junit.model.BinarySearchTreeSort;

public class BinarySortTest {
    public BinarySearchTreeSort sorter;
    @BeforeEach
    public void setup(){
        sorter = new BinarySearchTreeSort();
    }

    @Test
    @DisplayName("Fail expected")
    void testBinarySortUnsorted() {
        BinarySearchTreeSort bt = new BinarySearchTreeSort();
        int[] expected = {28, 41, 54, 65, 82, 85, 103, 121, 127, 137, 164, 173, 182, 223, 253, 256, 259, 283, 287, 296, 300, 302, 304, 312, 340, 345, 345, 355, 357, 394, 403, 415, 416, 419, 439, 455, 469, 485, 487, 494};
        int[] actual = {173, 494, 485, 419, 103, 304, 357, 302, 253, 355, 54, 300, 296, 256, 487, 416, 312, 345, 137, 283, 127, 65, 259, 28, 82, 85, 182, 164, 415, 345, 340, 439, 394, 121, 403, 469, 455, 223, 287, 41};
        for (int i = 0; i < actual.length; i++){
            bt.insert(actual[i]);
        }
        int[] actualSorted = sorter.sortArray(actual, actual.length);
        assertArrayEquals(expected, actualSorted);
    }
}
