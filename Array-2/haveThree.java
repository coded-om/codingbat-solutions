public class HaveThree {

    public static boolean haveThree(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            // Check for a 3
            if (nums[i] == 3) {
                count++;

                // Check if adjacent to another 3
                if (i > 0 && nums[i - 1] == 3) {
                    return false;
                }
            }
        }

        return count == 3;
    }

    public static void main(String[] args) {
        System.out.println(haveThree(new int[]{3, 1, 3, 1, 3}));  // true
        System.out.println(haveThree(new int[]{3, 1, 3, 3}));     // false
        System.out.println(haveThree(new int[]{3, 4, 3, 3, 4}));  // false
        System.out.println(haveThree(new int[]{1, 3, 1, 3, 1, 3})); // true
        System.out.println(haveThree(new int[]{3, 3, 3}));        // false
    }
}

