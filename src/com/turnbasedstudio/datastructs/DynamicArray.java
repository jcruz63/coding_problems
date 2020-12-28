package com.turnbasedstudio.datastructs;

/*
    This is the answer to https://www.hackerrank.com/challenges/dynamic-array/problem with the corresponding unit test.

 */


import java.util.ArrayList;

public class DynamicArray {

    private final ArrayList<ArrayList<Integer>> masterList;
    private int lastAnswer = 0;
    private final int numberOfSequences;

    public DynamicArray(int numberOfSequences) {
        this.numberOfSequences = numberOfSequences;
        this.masterList = new ArrayList<>();
        for (int i = 0; i < numberOfSequences; i++) {
            masterList.add(new ArrayList<>());
        }
    }

    public int getDynamicArrayLength() {
        return masterList.size();
    }

    public void insertIntoSequence(int sequence, int numberToInsert) {
        masterList.get(getSequenceListNumber(sequence)).add(numberToInsert);
    }

    public int getSequenceListNumber(int sequence) {
        if (sequence == 0) {
            return 0;
        }
        return (sequence ^ lastAnswer) % numberOfSequences;
    }

    public int getIntAtSequenceIndex(int sequence, int index) {
        return masterList.get(getSequenceListNumber(sequence)).get(index);
    }

    public int query(int queryType, int sequence, int indexOrNumberToInsert) {
        int ans = 0;
        switch (queryType) {
            case 1 -> insertIntoSequence(sequence, indexOrNumberToInsert);
            case 2 -> ans = getIntAtSequenceIndex(sequence, indexOrNumberToInsert);
        }
        lastAnswer = ans;
        return ans;
    }

}
