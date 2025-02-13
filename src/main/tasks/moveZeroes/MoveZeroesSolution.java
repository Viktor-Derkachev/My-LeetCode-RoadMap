package main.tasks.moveZeroes;

import java.util.Arrays;

/*
Given an integer array nums, move all 0's to the end of it while maintaining
the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 */
public class MoveZeroesSolution {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] expectedNums = {1, 3, 12, 0, 0};

        moveZeroes(nums);
        System.out.println(Arrays.equals(expectedNums, nums));

        int[] nums2 = {0};
        int[] expectedNums2 = {0};

        moveZeroes(nums2);
        System.out.println(Arrays.equals(expectedNums2, nums2));
    }

    public static void moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != index) {
                    nums[index] = nums[i];
                    nums[i] = 0;
                }
                index++;
            }
        }

    }
}
