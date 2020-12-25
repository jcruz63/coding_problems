package com.turnbasedstudio.stringsNumbersMath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingDuplicateCharactersTest {

    @Test
    public void TestStringForDuplicates(){

        assertEquals(3,CountingDuplicateCharacters.numberOfDuplicates("Hello world"));

        assertEquals(3,CountingDuplicateCharacters.numberOfDuplicates("pepper"));

        assertEquals(0,CountingDuplicateCharacters.numberOfDuplicates("liters"));
    }

}