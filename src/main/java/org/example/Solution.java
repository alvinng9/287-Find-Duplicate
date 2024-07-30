package org.example;

public class Solution {
    public int findDuplicate(int[] nums) {
        // create a new int array with the same length as the given nums array
        // since the original nums can't be modified, the index array will be used
        // instead
        int[] index = new int[nums.length];
        // iterating through the nums array to find the duplicate number
        for (int i = 0; i < nums.length; i++) {
            // if the number has already appeard, the index array would be modified
            // at that index
            // this will check whether that index of the index array has been modified
            if (index[nums[i]] != 0) {
                return nums[i];
            } else {
                // if the index has not been modified, then modify it
                index[nums[i]] = 1;
            }
        }
        return -1;
    }
}
