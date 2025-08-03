public class ShiftLeft {

    public static int[] shiftLeft(int[] nums) {
        if (nums.length <= 1) return nums;

        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
        return nums;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(java.util.Arrays.toString(shiftLeft(new int[]{6, 2, 5, 3}))); // [2, 5, 3, 6]
        System.out.println(java.util.Arrays.toString(shiftLeft(new int[]{1, 2})));       // [2, 1]
        System.out.println(java.util.Arrays.toString(shiftLeft(new int[]{1})));         // [1]
    }
}

