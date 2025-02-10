package main.tasks.containerWithMostWater;

public class ContainerWithMostWaterSolution {

    public static void main(String[] args) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println("Expected: 49, Actual:" + maxArea(height));
    }

    public static int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        int result = 0;

        while (leftIndex < rightIndex) {
            int leftWall = height[leftIndex];
            int rightWall = height[rightIndex];
            int currentAmount;

            if (leftWall > rightWall) {
                currentAmount = rightWall * (rightIndex - leftIndex);

                if (currentAmount > result) {
                    result = currentAmount;
                }

                rightIndex--;
            } else {
                currentAmount = leftWall * (rightIndex - leftIndex);

                if (currentAmount > result) {
                    result = currentAmount;
                }

                leftIndex++;
            }
        }

        return result;
    }
}
