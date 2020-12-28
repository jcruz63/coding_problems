package com.turnbasedstudio.datastructs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayReverseTest {

    @Test
    public void reverseIntArrayTest() {
        int[] arr = {2, 3, 4, 1};
        int[] arrReversed = {1, 4, 3, 2};
        assertArrayEquals(arrReversed, ArrayReverse.reverseIntArray(arr));
    }

}