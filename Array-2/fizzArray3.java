public class FizzArray3 {

    public static int[] fizzArray3(int start, int end) {
        int[] result = new int[end - start];
        for (int i = 0; i < result.length; i++) {
            result[i] = start + i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(java.util.Arrays.toString(fizzArray3(5, 10)));  // [5, 6, 7, 8, 9]
        System.out.println(java.util.Arrays.toString(fizzArray3(11, 18))); // [11, 12, 13, 14, 15, 16, 17]
        System.out.println(java.util.Arrays.toString(fizzArray3(1, 3)));   // [1, 2]
        System.out.println(java.util.Arrays.toString(fizzArray3(4, 4)));   // []
    }
}

