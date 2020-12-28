package com.turnbasedstudio.stringsNumbersMath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstNonRepeatingCharacterTest {


    @Test
    public void TestFindFirstNonRepeatingChar() {

        assertEquals('H', FirstNonRepeatingCharacter.findFirstNonRepeatingChar("Hello World"));
        assertEquals('g', FirstNonRepeatingCharacter.findFirstNonRepeatingChar("llhhgjjkklu"));

    }

}