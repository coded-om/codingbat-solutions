public class WithoutTen {

    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num != 10) {
                result[index++] = num;
            }
        }

        // Remaining elements are already 0 by default in new int[]
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(java.util.Arrays.toString(withoutTen(new int[]{1, 10, 10, 2})));    // [1, 2, 0, 0]
        System.out.println(java.util.Arrays.toString(withoutTen(new int[]{10, 2, 10})));       // [2, 0, 0]
        System.out.println(java.util.Arrays.toString(withoutTen(new int[]{1, 99, 10})));       // [1, 99, 0]
    }
}

