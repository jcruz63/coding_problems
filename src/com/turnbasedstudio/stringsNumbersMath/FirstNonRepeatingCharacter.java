package com.turnbasedstudio.stringsNumbersMath;

import org.jetbrains.annotations.NotNull;

public class FirstNonRepeatingCharacter {


    public static char findFirstNonRepeatingChar(@NotNull String testString) {
        for (int i = 0; i < testString.length(); i++) {
            int count = 0;
            for (int j = 0; j < testString.length(); j++) {
                if (testString.charAt(i) == testString.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                return testString.charAt(i);
            }
        }

        return ' ';
    }
}
