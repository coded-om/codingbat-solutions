public class Pre4 {

    public static int[] pre4(int[] nums) {
        int index = 0;

        // Find the index of the first 4
        while (index < nums.length && nums[index] != 4) {
            index++;
        }

        // Copy elements before the first 4
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(java.util.Arrays.toString(pre4(new int[]{1, 2, 4, 1}))); // [1, 2]
        System.out.println(java.util.Arrays.toString(pre4(new int[]{3, 1, 4})));    // [3, 1]
        System.out.println(java.util.Arrays.toString(pre4(new int[]{1, 4, 4})));    // [1]
    }
}

