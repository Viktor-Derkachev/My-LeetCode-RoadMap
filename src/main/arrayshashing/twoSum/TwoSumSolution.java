package main.arrayshashing.twoSum;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/two-sum/">...</a>
 * <p>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * <p>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 */
public class TwoSumSolution {
    public static void main(String[] args) {
        int[] nums1 = new int[]{2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Output should be: [0,1], actually:" + Arrays.toString(twoSum(nums1, target1)));

        int[] nums2 = new int[]{3,2,4};
        int target2 = 6;
        System.out.println("Output should be: [1,2], actually:" + Arrays.toString(twoSum(nums2, target2)));

        int[] nums3 = new int[]{3,3};
        int target3 = 6;
        System.out.println("Output should be: [0,1], actually:" + Arrays.toString(twoSum(nums3, target3)));


    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((target - nums[i]) == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }

        return result;
    }
}
