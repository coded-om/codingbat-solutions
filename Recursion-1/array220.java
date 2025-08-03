public class Array220 {

    // Recursive method to check if a value is followed by its 10x
    public static boolean array220(int[] nums, int index) {
        if (index >= nums.length - 1) {
            return false; // base case
        }

        if (nums[index + 1] == nums[index] * 10) {
            return true; // match found
        }

        return array220(nums, index + 1); // recurse
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("array220([1, 2, 20], 0) = " + array220(new int[]{1, 2, 20}, 0)); // true
        System.out.println("array220([3, 30], 0) = " + array220(new int[]{3, 30}, 0));       // true
        System.out.println("array220([3], 0) = " + array220(new int[]{3}, 0));              // false
    }
}

