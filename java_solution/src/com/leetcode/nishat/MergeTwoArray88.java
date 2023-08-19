package com.leetcode.nishat;

import com.leetcode.nishat.utils.Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoArray88 {

    public static void main(String args[]) {
        int[] nums1 = new int[]{0, 1, 2, 3, 4, 0, 0, 0, 0};
        int[] nums2 = new int[]{2, 3, 4, 5};
//        merge_solution(nums1, 5, nums2, 4);
        System.out.println(0%2);
    }

    public static void merge_JAVA_accepted(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();
        for (Integer i : nums1) {
            list.add(i);
        }
        for (Integer i : nums2) {
            list.add(i);
        }
        Collections.sort(list);
        for (Integer i : list) {
            nums1[list.indexOf(i)] = list.get(i);
        }
        Utils.printArray(nums1);
    }

    public static void mergeAttempt_1_wrong(int[] nums1, int m, int[] nums2, int n) {
        int swap;
        for (int i = 0, k = m, j = 0; i < m + n; i++) {
            if ((nums1[i] == nums2[j]) || (nums1[i] < nums2[j] && nums2[j] < nums1[i + 1])) {
                swap = nums1[i + 1];
                nums1[i + 1] = nums2[j];
                nums1[k] = swap;
                ++k;
                ++j;
                if (j >= n)
                    break;
            } else if (nums1[i] < nums2[j] && nums2[j] > nums1[i + 1]) {
                swap = nums1[i + 1];
                nums1[i] = nums1[i + 1];
                nums1[i + 1] = swap;
            }
            Utils.printArray(nums1);
        }
    }

    public static void merge_solution(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i > 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        Utils.printArray(nums1);
    }
}
