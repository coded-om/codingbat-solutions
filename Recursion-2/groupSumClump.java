public class GroupSumClump {

    public boolean groupSumClump(int start, int[] nums, int target) {
        // Base case: all numbers considered
        if (start >= nums.length) {
            return target == 0;
        }

        // Identify the clump of adjacent identical numbers
        int clumpValue = nums[start];
        int clumpCount = 1;
        int i = start + 1;
        while (i < nums.length && nums[i] == clumpValue) {
            clumpCount++;
            i++;
        }

        int clumpSum = clumpValue * clumpCount;

        // Try including the clump
        if (groupSumClump(start + clumpCount, nums, target - clumpSum)) {
            return true;
        }

        // Try excluding the clump
        if (groupSumClump(start + clumpCount, nums, target)) {
            return true;
        }

        // Neither works
        return false;
    }

    public static void main(String[] args) {
        GroupSumClump solver = new GroupSumClump();

        System.out.println("groupSumClump(0, [2, 4, 8], 10) → " + solver.groupSumClump(0, new int[]{2, 4, 8}, 10)); // true
        System.out.println("groupSumClump(0, [1, 2, 4, 8, 1], 14) → " + solver.groupSumClump(0, new int[]{1, 2, 4, 8, 1}, 14)); // true
        System.out.println("groupSumClump(0, [2, 4, 4, 8], 14) → " + solver.groupSumClump(0, new int[]{2, 4, 4, 8}, 14)); // false
        System.out.println("groupSumClump(0, [1, 1, 1, 5], 3) → " + solver.groupSumClump(0, new int[]{1, 1, 1, 5}, 3)); // true (1+1+1)
        System.out.println("groupSumClump(0, [1, 1, 1, 5], 5) → " + solver.groupSumClump(0, new int[]{1, 1, 1, 5}, 5)); // true (5)
        System.out.println("groupSumClump(0, [1, 1, 1, 5], 6) → " + solver.groupSumClump(0, new int[]{1, 1, 1, 5}, 6)); // true (1+1+1+5)
        System.out.println("groupSumClump(0, [1, 1, 1, 5], 7) → " + solver.groupSumClump(0, new int[]{1, 1, 1, 5}, 7)); // false
    }
}

