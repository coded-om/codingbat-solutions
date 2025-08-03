public class NotAlone {

    public static int[] notAlone(int[] nums, int val) {
        // Start from index 1 and go to the second last element
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(java.util.Arrays.toString(notAlone(new int[]{1, 2, 3}, 2)));            // [1, 3, 3]
        System.out.println(java.util.Arrays.toString(notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2)));    // [1, 3, 3, 5, 5, 2]
        System.out.println(java.util.Arrays.toString(notAlone(new int[]{3, 4}, 3)));               // [3, 4]
    }
}

