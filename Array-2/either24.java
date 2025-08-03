public class Either24 {

    public static boolean either24(int[] nums) {
        boolean has22 = false;
        boolean has44 = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                has22 = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                has44 = true;
            }
        }

        // Return true if exactly one of them is true (XOR)
        return has22 ^ has44;
    }

    public static void main(String[] args) {
        System.out.println(either24(new int[]{1, 2, 2}));       // true
        System.out.println(either24(new int[]{4, 4, 1}));       // true
        System.out.println(either24(new int[]{4, 4, 1, 2, 2})); // false
    }
}

