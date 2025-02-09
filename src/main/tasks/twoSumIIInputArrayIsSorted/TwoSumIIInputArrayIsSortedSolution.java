package main.tasks.twoSumIIInputArrayIsSorted;

import java.util.Arrays;

public class TwoSumIIInputArrayIsSortedSolution {
    public static void main(String[] args) {

        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;

        System.out.println("Output: " + Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int indexLeft = 1;
        int indexRight = numbers.length;
        int[] result = new int[2];

        while (indexLeft < indexRight) {
            int sum = numbers[indexLeft - 1] + numbers[indexRight - 1];
            if (sum == target) {
                result[0] = indexLeft;
                result[1] = indexRight;

                break;
            } else if (sum < target) {
                indexLeft++;
            } else {
                indexRight--;
            }
        }

        return result;
    }
}
