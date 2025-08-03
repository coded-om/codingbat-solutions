public class SplitArray {

    // Main method to run test cases
    public static void main(String[] args) {
        SplitArray sa = new SplitArray();

        System.out.println(sa.splitArray(new int[]{2, 2}));        // true
        System.out.println(sa.splitArray(new int[]{2, 3}));        // false
        System.out.println(sa.splitArray(new int[]{5, 2, 3}));     // true
        System.out.println(sa.splitArray(new int[]{1, 1, 1, 2}));  // true
        System.out.println(sa.splitArray(new int[]{1, 1, 1, 1}));  // true
    }

    // Public method called with input array
    public boolean splitArray(int[] nums) {
        return helper(nums, 0, 0, 0);
    }

    // Recursive helper method
    private boolean helper(int[] nums, int index, int sum1, int sum2) {
        if (index == nums.length) {
            return sum1 == sum2;
        }

        // Try putting nums[index] in group 1
        if (helper(nums, index + 1, sum1 + nums[index], sum2)) {
            return true;
        }

        // Try putting nums[index] in group 2
        if (helper(nums, index + 1, sum1, sum2 + nums[index])) {
            return true;
        }

        // No valid grouping found
        return false;
    }
}

