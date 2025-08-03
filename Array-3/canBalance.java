public class CanBalanceExample {

    // Method to check if array can be split into two equal-sum parts
    public static boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int leftSum = 0;
            int rightSum = 0;

            // Compute sum of the left side
            for (int j = 0; j <= i; j++) {
                leftSum += nums[j];
            }

            // Compute sum of the right side
            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }

            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + canBalance(new int[]{1, 1, 1, 2, 1}));  // true
        System.out.println("Test 2: " + canBalance(new int[]{2, 1, 1, 2, 1}));  // false
        System.out.println("Test 3: " + canBalance(new int[]{10, 10}));         // true
    }
}

