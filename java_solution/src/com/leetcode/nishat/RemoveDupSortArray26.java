package com.leetcode.nishat;

import com.leetcode.nishat.utils.Utils;

public class RemoveDupSortArray26 {
    public static void main (String args[]) {
        int[] nums3 = new int[]{-1, -1 ,0, 0, 1,2,2,4};
        removeDuplicates_solution(nums3);
    }

    public static int removeDuplicates_attempt_accepted(int[] nums) {
        int index = 0, newIdx = 0, element = -200;
        while (index < nums.length) {
            if (element != nums[index]) {
                nums[newIdx] = nums[index];
                element = nums[newIdx];
                newIdx++;
            }
            index++;
        }
        Utils.printArray(nums);
        System.out.println(newIdx);
        return newIdx;
    }

    public static int removeDuplicates_solution(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        Utils.printArray(nums);
        System.out.println(j);
        return j;
    }
}
