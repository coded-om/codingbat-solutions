public class Array6 {

    // Recursive method to check if array contains a 6 from given index
    public static boolean array6(int[] nums, int index) {
        if (index >= nums.length) {
            return false; // base case: reached end of array
        }
        if (nums[index] == 6) {
            return true; // found a 6
        }
        return array6(nums, index + 1); // check next element
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("array6([1, 6, 4], 0) = " + array6(new int[]{1, 6, 4}, 0)); // true
        System.out.println("array6([1, 4], 0) = " + array6(new int[]{1, 4}, 0));       // false
        System.out.println("array6([6], 0) = " + array6(new int[]{6}, 0));            // true
    }
}

