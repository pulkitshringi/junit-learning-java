package com.pulkit.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedArrayTest {

    @Test
    void sortedarray() {
        SortedArray obj = new SortedArray();
        int[] arr = null;
        assertThrows(ArithmeticException.class, () -> obj.sortedarray(arr));
    }
}