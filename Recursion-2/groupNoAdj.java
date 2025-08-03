public class GroupNoAdj {

    public boolean groupNoAdj(int start, int[] nums, int target) {
        // Base case: If we have reached the end of the array
        if (start >= nums.length) {
            return target == 0;
        }

        // Choose current element and skip the next one
        if (groupNoAdj(start + 2, nums, target - nums[start])) {
            return true;
        }

        // Skip current element
        if (groupNoAdj(start + 1, nums, target)) {
            return true;
        }

        // Neither option works
        return false;
    }

    public static void main(String[] args) {
        GroupNoAdj solver = new GroupNoAdj();

        System.out.println("groupNoAdj(0, [2, 5, 10, 4], 12) → " + solver.groupNoAdj(0, new int[]{2, 5, 10, 4}, 12)); // true
        System.out.println("groupNoAdj(0, [2, 5, 10, 4], 14) → " + solver.groupNoAdj(0, new int[]{2, 5, 10, 4}, 14)); // false
        System.out.println("groupNoAdj(0, [2, 5, 10, 4], 7) → " + solver.groupNoAdj(0, new int[]{2, 5, 10, 4}, 7));   // false
        System.out.println("groupNoAdj(0, [3, 2, 5, 10, 7], 15) → " + solver.groupNoAdj(0, new int[]{3, 2, 5, 10, 7}, 15)); // true
    }
}

