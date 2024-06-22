package org.example;

public class Solution {
    public int findDuplicate(int[] nums) {
        int[] clone = nums.clone();
        for (int i = 0; i < clone.length; i++) {
            if(nums[Math.abs(nums[i])] < 0) {
                return Math.abs(nums[i]);
            } else {
                nums[Math.abs(nums[i])] = -1 * nums[Math.abs(nums[i])];
            }
        }
        return -1;
    }
}
