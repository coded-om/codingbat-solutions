public class ZeroMax {

    public static int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int maxOdd = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 == 1 && nums[j] > maxOdd) {
                        maxOdd = nums[j];
                    }
                }
                if (maxOdd > 0) {
                    nums[i] = maxOdd;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(java.util.Arrays.toString(zeroMax(new int[]{0, 5, 0, 3})));   // [5, 5, 3, 3]
        System.out.println(java.util.Arrays.toString(zeroMax(new int[]{0, 4, 0, 3})));   // [3, 4, 3, 3]
        System.out.println(java.util.Arrays.toString(zeroMax(new int[]{0, 1, 0})));      // [1, 1, 0]
    }
}

