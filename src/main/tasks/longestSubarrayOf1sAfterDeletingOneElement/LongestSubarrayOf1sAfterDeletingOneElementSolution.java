package main.tasks.longestSubarrayOf1sAfterDeletingOneElement;

/*
1493. Longest Subarray of 1's After Deleting One Element
Solved
Medium
Topics
Companies
Hint
Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.



Example 1:

Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
Example 2:

Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
Example 3:

Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element.
 */
public class LongestSubarrayOf1sAfterDeletingOneElementSolution {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 0, 1};
        int[] nums2 = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        int[] nums3 = {1, 1, 1};

        System.out.println(longestSubarray(nums1)); // Output: 3
        System.out.println(longestSubarray(nums2)); // Output: 5
        System.out.println(longestSubarray(nums3)); // Output: 2

    }

    public static int longestSubarray(int[] nums) {
        int begin = 0;
        int result = 0;
        int sum = 0;
        int state = 0; //count of "0" in sum

        for (int i = 0; i < nums.length; i++) {
            sum++;
            if (nums[i] == 0) {
                state++;
                sum--;
            }

            if (state > 1) {
                while (nums[begin] == 1) {
                    begin++;
                }
                begin++;
                state--;
                sum = i - begin;
            }

            result = Math.max(result, sum);

            if (state == 0) {
                result--;
            }
        }

        return result;
    }
}
