import java.util.Arrays;

public class Fix34Example {

    public static int[] fix34(int[] nums) {
        int fourIndex = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            // When we find a 3 that is not followed by a 4
            if (nums[i] == 3 && nums[i + 1] != 4) {
                // Find the next 4 not already placed after a 3
                while (nums[fourIndex] != 4 || (fourIndex > 0 && nums[fourIndex - 1] == 3)) {
                    fourIndex++;
                }

                // Swap the number after 3 with the available 4
                int temp = nums[i + 1];
                nums[i + 1] = 4;
                nums[fourIndex] = temp;
            }
        }

        return nums;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + Arrays.toString(fix34(new int[]{1, 3, 1, 4})));               // [1, 3, 4, 1]
        System.out.println("Test 2: " + Arrays.toString(fix34(new int[]{1, 3, 1, 4, 4, 3, 1})));       // [1, 3, 4, 1, 1, 3, 4]
        System.out.println("Test 3: " + Arrays.toString(fix34(new int[]{3, 2, 2, 4})));               // [3, 4, 2, 2]
    }
}

