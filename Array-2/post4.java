public class Post4 {

    public static int[] post4(int[] nums) {
        int lastFourIndex = -1;

        // Find the index of the last 4
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                lastFourIndex = i;
            }
        }

        // Create a new array with elements after the last 4
        int[] result = new int[nums.length - lastFourIndex - 1];
        for (int i = lastFourIndex + 1, j = 0; i < nums.length; i++, j++) {
            result[j] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(java.util.Arrays.toString(post4(new int[]{2, 4, 1, 2})));     // [1, 2]
        System.out.println(java.util.Arrays.toString(post4(new int[]{4, 1, 4, 2})));     // [2]
        System.out.println(java.util.Arrays.toString(post4(new int[]{4, 4, 1, 2, 3})));  // [1, 2, 3]
    }
}

