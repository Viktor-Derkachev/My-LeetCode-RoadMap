package main.tasks.squaresOfSortedArray;

import java.util.Arrays;

public class SquaresOfSortedArraySolution {

    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};

        System.out.println("Output: " + Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int currentIndex = nums.length - 1;
        int[] result = new int[nums.length];

        while (currentIndex >= 0) {
            int leftSquare = nums[leftIndex] * nums[leftIndex];
            int rightSquare = nums[rightIndex] * nums[rightIndex];

            if (rightSquare > leftSquare) {
                result[currentIndex] = rightSquare;
                rightIndex--;
            } else {
                result[currentIndex] = leftSquare;
                leftIndex++;
            }
            currentIndex--;
        }

        return result;
    }
}
