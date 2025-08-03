public class Split53 {

    public boolean split53(int[] nums) {
        return helper(nums, 0, 0, 0);
    }

    private boolean helper(int[] nums, int index, int group1, int group2) {
        if (index == nums.length) {
            return group1 == group2;
        }

        int current = nums[index];

        if (current % 5 == 0) {
            // Must go in group1
            return helper(nums, index + 1, group1 + current, group2);
        } else if (current % 3 == 0) {
            // Must go in group2
            return helper(nums, index + 1, group1, group2 + current);
        } else {
            // Try both options
            return helper(nums, index + 1, group1 + current, group2) ||
                   helper(nums, index + 1, group1, group2 + current);
        }
    }

    public static void main(String[] args) {
        Split53 obj = new Split53();

        System.out.println(obj.split53(new int[]{1, 1}));       // → true
        System.out.println(obj.split53(new int[]{1, 1, 1}));    // → false
        System.out.println(obj.split53(new int[]{2, 4, 2}));    // → true
        System.out.println(obj.split53(new int[]{3, 5, 2, 2})); // → depends on balance
    }
}

