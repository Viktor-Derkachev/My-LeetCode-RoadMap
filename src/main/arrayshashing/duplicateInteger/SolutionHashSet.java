package main.arrayshashing.duplicateInteger;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
 * <a href="https://neetcode.io/problems/duplicate-integer">...</a>
 * Example 1:
 * Input: nums = [1, 2, 3, 3]
 * Output: true
 * Example 2:
 * Input: nums = [1, 2, 3, 4]
 * Output: false
 * Recommended Time & Space Complexity
 * You should aim for a solution with O(n) time and O(n) space, where n is the size of the input array.
 */
public class SolutionHashSet {
    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 2, 3, 3};
        System.out.println(" Output should be: true, result: " + hasDuplicate(nums1));

        int[] nums2 = new int[]{1, 2, 3, 4};
        System.out.println(" Output should be: false, result: " + hasDuplicate(nums2));

    }

    private static boolean hasDuplicate(int[] nums) {
        Set<Integer> setNums = new HashSet<>();
        for (int num : nums) {
            if (!setNums.add(num)) { // The add method returns false if the element already exists
                return true;
            }
        }
        return false;
    } //Time complexity: O(n)
}
