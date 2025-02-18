package main.tasks.maxConsecutiveOnesIII;
/*
1004. Max Consecutive Ones III

Given a binary array nums and an integer k, return the maximum number of consecutive 1's
in the array if you can flip at most k 0's.

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 */

public class MaxConsecutiveOnesIIISolution {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        System.out.println("Max Consecutive Ones III: " + longestOnes(nums, k));

        int[] nums2 = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k2 = 3;

        System.out.println("Max Consecutive Ones III: " + longestOnes(nums2, k2));
    }

    public static int longestOnes(int[] nums, int k) {
        int begin = 0;
        int result = 0;
        int sum = 0;
        int state = 0; //sum zero's

        for (int i = 0; i < nums.length; i++) {
            sum += 1;

            if (nums[i] == 0) {
                state++;

                if (state > k) {

                    while (nums[begin] == 1) {
                        begin++;
                    }

                    begin++;
                    state--;
                    sum = (i - begin) + 1;
                }
            }

            if (result < sum) {
                result = sum;
            }
        }

        return result;
    }
}
