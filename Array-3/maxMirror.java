import java.util.Arrays;

public class MaxMirrorExample {

    // Method to find the size of the largest mirror section
    public static int maxMirror(int[] nums) {
        int max = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                int length = 0;
                int iForward = i;
                int jBackward = j;

                // Count matching elements moving forward and backward
                while (iForward < n && jBackward >= 0 && nums[iForward] == nums[jBackward]) {
                    length++;
                    iForward++;
                    jBackward--;
                }

                // Update max if a longer mirror is found
                if (length > max) {
                    max = length;
                }
            }
        }

        return max;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1})); // 3
        System.out.println("Test 2: " + maxMirror(new int[]{1, 2, 1, 4}));            // 3
        System.out.println("Test 3: " + maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));    // 2
    }
}
	
