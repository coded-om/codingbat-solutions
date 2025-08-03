public class Only14 {

    public static boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        int[][] testArrays = {
            {1, 4, 1, 4},
            {1, 4, 2, 4},
            {1, 1},
            {},
            {4, 4},
            {1, 4, 5}
        };

        for (int i = 0; i < testArrays.length; i++) {
            System.out.print("Test " + (i + 1) + ": ");
            for (int n : testArrays[i]) {
                System.out.print(n + " ");
            }
            System.out.println("=> " + only14(testArrays[i]));
        }
    }
}

