package main.tasks.removeDuplicatesFromSorted;

/*
int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
 */
public class RemoveDuplicatesFromSortedArraySolution {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int[] expectedNums = {1, 2};

        System.out.println("Expected: " + expectedNums.length + " Actual: " + removeDuplicates(nums));

        for (int i = 0; i < expectedNums.length; i++) {
            System.out.println("Expected: " + expectedNums[i] + " Actual: " + nums[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int index = 0;
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
                k++;
            }
        }

        return k;
    }


}
