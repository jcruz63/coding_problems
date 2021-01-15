package com.turnbasedstudio.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubstringWithoutRepeatsTest {

    @Test
    public void getSubstringWithoutRepeatingChars() {
        String testString = "abcabcbb";
        SubstringWithoutRepeats substringWithoutRepeats = new SubstringWithoutRepeats();
        assertEquals(3, substringWithoutRepeats.lengthOfLongestSubstring(testString));
    }

}