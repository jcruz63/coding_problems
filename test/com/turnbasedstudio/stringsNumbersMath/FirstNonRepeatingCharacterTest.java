package com.turnbasedstudio.stringsNumbersMath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepeatingCharacterTest {


    @Test
    public void TestFindFirstNonRepeatingChar(){

        assertEquals('h',FirstNonRepeatingCharacter.findFirstNonRepeatingChar("Hello World"));
    }

}