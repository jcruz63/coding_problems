package com.turnbasedstudio.hackerrank.leftrotate;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ResultTest {


    @Test
    void testRotateArrayLeft() {
        int numOfRotations = 4;
        List<Integer> integerArrayList = Arrays.asList(1, 2, 3, 4, 5);
        int[] arrayAfterShift = {5, 1, 2, 3, 4};
        Integer[] result = new Integer[integerArrayList.size()];
        List<Integer> temp = Result.rotateLeft(4, integerArrayList);
        result = temp.toArray(result);


    }

}