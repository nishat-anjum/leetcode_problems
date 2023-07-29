package com.leetcode.nishat;

import com.leetcode.nishat.utils.Utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElement_27 {
    public static void main(String args[]) {
        int[] nums3 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    }

    public int removeElementAttempt_java_accepted(int[] nums, int val) {
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        numList.removeAll(Collections.singletonList(val));
        for (int i = 0; i < nums.length; i++) {
            if (i >= numList.size()) {
                break;
            }
            nums[i] = numList.get(i);
        }
        return numList.size();
    }

    public int removeElementAttempt_2_wrong(int[] nums, int val) {
        int count = 0;
        for (int index = 0, j = nums.length - 1; index < nums.length && j >= 0 && j <= index; ) {
            if (nums[index] == val) {
                ++count;
                nums[index] = nums[j];
                j--;
            } else {
                ++index;
            }
            System.out.println("index: " + index + "j : " + j + "count: " + count);
            Utils.printArray(nums);
        }
        System.out.println(count);
        return nums.length - count;
    }

    public int removeElement_solution(int[] nums, int val) {
        int p = 0, i = 0;
        while (i < nums.length) {
            if (nums[i] != val) {
                nums[p] = nums[i];
                p++;
            }
            i++;
        }
        Utils.printArray(nums);
        return p;
    }
}
