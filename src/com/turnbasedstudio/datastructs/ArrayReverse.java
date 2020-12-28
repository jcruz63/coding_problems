package com.turnbasedstudio.datastructs;

public interface ArrayReverse {
    static int[] reverseIntArray(int[] arr) {
        int length = arr.length;
        int[] ans = new int[length];
        --length;
        for (int i = 0; length > -1; length--, i++) {
            ans[i] = arr[length];
        }
        return ans;
    }

}
