package com.turnbasedstudio.datastructs;

/*
    This is the answer to https://www.hackerrank.com/challenges/dynamic-array/problem with the corresponding unit test
 */


import java.util.ArrayList;

public class DynamicArray {

    private final ArrayList<ArrayList<Integer>> arrayList;
    private final int lastAnswer = 0;
    private final int numberOfSequences;

    public DynamicArray(int numberOfSequences) {
        this.numberOfSequences = numberOfSequences;
        this.arrayList = new ArrayList<>();
        for (int i = 0; i < numberOfSequences; i++) {
            arrayList.add(new ArrayList<>());
        }
    }

    public int getDynamicArrayLength() {
        return arrayList.size();
    }

    public void insertIntoSequence(int sequence, int numberToInsert) {
        arrayList.get(getSequenceListNumber(sequence)).add(numberToInsert);
    }

    public int getSequenceListNumber(int sequence) {
        if (sequence == 0) {
            return 0;
        }
        return (sequence ^ lastAnswer) % numberOfSequences;
    }
}
