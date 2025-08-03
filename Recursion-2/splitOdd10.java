public class SplitOdd10 {

    public static void main(String[] args) {
        int[] test1 = {5, 5, 5};
        int[] test2 = {5, 5, 6};
        int[] test3 = {5, 5, 6, 1};

        System.out.println("splitOdd10([5, 5, 5]) → " + splitOdd10(test1)); // true
        System.out.println("splitOdd10([5, 5, 6]) → " + splitOdd10(test2)); // false
        System.out.println("splitOdd10([5, 5, 6, 1]) → " + splitOdd10(test3)); // true
    }

    public static boolean splitOdd10(int[] nums) {
        return helper(nums, 0, 0, 0);
    }

    private static boolean helper(int[] nums, int index, int group1, int group2) {
        if (index == nums.length) {
            return (group1 % 10 == 0 && group2 % 2 == 1) ||
                   (group2 % 10 == 0 && group1 % 2 == 1);
        }

        int current = nums[index];

        // Try adding current number to group1
        if (helper(nums, index + 1, group1 + current, group2)) {
            return true;
        }

        // Try adding current number to group2
        if (helper(nums, index + 1, group1, group2 + current)) {
            return true;
        }

        return false;
    }
}

