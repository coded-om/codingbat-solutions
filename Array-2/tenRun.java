public class TenRun {

    public static int[] tenRun(int[] nums) {
        int currentMultiple = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                currentMultiple = nums[i];  // Start or update the current multiple of 10
            } else if (currentMultiple != -1) {
                nums[i] = currentMultiple;  // Apply current multiple if in a run
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(java.util.Arrays.toString(tenRun(new int[]{2, 10, 3, 4, 20, 5}))); // [2, 10, 10, 10, 20, 20]
        System.out.println(java.util.Arrays.toString(tenRun(new int[]{10, 1, 20, 2})));       // [10, 10, 20, 20]
        System.out.println(java.util.Arrays.toString(tenRun(new int[]{10, 1, 9, 20})));       // [10, 10, 10, 20]
    }
}

