package com.turnbasedstudio.datastructs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DynamicArrayTest {

    @Test
    public void createSequenceListOfNLength() {
        int length = 2;
        assertEquals(length, new DynamicArray(2).getDynamicArrayLength());
    }

    @Test
    public void setCorrectSequenceList() {
        assertEquals(0, new DynamicArray(2).getSequenceListNumber(0));
        assertEquals(1, new DynamicArray(2).getSequenceListNumber(1));
    }

    @Test
    public void insertIntoSequence() {
    }

}