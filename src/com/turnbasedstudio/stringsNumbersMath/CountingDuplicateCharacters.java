package com.turnbasedstudio.stringsNumbersMath;

import java.util.Arrays;

public class CountingDuplicateCharacters {


    public static int numberOfDuplicates(String testString) {
        int count=0;
        char charArray[] = testString.toCharArray();

        Arrays.sort(charArray);

        for(int i=0;(i+1)<charArray.length;i++){
            if(charArray[i]==charArray[i+1]){
                count++;
            }
        }



        return count;
    }
}
