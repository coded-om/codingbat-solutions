import java.util.Arrays;

public class Fix45Example {

    public static int[] fix45(int[] nums) {
        int fiveIndex = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                // Find the next 5 that is not already placed after a 4
                while (nums[fiveIndex] != 5 || (fiveIndex > 0 && nums[fiveIndex - 1] == 4)) {
                    fiveIndex++;
                }

                // Swap nums[i + 1] and nums[fiveIndex]
                int temp = nums[i + 1];
                nums[i + 1] = 5;
                nums[fiveIndex] = temp;
            }
        }

        return nums;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + Arrays.toString(fix45(new int[]{5, 4, 9, 4, 9, 5})));
        // Expected: [9, 4, 5, 4, 5, 9]

        System.out.println("Test 2: " + Arrays.toString(fix45(new int[]{1, 4, 1, 5})));
        // Expected: [1, 4, 5, 1]

        System.out.println("Test 3: " + Arrays.toString(fix45(new int[]{1, 4, 1, 5, 5, 4, 1})));
        // Expected: [1, 4, 5, 1, 1, 4, 5]
    }
}

