package com.turnbasedstudio.datastructs;

import com.turnbasedstudio.data.structures.array.Result;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResultTest {

    @Test
    public void createSequenceListOfNLength() {
        int length = 2;
        assertEquals(length, new Result(2).getDynamicArrayLength());
    }

    @Test
    public void setCorrectSequenceList() {
        assertEquals(0, new Result(2).getSequenceListNumber(0));
        assertEquals(1, new Result(2).getSequenceListNumber(1));
    }

    @Test
    public void insertIntoSequence() {
        Result result = new Result(2);
        int sequence = 1;
        int numberToInsert = 5;
        result.insertIntoSequence(sequence, numberToInsert);

        //could have used reflection but as the getter doesn't change the value or logic I am only still testing the ability to insert into the correct list
        assertEquals(numberToInsert, result.getIntAtSequenceIndex(sequence, 0));
    }

    @Test
    public void executeQueries() {
        int numberOfSequences = 2;
        Result result = new Result(numberOfSequences);
        int numberOfQueries = 5;
        int[][] queries = {
                {1, 0, 5},
                {1, 1, 7},
                {1, 0, 3},
                {2, 1, 0},
                {2, 1, 1}
        };
        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] == 1) {
                assertEquals(0, result.query(queries[i][0], queries[i][1], queries[i][2]));
            } else if (i == 3) {
                assertEquals(7, result.query(queries[i][0], queries[i][1], queries[i][2]));
            } else if (i == 4) {
                assertEquals(3, result.query(queries[i][0], queries[i][1], queries[i][2]));
            }
        }
    }

}