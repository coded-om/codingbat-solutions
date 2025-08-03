public class MaxSpanExample {

    // Method to find the maximum span in the array
    public static int maxSpan(int[] nums) {
        int maxSpan = 0;

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[j] == value) {
                    int span = j - i + 1;
                    if (span > maxSpan) {
                        maxSpan = span;
                    }
                    break; // stop looking once rightmost match is found
                }
            }
        }

        return maxSpan;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + maxSpan(new int[]{1, 2, 1, 1, 3}));          // 4
        System.out.println("Test 2: " + maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));    // 6
        System.out.println("Test 3: " + maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));    // 6
    }
}

