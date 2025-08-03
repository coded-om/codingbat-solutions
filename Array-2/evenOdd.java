public class EvenOdd {

    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
            }
        }

        // Optional: reverse the odd part to keep original order (if needed)
        // But per the problem, order doesn't matter, so we can skip it.

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(java.util.Arrays.toString(evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1}))); // [0, 0, 0, 1, 1, 1, 1]
        System.out.println(java.util.Arrays.toString(evenOdd(new int[]{3, 3, 2})));             // [2, 3, 3]
        System.out.println(java.util.Arrays.toString(evenOdd(new int[]{2, 2, 2})));             // [2, 2, 2]
    }
}

