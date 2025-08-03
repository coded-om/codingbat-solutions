public class GroupSum5 {

    public boolean groupSum5(int start, int[] nums, int target) {
        // Base case
        if (start >= nums.length) {
            return target == 0;
        }

        if (nums[start] % 5 == 0) {
            // Must include multiples of 5
            if (start + 1 < nums.length && nums[start + 1] == 1) {
                // Skip the 1 immediately after a multiple of 5
                return groupSum5(start + 2, nums, target - nums[start]);
            } else {
                return groupSum5(start + 1, nums, target - nums[start]);
            }
        } else {
            // Try including nums[start]
            if (groupSum5(start + 1, nums, target - nums[start])) {
                return true;
            }
            // Try excluding nums[start]
            if (groupSum5(start + 1, nums, target)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        GroupSum5 solver = new GroupSum5();

        System.out.println("groupSum5(0, [2, 5, 10, 4], 19) → " + solver.groupSum5(0, new int[]{2, 5, 10, 4}, 19)); // true
        System.out.println("groupSum5(0, [2, 5, 10, 4], 17) → " + solver.groupSum5(0, new int[]{2, 5, 10, 4}, 17)); // true
        System.out.println("groupSum5(0, [2, 5, 10, 4], 12) → " + solver.groupSum5(0, new int[]{2, 5, 10, 4}, 12)); // false
        System.out.println("groupSum5(0, [5, 1, 3], 8) → " + solver.groupSum5(0, new int[]{5, 1, 3}, 8)); // false (1 must be skipped)
    }
}

