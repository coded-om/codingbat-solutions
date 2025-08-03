public class Array11 {

    // Recursive method to count occurrences of 11 starting from index
    public static int array11(int[] nums, int index) {
        if (index >= nums.length) {
            return 0; // base case
        }
        if (nums[index] == 11) {
            return 1 + array11(nums, index + 1); // count and move on
        } else {
            return array11(nums, index + 1); // skip and move on
        }
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("array11([1, 2, 11], 0) = " + array11(new int[]{1, 2, 11}, 0)); // 1
        System.out.println("array11([11, 11], 0) = " + array11(new int[]{11, 11}, 0));     // 2
        System.out.println("array11([1, 2, 3, 4], 0) = " + array11(new int[]{1, 2, 3, 4}, 0)); // 0
    }
}

