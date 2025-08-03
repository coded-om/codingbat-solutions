public class GroupSum {

    public static boolean groupSum(int start, int[] nums, int target) {
        // Base case: reached end of array
        if (start == nums.length) {
            return target == 0;
        }

        // Recursive case: try including or excluding nums[start]
        
        // Include current number
        if (groupSum(start + 1, nums, target - nums[start])) {
            return true;
        }

        // Exclude current number
        if (groupSum(start + 1, nums, target)) {
            return true;
        }

        // Neither inclusion nor exclusion worked
        return false;
    }

    // Main method to test
    public static void main(String[] args) {
        System.out.println("groupSum(0, [2, 4, 8], 10) = " + groupSum(0, new int[]{2, 4, 8}, 10)); // true
        System.out.println("groupSum(0, [2, 4, 8], 14) = " + groupSum(0, new int[]{2, 4, 8}, 14)); // true
        System.out.println("groupSum(0, [2, 4, 8], 9) = " + groupSum(0, new int[]{2, 4, 8}, 9));   // false
    }
}

