public class EvenCopy {
    public static int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[index] = num;
                index++;
                if (index == count) break;
            }
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(Arrays.toString(copyEvens(new int[] {3, 2, 4, 5, 8}, 2)));  // [2, 4]
        System.out.println(Arrays.toString(copyEvens(new int[] {3, 2, 4, 5, 8}, 3)));  // [2, 4, 8]
        System.out.println(Arrays.toString(copyEvens(new int[] {6, 1, 2, 4, 5, 8}, 3)));  // [6, 2, 4]
    }
}

