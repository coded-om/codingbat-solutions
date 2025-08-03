public class ZeroFront {

    public static int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int zeroIndex = 0;
        int nonZeroIndex = nums.length - 1;

        // Fill zeros from the front and non-zeros from the back
        for (int num : nums) {
            if (num == 0) {
                result[zeroIndex++] = 0;
            } else {
                result[nonZeroIndex--] = num;
            }
        }

        // Fill remaining from the back to front (preserve 0s already in front)
        int fillIndex = zeroIndex;
        for (int i = nums.length - 1; i > nonZeroIndex; i--) {
            result[fillIndex++] = result[i];
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(java.util.Arrays.toString(zeroFront(new int[]{1, 0, 0, 1})));     // [0, 0, 1, 1]
        System.out.println(java.util.Arrays.toString(zeroFront(new int[]{0, 1, 1, 0, 1})));  // [0, 0, 1, 1, 1]
        System.out.println(java.util.Arrays.toString(zeroFront(new int[]{1, 0})));           // [0, 1]
    }
}

