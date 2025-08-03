public class ModThree {

    public static boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            boolean firstEven = nums[i] % 2 == 0;
            boolean secondEven = nums[i + 1] % 2 == 0;
            boolean thirdEven = nums[i + 2] % 2 == 0;

            // All three even or all three odd
            if ((firstEven && secondEven && thirdEven) || 
                (!firstEven && !secondEven && !thirdEven)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(modThree(new int[]{2, 1, 3, 5}));  // true
        System.out.println(modThree(new int[]{2, 1, 2, 5}));  // false
        System.out.println(modThree(new int[]{2, 4, 2, 5}));  // true
        System.out.println(modThree(new int[]{1, 3, 5}));     // true
        System.out.println(modThree(new int[]{0, 2, 4}));     // true
        System.out.println(modThree(new int[]{1, 2, 3}));     // false
    }
}

