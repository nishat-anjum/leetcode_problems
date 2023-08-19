package com.leetcode.nishat;

import com.leetcode.nishat.utils.Utils;

public class SortedArrayRemDuplicate_80 {
    public static void main(String args[]) {
        int[] nums3 = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 4,6,7,8,9,9,9,9,9,9};
        removeDuplicates_accepted(nums3);
    }

    public static int removeDuplicates_accepted(int[] nums) {
        int index = 0, index2 = 0, element = nums[index], counter = 0;
        while (index < nums.length) {
            if (element == nums[index]) {
                if (counter == 2) {
                    counter = -1;
                } else if (counter != -1) {
                    nums[index2] = nums[index];
                    element = nums[index];
                    counter++;
                    index2++;
                }
            } else {
                nums[index2] = nums[index];
                element = nums[index];
                counter = 1;
                index2++;
            }
            index++;
            System.out.println(index2);
            Utils.printArray(nums);
        }
        return index2;
    }
}
