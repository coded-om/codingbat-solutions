public class GroupSum6 {

    // Method that checks if a group can sum to target with all 6s included
    public boolean groupSum6(int start, int[] nums, int target) {
        // Base case: if we’ve processed all elements, check if target is reached
        if (start == nums.length) {
            return target == 0;
        }

        // If current number is 6, we must include it
        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - nums[start]);
        }

        // Try including the current number
        if (groupSum6(start + 1, nums, target - nums[start])) {
            return true;
        }

        // Try excluding the current number
        if (groupSum6(start + 1, nums, target)) {
            return true;
        }

        // Neither inclusion nor exclusion leads to a solution
        return false;
    }

    // Main method to test the function
    public static void main(String[] args) {
        GroupSum6 solver = new GroupSum6();

        System.out.println("groupSum6(0, [5, 6, 2], 8): " + solver.groupSum6(0, new int[]{5, 6, 2}, 8));  // true
        System.out.println("groupSum6(0, [5, 6, 2], 9): " + solver.groupSum6(0, new int[]{5, 6, 2}, 9));  // false
        System.out.println("groupSum6(0, [5, 6, 2], 7): " + solver.groupSum6(0, new int[]{5, 6, 2}, 7));  // false
        System.out.println("groupSum6(0, [6, 6, 6], 18): " + solver.groupSum6(0, new int[]{6, 6, 6}, 18)); // true
        System.out.println("groupSum6(0, [6, 2, 4], 8): " + solver.groupSum6(0, new int[]{6, 2, 4}, 8));   // true
    }
}

